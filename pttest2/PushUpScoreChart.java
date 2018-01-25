package pttest2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PushUpScoreChart {
	private Map<Integer, Integer> pushupScoreChart;
	
	public PushUpScoreChart(Soldier soldier) {
		populatePushUpChart(soldier);
	}
	
    public Map<Integer, Integer> getPushupScoreChart() {
		return pushupScoreChart;
	}

	public void setPushupScoreChart(Map<Integer, Integer> pushupScoreChart) {
		this.pushupScoreChart = pushupScoreChart;
	}

	private void populatePushUpChart(Soldier soldier) {
        // TreeMap to have sorted results
        pushupScoreChart = new TreeMap<>();

        try (BufferedReader in = new BufferedReader(new FileReader(
                selectCorrectFile(soldier.getAgeRange(), soldier.getGender())))) {
        	
            String line = null;
            while ((line = in.readLine()) != null) {

                String[] data = line.split("\t");

                if (data.length == 2) {
                    int repetitions = Integer.parseInt(data[0]);
                    int score = Integer.parseInt(data[1]);
                    
                    pushupScoreChart.put(repetitions, score);
                }
            }
        }
        catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
    
    private String selectCorrectFile(AgeRange ageRange, Gender gender) {
		String fileName = null;
		
		if (gender == Gender.MALE) {
			if (ageRange == ageRange.SIXTYTWO_AND_HIGHER) {
				fileName = "MalePU62+.txt";
			} 
			else if (ageRange == ageRange.FIFTYSEVEN_TO_SIXTYONE) {
				fileName = "MalePU57-61.txt";
			} 
			else if (ageRange == ageRange.FIFTYTWO_TO_FIFTYSIX) {
				fileName = "MalePU52-56.txt";
			}
			else if (ageRange == ageRange.FORTYSEVEN_TO_FIFTYONE) {
				fileName = "MalePU47-51.txt";
			}
			else if (ageRange == ageRange.FORTYTWO_TO_FORTYSIX) {
				fileName = "MalePU42-46.txt";
			}
			else if (ageRange == ageRange.THIRTYSEVEN_TO_FORTYONE) {
				fileName = "MalePU37-41.txt";
			}
			else if (ageRange == ageRange.THIRTYTWO_TO_THIRTYSIX) {
				fileName = "MalePU32-36.txt";
			}
			else if (ageRange == ageRange.TWENTYSEVEN_TO_THIRTYONE) {
				fileName = "MalePU27-31.txt";
			}
			else if (ageRange == ageRange.TWENTYTWO_TO_TWENTYSIX) {
				fileName = "MalePU22-26.txt";
			}
			else {
				fileName = "MalePU17-21.txt";
			}
		} 
		else {
			if (ageRange == ageRange.SIXTYTWO_AND_HIGHER) {
				fileName = "FemalePU62+.txt";
			} 
			else if (ageRange == ageRange.FIFTYSEVEN_TO_SIXTYONE) {
				fileName = "FemalePU57-61.txt";
			} 
			else if (ageRange == ageRange.FIFTYTWO_TO_FIFTYSIX) {
				fileName = "FemalePU52-56.txt";
			}
			else if (ageRange == ageRange.FORTYSEVEN_TO_FIFTYONE) {
				fileName = "FemalePU47-51.txt";
			}
			else if (ageRange == ageRange.FORTYTWO_TO_FORTYSIX) {
				fileName = "FemalePU42-46.txt";
			}
			else if (ageRange == ageRange.THIRTYSEVEN_TO_FORTYONE) {
				fileName = "FemalePU37-41.txt";
			}
			else if (ageRange == ageRange.THIRTYTWO_TO_THIRTYSIX) {
				fileName = "FemalePU32-36.txt";
			}
			else if (ageRange == ageRange.TWENTYSEVEN_TO_THIRTYONE) {
				fileName = "FemalePU27-31.txt";
			}
			else if (ageRange == ageRange.TWENTYTWO_TO_TWENTYSIX) {
				fileName = "FemalePU22-26.txt";
			}
			else {
				fileName = "FemalePU17-21.txt";
			}
		}
		return fileName;
    }
	
	
}
