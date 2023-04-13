package chap_02;

public class AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("==================");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("동생 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 딸기쨈, 양상추, 치즈, 계란");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
       return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}
