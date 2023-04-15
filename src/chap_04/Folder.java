package chap_04;

import java.io.File;

public class Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        }

        System.out.println("------------------");

        folderName = "A/B/C";
        //OS와 상관없이 / 구분 해주는 역할
        //"A" + File.separator + "B" + File.separator + "C";
        folder = new File(folderName);
        folder.mkdirs(); // 하위 폴더를 생성할땐 mkdir()이 아닌 mkdirs()를 사용해야한다.
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다." + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패");
        }

    }
}
