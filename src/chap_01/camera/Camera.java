package chap_01.camera;

public class Camera {

    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        System.out.println("사진 촬영");
    }

    public void recordVideo() {
        System.out.println("동영상 녹화");
    }
}
