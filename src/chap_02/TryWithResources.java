package chap_02;

public class TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;

        try {
            writer1 = new MyFileWriter();
            writer1.write("aaaaaa");
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        // try () 안에 AutoCloseable를 상속받은 객체나 파일등을 선언해주면 try catch를 빠져나올때 close가 자동으로 호출된다.
        try (MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("bbbbbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일의 내용을 입력합니다.");
        System.out.println("입력내용 : " + line);
    }
}
