//A Chemistry class that includes the parent variables and a lab coat size variable//
public class Chemistry extends Course{
    char LabCoatSize = 'S';
    Chemistry(String title, int number, String department, String type) {
        super(title, number, department, type);
    }
    public void getCoat(){
        System.out.println("Lab Coat Size: "+LabCoatSize);
    }
}
