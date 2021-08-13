public class index {

    public static void main(String[] args) {
        System.out.println("Size = " + Size.BIG.getSize());
    }
}

enum Size {
    SMALL, BIG, LARGE;

    public String getSize() {
        switch (this) {
            case SMALL:
                return "small";
            case BIG:
                return "Big";
            case LARGE:
                return "Large";
            default:
                return null;
        }
    }
}