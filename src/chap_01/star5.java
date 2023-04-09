package chap_01;

public class star5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//방법2
//        for(int i = 1; i < 10; i+=2) {
//            for(int j = 9; j > i; j-=2) {
//                System.out.print(" ");
//            }
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

