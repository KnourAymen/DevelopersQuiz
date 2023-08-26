package com.example.developersquiz;

public class Quiz {

    private String quizQuestion;
    private String quizOptionOne;
    private String quizOptionTwo;
    private String quizOptionThree;
    private String quizOptionFour;
    private String quizAnswer;
    private String userSelectedAnswer;

    public Quiz(String quizQuestion, String quizOptionOne, String quizOptionTwo, String quizOptionThree, String quizOptionFour, String quizAnswer, String userSelectedAnswer) {
        this.quizQuestion = quizQuestion;
        this.quizOptionOne = quizOptionOne;
        this.quizOptionTwo = quizOptionTwo;
        this.quizOptionThree = quizOptionThree;
        this.quizOptionFour = quizOptionFour;
        this.quizAnswer = quizAnswer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public String getQuizOptionOne() {
        return quizOptionOne;
    }

    public void setQuizOptionOne(String quizOptionOne) {
        this.quizOptionOne = quizOptionOne;
    }

    public String getQuizOptionTwo() {
        return quizOptionTwo;
    }

    public void setQuizOptionTwo(String quizOptionTwo) {
        this.quizOptionTwo = quizOptionTwo;
    }

    public String getQuizOptionThree() {
        return quizOptionThree;
    }

    public void setQuizOptionThree(String quizOptionThree) {
        this.quizOptionThree = quizOptionThree;
    }

    public String getQuizOptionFour() {
        return quizOptionFour;
    }

    public void setQuizOptionFour(String quizOptionFour) {
        this.quizOptionFour = quizOptionFour;
    }

    public String getQuizAnswer() {
        return quizAnswer;
    }

    public void setQuizAnswer(String quizAnswer) {
        this.quizAnswer = quizAnswer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
