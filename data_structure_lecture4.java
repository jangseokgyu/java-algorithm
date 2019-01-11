import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int age;
    String name;
    String gender;

    Scanner scan = new Scanner(System.in);

    age = scan.nextInt();
    name = scan.next();
    gender = scan.next();

    if (gender.equals("male"))
       System.out.println("you are : " + gender);
    else
       System.out.println("you are : " + "interesting");
    
    scan.close();
  }
}
/*
import java.util.*;

public class Main {
  public static void main(String[] args) {
  
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] ages = new int[n];

    for(int i=0;i<n;i++) {
      ages[i] = scan.nextInt();
    }
    for(int i=0;i<ages.length;i++)
      System.out.println(ages[i]);
  }
}
*/
