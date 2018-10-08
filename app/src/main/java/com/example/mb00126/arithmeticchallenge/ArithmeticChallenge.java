package com.example.mb00126.arithmeticchallenge;
// import statements here

public abstract class ArithmeticChallenge {
    private long mStartTime;

    private String mQuestionText;

    private int[] mChoice;
    private int mAnswer;

    private int mScore;
    private int mHighScore;

    private int mProgress;
    private int turnsPerLevel;


    public ArithmeticChallenge(int TOTAL_LEVELS, int TURNS_PER_LEVEL) {
        turnsPerLevel = TURNS_PER_LEVEL;
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
        mChoice = choices;
        mStartTime = System.currentTimeMillis();
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

    protected void setScore(boolean correct){
        long mEndTime = System.currentTimeMillis();
        int time = (int) (mEndTime - mStartTime) / 1000;
        if (correct) {
            mScore += 1000 / time;
        }
    }

    protected int getScore(){
        return mScore;
    }

    protected void setHighScore(int score){
        mHighScore = score;
    }

    protected int getHighScore(){
        return mHighScore;
    }
    protected void setProgress(){
        mProgress += (100 / turnsPerLevel);
    }


    protected int getProgress(){
        return mProgress;
    }


    /******************************************************
     * Concrete Classes
     ******************************************************/

    protected boolean isCorrect(int choice) {
        if(mChoice[choice] == mAnswer)
            return true;
        else
            return false;
    }


    private void shuffleChoices(int[] choices) {
       mAnswer = choices[0];
       int ran = (int) (6 * Math.random());
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
           case 4: choices[1] = orig[0];
               choices[0] = orig[1];
               choices[2] = orig[2];
               break;
           case 5: choices[0] = orig[0];
               choices[1] = orig[1];
               choices[2] = orig[2];
               break;
       }
    }
}