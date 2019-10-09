package bulb;

public class LEDStrip {
    private LED[] ledStrip;
    private int lengthOfStrip() {
        return ledStrip.length;
    }
    private int numberOfDefectiveLEDs() {
        int counter = 0;
        for (LED led : ledStrip) {
            if (!led.isWorking()) {
                counter++;
            }
        }
        return counter;
    }
    private boolean isStripDefective() {
        return numberOfDefectiveLEDs() > (lengthOfStrip() / 2);
    }
    public void printStripStatus()  {
        System.out.println(isStripDefective() ? "This strip is defective"
                :
                "This strip is not defective");
    }

    public LEDStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

    public LED[] getLedStrip() {
        return ledStrip;
    }

    public void setLedStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }
}


