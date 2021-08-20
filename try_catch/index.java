import java.io.FileWriter;
import java.io.PrintWriter;

public class index {
    public static void main(String[] args) {
        insertDS.addDS();
    }
}

class insertDS {
    private static int[] list = { 1, 2, 3, 4, 5 };

    static void addDS() {
        PrintWriter out = null;
        try {
            String fileName = "List.txt";
            FileWriter writer = new FileWriter(fileName);
            out = new PrintWriter(writer);

            for (int i = 0; i < 7; i++) {
                out.println("value : " + i + " = " + list[i]);
            }
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (out != null) {
                System.out.println("Printer close");
                out.close();
            } else {
                System.out.println("PrintWriter can't Open");
            }
        }
    }
}