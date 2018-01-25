package pttest2;

import java.util.Iterator;

public class PushupCalculator {

    private static PushupCalculator instance;

    public static PushupCalculator getInstance() {
        if (instance == null) {
            instance = new PushupCalculator();
        }
        return instance;
    }

    public PushupScore calculatePushupScore(Soldier soldier) {
    		
    		// select the correct file from age and gender, then generate a hashmap of repetitions and scores
    		PushUpScoreChart pushupScoreChart = new PushUpScoreChart(soldier);
    		
    		// calculate the score based on the repetitions
    		int soldierRepetition = soldier.getPushups();
    		int soldierResult = 0;
        Iterator<Integer> scores = pushupScoreChart.getPushupScoreChart().keySet().iterator();

        if (soldierRepetition < 5) {
        		soldierResult = 0;
        } else if (soldierRepetition > 77) {
        		soldierResult = 100;
        } else {
            while (scores.hasNext()) {
                int repetition = scores.next();
                int result = pushupScoreChart.getPushupScoreChart().get(repetition);
                if (repetition == soldierRepetition) {
                		soldierResult = result;
                }
            }
        }
    		
        // generate a score object
    		PushupScore pushupScore = new PushupScore(soldierRepetition,soldierResult);
        
    		return pushupScore;
    }
}