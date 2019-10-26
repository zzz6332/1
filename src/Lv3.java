import javax.sound.midi.SysexMessage;

public class Lv3 {
    public static void main(String args[]){
        int num1[] = {123,156,187};
        int num2[] = {145,154,199,201};
        int num3[] = null;
        num3 = new int[7];
        System.out.print("小本本1：{");
        for(int a = 0;a < 3;a++) {
            num3[a] = num1[a];


            System.out.print(num1[a] + " ");
        }
            System.out.println("}");
        System.out.print("小本本2：{");

        for(int b = 0;b < 4;b++) {
            num3[num1.length + b] = num2[b];

            System.out.print(num2[b] + " ");
        }
             System.out.println("}");
        System.out.println("合并之后");
        for(int c = 1;c < 7;c++){
            for(int d = 0;d < 7;d++) {
                if (num3[c] < num3[d]) {
                    int e = num3[c];
                    num3[c] = num3[d];
                    num3[d] = e  ;
                }
            }
        }
        System.out.print("小本本：{");
                for(int f =0;f < 7;f++){
                    System.out.print( num3[f] + " ");
                }
                System.out.print("}");
                System.out.println("");

                System.out.print("找到中间的学妹:");
                  System.out.print(num3[num3.length / 2] );



    }
}
