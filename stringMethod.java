import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine(); // nextLine = string, next = character
        // Sikta Adhikary
        // 0123456789
        String sub_str = str.substring(2, 7);
        System.out.println(sub_str);
        sc.close();
    }
}
