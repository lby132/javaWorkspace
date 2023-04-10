package chap_01.camera;

public class FactoryCam extends Camera {


    public String name;

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
}
