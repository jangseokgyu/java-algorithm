import java.util.Scanner;
//존냉 어렵낸 ㅅㅂ 하다 안되서 소스 봤다 ㅅㅂ 아 제기랄.
public class Main {
  public static void getPossible(String code) {
    long[] dynamic=new long[code.length()+1];
    dynamic[0]=1;
    dynamic[1]=1;
    
    if(code.charAt(0)=='0'){//0으로 시작하는 경우
    System.out.println(0);
    return;
    }
    
    for(int i=1; i<code.length(); i++) {
      char pri = code.charAt(i - 1);//이전 숫자
      if(code.charAt(i) >= '1' && code.charAt(i)<='9'){//혼자올수있음
      dynamic[i+1]+=dynamic[i];
      dynamic[i+1]%=1000000;
      }
      
      if (!(pri == '0' || pri > '2' || (pri == '2' && code.charAt(i) > '6'))) {
        dynamic[i + 1] += dynamic[i-1];
        dynamic[i+1]%=1000000;
        
        }  
        dynamic[i + 1] %= 1000000000;
    }

        System.out.println(dynamic[code.length()]%1000000000);
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String code = scan.next();
    
    getPossible(code);
    }
}
