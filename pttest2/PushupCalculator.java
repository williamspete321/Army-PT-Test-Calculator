package pttest2;

public class PushupCalculator {

    private static PushupCalculator instance;

    public static PushupCalculator getInstance() {
        if (instance == null) {
            instance = new PushupCalculator();
        }
        return instance;
    }

    public PushupScore calculatePushupScore(Soldier soldier) {
    	
        //looks like I would need to load in the txt files here?
    		//because I get 'gender' and 'age' from Soldier?
    		// (gender and age are needed to grab correct scores)
    		
    		PushupScore pushupScore = new PushupScore(soldier.getPushups());
        //TODO: do calculations here and return a pushup score
        
    		return pushupScore;
    }
}