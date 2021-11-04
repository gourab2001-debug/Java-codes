import java.io.*;
//To show the difference between static and instance variable in java
class marks{
    static int pass_marks;
    int st_marks; 
    //constructor to set initialize the passmarks 
    marks(int val){
        pass_marks = val;
    } 
    //to set the value of the instance variable student marks  
    void set_marks(int val){
        st_marks = val;
    }
    // returns true if the student marks is greater than or equal to passmarks
    // else returns false
    boolean isPass(){
        if(st_marks >= pass_marks)
        return true;
        return false;
    }
    // to display the data
    void display(){
        System.out.println("Passing marks: " + pass_marks);
        System.out.println("Your marks: " + st_marks);
        if(isPass()){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are failed");
        }
    }
}

public class static_ins{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int studentMarks;
        //Taking inputs for the student 1
        marks st1 = new marks(Integer.parseInt(br.readLine()));
        System.out.println("Enter the marks of the student 1 : ");
        studentMarks = Integer.parseInt(br.readLine());
        st1.set_marks(studentMarks);
        st1.display();
        // Taking inputs of the student 2
        marks st2 = new marks(Integer.parseInt(br.readLine()));
        System.out.println("Enter the marks of the student 2 : ");
        studentMarks = Integer.parseInt(br.readLine());
        st2.set_marks(studentMarks);
        st2.display();

        // pass marks is changed for both as it was a static member
        st1.display();
        
    }
}