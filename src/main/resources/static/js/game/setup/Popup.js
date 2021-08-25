class Popup {
    constructor(msg, parentNode) {
        Popup.#deletePreviousAlerts(parentNode);

        let div = document.createElement("div");
        div.classList.add("popup");
        div.innerText = msg;
        this.popup = div;
        this.parent = parentNode;
        this.setListener();

        Popup.#alerts.push(this)
    }
    static #alerts = [];
    static #deletePreviousAlerts(node) {
        Popup.#alerts.forEach(alert => {
            if(alert.parent == node) {
                node.removeEventListener("click",function() {
                    Popup.#deletePreviousAlerts(this);
                })
                alert.disappear()
                Popup.#alerts = Popup.#alerts.filter((v, i, a) => {
                    return v !== alert;
                });
            }
        })
    }

    appear() {
        // let root = document.documentElement;
        // root.style.setProperty("--top",this.parent.)

        this.parent.append(this.popup);
    }

    disappear() {
        this.popup.classList.add("popup-disappear");
        setTimeout(() =>{
                this.parent.removeChild(this.popup);
                // alertLabel.#deletePreviousAlerts(this.parent);
            },
            2000);

    }
    setTimerToSelfDestruct() {
        let minTime = 3000;
        setTimeout(() => {this.disappear();},
            300*((msg.split(" ").length)+1) + minTime);
    }
    setListener() {
        this.parent.addEventListener("click",function() {
            Popup.#deletePreviousAlerts(this);
        })
    }
}
