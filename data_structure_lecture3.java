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
