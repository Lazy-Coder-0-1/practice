public class Pattern6 {
    public static void main(String[] args) {
        int star = 0;
        for (int i = 1; i <= 7; i++) {
            if (i > 2 && i <= 5) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }

            } else {
                for (int k = 1; k <= 4; k++) {
                    System.out.print(" ");
                }
            }
            if (i <= 4) {
                star++;
            } else {
                star--;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
