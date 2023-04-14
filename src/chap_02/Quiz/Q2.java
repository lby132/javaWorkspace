package chap_02.Quiz;

public class Q2 {
    public static void main(String[] args) {
        int error = 2;
        try {
            switch (error) {
                case 0:
                    System.out.println("상품 구매를 완료했습니다.");
                    break;
                case 1:
                    System.out.println("상품 구매 가능 시간이 아닙니다.");
                    throw new NotOnSaleException("상품 구매는 20시 부터 가능합니다..");
                case 2:
                    System.out.println("해당 상품은 매진 되었습니다.");
                    throw new SoldOutException("다음 기회에 이용해주세요.");
            }

        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
        }
    }

}

class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
