//A Calculus class that includes the parent variables and a calculator type variable//
public class Calculus extends Course{
    String calculator = "TI-83 Plus";
    Calculus(String title, int number, String department, String type) {
        super(title, number, department, type);
    }
    public void getCalculator(){
        System.out.println("Required Calculator: "+calculator);
    }
}
