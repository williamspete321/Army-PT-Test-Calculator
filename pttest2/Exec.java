package pttest2;

import java.util.Scanner;

public class Exec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pushupNum;
		int situpNum;
		int runMinutes;
		int runSeconds;
		Gender gender;
		int age;
		
		gender = getGender(scanner);
		age = getAge(scanner);
		pushupNum = getPushUps(scanner);
		situpNum = getSitUps(scanner);
		runMinutes = getMinutes(scanner);
		runSeconds = getSeconds(scanner);
		
		scanner.close();
		
		Soldier soldier =  new Soldier(gender, age, pushupNum, situpNum, runMinutes, runSeconds);
		
		System.out.println(PushupCalculator.getInstance().calculatePushupScore(soldier));
		System.out.println(SitupCalculator.getInstance().calculateSitupScore(soldier));
		System.out.println(RuntimeCalculator.getInstance().calculateRuntimeScore(soldier));

		// everything works BUT
		// this seems super messy, is there an easier way to get a total score and show overall PASS/FAIL?
		System.out.println(
				TotalScoreCalculator.getInstance().calculateTotalScore(
						PushupCalculator.getInstance().calculatePushupScore(soldier), 
						SitupCalculator.getInstance().calculateSitupScore(soldier), 
						RuntimeCalculator.getInstance().calculateRuntimeScore(soldier))
							);
		
	}
	
	public static Gender getGender(Scanner scanner) {
		char input;
		Gender gender;
		
		while (true) {
			System.out.println("Enter the soldier's gender (M/F) : ");
			input = scanner.next().charAt(0);
			
			if (input == 'M' || input == 'm') {
				gender = Gender.MALE;
				break;
			} else if (input == 'F' || input == 'f') {
				gender = Gender.FEMALE;
				break;
			} else {
				System.out.println("You must enter M for Male or F for Female.");
			}
		}
		return gender;
	}
	
	public static int getAge(Scanner scanner) {
		String ageString = "";
		int age = 0;
	
		while (age < 17) {
			
			System.out.println("Enter the soldier's age: ");
			ageString = scanner.next();
		
			try
			{
				age = Integer.parseInt(ageString);
				if (age<17) {
					System.out.println("You must enter an age of 17 or higher.");
				}
			}
			catch(Exception e)
			{
				System.out.println("ERROR: Invalid Data.");
			}
		}
			return age;
	}
	
	public static int getPushUps(Scanner scanner) {
		String pushupNumString;
		int pushupNum = -1;
		
		
		while (pushupNum < 0) {
			System.out.println("Enter the number of pushups: ");
			pushupNumString = scanner.next();
			try
			{
			  pushupNum = Integer.parseInt(pushupNumString);
			  if (pushupNum < 0) {
				  System.out.println("You must enter 0 or higher.");
			  }
			}
			catch(Exception e)
			{
			  System.out.println("ERROR: Invalid Data.");
			}
		}
		return pushupNum;
	}
	
	public static int getSitUps(Scanner scanner) {
		String situpNumString;
		int situpNum = -1;
		
		while (situpNum < 0) {
			System.out.println("Enter the number of situps: ");
			situpNumString = scanner.next();
			try
			{
			  situpNum = Integer.parseInt(situpNumString);
			  if (situpNum < 0) {
				  System.out.println("You must enter 0 or higher.");
			  }
			}
			catch(Exception e)
			{
			  System.out.println("ERROR: Invalid Data.");
			}
		}
		return situpNum;
	}

	public static int getMinutes(Scanner scanner) {
		String minutesString;
		int minutes = -1;
		
		while (minutes < 0) {
			System.out.println("Enter the runtime minutes: ");
			minutesString = scanner.next();
			try
			{
			  minutes = Integer.parseInt(minutesString);
			  if (minutes < 0) {
				  System.out.println("You must enter 0 or higher.");
			  }
			}
			catch(Exception e)
			{
			  System.out.println("ERROR: Invalid Data.");
			}
		}
		return minutes;
	}
	
	public static int getSeconds(Scanner scanner) {
		String secondsString;
		int seconds = -1;
		
		while (seconds < 0 || seconds > 59) {
			System.out.println("Enter the runtime seconds: ");
			secondsString = scanner.next();
			try
			{
			  seconds = Integer.parseInt(secondsString);
			  if (seconds < 0) {
				  System.out.println("You must enter 0 seconds or higher.");
			  }
			  if (seconds > 59) {
				  System.out.println("You must enter 59 seconds or lower.");
			  }
			}
			catch(Exception e)
			{
			  System.out.println("ERROR: Invalid Data.");
			}
		}
		return seconds;
	}

}