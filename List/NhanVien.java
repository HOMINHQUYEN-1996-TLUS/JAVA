public class NhanVien {
    private String fullName;
    private int Age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public NhanVien() {
    }

    public NhanVien(String fullName, int Age) {
        this.fullName = fullName;
        this.Age = Age;
    }

    public void xuat() {
        System.out.println("Ten : " + this.fullName);
        System.out.println("Tuoi : " + this.Age);
    }
}
