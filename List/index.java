import java.util.*;

public class index {
    public static Scanner Input = new Scanner(System.in);

    public static void main(String[] args) {
        List<NhanVien> ListNV = new ArrayList<>();
        NhanVien nv = new NhanVien("Hoang", 36);
        ListNV.add(new NhanVien("Quyen", 26));
        ListNV.add(new NhanVien("Loan", 22));
        ListNV.add(new NhanVien("Nam", 20));
        ListNV.add(nv);

        ListNV.sort(Comparator.comparingInt(t -> t.getAge()));
        for (NhanVien nhanVien : ListNV) {

            nhanVien.xuat();
        }

    }
}