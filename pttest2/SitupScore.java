package pttest2;

public class SitupScore {
    private int reps;
    private int score;
    private boolean pass;

    public SitupScore(int reps, int score) {
    		this.reps = reps;
    		this.score = score;
    		if (score >= 60) {
         	pass = true;
        } else {
         	pass = false;
        }
    }
    

    public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}


	@Override
    public String toString() {
        //TODO: return string with reps and score here instead of using a display method
        return "Situp reps: " + reps + "\tSitup score: " + score;
    }
}