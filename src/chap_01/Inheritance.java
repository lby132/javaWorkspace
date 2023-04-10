package chap_01;

import chap_01.camera.Camera;
import chap_01.camera.FactoryCam;
import chap_01.camera.SpeedCam;

public class Inheritance {
    public static void main(String[] args) {

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        System.out.println("camera = " + camera.name);
        System.out.println("factoryCam = " + factoryCam.name);
        System.out.println("speedCam = " + speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();


        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }
    }
}
