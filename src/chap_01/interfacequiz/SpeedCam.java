package chap_01.interfacequiz;

public class SpeedCam implements in, Fir {

    private in detector;
    private Fir reporter;


    public void setDetector(in detector) {
        this.detector = detector;
    }

    public void setReporter(Fir reporter) {
        this.reporter = reporter;
    }


    @Override
    public void report() {
        this.detector.detect();
    }

    @Override
    public void detect() {
        this.reporter.report();
    }
}
