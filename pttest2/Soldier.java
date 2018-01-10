package pttest2;

public class Soldier {
    private Gender gender;
    private int age;
    private int pushups;
    //private int situps;
    //private String runtime;

    public Soldier(Gender gender, int age, int pushups) {
        this.gender = gender;
        this.age = age;
        this.pushups = pushups;
        //this.situps = situps;
        //this.runtime = runtime;
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

    public void display() {
        //TODO:
    }
}