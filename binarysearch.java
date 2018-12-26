class Binary_Search {
  public static int binarysearch(int[] ast,int size,int num) {
    int i = 0,mid = 0;
    while(i<=size) {
      mid = (size+i)/2;
      if(num == ast[mid])
        return i;
      else {
        if(num <ast[mid])
           size = mid - 1;
        else
           i = mid + 1;
      }
    }
    return -1;
  }
}

public class Main {
  public static void main(String[] args) {
    int sort[] = {12,23,38,42,44,56,66,78,89,99};
    int size = 9;
    int num = 89;

    int temp = Binary_Search.binarysearch(sort,size,num);

    if(temp == -1)
      System.out.println("검색결과가 없습니다");
    else
      System.out.println("검색결과 "+num+"의 위치는 "+ temp+" 입니다");
}
}
