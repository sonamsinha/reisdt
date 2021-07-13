package com.rei.sdt;

import com.rei.sdt.dictionary.Dictionary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dictionary dictionary = new Dictionary();
        System.out.println(dictionary.isEnglishWord("working"));
    }
}
