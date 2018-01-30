package pttest2;

public class TotalScoreCalculator {
	
    private static TotalScoreCalculator instance;

    public static TotalScoreCalculator getInstance() {
        if (instance == null) {
            instance = new TotalScoreCalculator();
        }
        return instance;
    }
	
    public TotalScore calculateTotalScore(PushupScore pushupScore, SitupScore situpScore, RuntimeScore runtimeScore) {
		
		int allScores = pushupScore.getScore() + situpScore.getScore() + runtimeScore.getScore();
		boolean allPass;
		
		if (pushupScore.isPass() && situpScore.isPass() && runtimeScore.isPass()) {
			allPass = true;
		} else {
			allPass = false;
		}
		
		TotalScore totalScore = new TotalScore(allScores, allPass);
    
		return totalScore;
    }
    
    
	
}
