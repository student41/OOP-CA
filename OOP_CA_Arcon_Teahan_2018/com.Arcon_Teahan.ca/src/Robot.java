public class Robot {

    private String name;
    private int numMotors;
    private double pwrDuration;






    //no argument constructor
    public Robot(){
        this("Unknown",0,0.00f);
    }

    //3 argument constructor
    public Robot(String name,int numMotors,double pwrDuration){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMotors() {
        return numMotors;
    }

    public void setNumMotors(int numMotors) {
        this.numMotors = numMotors;
    }

    public double getPwrDuration() {
        return pwrDuration;
    }

    public void setPwrDuration(double pwrDuration) {
        this.pwrDuration = pwrDuration;
    }

    public String toString() {
        return String.format(" Name:%20s\n Number of Motors:%1\n Power Duration:%10.2f m.\n\n",
                getName(),getNumMotors(),getPwrDuration());
    }
}
