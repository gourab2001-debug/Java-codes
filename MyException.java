import java.util.Scanner;

class NoMatchException extends Exception {
    NoMatchException(String s) {
        super(s);
    }
}

public class MyException {
    static void checkString(String str) throws NoMatchException {
        if (str.equals("DCST")) {
            System.out.println("String Matched!!");
        } else {
            throw new NoMatchException(str + " is not DCST");
        }
    }

    public static void main(String[] args) throws NoMatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.next();

        try {
            checkString(str);
        } catch (NoMatchException e) {
            System.out.println("Caught Exception..");
            System.out.println("Exception Occurred : " + e);
        }
        sc.close();
    }
}
