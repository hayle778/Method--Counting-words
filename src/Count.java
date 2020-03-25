// Write a method to count all words in a string

import java.util.Scanner;

public class Count {
public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    String yumi;
    System.out.println("Input a String:");
    yumi = input.nextLine();

    // method calling
    System.out.println("Number of words in the string:" + count_Words(yumi) +"\n");
    String num;
}

    private static int count_Words(String yumi) {
    int count = 0;
    if(!("" . equals(yumi.substring(0, 1)))||!("".equals(yumi.substring(yumi.length() - 1)))){
        for(int i = 0; i < yumi.length(); i++) {
            if (yumi.charAt(i) == ' ')
            {
                count++;
            }
        }
             count = count + 1;
        }
          return count;// returns 0 if string starts or ends with space

    }


}

