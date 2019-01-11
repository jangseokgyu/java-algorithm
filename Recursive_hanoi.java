import java.util.*;

public class Main {
static void TowerofHanoi(int n,int a,int b, int c) {
  if(n==1) {
    System.out.println(String.valueOf(a)+" "+String.valueOf(b));
    return;
  }
  TowerofHanoi(n-1,a,c,b);
  System.out.println(String.valueOf(a)+" "+String.valueOf(b));

  TowerofHanoi(n-1,c,b,a);
}
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  int n = scan.nextInt();

  int a=1,b=2,c=3;

  TowerofHanoi(n, a, b, c);

}
}
