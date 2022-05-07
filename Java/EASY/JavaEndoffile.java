import java.io.*;
import java.util.*;
import java.text.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

HACKERRANK - JAVA END-OF-LINE

Source Help: https://www.geeksforgeeks.org/scanner-class-in-java/

The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

*/


public class ENDOFLINE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (sc.hasNext())
        {
            count++;
            String str = sc.nextLine();

            if(str.contains("end-of-file.")){
                System.out.println(count + " " + str);
                break;
            }else{
                System.out.println(count + " " + str);
            }

        }
    }
}


