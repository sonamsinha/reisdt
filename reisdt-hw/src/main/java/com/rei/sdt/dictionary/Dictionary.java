package com.rei.sdt.dictionary;

import com.rei.sdt.service.DictionaryService;

import java.util.List;

public class Dictionary {

    private DictionaryService dictionaryService;

    /**
     * This method returns TRUE/FALSE based on the validity of the word checking against a dictionary.
     * @param word
     * @return List<String>
     */
    public Boolean isEnglishWord(String word) {
        dictionaryService = new DictionaryService();
        dictionaryService.createDictionary();
        return dictionaryService.isEnglishWord(word);
    }
}
