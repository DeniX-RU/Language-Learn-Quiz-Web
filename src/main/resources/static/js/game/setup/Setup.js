window.addEventListener('load', async  function () {
    setupListeners();
    setupTexts(); //TODO setup username field
});
let usernameAllowed = false;
let usernameNotAllowedMessage = "Empty field!";
let inputField;

function setupListeners() { 
    function createToggleButtonListeners() {
        document.getElementById("partsOfSpeech1").addEventListener('change',function() {
            changeToggleButtonTitle();
        });
    }
    function createInputTextFieldListeners() {
        inputField = document.getElementById("username");
        document.getElementById("username").addEventListener("change", function () {
            isAvailable();
        })
    }

    createToggleButtonListeners();
    createInputTextFieldListeners();
}
function changeToggleButtonTitle() {
    //TODO parts and part of speech
    let button = document.getElementById("partsOfSpeechLabel");
    let checkbox = document.getElementById("partsOfSpeech1");
    if (checkbox.checked) { // If checked - Yes
        button.innerHTML = "Yes";
    } else { // Else - no
        button.innerHTML = "No";
    }
}

async function isAvailable() {
    async function isAvailableJSON(value){
        return fetch("/data/usernames/isAvailable/" + value)
            .then(async function (response) {
                return await response.json()
            })
            .then(function(data){
                var avail = data.success;
                return avail;
            });
    }
    if (inputField.value === "") {
        usernameAllowed = false;
        usernameNotAllowedMessage = "Empty field!";
    } else if (!await isAvailableJSON(inputField.value)) {
        usernameAllowed = false;
        usernameNotAllowedMessage = "This username is already taken!";
    } else {
        usernameAllowed = true;
    }
}
function setupTexts() {
    changeToggleButtonTitle();
    isAvailable();
}



function notifyWithMsg(parentNode, msg) {
    function findCorrectParent(parentNode, targetClass) {
        return (parentNode.classList.contains(targetClass) ?  parentNode : findCorrectParent(parentNode.parentNode, targetClass));
    }
    function getPopup(msg, parentNode) {
        return new Popup(msg, parentNode);
    }
    let targetClass = "inputDiv";
    parentNode = findCorrectParent(parentNode, targetClass);
    let popup = getPopup(msg, parentNode);
    popup.appear();

    //TODO 1) delete alertDiv
    // 2) set timer to get removed for popups
    // 3) set listener when parent div is clicked - popup dissappears
    // 4) animation
    // 5) make popups appear on all divs, not the first one to be incorrect only

}



function optionsCorrect() {
    function checkDifficulty() {
        var radio = document.getElementsByName("difficulty.index");
        for (let i = 0; i < radio.length; i++) {
            if (radio[i].checked) {
                return true;
            }
        }
        notifyWithMsg(radio[0],"Choose one");
        return false;
    }


    function checkLanguage() {
        var radio = document.getElementsByName("languages.index");
        for (let i = 0; i < radio.length; i++) {
            if (radio[i].checked) {
                return true;
            }
        }
        notifyWithMsg(radio[0],"Choose one");
        return false;
    }

    function checkUsername() {
        var username = document.getElementById("username");
        if(usernameAllowed) {
            return true;
        } else {
            notifyWithMsg(username,usernameNotAllowedMessage);
            return false;
        }
    }

    let result1 = checkDifficulty();
    let result2 = checkLanguage();
    let result3 = checkUsername(); //TODO smth with this thing, cmon it aint cool
    return result1 && result2 && result3;
    // return checkDifficulty() && checkLanguage() && checkUsername();
}

function launchGame() {
    if (optionsCorrect()) {
        //TODO stopped here, time to uncomment method and see what happens

        //TODO check if YesNo toggle button still works after redirecting
        document.getElementById("playForm").submit();
    }
}