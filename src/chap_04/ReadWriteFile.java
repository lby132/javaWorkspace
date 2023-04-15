package chap_04;

import java.io.*;

public class ReadWriteFile {

    public static void main(String[] args) {

        // 파일 쓰기
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
////            bw.write("이제 거의 끝");
////            bw.newLine();//줄바꿈
////            bw.write("끝");
////            bw.newLine();
//            bw.write("3.aaa");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
