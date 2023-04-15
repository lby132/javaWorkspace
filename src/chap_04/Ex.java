package chap_04;

import java.io.*;

public class Ex {
    public static void main(String[] args) {

        File folder = new File("C");
        folder.mkdir();

        String folder2 = "C" + File.separator + "BB2" + File.separator;
        folder = new File(folder2);
        if (folder.exists()) {
            folder.mkdirs();
        }



    }
}
