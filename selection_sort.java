public class cal {
  private int[] str = new int[8];
  private int index;

  public cal(int[] a,int n) {
    this.str = a;
    this.index = n;
  }
  public void method() {
    int temp;

    for(int i=0;i<index;i++) {
      int min = i;
      for(int j = i+1;j<index;j++) {
        if(str[min] > str[j]) {
          min = j;
        }
      }
      temp = str[i];
      str[i] = str[min];
      str[min] = temp;

      for(int x=0;x<index;x++) {
      System.out.print(str[x]+" ");
      }
      System.out.println();
    }
  }
}
//---------------------------------
//---------------------------------
public class Main {
  public static void main(String[] args) {
    int[] sort = {80,75,10,60,15,49,12,25};

    cal fuck = new cal(sort,8);

    fuck.method();
  }
}
