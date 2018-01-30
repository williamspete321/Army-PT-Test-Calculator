package pttest2;

public class Soldier {
    private Gender gender;
    private int age;
    private int pushups;
    private int situps;
    private int runMinutes;
    private int runSeconds;
    private int formattedRuntime;
    private String originalRuntime;

    public Soldier(Gender gender, int age, int pushups, int situps, int runMinutes, int runSeconds) {
        this.gender = gender;
        this.age = age;
        this.pushups = pushups;
        this.situps = situps;
        this.runMinutes = runMinutes;
        this.runSeconds = runSeconds;
		this.formattedRuntime = formatRuntime(runMinutes, runSeconds);
		this.originalRuntime = readableRuntime(runMinutes, runSeconds);
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getPushups() {
        return pushups;
    }

    public void setPushups(int pushups) {
        this.pushups = pushups;
    }
    
    public int getSitups() {
        return situps;
    }

    public void setSitups(int situps) {
        this.situps = situps;
    }

    public int getRunMinutes() {
		return runMinutes;
	}

	public void setRunMinutes(int runMinutes) {
		this.runMinutes = runMinutes;
	}

	public int getRunSeconds() {
		return runSeconds;
	}

	public void setRunSeconds(int runSeconds) {
		this.runSeconds = runSeconds;
	}

	public int getFormattedRuntime() {
		return formattedRuntime;
	}

	public void setFormattedRuntime(int formattedRuntime) {
		this.formattedRuntime = formattedRuntime;
	}

	public String getOriginalRuntime() {
		return originalRuntime;
	}

	public void setOriginalRuntime(String originalRuntime) {
		this.originalRuntime = originalRuntime;
	}

	public void display() {
        //TODO:
    }
    
	private int formatRuntime(int minutes, int seconds) {
		
		int remainder = seconds % 6;
		
		int formattedSecs;
		int formattedMinutes;
		int formattedRun;
		
		formattedMinutes = minutes * 100;
		
		/* the seconds need to be divisible by 6, this function adds additional 
		   seconds to bring the score to the next highest number of seconds 
		   that are divisible by 6. for example, if a soldier had 45 seconds, then
		   their new formatted seconds would equal 48 */
		
		if (remainder == 0) 
		{
			formattedSecs = seconds;
		}
		else 
		{
			formattedSecs = (seconds - remainder) + 6; 
		}
		
		formattedRun = formattedMinutes + formattedSecs;
		
		return formattedRun;
	}
	
	private String readableRuntime(int minutes, int seconds) {
		String runtime;
		
		if (seconds < 10) 
		{
			runtime = Integer.toString(minutes) + ":0" + Integer.toString(seconds);
		} 
		else 
		{
			runtime = Integer.toString(minutes) + ":" + Integer.toString(seconds);
		}
		
		return runtime;
	}
}