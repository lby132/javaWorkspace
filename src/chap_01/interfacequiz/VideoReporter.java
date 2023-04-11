package chap_01.interfacequiz;

public class VideoReporter implements Fir {

    @Override
    public void report() {
        System.out.println("직전 30초");
    }
}
