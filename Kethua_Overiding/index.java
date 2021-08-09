public class index {
    public static void main(String[] args) {
        sinhvien sv = new sinhvien();
        // sv.eat();
        // sv.learn();
        // sv.run();
        sv.thongtin();
        System.out.println(sv.checkNumber("0A38872403"));
    }
}

class person {
    public String laptop = "DELL";
    private int age = 0;

    public person() {
        System.out.println("I'm person");
    }

    public void eat() {
        System.out.println("I can eat rice");
    }

    public void run() {
        System.out.println("I can run 10m/s");
    }

    public void tuoi() {
        age = 26;
        System.out.println("Age = " + age);
    }
}

class sinhvien extends person {
    public sinhvien() {
        super();
        System.out.println("Im sinhvien");
    }

    @Override
    public void eat() {
        System.out.println("I can eat chicken");
    }

    public void learn() {
        System.out.println("I can learn English");
    }

    public void thongtin() {
        String name = "Quyen";
        super.tuoi();
        System.out.println("Name = " + name);
        System.out.println("Laptop : " + super.laptop);
    }

    public boolean checkNumber(String s) {
        char[] sa = s.toCharArray();
        for (int i = 0; i < sa.length; i++) {
            if (sa[i] < 48 && sa[i] > 57) {
                return false;
            }
        }
        return true;
    }
}