package com.example.mb00126.arithmeticchallenge;

import com.example.mb00126.arithmeticchallenge.ArithmeticChallenge;

/*****************************************************************
 * Meaghan Boykin
 * 9/21/18
 *
 * I made possible questions a random number 1-12 x another random number
 * 1-12 because I remember learning my times tables up to twelve in elementary school.
 *
 * Both possible wrong answers are answers to similar multiplication problems to the original,
 * just with one number being multiplied slightly larger or smaller. I did this because this way the possible
 * answers are similar enough to not make the correct answer obvious, and because I feel kids
 * are more likely to accidentally multiply by the wrong number than use the wrong operator.
 ****************************************************************/


    public class Multiplication extends ArithmeticChallenge {
        int num1, num2;
        int choice0, choice1, choice2;

        public Multiplication(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
            super(TOTAL_LEVELS, TURNS_PER_LEVEL);
        }

        protected String createQuestion(){
            num1 = (int) (12 * Math.random() + 1);
            num2 = (int) (12 * Math.random() + 1);
            String question = num1 + " x " + num2;
            return question;
        }


        protected int[] createChoices(){
            choice0 = num1 * num2;

            do {
                if(num1 > 3)
                    choice1 = num1 * (int) (Math.random() * ((num2 + 2) - (num2 - 2)) + (num2 - 2));
                else
                    choice1 = num1 * (int) (3 * Math.random() + num2);
            }
            while (choice1 == choice0 || choice1 == 0);
            do {

                if(num2 > 3)
                    choice2 = num2 * (int) (Math.random() * ((num1 + 2) - (num1 - 2)) + (num1 - 2));
                else
                    choice2 = num2 * (int) (3 * Math.random() + num1);
            }
            while (choice2 == choice1 || choice2 == choice0 || choice2 == 0);

            int[] choices = {choice0, choice1, choice2};
            return choices;
        }
    }


