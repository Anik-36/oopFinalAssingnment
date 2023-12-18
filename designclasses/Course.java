package designclasses;

public class Course {
    private String courseNam;
    private int courseCode;
    private int credit;
    // constructor 1
    public Course(){
        System.out.println("There is no details about any course.\n\n");
    }
    //constructor 2
    public Course(String n, int c,int cr){
        this.courseNam= n;
        this.courseCode=c;
        this.credit= cr;
    }
    //method
    public void displayInfo(){
        System.out.println("Course name = "+courseNam);
        System.out.println("Course code = "+courseCode);
        System.out.println("Total credit = "+credit);
    }
    public void courseTeacher(String t){
        System.out.println("Course Teacher's name = "+t);
    }
    public void assignment(int a){
        System.out.println("Total assignment = "+a);
    }
    public void examDate(int d){
        System.out.println("Date of final exam = "+d+" December");
    }
    public static void main(String[] args) {
        Course c1= new Course();
        Course c2 = new Course("OOP",115,3);
        c2.displayInfo();
        c2.courseTeacher("Fahim Shahriar");
        c2.assignment(2);
        c2.examDate(22);
    }
}
