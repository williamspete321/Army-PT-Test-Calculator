package pttest2;

import java.util.Iterator;

public class SitupCalculator {

    private static SitupCalculator instance;

    public static SitupCalculator getInstance() {
        if (instance == null) {
            instance = new SitupCalculator();
        }
        return instance;
    }

    public SitupScore calculateSitupScore(Soldier soldier) {
    		
    		// select the correct file from age and gender, then generate a hashmap of repetitions and scores
    		SitupScoreChart situpScoreChart = new SitupScoreChart(soldier);
    		
    		// calculate the score based on the repetitions
    		int soldierRepetition = soldier.getSitups();
    		int soldierResult = 0;
        Iterator<Integer> scores = situpScoreChart.getSitupScoreChart().keySet().iterator();

        if (soldierRepetition < 21) {
        		soldierResult = 0;
        } else if (soldierRepetition > 82) {
        		soldierResult = 100;
        } else {
            while (scores.hasNext()) {
                int repetition = scores.next();
                int result = situpScoreChart.getSitupScoreChart().get(repetition);
                if (repetition == soldierRepetition) {
                		soldierResult = result;
                }
            }
        }
    		
        // generate a score object
    		SitupScore situpScore = new SitupScore(soldierRepetition,soldierResult);
        
    		return situpScore;
    }
}