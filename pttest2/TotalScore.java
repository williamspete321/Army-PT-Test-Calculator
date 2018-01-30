package pttest2;

public class TotalScore {
	private int totalScore;
	private boolean totalPass;
	
	public TotalScore(int totalScore, boolean totalPass) {
		this.totalScore = totalScore;
		this.totalPass = totalPass;
		
	}
	
	public String testResult(boolean totalPass) {
		String result;
		
		if (totalPass) {
			result = "PASSED";
		} else {
			result = "FAILED";
		}
		
		return result;
	}

	@Override
	public String toString() {
		return "TOTAL: " + totalScore + "/300\tRESULT: " + testResult(totalPass);
	}
	
	
}
