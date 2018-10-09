import javax.swing.*;

public class RobotAnalysis {


    //numRobots is used to determine the number of Robots required by the user
    private static int numRobots=5;
   public Robot robotTeam[] = new Robot[numRobots];

    private String name;
    private int numMotors;
    private double pwrDuration;


    //enhanced for loop used to create the robots
for (Robot r : robotTeam) {
        name = JOptionPane.showInputDialog("Enter Title");
        numMotors = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Motors"));
        pwrDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter Duration"));

        r = new Robot(name,numMotors,pwrDuration);

        System.out.println(r.toString());
    }








    /** Class method to display robotTeam
     *
     *
     *
     */


    public static void display(Robot[] robotTeam){

        JTextArea jta = new JTextArea("Team:\n");
        for (int i=0; i<numRobots; i++){
            jta.append("Name: " + robotTeam[i]. getName()+"\n");
            jta.append("Number of Motors: " + robotTeam[i]. getNumMotors()+" \n");
            jta.append("Power Duration: " + (robotTeam[i]. getPwrDuration()+"hrs")+"\n");
        }

        JOptionPane.showMessageDialog(null,jta);

    }


    public static void main(String[] args) {
       numRobots= Integer.parseInt(JOptionPane.showInputDialog("Enter Number of robots."));
     //   RobotAnalysis.display(robotTeam);
    }


}



