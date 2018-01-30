package pttest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RuntimeScoreChart {
	private Map<Integer, Integer> runtimeScoreChart;
	
	public RuntimeScoreChart(Soldier soldier) {
		populateRuntimeScoreChart(soldier);
	}
	
    public Map<Integer, Integer> getRuntimeScoreChart() {
		return runtimeScoreChart;
	}

	public void setRuntimeScoreChart(Map<Integer, Integer> runtimeScoreChart) {
		this.runtimeScoreChart = runtimeScoreChart;
	}

	private void populateRuntimeScoreChart(Soldier soldier) {
        // TreeMap to have sorted results
        runtimeScoreChart = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                selectCorrectFile(soldier)))) {
        	
            String line = null;
            while ((line = in.readLine()) != null) {

                String[] data = line.split("\t");

                if (data.length == 2) {
                    int runtime = Integer.parseInt(data[0]);
                    int score = Integer.parseInt(data[1]);
                    
                    runtimeScoreChart.put(runtime, score);
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
		
		if (gender == Gender.MALE) {
			if (age >= 62) {
				fileName = "MaleRUN62+.txt";
			} 
			else if (age >= 57) {
				fileName = "MaleRUN57-61.txt";
			} 
			else if (age >= 52) {
				fileName = "MaleRUN52-56.txt";
			}
			else if (age >= 47) {
				fileName = "MaleRUN47-51.txt";
			}
			else if (age >= 42) {
				fileName = "MaleRUN42-46.txt";
			}
			else if (age >= 37) {
				fileName = "MaleRUN37-41.txt";
			}
			else if (age >= 32) {
				fileName = "MaleRUN32-36.txt";
			}
			else if (age >= 27) {
				fileName = "MaleRUN27-31.txt";
			}
			else if (age >= 22) {
				fileName = "MaleRUN22-26.txt";
			}
			else {
				fileName = "MaleRUN17-21.txt";
			}
		} 
		else {
			if (age >= 62) {
				fileName = "FemaleRUN62+.txt";
			} 
			else if (age >= 57) {
				fileName = "FemaleRUN57-61.txt";
			} 
			else if (age >= 52) {
				fileName = "FemaleRUN52-56.txt";
			}
			else if (age >= 47) {
				fileName = "FemaleRUN47-51.txt";
			}
			else if (age >= 42) {
				fileName = "FemaleRUN42-46.txt";
			}
			else if (age >= 37) {
				fileName = "FemaleRUN37-41.txt";
			}
			else if (age >= 32) {
				fileName = "FemaleRUN32-36.txt";
			}
			else if (age >= 27) {
				fileName = "FemaleRUN27-31.txt";
			}
			else if (age >= 22) {
				fileName = "FemaleRUN22-26.txt";
			}
			else {
				fileName = "FemaleRUN17-21.txt";
			}
		}
		return fileName;
    }

}