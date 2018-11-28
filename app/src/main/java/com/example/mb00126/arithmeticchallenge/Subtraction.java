package com.example.mb00126.arithmeticchallenge;

import com.example.mb00126.arithmeticchallenge.ArithmeticChallenge;

public class Subtraction extends ArithmeticChallenge {
    int num1, num2;
    int choice0, choice1, choice2;

    public Subtraction(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion(){
        num1 = (int) (20 * Math.random() + 1);
        num2 = (int) ((num1 -1) * Math.random() + 1);
        while((num1 - num2) <= 0) {
            num1++;
            num2--;
        }
        String question = num1 + " - " + num2;
        return question;
    }


    protected int[] createChoices(){
        choice0 = num1 - num2;

        do {
            if(num1 > 3)
                choice1 = num1 - (int) (Math.random() * ((num2 + 2) - (num2 - 2)) + (num2 - 2));
            else
                choice1 = num1 - (int) (3 * Math.random() + num2);
        }
        while (choice1 == choice0 || choice1 == 0);
        if(choice1 < 0)
        do {

            if(num2 > 3)
                choice2 = num2 - (int) (Math.random() * ((num1 + 2) - (num1 - 2)) + (num1 - 2));
            else
                choice2 = num2 - (int) (3 * Math.random() + num1);
        }
        while (choice2 == choice1 || choice2 == choice0 || choice2 == 0);

        int[] choices = {choice0, choice1, choice2};
        return choices;
    }
}

