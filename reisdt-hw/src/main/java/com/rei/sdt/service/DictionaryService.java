package com.rei.sdt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DictionaryService {

    public List<String> createDictionary(){
        List<String> words = new ArrayList<>();
        words.add("working");
        words.add("king");
        words.add("work");
        words.add("know");
        words.add("ring");
        words.add("know");
        words.add("now");
        words.add("home");
        words.add("ping");
        words.add("pong");
        words.add("gone");
        return words;
    }

    public Boolean isEnglishWord(String input){
        return Boolean.FALSE;
    }

    public List<String> findWordsFromInput(String input){
        List<String> possibleWords = new ArrayList<String>();
        if (!input.isBlank() && !input.isEmpty()){
            List<String> allWords = createDictionary();
            input = input.toLowerCase(Locale.ROOT);

            for(String word : allWords){
                Boolean noMatchingWordFound = true;

                //convert word to char array
                for (char ch : word.toCharArray()){
                    String wordFromChar = Character.toString(ch);

                    int wordLength = word.length() - word.replace(wordFromChar, "").length();
                    int inputLength = input.length() - input.replace(wordFromChar, "").length();

                    if (wordLength != inputLength) {
                        noMatchingWordFound = false;
                        break;
                    }
                }
                if (noMatchingWordFound){
                    possibleWords.add(word);
                }
            }
            System.out.println(possibleWords);
        } else {
          System.out.println("The input is not valid");
        }

        return possibleWords;
    }
}
