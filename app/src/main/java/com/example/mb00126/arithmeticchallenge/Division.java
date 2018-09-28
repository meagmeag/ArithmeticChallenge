package com.example.mb00126.arithmeticchallenge;

import com.example.mb00126.arithmeticchallenge.ArithmeticChallenge;

public class Division extends ArithmeticChallenge {
    int [] fake1 = {1,2,2};
    String fake= "fake";

    public Division(int TOTAL_LEVELS, int TURNS_PER_LEVEL){
        super(TOTAL_LEVELS, TURNS_PER_LEVEL);
    }

    protected String createQuestion(){
        return fake;
    }

    protected int[] createChoices(){
        return fake1;
    }
}
