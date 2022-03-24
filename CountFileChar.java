import java.io.*;

public class CountFileChar {
    public static void main(String[] args) throws Exception {
        File newFile = new File("demo.txt");
        BufferedReader br = new BufferedReader(new FileReader(newFile));

        int count = 0;
        String st;

        while ((st = br.readLine()) != null) {
            count += st.length();
        }

        System.out.println(count);
        br.close();
    }
}
