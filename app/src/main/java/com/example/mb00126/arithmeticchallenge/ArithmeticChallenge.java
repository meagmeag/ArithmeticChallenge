package com.example.mb00126.arithmeticchallenge;
// import statements here

public abstract class ArithmeticChallenge {
    long mStartTime;
    String mQuestionText;
    int[] mChoice;

    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL) {
        // to be implemented
    }

    /******************************************************
     * Abstract Classes
     ******************************************************/

    abstract String createQuestion();

    abstract int[] createChoices();

    /******************************************************
     * Getters and Setters
     ******************************************************/

    protected void setChoices(int[] choices) {
        shuffleChoices(choices);
        mStartTime = System.currentTimeMillis();
        mChoice = choices;
    }


    protected void setQuestionText(String text) {
       mQuestionText = text;
    }

    protected String getQuestionText() {
        return mQuestionText;
    }

    protected String getChoice(int index) {
        return Integer.toString(mChoice[index]);
    }

    /******************************************************
     * Concrete Classes
     ******************************************************/

    protected boolean isCorrect(int choice) {
        // to be implemented
        return true;
    }


    private void shuffleChoices(int[] choices) {
       int ran = (int) (7 * Math.random());
       int[] orig = new int[3];
       for(int i = 0; i < 3; i++){
           orig[i] = choices[i];
       }

       switch(ran) {
           case 0: choices[2] = orig[0];
                choices[0] = orig[1];
                choices[1] = orig[2];
               break;
           case 1: choices[1] = orig[0];
                choices[2] = orig[1];
                choices[0] = orig[2];
               break;
           case 2: choices[2] = orig[0];
                choices[1] = orig[1];
                choices[0] = orig[2];
               break;
           case 3: choices[0] = orig[0];
               choices[2] = orig[1];
               choices[1] = orig[2];
               break;
           case 5: choices[1] = orig[0];
               choices[0] = orig[1];
               choices[2] = orig[2];
               break;
           case 6: choices[0] = orig[0];
               choices[1] = orig[1];
               choices[2] = orig[2];
               break;
       }
    }
    }