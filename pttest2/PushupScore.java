package pttest2;

public class PushupScore {
    private int reps;
    private int score;
    private boolean pass;

    public PushupScore(int reps, int score) {
    		this.reps = reps;
    		this.score = score;
        //calculate pass or fail
    }

    @Override
    public String toString() {
        //TODO: return string with reps and score here instead of using a display method
        return "Pushup reps: " + reps + "\tPushup score: " + score;
    }
}