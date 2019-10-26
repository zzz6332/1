package level2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Card card1 = new Card("2", "spades");
        Card card2 = new Card("2", "spades");
        Card card3 = new Card("3", "spades");
        Card card4 = new Card("4", "spades");
        Card card5 = new Card("5", "spades");
        Card card6 = new Card("6", "spades");
        Card card7 = new Card("7", "spades");
        Card card8 = new Card("8", "spades");
        Card card9 = new Card("9", "spades");
        Card card10 = new Card("10", "spades");

        Card card11 = new Card("J", "clubs");
        Card card12 = new Card("Q", "clubs");
        Card card13 = new Card("K", "clubs");
        Card card14 = new Card("A", "clubs");
        Card card15 = new Card("2", "clubs");
        Card card16 = new Card("3", "clubs");
        Card card17 = new Card("4", "clubs");
        Card card18 = new Card("5", "clubs");
        Card card19 = new Card("6", "clubs");
        Card card20 = new Card("7", "clubs");
        Card card21 = new Card("8", "clubs");
        Card card22 = new Card("9", "clubs");
        Card card23 = new Card("10", "clubs");
        Card card24 = new Card("J", "clubs");
        Card card25 = new Card("Q", "clubs");
        Card card26 = new Card("K", "clubs");
        Card card27 = new Card("A", "clubs");

        Card card28 = new Card("2", "hearts");
        Card card29 = new Card("3", "hearts");
        Card card30 = new Card("4", "hearts");
        Card card31 = new Card("5", "hearts");
        Card card32 = new Card("6", "hearts");
        Card card33 = new Card("7", "hearts");
        Card card34 = new Card("8", "hearts");
        Card card35 = new Card("9", "hearts");
        Card card36 = new Card("10", "hearts");
        Card card37 = new Card("J", "hearts");
        Card card38 = new Card("Q", "hearts");
        Card card39 = new Card("K", "hearts");
        Card card40 = new Card("A", "hearts");

        Card card41 = new Card("2", "diamonds");
        Card card42 = new Card("3", "diamonds");
        Card card43 = new Card("3", "diamonds");
        Card card44 = new Card("3", "diamonds");
        Card card45 = new Card("3", "diamonds");
        Card card46 = new Card("3", "diamonds");
        Card card47 = new Card("3", "diamonds");
        Card card48 = new Card("3", "diamonds");
        Card card49 = new Card("3", "diamonds");
        Card card50 = new Card("3", "diamonds");
        Card card51 = new Card("3", "diamonds");
        Card card52 = new Card("3", "diamonds");

        Card card53 = new Card("大王");
        Card card54 = new Card("小王");

        //---------------打印
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
        card4.printInfo();
        card5.printInfo();
        card6.printInfo();
        card7.printInfo();
        card8.printInfo();
        card9.printInfo();
        card10.printInfo();
        card11.printInfo();
        card12.printInfo();
        card13.printInfo();
        card14.printInfo();
        card15.printInfo();
        card16.printInfo();
        card17.printInfo();
        card18.printInfo();
        card19.printInfo();
        card20.printInfo();
        card21.printInfo();
        card22.printInfo();
        card23.printInfo();
        card24.printInfo();
        card25.printInfo();
        card26.printInfo();
        card27.printInfo();
        card28.printInfo();
        card29.printInfo();
        card30.printInfo();
        card31.printInfo();
        card32.printInfo();
        card33.printInfo();
        card34.printInfo();
        card35.printInfo();
        card36.printInfo();
        card37.printInfo();
        card38.printInfo();
        card39.printInfo();
        card40.printInfo();
        card41.printInfo();
        card42.printInfo();
        card43.printInfo();
        card45.printInfo();
        card46.printInfo();
        card47.printInfo();
        card48.printInfo();
        card49.printInfo();
        card50.printInfo();
        card51.printInfo();
        card52.printInfo();
        card53.printInfo();
        card54.printInfo();

        //---------------开始游戏
        //----------------规则：系统分别给RNG和FNC三张牌，并分出一张牌对比
        //**---------给出随机数
        Game[] array = new Game[3];
        int a = (int) (Math.random() * 13 + 3);
        ;
        int b = (int) (Math.random() * 13 + 3);
        ;
        int c = (int) (Math.random() * 13 + 3);
        ;
        int d = (int) (Math.random() * 13 + 3);
        ;
        int e = (int) (Math.random() * 13 + 3);
        ;
        int f = (int) (Math.random() * 13 + 3);
        ;
        Game s1 = new Game(a);
        Game s2 = new Game(b);
        Game s3 = new Game(c);

        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        //**---------------打印对手的牌
        array[0].printInfo1();
        for (int i = 0; i < 3; i++) {
            array[i].printInfo2();
        }
        //-------------------打印完毕
        Game s4 = new Game(d);
        Game s5 = new Game(e);
        Game s6 = new Game(f);
        Game array1[] = new Game[3];
        array1[0] = s4;
        array1[1] = s5;
        array1[2] = s6;
        array1[1].printInfo3();
        //----------打印自己的牌
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ": ");
            array1[i].printInfo2();
        }
        //---------------------打印完毕
        //--------------------打印对手出的牌
        int g = (int) (1 + Math.random() * (3 - 1 + 1));
        array1[0].printInfo4(g, array);
        //----------------------打印提示语
        array1[0].printInfo5();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        //----------------你出的牌
        array1[0].printInfo6(num1, array1);
        //---------------比较大小
        array1[0].compare(array[g - 1], array1[num1 - 1]);

    }
}

