public class program {
    public static void main(String[] args) {
        int[][] a = new int[11][11];
        for (int i = 0; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < 11; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("x" + "\t");
                } else if (i == 0) {
                    System.out.print(j + "\t");
                } else if (j == 0) {
                    System.out.print(i + "\t");
                } else if (i == 1) {
                    System.out.print(j + "\t");
                } else if (j == 1) {
                    System.out.print(i + "\t");
                } else if (i == 2) {
                    System.out.print(2 * j + "\t");
                } else if (i == 3) {
                    System.out.print(3 * j + "\t");
                } else if (i == 4) {
                    System.out.print(4 * j + "\t");
                } else if (i == 5) {
                    System.out.print(5 * j + "\t");
                } else if (i == 6) {
                    System.out.print(6 * j + "\t");
                } else if (i == 7) {
                    System.out.print(7 * j + "\t");
                } else if (i == 8) {
                    System.out.print(8 * j + "\t");
                } else if (i == 9) {
                    System.out.print(9 * j + "\t");
                } else if (i == 10) {
                    System.out.print(10 * j + "\t");
                }

            }
        }
    }
}