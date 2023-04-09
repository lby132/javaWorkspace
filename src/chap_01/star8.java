package chap_01;

public class star8 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i += 2) {
            for (int j = 10; j > i; j -= 2) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int l = 10; l > i; l -= 2) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 9; i += 2) {
            for (int j = 0; j < i + 2; j += 2) {
                System.out.print("*");
            }
            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (int l = 0; l < i + 2; l += 2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
