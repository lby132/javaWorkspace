package chap_01.q9;

public class Student {

    private String name;
    private String programLang;

    public Student(String name, String programLang) {
        this.name = name;
        this.programLang = programLang;
    }

    public String getProgramLang() {
        return programLang;
    }

    public String getName() {
        return name;
    }
}
