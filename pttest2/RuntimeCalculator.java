package pttest2;

import java.util.Iterator;

public class RuntimeCalculator {

    private static RuntimeCalculator instance;

    public static RuntimeCalculator getInstance() {
        if (instance == null) {
            instance = new RuntimeCalculator();
        }
        return instance;
    }

    public RuntimeScore calculateRuntimeScore(Soldier soldier) {
    		
    		// select the correct file from age and gender, then generate a hashmap of repetitions and scores
    		RuntimeScoreChart runtimeScoreChart = new RuntimeScoreChart(soldier);
    		
    		// calculate the score based on the repetitions
    		int soldierRuntime = soldier.getFormattedRuntime();
    		String readableRuntime = soldier.getOriginalRuntime();
    		int soldierResult = 0;
        Iterator<Integer> scores = runtimeScoreChart.getRuntimeScoreChart().keySet().iterator();

        if (soldierRuntime > 2630) {
        		soldierResult = 0;
        } else if (soldierRuntime < 1300) {
        		soldierResult = 100;
        } else {
            while (scores.hasNext()) {
                int run = scores.next();
                int result = runtimeScoreChart.getRuntimeScoreChart().get(run);
                if (run == soldierRuntime) {
                		soldierResult = result;
                }
            }
        }
    		
        // generate a score object
    		RuntimeScore runtimeScore = new RuntimeScore(readableRuntime,soldierResult);
        
    		return runtimeScore;
    }
}