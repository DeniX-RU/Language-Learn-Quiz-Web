package com.languagelearnquiz.webquiz.game.options;

import com.languagelearnquiz.webquiz.game.difficulty.Difficulty;
import com.languagelearnquiz.webquiz.game.languages.Language;
import com.languagelearnquiz.webquiz.game.languages.Languages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Options {
    public Difficulty difficulty;
    public Languages languages;
    public Boolean partsOfSpeech;
    public String username;
}
