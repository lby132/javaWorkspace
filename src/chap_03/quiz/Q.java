package chap_03.quiz;

public class Q {
    public static void main(String[] args) {
        Product product = new Product();

        Runnable prodA = () -> {
            for (int i = 1; i <= 5; i++) {
                product.box("A", i);
            }
            System.out.println("--A 상품 준비 완료--");
        };

        Runnable prodB = () -> {
            for (int i = 1; i <= 5; i++) {
                product.box("B", i);
            }
            System.out.println("--B 상품 준비 완료--");
        };

        Thread thread1 = new Thread(prodA);
        Thread thread2 = new Thread(prodB);

        thread1.start();
        thread2.start();

        // thread1.isAlive() 스레드가 끝났는지 돌고있는지 체크하는 메소드
//        while (thread1.isAlive() || thread2.isAlive()) {}

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable setBox = () -> {
            System.out.println(" == 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println(" == 세트 상품 포장 완료 ==");
        };

        Thread thread3 = new Thread(setBox);
        thread3.start();
    }


}
