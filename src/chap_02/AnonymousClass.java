package chap_02;

public class AnonymousClass {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("----------------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("----------------------");

        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String name) {
                super.order(name);
                System.out.println("딸키 케이크");
            }

            @Override
            public void returnTray() {
                super.returnTray();
                System.out.println("리턴 재정의");
            }
        };
        specialCoffee.order("바닐라 라테");
        specialCoffee.returnTray();
    }
}


class Coffee {
    public void order(String name) {
        System.out.println("name = " + name);
    }

    public void returnTray() {
        System.out.println("리턴");
    }
}