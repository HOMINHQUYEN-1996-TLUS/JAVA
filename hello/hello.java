import java.util.Scanner;

public class hello {
    public static void main(String[] arg) {
        Scanner Input = new Scanner(System.in);
        String nhiphan = "";
        System.out.print("Nhap vao a : ");
        int a = Input.nextInt();
        while (a > 0) {
            if (a % 2 == 1) {
                nhiphan = nhiphan + "1";
            }
            if (a % 2 == 0) {
                nhiphan = nhiphan + "0";
            }
            a = a / 2;
        }
        System.out.println("a = " + a);
        /*
         * Sau khi co chuoi nhi phan. Nhung vi khi chuyen tu thap phan sang nhi phan ta
         * phai ghi tu duoi len. Nen ta dung ham reverse() co san cua JAVA de dao nguoc
         * chuoi nhi phan lai.
         */
        StringBuilder ketqua = new StringBuilder(nhiphan);
        System.out.println(ketqua.reverse().toString());
        Input.close();
    }
}