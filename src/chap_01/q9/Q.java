package chap_01.q9;

import java.util.ArrayList;
import java.util.List;

public class Q {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student a = new Student("a", "파이썬");
        Student b = new Student("b", "java");
        Student c = new Student("c", "java");
        Student d = new Student("d", "C");
        Student e = new Student("e", "파이썬");

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        for (Student student : list) {
            if ("java".equals(student.getProgramLang())) {
                System.out.println(student.getName());
            }
        }
    }
}
