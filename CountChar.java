import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any messege: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0, others = 0;

        char[] charArr = str.toCharArray();
        for (char i : charArr) {
            int ascii = i;
            if ((ascii <= 90 && ascii >= 65) || (ascii <= 122 && ascii >= 97)) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'O'
                        || i == 'U' || i == 'I') {
                    vowels++;
                } else
                    consonants++;
            } else
                others++;
        }
        System.out.println("No of Vowels = " + vowels);
        System.out.println("No of consonants = " + consonants);
        System.out.println("No of others = " + others);
        sc.close();
    }
}
