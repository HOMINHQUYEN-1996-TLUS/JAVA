public class DSSinhVien {

    private int key;
    private String value;

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public DSSinhVien() {
    }

    public DSSinhVien(int key, String value) {
        this.key = key;
        this.value = value;
    }

}
