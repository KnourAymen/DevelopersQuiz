package com.example.developersquiz;

import java.util.ArrayList;
import java.util.List;

public class QuizBank {

    private static List<Quiz> makeLettersQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("Which letter comes after \"F\" in the alphabet ?", "G", "H", "I", "J", "G", "");
        final Quiz quizTwo = new Quiz("Which letter is a vowel ?", "L", "M", "N", "O", "O", "");
        final Quiz quizThree = new Quiz("Which letter is a consonant ?", "A", "E", "I", "K", "K", "");
        final Quiz quizFour = new Quiz("Which letter is silent in the word \"knight\" ?", "K", "N", "G", "H", "K", "");
        final Quiz quizFive = new Quiz("Which letter is the first letter in the word \"umbrella\" ?", "U", "M", "E", "A", "U", "");
        final Quiz quizSix = new Quiz("Which letter is a mirror image of itself ?", "B", "D", "O", "X", "D", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;

    }

    private static List<Quiz> makeNumbersQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("What is the next number in the sequence: 2, 4, 6, 8, ___?", "9", "10", "11", "12", "10", "");
        final Quiz quizTwo = new Quiz("Which of the following is an odd number ?", "6", "10", "15", "2O", "15", "");
        final Quiz quizThree = new Quiz("What is the value of the digit 7 in the number 472 ?", "7", "70", "700", "7000", "70", "");
        final Quiz quizFour = new Quiz(" Which of the following is the largest number ?", "2.5", "2.55", "2.505", "2.5005", "2.5005", "");
        final Quiz quizFive = new Quiz("What is the sum of 3 and 5 ?", "7", "8", "9", "10", "8", "");
        final Quiz quizSix = new Quiz("What is the product of 4 and 9 ?", "13", "36", "45", "54", "36", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;
    }

    private static List<Quiz> makeColorsQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("Which color is made by mixing red and blue ?", "Green", "Purple", "Orange", "Yellow", "Purple", "");
        final Quiz quizTwo = new Quiz("Which color is made by mixing yellow and blue ?", "Green", "Purple", "Orange", "Yellow", "Red", "");
        final Quiz quizThree = new Quiz("What color is the sky on a clear day ?", "Red", "Blue", "Green", "Orange", "Blue", "");
        final Quiz quizFour = new Quiz("What color is a lemon ?", "Green", "Yellow", "Red", "Blue", "Yellow", "");
        final Quiz quizFive = new Quiz("What color is a stop sign ?", "Red", "Blue", "Yellow", "Green", "Red", "");
        final Quiz quizSix = new Quiz("Which color is opposite to green on the color wheel ?", "Red", "Blue", "Yellow", "Orange", "Red", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;
    }

    private static List<Quiz> makeAnimalsQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("Which animal has a long trunk and large ears ?", "Lion", "Giraffe", "Elephant", "Yellow", "Elephant", "");
        final Quiz quizTwo = new Quiz("Which animal has black and white stripes ?", "Lion", "Zebra", "Tiger", "Cheetah", "Zebra", "");
        final Quiz quizThree = new Quiz("Which animal can climb trees and has a long tail to balance itself ?", "Kangaroo", "Monkey", "Sloth", "Koala", "Monkey", "");
        final Quiz quizFour = new Quiz("Which animal lives in water and can hold its breath for a long time ?", "Dolphin", "Seal", "Whale", "Penguin", "Dolphin", "");
        final Quiz quizFive = new Quiz("Which animal has a hump on its back ?", "Elephant", "Camel", "Hippo", "Rhinoceros", "Camel", "");
        final Quiz quizSix = new Quiz("Which animal has a shell on its back and can retract inside it ?", "Crab", "Snail", "Turtle", "Frog", "Turtle", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;
    }

    private static List<Quiz> makeFruitsQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("Which fruit is round, red, and commonly used to make juice ?", "Orange", "Grape", "Apple", "Tomato", "Grape", "");
        final Quiz quizTwo = new Quiz("Which fruit is yellow and has a curved shape ?", "Pineapple", "Orange", "Banana", "Pear", "Banana", "");
        final Quiz quizThree = new Quiz("Which fruit has a brown, hairy exterior and green flesh inside ?", "Pineapple", "Mango", "Coconut", "Kiwi", "Kiwi", "");
        final Quiz quizFour = new Quiz("Which fruit is small, red, and often used to make jam ?", "Strawberry", "Blueberry", "Raspberry", "Blackberry", "Strawberry", "");
        final Quiz quizFive = new Quiz("Which fruit is large, green, and has a rough skin ?", "Watermelon", "Honeydew", "Papaya", "Cantaloupe", "Watermelon", "");
        final Quiz quizSix = new Quiz("Which fruit is red and heart-shaped ?", "Apple", "Grapefruit", "Lemon", "Cherry", "Cherry", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;
    }

    private static List<Quiz> makeVegetablesQuiz() {

        final List<Quiz> quizList = new ArrayList<>();

        final Quiz quizOne = new Quiz("Which vegetable is long, orange, and sweet ?", "Broccoli", "Carrot", "Eggplant", "Cabbage", "Carrot", "");
        final Quiz quizTwo = new Quiz("Which vegetable is round, red, and often used in salads ?", "Carrot", "Tomato", "Potato", "Onion", "Tomato", "");
        final Quiz quizThree = new Quiz("Which vegetable is green, leafy, and often used in salads ?", "Spinach", "Kale", "Cabbage", "Broccoli", "Spinach", "");
        final Quiz quizFour = new Quiz("Which vegetable is green, crunchy, and often used in stir-fries ?", "Carrot", "Potato", "Onion", "Broccoli", "Broccoli", "");
        final Quiz quizFive = new Quiz("Which vegetable is yellow, sweet, and often used in casseroles ?", "Onion", "Garlic", "Bell pepper", "Squash", "Squash", "");
        final Quiz quizSix = new Quiz("Which vegetable is long, green, and often used in pickles ?", "Cucumber", "Carrot", "Onion", "Zucchini", "Cucumber", "");

        quizList.add(quizOne);
        quizList.add(quizTwo);
        quizList.add(quizThree);
        quizList.add(quizFour);
        quizList.add(quizFive);
        quizList.add(quizSix);

        return quizList;
    }

    public static List<Quiz> getQuiz(String selectedTopicName) {
        switch (selectedTopicName) {
            case "lettersQuiz":
                return makeLettersQuiz();

            case "numbersQuiz":
                return makeNumbersQuiz();

            case "colorsQuiz":
                return makeColorsQuiz();

            case "animalsQuiz":
                return makeAnimalsQuiz();

            case "fruitsQuiz":
                return makeFruitsQuiz();

            default:
                return makeVegetablesQuiz();
        }
    }
}
