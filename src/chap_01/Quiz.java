package chap_01;

public class Quiz {
    public static void main(String[] args) {
        int[] sizeArr = new int[10];

        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = 250 + (5 * i);
        }

        for (int size : sizeArr) {
            System.out.println("신발 사이즈 " + size);
        }


    }
}
