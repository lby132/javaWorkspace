package chap_01.ggg;

import chap_01.ggg.coffee.*;
import chap_01.ggg.user.User;
import chap_01.ggg.user.VIPUser;

import java.sql.Array;
import java.util.ArrayList;

public class GenericClass {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("Aaaa");
        c2.ready();

        CoffeeByName c3 = new CoffeeByName("dddd");
        c3.ready();

        System.out.println("----------------------------");


        Coffee<String> coffee = new Coffee<>("111");
        coffee.ready();

        Coffee<Integer> coffee2 = new Coffee<>(11);
        coffee2.ready();

        System.out.println("----------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("abc"));
        c7.ready();

        CoffeeByUser cba = new CoffeeByUser(new VIPUser("cba"));
        cba.ready();

        System.out.println("-----------------");
        orderCoffee("sss");
        orderCoffee(22, "라테");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "커피 준비 완료 : " + name);
    }
}
