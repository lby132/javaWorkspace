package chap_01;

public class Quiz1 {
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-3030-3010";

        System.out.println("이름 = " + getHiddenData(name, 1));
        System.out.println("주민등록번호 = " + getHiddenData(id, 8));
        System.out.println("전화번호 = " + getHiddenData(phone, 9));
    }

    public static String getHiddenData(String data, int index) {
        Quiz1 quiz1 = new Quiz1();
        String hiddenData = data.substring(0, index);
//        for (int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }

        return hiddenData;
    }

//    public static String getHiddenData(String val, int index) {
//        return val.replace(val.substring(index), "*");
//
}

