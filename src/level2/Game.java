package level2;

import java.util.Scanner;

public class Game {
   private int num;
   private String point;
   public Game(int num){
       this.num = num;
   }
        // -------------------------- 打印对手
   public void printInfo1() {
       System.out.println("FNC有如下牌：");
   }
        // ---------------------------打印对手的牌
   public void printInfo2(){
       if(this.num==11){
           this.point ="J";
           System.out.println(this.point + "  ");
       }
       else if(this.num==12){
           this.point ="Q";
           System.out.println(this.point + "  ");
       }
       else if (this.num==13){
           this.point ="K";
           System.out.println(this.point + "  ");
       }
       else if (this.num==14){
           this.point ="A";
           System.out.println(this.point + "  ");
       }
       else if (this.num==15){
           this.point ="小王";
           System.out.println(this.point + "  ");
       }
       else if (this.num==16){
           this.point ="大王";
           System.out.println(this.point + "  ");
       }else {
           System.out.println(this.num +"  ");
       }
}
                      //-------------打印手牌
public void printInfo3(){
    System.out.println("RNG的手牌有：" + "  ");
}
    public void printInfo4(int a,Game[] b){
    System.out.print("FNC出了:" );
        if(b[a-1].num==11){
            this.point ="J";
            System.out.println(b[a-1].point + "  ");
        }
        else if(b[a-1].num==12){
            this.point ="Q";
            System.out.println(b[a-1].point + "  ");
        }
        else if (b[a-1].num==13){
            this.point ="K";
            System.out.println(b[a-1].point + "  ");
        }
        else if (b[a-1].num==14){
            this.point ="A";
            System.out.println(b[a-1].point + "  ");
        }
        else if (b[a-1].num==15){
            this.point ="小王";
            System.out.println(b[a-1].point + "  ");
        }
        else if (b[a-1].num==16){
            this.point ="大王";
            System.out.println(b[a-1].point + "  ");
        }else {
            System.out.println(b[a-1].num +"  ");
        }
}
                      //-------------------打印提示语
public void printInfo5(){
    System.out.println("请输入RNG要出的牌(1,2,3)：");
}
public void printInfo6(int a, Game[] b){
    System.out.println("RNG打出了：" );
    if(b[a-1].num==11){
        this.point ="J";
        System.out.println(b[a-1].point + "  ");
    }
    else if(b[a-1].num==12){
        this.point ="Q";
        System.out.println(b[a-1].point + "  ");
    }
    else if (b[a-1].num==13){
        this.point ="K";
        System.out.println(b[a-1].point + "  ");
    }
    else if (b[a-1].num==14){
        this.point ="A";
        System.out.println(b[a-1].point + "  ");
    }
    else if (b[a-1].num==15){
        this.point ="小王";
        System.out.println(b[a-1].point + "  ");
    }
    else if (b[a-1].num==16){
        this.point ="大王";
        System.out.println(b[a-1].point + "  ");
    }else {
        System.out.println(b[a-1].num +"  ");
    }
}
public void compare(Game a, Game b){
       if(a.num > b.num){
           System.out.println("RNG输了..................");
       }
       else if (a.num == b.num){
           System.out.println("平局!!!!!!!!!!!!!!!!!!!1");
       }
       else {
           System.out.println("RNG赢了.!!!!!!!!!!!!!!!!!!!!!!!!!..");
       }
}
}
