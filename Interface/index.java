public class index {
    public static void main(String[] args) {
        TamGiac tg = new TamGiac(3, 4, 5);
        tg.dientich();
        tg.chuvi(3, 4, 5);

        HCN hcn = new HCN(5, 6);
        hcn.dientich();
        hcn.chuvi(5, 6, 5, 6);

    }
}

interface hinhhoc {
    void dientich();

    default void chuvi(int... values) {
        int c = 0;
        for (int value : values) {
            c = c + value;
        }
        System.out.println("Chu vi = " + c);
    }

}

class TamGiac implements hinhhoc {
    private double a;
    private double b;
    private double c;
    private double s;
    private double area;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void dientich() {
        this.s = (a + b + c) / 2;
        this.area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Dien tich = " + area);
    }
}

class HCN implements hinhhoc {
    private double a;
    private double b;
    private double area;

    public HCN(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void dientich() {
        area = a * b;
        System.out.println("Dien tich HCN = " + area);
    }
}
