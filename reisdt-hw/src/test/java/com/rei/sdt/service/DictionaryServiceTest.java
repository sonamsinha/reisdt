package com.rei.sdt.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.rei.sdt.dictionary.Dictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class DictionaryServiceTest {

    private Dictionary dictionary;
    private DictionaryService dictionaryService;
    private List<String> words;
    private List<String> possibleWords;

    @Before
    public void setUp(){
        words = new ArrayList<>();
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
        words.add("sleep");
        words.add("peels");
        words.add("peel");
        words.add("eel");
        words.add("eels");
        possibleWords = new ArrayList<>();
        possibleWords.add("working");
        possibleWords.add("king");
        possibleWords.add("work");
        possibleWords.add("know");
        possibleWords.add("ring");
        possibleWords.add("know");
        possibleWords.add("now");
        dictionary = new Dictionary();
        dictionaryService = new DictionaryService();
    }

    @Test
    public void testPossibleWordsPass(){
        Assert.assertEquals(possibleWords, dictionaryService.findWordsFromInput("WORKING"));
    }

    @Test
    public void testPossibleWordsFail(){
        Assert.assertNotEquals(words, dictionaryService.findWordsFromInput("WORKING"));
    }

    @Test
    public void testPossibleWordsFailSecond(){
        Assert.assertNotEquals(words, dictionaryService.findWordsFromInput("SLEEPING"));
    }
}
