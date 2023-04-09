package chap_01;

public class ASCII {

    public static void main(String[] args) {
        char c = 'B';
        System.out.println("c = " + c);
        System.out.println("c = " + (int)c);

        c++;
        System.out.println("c = " + c);
        System.out.println("c = " + (int)c);

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
