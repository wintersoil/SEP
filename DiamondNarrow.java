import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class diamond {


    public static void printDiamond(String a) {
        a = a.toUpperCase();
        char[] letter = a.toCharArray();
        int space = letter[0] - 'A';
        for (int i = 0; i <= space; i++) {
            for (int j = i; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i));
            if(i != 0)
            {
                for (int l = 2*i -1; l > 0; l--) {
                    System.out.print(" ");
                }
            }

            if(i != 0)
                System.out.print((char) ('A' + i));
            System.out.print("\n");

        }
        for (int i = space - 1; i >= 0; i--) {
            for (int j = i; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.print((char) ('A' + i));
            if(i != 0)
            {
                for (int l = 2*i-1; l > 0; l--) {
                    System.out.print(" ");
                }
            }
            if(i != 0)
                System.out.print((char) ('A' + i));
            System.out.print("\n");
        }
    }

    public static void main(String args[]) {
        do {
            System.out.println("Please enter a character between A and Z");
            System.out.println("Any character between a to z will be considered to be their capital counterparts\n\n");
            System.out.println("Type QUIT to quit the program\n\n\n");
            Scanner scan = new Scanner(System.in);
            String a1 = scan.next();
            Pattern regex1 = Pattern.compile("[a-zA-Z]");
            Matcher m = regex1.matcher(a1);
            boolean isLetters = m.matches();
            if(a1.equals("QUIT"))
            {
                System.out.println("Program is exiting");
                break;
            }
            if (a1.length() > 1 || !isLetters) {
                System.out.println("Error: Please reenter a character between A-Z !");
            } else {
                printDiamond(a1);
            }

            System.out.print("\n");
            System.out.print("--------------------------------------------------------------------------------------\n\n\n");
        }while(true);



    }
}
