import java.util.Scanner;

public class Student {
    String name;
    Student(String a)
    {
        name = s;
    }
    Student ()
    {
        name ="unknown";
    }
}
class mains
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Student obj1 = new Student();
        Student obj2 = new Student(n);
    }
}