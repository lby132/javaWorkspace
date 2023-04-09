package chap_01;

public class star3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i <= 5) {
                for (int j = 5; j > i; j--) {
                    System.out.print("*");
                }
            }
            if (i >= 5) {
                for (int j = 3; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

//방법2
//        for (int i = 5; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 2; i <= 5; i++) {		// 아래로 갈수록 늘어나는 별 구현(2개부터 실행)
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
