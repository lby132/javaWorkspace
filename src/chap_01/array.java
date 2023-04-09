package chap_01;

public class array {
    public static void main(String[] args) {
        String[][] ar = new String[][]{
                {"a1", "a2", "a3", "a4", "a5"},
                {"b1", "b2", "b3", "b4", "b5"}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("ar[i][j] = " + ar[i][j]);
            }
        }
        System.out.println("-------------------");

        String[][][] se = new String[][][]{
                {{"a1", "a2", "a3"}, {"b1", "b2", "b3", "b4"}, {"c1", "c2", "c3", "c4", "c5"}},
                {{"x1", "x2", "x3"}, {"v1", "v2", "v3", "v4"}, {"11", "12", "13", "14", "15"}}
        };

        for (int i = 0; i <se.length; i++) {
            for (int j = 0; j < se[i].length; j++) {
                for (int k = 0; k <3; k++) {
                    System.out.println("se[i][j][k] = " + se[i][j][k]);
                }
            }
        }

        System.out.println("-------------------");

        String[][] seats3 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        seats3[7][8] = "__";
        seats3[7][9] = "__";

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
