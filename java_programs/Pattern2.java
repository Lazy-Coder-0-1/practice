public class Pattern2 {
    public static void main(String[] args) {
        int star = 6;
        int space = -1;
        for (int i = 1; i <= 5; i++) {
            space++;
            star--;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
