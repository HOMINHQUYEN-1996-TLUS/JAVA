import java.util.Scanner;

public class hello {
    public static Scanner Input = new Scanner(System.in);

    public static void main(String[] arg) {

        // ThapphanToNhiphan();
        // NhiphanToThapphan();
        // xuatmang(nhapmang(5));
        phantulonnhat(3);
    }

    static void ThapphanToNhiphan() {
        System.out.print("Nhap vao a : ");
        int a = Input.nextInt();
        String nhiphan = "";
        while (a > 0) {
            if (a % 2 == 1) {
                nhiphan = nhiphan + "1";
            }
            if (a % 2 == 0) {
                nhiphan = nhiphan + "0";
            }
            a = a / 2;
        }
        /*
         * Sau khi co chuoi nhi phan. Nhung vi khi chuyen tu thap phan sang nhi phan ta
         * phai ghi tu duoi len. Nen ta dung ham reverse() co san cua JAVA de dao nguoc
         * chuoi nhi phan lai.
         */
        StringBuilder ketqua = new StringBuilder(nhiphan);
        System.out.println(ketqua.reverse().toString());
    }

    static void NhiphanToThapphan() {
        System.out.print("Nhap vao chuoi nhi phan : ");
        String s = Input.next();
        Double ketqua = 0.0;
        for (int i = s.length() - 1; i >= 0; i--) {
            /*
             * Chuyen tu kt tu char sang so nguyen ta kep kieu dong thoi dungf bang ma ASCII
             * de chuyen. s.charAt(i) la he 10 trong bang ma ACSII
             */
            ketqua = ketqua + ((int) s.charAt(i) - 48) * Math.pow(2, s.length() - i - 1);
        }
        System.out.println("Ket qua = " + ketqua);
    }

    static int[] nhapmang(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Input.nextInt();
        }
        return a;
    }

    static void xuatmang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    static void phantulonnhat(int n) {
        int[][] a = new int[n][n];
        int max = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a [" + i + "][" + j + "] : ");
                a[i][j] = Input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Nhap vao hang can tim max : ");
        int i = Input.nextInt();

        for (int j = 0; j < n; j++) {
            if (a[i][j] > max) {
                max = a[i][j];
            }
        }
        System.out.println("Phan tu lon nhat cua hang [ " + i + " ] : " + max);
    }
}