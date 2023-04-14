package chap_02;

import java.io.FileWriter;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {
        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("메인 메소드에서 해결");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기 실패");
//        } catch (IOException e) {
//            System.out.println("메소드 내에서 자체 해결함");
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패");
    }
}
