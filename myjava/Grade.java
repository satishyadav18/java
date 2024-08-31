package myjava;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the marks of Maths: ");  
      int m = in.nextInt();
      System.out.println("Enter the marks of Hindi: ");
      int h = in.nextInt();
      System.out.println("Enter the value of Science: ");
      int s = in.nextInt();

      int totalMarks = m+h+s;
      float avg = totalMarks / 3;
      System.out.println("Average marks: "+avg);

      if(avg >= 90){
        System.out.println("\"Grade-O\"");
      }
      else if (avg < 90 && avg >= 80){
        System.out.println("Grade-E");
      }
      else if(avg < 80 && avg >= 70){
        System.out.println("Grade-A");
      }
      else if(avg < 70 && avg >= 60){
        System.out.println("Grade-B");
      }
      else if(avg < 60 && avg >= 50){
        System.out.println("Grade-C");
      }
      else if(avg < 50 && avg >= 40){
        System.out.println("Grade-D");
      }
      else{
        System.out.println("Fail");
      }

      in.close();
    }
}
