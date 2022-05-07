import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*

Java Static Initializer Block

Source help:
https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful?answertab=votes#tab-top

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height .
You should read the variables from the standard input.

If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise,
print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
*/

public class JSIB {

    public static Scanner scan = new Scanner(System.in);
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();
    public static boolean flag = initializeClassVariable();

    private static boolean initializeClassVariable() {

        try {
            if( B<= 0 ){
                throw new Exception();
            }
            if( H<= 0 ){
                throw new Exception();
            }
        }
        catch(Exception exc)
        {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main
}//end of class

