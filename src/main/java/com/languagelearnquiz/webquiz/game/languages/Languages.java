package com.languagelearnquiz.webquiz.game.languages;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Languages {
    public int index = -1;
    public String title = null;

    public void setIndex(int index) {
        this.index = index;
        this.title = getTypeOfGameAsTitle(this.index);
    }

    private static String first(){
        return String.valueOf(Language.RUS);
    }
    private static String second(){
        return String.valueOf(Language.ENG);
    }
    private static String third(){
        return String.valueOf(Language.RANDOM);
    }
        private static final String[] languages = new String[]{first(),second(),third()};
    public static String getLanguage(int index) {
        return languages[index];
    }


    private static String firstTypeOfGame() {
        return "From "+first()+" to "+second();
    }
    private static String secondTypeOfGame() {
        return "From "+second()+" to "+first();
    }
    private static String thirdTypeOfGame() {
        return third();
    }
        public static final String[] types = new String[]{firstTypeOfGame(),secondTypeOfGame(),thirdTypeOfGame()};
    public static String getTypeOfGameAsTitle(int index){
        return types[index];
    }
}
