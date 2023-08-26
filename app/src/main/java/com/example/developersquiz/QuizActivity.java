package com.example.developersquiz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView number_questions;
    private TextView questions;
    private AppCompatButton option_one, option_two, option_three, option_four;
    private AppCompatButton btnNext;
    private Timer quizTimer;
    private int totalTimeInMin = 1;
    private int seconds = 0;
    private List<Quiz> quizList;
    private int currentQuizPosition = 0;
    private String selectedOptionByUser = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView btnBack = findViewById(R.id.btnBack);
        final TextView timer = findViewById(R.id.timer);
        final TextView topic_name = findViewById(R.id.topic_name);

        number_questions = findViewById(R.id.questions_number);
        questions = findViewById(R.id.questions);

        option_one = findViewById(R.id.option_one);
        option_two = findViewById(R.id.option_two);
        option_three = findViewById(R.id.option_three);
        option_four = findViewById(R.id.option_four);

        btnNext = findViewById(R.id.btn_next);

        final String getSelectedTopicName = getIntent().getStringExtra("SELECTED_TOPIC");
        topic_name.setText(getSelectedTopicName);

        quizList = QuizBank.getQuiz(getSelectedTopicName);
        startTimer(timer);

        number_questions.setText((currentQuizPosition + 1) + "/" + quizList.size());
        questions.setText(quizList.get(0).getQuizQuestion());
        option_one.setText(quizList.get(0).getQuizOptionOne());
        option_two.setText(quizList.get(0).getQuizOptionTwo());
        option_three.setText(quizList.get(0).getQuizOptionThree());
        option_four.setText(quizList.get(0).getQuizOptionFour());

        option_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option_one.getText().toString();
                    option_one.setBackgroundResource(R.drawable.round_back_red);
                    option_one.setTextColor(Color.WHITE);

                    revealAnswer();
                    quizList.get(currentQuizPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option_two.getText().toString();
                    option_two.setBackgroundResource(R.drawable.round_back_red);
                    option_two.setTextColor(Color.WHITE);

                    revealAnswer();
                    quizList.get(currentQuizPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option_three.getText().toString();
                    option_three.setBackgroundResource(R.drawable.round_back_red);
                    option_three.setTextColor(Color.WHITE);

                    revealAnswer();
                    quizList.get(currentQuizPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        option_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()) {
                    selectedOptionByUser = option_four.getText().toString();
                    option_four.setBackgroundResource(R.drawable.round_back_red);
                    option_four.setTextColor(Color.WHITE);

                    revealAnswer();
                    quizList.get(currentQuizPosition).setUserSelectedAnswer(selectedOptionByUser);
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()) {
                    Toast.makeText(QuizActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                } else {
                    changeNextQuiz();
                }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void changeNextQuiz() {

        currentQuizPosition++;
        if(currentQuizPosition < quizList.size()) {
            selectedOptionByUser = "";

            option_one.setBackgroundResource(R.drawable.round_back_white_stroke_btn);
            option_one.setTextColor(Color.parseColor("#1f6BB8"));

            option_two.setBackgroundResource(R.drawable.round_back_white_stroke_btn);
            option_two.setTextColor(Color.parseColor("#1f6BB8"));

            option_three.setBackgroundResource(R.drawable.round_back_white_stroke_btn);
            option_three.setTextColor(Color.parseColor("#1f6BB8"));

            option_four.setBackgroundResource(R.drawable.round_back_white_stroke_btn);
            option_four.setTextColor(Color.parseColor("#1f6BB8"));

            number_questions.setText((currentQuizPosition + 1) + "/" + quizList.size());
            questions.setText(quizList.get(currentQuizPosition).getQuizQuestion());
            option_one.setText(quizList.get(currentQuizPosition).getQuizOptionOne());
            option_two.setText(quizList.get(currentQuizPosition).getQuizOptionTwo());
            option_three.setText(quizList.get(currentQuizPosition).getQuizOptionThree());
            option_four.setText(quizList.get(currentQuizPosition).getQuizOptionFour());

        } else {
            Intent intent = new Intent(QuizActivity.this, QuizResultsActivity.class);
            intent.putExtra("CORRECT", getCorrectAnswer());
            intent.putExtra("INCORRECT", getInCorrectAnswer());
            startActivity(intent);
            finish();
        }
    }
    private void startTimer(TextView timerTexView) {
        quizTimer = new Timer();
        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(seconds == 0) {
                    totalTimeInMin--;
                    seconds = 59;
                } else if(seconds == 0 && totalTimeInMin == 0) {
                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Time out", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(QuizActivity.this, QuizResultsActivity.class);
                    intent.putExtra("CORRECT", getCorrectAnswer());
                    intent.putExtra("INCORRECT", getInCorrectAnswer());
                    startActivity(intent);
                    finish();
                } else {
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String finalQuizMinutes = String.valueOf(totalTimeInMin);
                        String finalQuizSeconds = String.valueOf(seconds);

                        if(finalQuizMinutes.length() == 1) {
                            finalQuizMinutes = "0"+finalQuizMinutes;
                        }
                        if(finalQuizSeconds.length() == 1) {
                            finalQuizSeconds = "0"+finalQuizSeconds;
                        }

                        timerTexView.setText(finalQuizMinutes + ":" + finalQuizSeconds);
                    }
                });


            }
        }, 1000, 1000);
    }

    private int getCorrectAnswer() {
        int correctAnswer = 0;
        for(int i = 0; i < quizList.size(); i++) {

            final String getUserSelectedAnswer = quizList.get(i).getUserSelectedAnswer();
            final String getAnswer = quizList.get(i).getQuizAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)) {
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    private int getInCorrectAnswer() {
        int inCorrectAnswer = 0;
        for(int i = 0; i < quizList.size(); i++) {

            final String getUserSelectedAnswer = quizList.get(i).getUserSelectedAnswer();
            final String getAnswer = quizList.get(i).getQuizAnswer();

            if(!getUserSelectedAnswer.equals(getAnswer)) {
                inCorrectAnswer++;
            }
        }
        return inCorrectAnswer;
    }

    private void revealAnswer() {
        final String getAnswer = quizList.get(currentQuizPosition).getQuizAnswer();

        if(option_one.getText().toString().equals(getAnswer)) {
            option_one.setBackgroundResource(R.drawable.round_back_green);
            option_one.setTextColor(Color.WHITE);

        } else if(option_two.getText().toString().equals(getAnswer)) {
            option_two.setBackgroundResource(R.drawable.round_back_green);
            option_two.setTextColor(Color.WHITE);

        } else if(option_three.getText().toString().equals(getAnswer)) {
            option_three.setBackgroundResource(R.drawable.round_back_green);
            option_three.setTextColor(Color.WHITE);

        } else if(option_four.getText().toString().equals(getAnswer)) {
            option_four.setBackgroundResource(R.drawable.round_back_green);
            option_four.setTextColor(Color.WHITE);
        }
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();
        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }
}