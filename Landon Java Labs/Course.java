//This program displays a basic inheritance relationship between a college course parent class and its children//
public class Course {

    protected String title;
    protected int number;
    protected String department;
    protected String type;

//Establishes the basic variables needed for any college course//
    Course(String title, int number, String department, String type){

        this.title = title;
        this.number = number;
        this.department = department;
        this.type = type;
    }
//Method that can be connected to each courses constructor to print the varying information//
    public void courseInfo(){
        System.out.println("Course Name: "+title+"\nCourse Number: "+number+"\nDepartment: "+department+
                "\nCourse Type: "+type);

    }


}