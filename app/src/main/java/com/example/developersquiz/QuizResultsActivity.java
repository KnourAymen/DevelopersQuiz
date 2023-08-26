package com.example.developersquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QuizResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton btnStartNewQuiz = findViewById(R.id.btnStartNewQuiz);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView wrongAnswers = findViewById(R.id.wrongAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("CORRECT", 0);
        final int getWrongAnswers = getIntent().getIntExtra("INCORRECT", 0);

        correctAnswers.setText("Correct Answers : " + getCorrectAnswers);
        wrongAnswers.setText("Wrong Answers : " + getWrongAnswers);

        btnStartNewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResultsActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResultsActivity.this, MainActivity.class));
        finish();
    }
}