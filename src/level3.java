
import java.sql.SQLOutput;
import java.util.Scanner;

class Meals {
    int price;
    String name;

    //-----------------------------------打印欢迎句
    public void printInfo1() {
        System.out.println("欢迎光临红高粱餐厅，这是今天的菜品：");
    }

    //---------------------------------打印菜单
    public void printInfo2() {
        System.out.println(name + " " + price);
    }

    //----------------------------------打印输入的数字
    public void printInfo3(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(i + " ");
        }
    }

    ///-----------------------------打印点的菜
    public void printInfo5(double a[], int b) {
        int c[] = new int[b];
        for (int i = 0; i < b; i++) {

            if (a[i] == 1) {
                System.out.println("1: 鱼香肉丝:18");
                c[i] = 18;
            }
            if (a[i] == 2) {
                System.out.println("2 : 韭菜炒蛋:12");
                c[i] = 12;
            }
            if (a[i] == 3) {
                System.out.println("3 : 土豆:18");
                c[i] = 18;
            }
            if (a[i] == 4) {
                System.out.println("4 : 瓦香鸡:18");
                c[i] = 18;
            }
            if (a[i] == 5) {
                System.out.println("5 : 饺子:18");
                c[i] = 18;
            }
        }
        double sum = 0;
        for (int j = 0; j < c.length; j++) {
            sum = sum + c[j];
        }
        System.out.println("共计     " + sum);
    }

    //---------------------打印付款方式
    public void printMethod() {
        System.out.println("请选择付款方式:");
        System.out.println("1.人脸识别");
        System.out.println("2.微信");
        System.out.println("3.支付宝");
        Scanner scanner = new Scanner(System.in);
        int input2 = scanner.nextInt();

        if (input2 == 2 || input2 == 3) {
            System.out.println("请出示付款码");
        }
        if (input2 == 1) {
            System.out.println("请来拍照鸭");
        }
    }
}

//------------------开始
public class level3 {
    public static void main(String[] args) {

        Meals dish1 = new Meals();
        Meals dish2 = new Meals();
        Meals dish3 = new Meals();
        Meals dish4 = new Meals();
        Meals dish5 = new Meals();
        Scanner scanner = new Scanner(System.in);
        ////////////---
        dish1.price = 18;
        dish1.name = "鱼香肉丝";

        dish2.price = 12;
        dish2.name = "韭菜炒蛋";

        dish3.price = 18;
        dish3.name = "土豆";

        dish4.price = 18;
        dish4.name = "瓦香鸡";

        dish5.price = 18;
        dish5.name = "饺子";


        dish1.printInfo1();
        System.out.print("1:");
        dish1.printInfo2();
        System.out.print("2:");
        dish2.printInfo2();
        System.out.print("3:");
        dish3.printInfo2();
        System.out.print("4:");
        dish4.printInfo2();
        System.out.print("5:");
        dish5.printInfo2();
        System.out.println("请输入想要的菜的序号(空格分隔，回车结束): ");
        //------------------------------/输入数字
        String input = scanner.nextLine();
        input = input.trim();
        String[] temp = input.split(" ");
        double[] nums = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            nums[i] = Double.parseDouble(temp[i]);
        }
        int length = nums.length;
        dish1.printInfo3(length);
        System.out.println("你选择了：");

        dish1.printInfo5(nums, length);
        System.out.println("还有需要的吗？");
        ////---------------------------再次打印
        System.out.print("1:");
        dish1.printInfo2();
        System.out.print("2:");
        dish2.printInfo2();
        System.out.print("3:");
        dish3.printInfo2();
        System.out.print("4:");
        dish4.printInfo2();
        System.out.print("5:");
        dish5.printInfo2();
        System.out.println("请输入想要的菜的序号(空格分隔，回车结束): ");
        //--------------------------------第二次输入数字
        String inPut1 = scanner.nextLine();
        inPut1 = inPut1.trim();
        String[] temp1 = inPut1.split(" ");
        double[] nums1 = new double[temp1.length];

        for (int i = 0; i < temp1.length; i++) {
            nums1[i] = Double.parseDouble(temp1[i]);
        }
        double all[] = new double[nums.length + nums1.length];
        for (int i = 0; i < nums.length; i++) {
            all[i] = nums[i];
        }
        for (int j = 0; j < nums1.length; j++) {
            all[j + nums.length] = nums1[j];
        }
        dish1.printInfo5(all, nums.length + nums1.length);

        dish1.printMethod();

    }
}
