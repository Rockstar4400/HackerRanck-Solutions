/*
* HACKRANK - JAVA - STRINGS - STRING INTRODUCTION
*
* Source:
* https://www.hackerrank.com/challenges/java-strings-introduction/problem
*
* "A string is traditionally a sequence of characters, either as a literal
* constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String
declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a
String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

1.Sum the lengths of A and B.
2.Determine if A is lexicographically larger than B (i.e.: does B come before A
in the dictionary?).
3.Capitalize the first letter in A and B and print them on a
single line, separated by a space.

Input Format

The first line contains a string A. The second line contains another string B.
The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically larger than B
or No if it is not.
For the third line, capitalize the first letter in both A and B and print
them on a single line, separated by a space.

Sample Input

hello
java

Sample Output

9
No
Hello Java

Explanation

String A is "hello" and B is "java".

A has a length of 5, and  has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" comes before "java";
therefore,A is not larger than B and the answer is No.

When you capitalize the first letter of both A and B and then print them
separated by a space, you get "Hello Java".
*
*/
import java.util.*;
public class STRINGINTRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Constructor
        String A = sc.next(); // Input A
        String B = sc.next(); // Input B
        int sum = 0; // Initializing sum
        int letter1 = A.length(); // Define letter 1
        int letter2 = B.length(); // Define letter 2
        sum = letter1 + letter2; // Sum length
        System.out.println(sum); // Print sum

        if(A.charAt(0) > B.charAt(0)) { // Condition if A[0] > B[0]
            System.out.println("Yes"); // Print Yes
        }else System.out.println("No"); // Else print No

        System.out.println(A.toUpperCase().charAt(0) + A.substring(1,A.length())+
        " " + B.toUpperCase().charAt(0) + B.substring(1,B.length())); // Concat Strings and UpperCase first letter
    }
}
