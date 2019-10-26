public class Lv1 {
  public static void main (String[] args){
      int a = 555555;
      int b = a - 1;
      int c = 0;
      while (b > 1){
          if(a % b == 0 && b > 100 && b < 1000 ){


                break;
            }
             b = b - 1;
      }
      System.out.println(b);
  }
}


