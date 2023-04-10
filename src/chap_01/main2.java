package chap_01;

import java.util.Random;

public class main2 {
    public static void main(String[] args) {
        Random random = new Random();
        double min = 5.0;
        double max = 10.0;
        System.out.println((min + (max - min) * random.nextDouble()));

        System.out.println(random.nextInt(45) + 1);


    }

}
