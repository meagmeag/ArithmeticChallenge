package com.example.mb00126.arithmeticchallenge;

import com.example.mb00126.arithmeticchallenge.ArithmeticChallenge;


    public class Multiplication extends ArithmeticChallenge {
        int num1, num2;
        int choice0, choice1, choice2;
        String operator = "X";



        public Multiplication(){
            //super(TOTAL_LEVELS, TURNS_PER_LEVEL);
        }

        protected String createQuestion(){
            num1 = (int) (12*Math.random()+1);
            num2 = (int) (12*Math.random()+1);
            String question = num1 + " " + operator + " " + num2;
            return question;
        }


        protected int[] createChoices(){
            choice0 = num1 * (int)(12*Math.random()+1);
            choice1 = num2 * (int) (12*Math.random()+1);
            while(choice1 == choice0)
                choice1= num2 * (int) (12*Math.random()+1);
            choice2 = num1 * num2;
            int[] choices = {choice0, choice1, choice2};
            return choices;
        }
    }


