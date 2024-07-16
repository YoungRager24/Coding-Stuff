//A Cybersecurity course that includes the general variables from the Course class and a meeting type variable//
public class Cybersecurity extends Course {
    String meeting = "Asynchronous";

    public Cybersecurity(String title, int number, String department, String type) {
        super(title, number, department, type);
    }
    public void getMeeting(){
        System.out.println("Meeting Time: "+meeting);
    }
}

