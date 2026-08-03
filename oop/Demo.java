public class Demo {
    public static void main(String[] args) {
        student s1 = new student("John", 20, 38);
       
        System.out.println(s1.rollno);
    }
}

class student {
    String name;
    int age;
    int rollno;
    String collage;

  student(String name, int age, int rollno){
    // here this is used to call the constructor with 4 parameters from the constructor with 3 parameters 
       this(name, age, rollno, "Default Collage");
       System.out.println("Constructor with 3 parameters called");
    };

    student(String name, int age, int rollno, String collage){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.collage = collage;
        System.out.println("Constructor with 4 parameters called");
    }
}