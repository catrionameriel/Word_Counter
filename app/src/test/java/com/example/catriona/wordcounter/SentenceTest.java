package com.example.catriona.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by catriona on 18/12/2017.
 */

public class SentenceTest {

    Sentence sentence;

    @Before
    public void before(){
        sentence = new Sentence("This is the sentence");
    }

    @Test
    public void canGetSentence(){
        assertEquals("This is the sentence", sentence.getSentence());
    }

    @Test
    public void canCountWords(){
        assertEquals(4, sentence.countWords());
    }
}
