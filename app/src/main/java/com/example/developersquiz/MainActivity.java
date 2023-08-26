package com.example.developersquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout lettersQuiz = findViewById(R.id.letters_quiz);
        final LinearLayout numbersQuiz = findViewById(R.id.numbers_quiz);
        final LinearLayout colorsQuiz = findViewById(R.id.colors_quiz);
        final LinearLayout animalsQuiz = findViewById(R.id.animals_quiz);
        final LinearLayout fruitsQuiz = findViewById(R.id.fruits_quiz);
        final LinearLayout vegetablesQuiz = findViewById(R.id.vegetables_quiz);

        lettersQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "lettersQuiz";
                lettersQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                numbersQuiz.setBackgroundResource(R.drawable.round_back_white);
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white);
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white);
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white);
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });

        numbersQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "numbersQuiz";
                numbersQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                lettersQuiz.setBackgroundResource(R.drawable.round_back_white);
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white);
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white);
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white);
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });

        colorsQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "colorsQuiz";
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                lettersQuiz.setBackgroundResource(R.drawable.round_back_white);
                numbersQuiz.setBackgroundResource(R.drawable.round_back_white);
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white);
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white);
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });

        animalsQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "animalsQuiz";
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                lettersQuiz.setBackgroundResource(R.drawable.round_back_white);
                numbersQuiz.setBackgroundResource(R.drawable.round_back_white);
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white);
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white);
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });

        fruitsQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "fruitsQuiz";
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                lettersQuiz.setBackgroundResource(R.drawable.round_back_white);
                numbersQuiz.setBackgroundResource(R.drawable.round_back_white);
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white);
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white);
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });

        vegetablesQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "vegetablesQuiz";
                vegetablesQuiz.setBackgroundResource(R.drawable.round_back_white_stroke);

                lettersQuiz.setBackgroundResource(R.drawable.round_back_white);
                numbersQuiz.setBackgroundResource(R.drawable.round_back_white);
                colorsQuiz.setBackgroundResource(R.drawable.round_back_white);
                animalsQuiz.setBackgroundResource(R.drawable.round_back_white);
                fruitsQuiz.setBackgroundResource(R.drawable.round_back_white);

                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("SELECTED_TOPIC", selectedTopicName);
                startActivity(intent);
            }
        });
    }
}