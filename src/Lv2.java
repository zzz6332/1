 public class Lv2 {
     public static void main(String[] args) {
         //上半部分
         int a = 30;
         for (int b = 1; b < 9; b++) {
             for (int c = 1; c <= 48 - 6 * b; c++) {
                 System.out.print(" ");

             }
             for (int d = 0; d < b; d++) {
                 System.out.print(" *");
             }
             System.out.print("\n");
         }
         //下半部分

         for (int e = 7,j = 7; e >= 1; e--,j--) {
             for (int f = 1; f <= 48 - 6 * e; f++) {
                 System.out.print(" ");
             }
                 for (int h = 0; h < j; h++) {
                     System.out.print(" *");

                 }
                    System.out.print("\n");

         }
     }
 }

