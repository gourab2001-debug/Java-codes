import java.util.Scanner;
class student {
    private int roll_no;
    private String name;

    student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    
    void display(){
        System.out.println("Student's name : " + name);
        System.out.println("Student's Roll No : " + roll_no);
    }
}
public class ObjectArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_students = 3;
        student[] students = new student[no_of_students];
        
        for(int i = 0; i < no_of_students; i++) {
            System.out.print("Enter roll no & name: ");
            int roll_no = sc.nextInt();
            String name = sc.nextLine();
            students[i] = new student(roll_no, name);
        }
        
        
        System.out.println("\nDetails of the students");
        for(int i = 0; i<no_of_students; i++) {
            System.out.println("\nStudent No " + (i+1));
            students[i].display();
        }

        sc.close();
    }
}
