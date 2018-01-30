package pttest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SitupScoreChart {
	private Map<Integer, Integer> situpScoreChart;
	
	public SitupScoreChart(Soldier soldier) {
		populateSitupChart(soldier);
	}
	
    public Map<Integer, Integer> getSitupScoreChart() {
		return situpScoreChart;
	}

	public void setSitupScoreChart(Map<Integer, Integer> situpScoreChart) {
		this.situpScoreChart = situpScoreChart;
	}

	private void populateSitupChart(Soldier soldier) {
        // TreeMap to have sorted results
		situpScoreChart = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                selectCorrectFile(soldier)))) {
        	
            String line = null;
            while ((line = in.readLine()) != null) {

                String[] data = line.split("\t");

                if (data.length == 2) {
                    int repetitions = Integer.parseInt(data[0]);
                    int score = Integer.parseInt(data[1]);
                    
                    situpScoreChart.put(repetitions, score);
                }
            }
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
    
    private String selectCorrectFile(Soldier soldier) {
    		int age = soldier.getAge();
    		Gender gender = soldier.getGender();
		String fileName = null;
		
		if (age >= 62) {
			fileName = "SU62+.txt";
		} 
		else if (age >= 57) {
			fileName = "SU57-61.txt";
		} 
		else if (age >= 52) {
			fileName = "SU52-56.txt";
		}
		else if (age >= 47) {
			fileName = "SU47-51.txt";
		}
		else if (age >= 42) {
			fileName = "SU42-46.txt";
		}
		else if (age >= 37) {
			fileName = "SU37-41.txt";
		}
		else if (age >= 32) {
			fileName = "SU32-36.txt";
		}
		else if (age >= 27) {
			fileName = "SU27-31.txt";
		}
		else if (age >= 22) {
			fileName = "SU22-26.txt";
		}
		else {
			fileName = "SU17-21.txt";
		}
		return fileName;
    }

}