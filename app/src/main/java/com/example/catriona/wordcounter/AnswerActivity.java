package com.example.catriona.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;
    TextView inputSentenceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerText = findViewById(R.id.word_count_answer_text);
        inputSentenceText = findViewById(R.id.sentence_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String count = extras.getString("wordCount");
        String sentence = extras.getString("inputSentence");

        inputSentenceText.setText(sentence);
        answerText.setText(count);

    }
}
