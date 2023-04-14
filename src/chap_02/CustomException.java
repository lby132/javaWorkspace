package chap_02;

public class CustomException {
    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 19) {
                throw new AgeLessThan19Exception("미성년자입니다.");
            } else {
                System.out.println("주문하신 상품입니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}