package com.example.catriona.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText sentenceInput;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(), "onCreate activated");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        sentenceInput = findViewById(R.id.input_sentence_box);
        countButton = findViewById(R.id.submit_button);
    }

    public void onSubmitButtonPressed(View button){
        Log.d(getClass().toString(),"submitButton pressed");
        String inputPhrase = sentenceInput.getText().toString();
        Log.d(getClass().toString(), "the text was: " + inputPhrase);

        Sentence sentence = new Sentence(inputPhrase);
        int count = (sentence.countWords());
        String countAsString = Integer.toString(count);

        Intent newIntent = new Intent(this, AnswerActivity.class);
        newIntent.putExtra("wordCount", "There are " + countAsString + " words!");
        newIntent.putExtra("inputSentence", "Your sentence was: " + inputPhrase);

        startActivity(newIntent);
    }

}
