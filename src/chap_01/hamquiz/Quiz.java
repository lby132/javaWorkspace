package chap_01.hamquiz;

public class Quiz {

    public static void main(String[] args) {
        Common[] commons = new Common[3];
        commons[0] = new CheeseBurger();
        commons[1] = new Hamburger();
        commons[2] = new ShrimpBurger();

        for (Common common : commons) {
            common.cook();
            System.out.println("--------------------");
        }
        System.out.println("메뉴 완료");
    }

    static abstract class Common {
        private String name;

        public Common(String name) {
            this.name = name;
        }

        public void cook() {
            System.out.println(this.name + "를 만듭니다.");
            System.out.println("빵 사이에 들어가는 재료는?");
            System.out.println("> 양상추");
            System.out.println("+ 패티");
            System.out.println("+ 피클");
        }

    }
    static class CheeseBurger extends Common {

        public CheeseBurger() {
            super("치즈버거");
        }

        @Override
        public void cook() {
            super.cook();
            System.out.println("+ 치즈");
        }
    }


    static class Hamburger extends Common {

        public Hamburger() {
            super("햄버거");
        }

        @Override
        public void cook() {
            super.cook();
            System.out.println("+ 햄버거");
        }
    }

    static class ShrimpBurger extends Common {

        public ShrimpBurger() {
            super("새우버거");
        }

        @Override
        public void cook() {
            super.cook();
            System.out.println("+ 새우");
        }
    }
}

