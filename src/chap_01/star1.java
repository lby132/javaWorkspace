package chap_01;

public class star1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            }
            if (i > 4) {
                for (int k = 9; k > i; k--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
// for (int k = 5; k > i; k--) {
//         System.out.print("2");
//         }