package chap_01;

public class Enum {
    public static void main(String[] args) {

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("===================");

        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}