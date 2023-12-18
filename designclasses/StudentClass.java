package designclasses;

public class StudentClass {
    private String name;
    private int age;
    private int id;
    public StudentClass(){
        System.out.println("No value is provided.\n\n");
    }
    public StudentClass(String name, int age,int id){
        this.name = name;
        this.age = age;
        this.id=id;
    }
    
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
    }
    private void Courses(int x){
        System.out.println("Taken "+x+" Courses.");
    }
    public void Exam(int date){
        System.out.println("Exam starts At Nov "+ date);
    }
    public void Assignment(String course){
        System.out.println("Remaining Assignment: "+ course);
    }
    public static void main(String[] args) {
        StudentClass st1 = new StudentClass();
        StudentClass st2 = new StudentClass("Anik", 24,27223);
        st2.displayInfo();
        st2.Assignment("CSE");
        st2.Exam(1);
        st2.Courses(7);
    }
    
}