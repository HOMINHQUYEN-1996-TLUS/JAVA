import java.util.*;

public class index {
    public static void main(String[] args) {
        // Trien khai HashMap

        Map<Integer, String> sinhvien = new HashMap<>();

        sinhvien.put(0, "Quyen");
        sinhvien.put(1, "Hang");
        sinhvien.put(2, "Nam");
        sinhvien.put(3, "Loan");

        sinhvien.replace(0, "Ho Minh Quyen");

        System.out.println(sinhvien);

        // Demo

        DSSinhVien sVien1 = new DSSinhVien(0, "Quyen");
        DSSinhVien sVien2 = new DSSinhVien(1, "Lan");
        DSSinhVien sVien3 = new DSSinhVien(2, "Loan");

        Map<Integer, String> sinhviens = new HashMap<>();

        sinhviens.put(sVien1.getKey(), sVien1.getValue());
        sinhviens.put(sVien2.getKey(), sVien2.getValue());
        sinhviens.put(sVien3.getKey(), sVien3.getValue());

        System.out.println(sinhviens.get(sVien2.getKey()));
    }
}