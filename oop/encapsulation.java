class Student{
    private  String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //getter 
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Ganesh");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}

// You cannot directly access:
// s.age = 20;       // ❌ Error
// s.name = "Ganesh"; // ❌ Error