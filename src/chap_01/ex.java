package chap_01;

public class ex {
    public static void main(String[] args) {
        int hour = 10;
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 시간당 4000원

        // 일일 30000원 초과시 최대요금
        if (fee > 30000) {
            fee = 30000;
        }

        //경차 또는 장애인 차량 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
