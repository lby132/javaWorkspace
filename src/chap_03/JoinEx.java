package chap_03;

import chap_03.clean.CleanRunnable;

public class JoinEx {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            //현재 스레드를 다 끝내고 다음 스레드가 실행됨(다음 스레드는 cleanByBoss()라는 함수를가진 메인 스레드가 실행)
            thread.join(); // thread.join(3000) 이런식으로 3초를 주면 3초동안만 현재 스레드를 실행한다. 만약 3초안에 모든 스레드가 실행되지 않으면
                                    // 다른 스레드로 넘어간다.(다른 스레드는 cleanByBoss()라는 함수를가진 메인 스레드가 실행)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("------사장 청소 시작-------");
        for (int i = 1; i < 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
