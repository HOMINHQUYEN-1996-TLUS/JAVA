import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        long a = Input.nextInt();
        long b = Input.nextInt();
        long min = min(a, b);
        long max = max(a, b);
        long tong = 0;
        double temp = Math.sqrt(min);
        for (int i = 1; i <= temp; i++) {
            if (min % i == 0) {
                long res = min(a, b) / i;
                if (max % i == 0) {
                    tong = tong + i;
                }
                if (max % res == 0) {
                    tong = tong + res;
                }
            }
        }
        System.out.println("Tong cac uoc cua a va b la : " + tong);
        Input.close();
    }

    static long min(long a, long b) {
        long min1 = a;
        if (min1 < b) {
            return min1;
        } else
            return b;
    }

    static long max(long a, long b) {
        long max1 = a;
        if (max1 > b) {
            return max1;
        } else
            return b;
    }
}