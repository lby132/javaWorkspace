package chap_01.ggg;

public class Generics {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.println("t = " + t);
        }
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double v : dArray) {
            System.out.println("v = " + v);
        }
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.println("s = " + s);
        }
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.println("i = " + i);
        }
    }
}
