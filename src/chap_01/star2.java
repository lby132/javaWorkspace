package chap_01;

public class star2 {
    public static void main(String[] args) {
            for (int l = 0; l <= 5; l++) {
                for (int j = 5; j > l; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= l; k++) {
                    System.out.print("*");
                }
                for (int k = 0; k <= l - 1; k++) {
                    System.out.print("*");
                }
                for (int j = 5; j > l; j--) {
                    System.out.print(" ");
                }

                System.out.println();
            }
    }

}