package chap_04.quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            System.out.println("속담 퀴즈 입니다. 빈 칸에 알맞은 말을 고르세요");
            System.out.println("----------------------------------");

            String quiz;
            String answer;
            String input;

            while (true) {
                quiz = br.readLine();
                answer = br.readLine();
                if (quiz == null || answer == null) {
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print(" 정답 입력 => ");
                input = sc.next();
                if (input.equals(answer)) {
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }
            }

            System.out.println("----------------------------------");
            System.out.println("퀴즈가 완료 되었습니다.");


//            Scanner sc = new Scanner(System.in);
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println("(문제) " + line);
//                System.out.print(" 정답 입력 => ");
//                String answer = sc.nextLine();
//                if (answer.equals(br.readLine())) {
//                    System.out.println("정답입니다.");
//                } else {
//                    System.out.println("틀렸습니다. 정답은 " + line);
//                }
//            }
//            System.out.println("퀴즈가 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
