import java.util.Scanner;
public class Lv4 {

    public static void main(String[] args) {
        //输时间戳
        Scanner input = new Scanner(System.in);
        long time = input.nextLong();

        long year;
        long month;
        long day;
        long x = time / 86400;                          // x=天数
        long y = x / 1461;
        long a = time - 1461 * 86400 * y;//一个周期内时间戳
        long b = a / 86400;//   //一个周期内天数
        long c = time;
        long d[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long f[] = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long g[] = {30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //
        //判断是不是闰年
        //如果是平年
        if (b <= 365) {
            year = 1970 + 4 * y;
            long sum = b;
            int i;
            for(i=0;f[i] <= sum ;i++) {
                sum = sum - f[i];
            }
            month = i + 1;
            day = sum;
        } else if (b > 365 && b < 730) {
            year = 1971 + 4 * y;
            long sum = b - 365 ;
            int i;
            for(i=0; (f[i] < sum); i++) {
                sum = sum - f[i];
            }
            month = i + 1;
            day = sum;
        } else if (b >= 1196) {
            year = 1973 + 4 * y;
            long sum = b - 365 - 366 - 365;
            int i;
            for(i=0;f[i] <= sum ;i++) { ;
                sum = sum - f[i];
            }
            month = i + 1;
            day = sum;
        }
        //如果是闰年
        else {
            year = 1972 + 4 * y;
            long sum = b - 365 -365 ;
            int i;
            for(i=0;f[i] <= sum ;i++) {
                sum = sum - f[i];
            }
            month = i + 1;
            day = sum;
        }
        System.out.print(c);
        System.out.print("=" + year + "年" + month + "月" + day + "日");
    }
}





