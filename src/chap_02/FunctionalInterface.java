package chap_02;

public class FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        converter.convert(1);

        converterUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 1   );

        ConvertableWithNoParams c1 = () -> System.out.println("converter");
        c1.converter();

        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD + KRW) + " 원");
        };
        c1.converter();

        ConvertableWithTwoParams c2 = (a, b) -> {
            System.out.println(a + " 달러c2= " + (a + b) + " 원");
        };
        c2.convert(1,3);

        ConvertableWithReturn c3 = (d, w) -> d + w;
        int result = c3.convert(20, 1400);
        System.out.println("20달러 = " + result + " 원");
    }

    public static void converterUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}
