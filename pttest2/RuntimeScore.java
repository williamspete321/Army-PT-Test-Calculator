package pttest2;

public class RuntimeScore {
    private String runtime;
    private int score;
    private boolean pass;

    public RuntimeScore(String runtime, int score) {
    		this.runtime = runtime;
    		this.score = score;
    		if (score >= 60) {
         		pass = true;
         } else {
         		pass = false;
         }
    }

    public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
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
        return "Runtime: " + runtime + "\tRuntime score: " + score;
    }
}