package com.example.catriona.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by catriona on 18/12/2017.
 */

public class WordTest {

    private Word word;
    private Word word2;

    @Before
    public void before(){
        word = new Word("jump");
        word2 = new Word("Help");

    }

    @Test
    public void canGetWord(){
        assertEquals("jump", word.getWord());
    }

    @Test
    public void canGetSizeOfWord(){
        assertEquals(4, word.calculateSizeOfWord());
    }

    @Test
    public void canGetSizeOfWordEvenIfCapital(){
        assertEquals(4, word2.calculateSizeOfWord());
    }
}
