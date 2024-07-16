//Main class that constructs each individual course and establishes/prints their intended variables//
public class Main {
    public static void main(String[] args){
        System.out.println();

        Cybersecurity cyber = new Cybersecurity("Intro to Cybersecurity", 320, "Computer " +
                "Science", "Online");
        cyber.courseInfo();
        cyber.getMeeting();

        System.out.println();

        Calculus calc = new Calculus("Calculus I",141,"Mathematics", "In Person");
        calc.courseInfo();
        calc.getCalculator();

        System.out.println();

        Chemistry chem = new Chemistry("General Chemistry", 111, "Lab Sciences", "In Person");
        chem.courseInfo();
        chem.getCoat();

    }
}
