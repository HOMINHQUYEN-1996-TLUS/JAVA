import java.util.Scanner;

public class btvn {
    public static Scanner Input = new Scanner(System.in);

    public static void bai5() {
        System.out.print("Nhap vao chuoi s : ");
        String s = Input.next();
        String temp = "";
        char[] schuoi = s.toCharArray();
        for (int i = schuoi.length - 1; i >= 0; i--) {
            temp = temp + schuoi[i];
        }
        if (s.equals(temp)) {
            System.out.println("Day la chuoi doi xung");
        } else
            System.out.println("Khong phai chuoi doi xung");
    }

    public static boolean bai6() {
        System.out.print("Nhap vao chuoi s : ");
        String s = Input.next();
        char[] schuoi = s.toCharArray();
        for (int i = 0; i < schuoi.length; i++) {
            if (schuoi[i] == '@') {
                for (int j = schuoi.length - 1; j > schuoi.length - i; j--) {
                    if (schuoi[j] == '.') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void bai7() {
        System.out.print("Nhap vao chuoi s : ");
        String s = Input.next();
        char[] schuoi = s.toCharArray();
        String chuoiHoa = "";
        String chuoiThuong = "";
        String dacbiet = "";
        String chuoiso = "";

        for (int i = 0; i < schuoi.length; i++) {
            if (schuoi[i] >= 65 && schuoi[i] <= 90) {
                chuoiHoa = chuoiHoa + schuoi[i];
            } else if (schuoi[i] >= 97 && schuoi[i] <= 122) {
                chuoiThuong = chuoiThuong + schuoi[i];
            } else if (schuoi[i] >= 32 && schuoi[i] <= 47) {
                dacbiet = dacbiet + schuoi[i];
            } else {
                chuoiso = chuoiso + schuoi[i];
            }
        }
        if (!chuoiHoa.isEmpty() && !chuoiThuong.isEmpty() && !chuoiso.isEmpty() && !dacbiet.isEmpty()) {
            System.out.println("Chuoi nay la chuoi phuc tap");
        } else {
            System.out.println("Chuoi nay khong phai la chuoi phuc tap");
        }
    }

    public static void bai8() {

        int[] a = new int[26];
        String check = "abcdefghijklmnoqprstuvxywz";
        char[] charCheck = check.toCharArray();

        System.out.print("Nhap vao chuoi s : ");
        String s = Input.next();
        char[] schuoi = s.toCharArray();

        for (int i = 0; i < schuoi.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (schuoi[i] == charCheck[j]) {
                    a[j]++;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                System.out.println(charCheck[i] + "-" + a[i]);
            }
        }
    }
}
