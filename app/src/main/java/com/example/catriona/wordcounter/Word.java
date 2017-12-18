package com.example.catriona.wordcounter;

/**
 * Created by catriona on 18/12/2017.
 */

public class Word {

    private String letters;

    public Word (String letters){
       this.letters = letters;
   }

    public String getWord(){
        return this.letters;
    }

    public int calculateSizeOfWord(){
        return this.letters.length();
    }


}
