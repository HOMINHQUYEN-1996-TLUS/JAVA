import java.util.Scanner;

public class hello {
    public static Scanner Input = new Scanner(System.in);

    public static void main(String[] arg) {

        // ThapphanToNhiphan();
        // NhiphanToThapphan();
        xuatmang(nhapmang(5));
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
}