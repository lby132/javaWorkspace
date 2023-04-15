package chap_04;

import java.io.File;

public class FileAndFolder {
    public static void main(String[] args) {
//        String folder = "/Users/lby/Downloads/project/javaWorkspace/src/chap_04"; // 절대경로
        String folder = "src/chap_04";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());

        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) System.out.println("파일 " + file.getName());
            if (file.isDirectory()) System.out.println("폴더 " + file.getName());
            System.out.println("file.getName() = " + file.getName());
        }
    }
}
