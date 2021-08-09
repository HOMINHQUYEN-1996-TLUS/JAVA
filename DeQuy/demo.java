
public class demo {
    public static void main(String[] args) {

        sinhvien b = new sinhvien();
        person a = b;

        if (a instanceof sinhvien) {
            sinhvien b2 = (sinhvien) a;
            b2.show();
        }

        sinhvien b3 = new sinhvien();
        person a2 = b3;
        a2.show1();
    }
}

class person {
    public void show1() {
        System.out.println("ABC XYZ");
    }
}

class sinhvien extends person {
    public void show() {
        System.out.println("Ho Minh Quyen");
    }
}