package com.example.catriona.wordcounter;

/**
 * Created by catriona on 18/12/2017.
 */

public class Sentence {

    private String words;

    public Sentence(String words){
        this.words = words;
    }


    public String getSentence() {
        return this.words;
    }

    public int countWords() {
        String [] words = this.getSentence().split(" ");
        return words.length;
    }
}
