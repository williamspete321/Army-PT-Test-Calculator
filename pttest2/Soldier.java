package pttest2;

public class Soldier {
    private Gender gender;
    private AgeRange ageRange;
    private int pushups;
    //private int situps;
    //private String runtime;

    public Soldier(Gender gender, AgeRange ageRange, int pushups) {
        this.gender = gender;
        this.ageRange = ageRange;
        this.pushups = pushups;
        //this.situps = situps;
        //this.runtime = runtime;
    }

    public AgeRange getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(AgeRange ageRange) {
        this.ageRange = ageRange;
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

    public void display() {
        //TODO:
    }
}