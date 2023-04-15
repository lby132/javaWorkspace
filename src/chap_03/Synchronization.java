package chap_03;

public class Synchronization {
    public static void main(String[] args) {
        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("------직원1 청소 시작 (Thread)-------");
                for (int i = 1; i < 5; i ++) {
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i == 2) { // 한 스레드가 에러를 방생시켜도 다른 스레드는 끝까지 수행된다.
                        throw new RuntimeException("ㅠㅜㅠ");
                    }
                }
                System.out.println("-- 직원1 청소 끝 --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("------직원2 청소 시작 (Thread)-------");
            for (int i = 1; i < 5; i ++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("-- 직원2 청소 끝 --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
