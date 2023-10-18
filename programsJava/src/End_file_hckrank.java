import java.util.Scanner;

public class End_file_hckrank {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int count = 1;

//        each time, a line is inputed, it reaches the end of the file and gives out the output instantly.
        while (line.hasNextLine()) {
            String sLine = line.nextLine();
            System.out.println(count + " " + sLine);
            count++;
        }

    }
}
