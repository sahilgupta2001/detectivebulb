package bulb;

public class LED {
    private String colourName;
    private boolean working;
    public String getColourName() {
        return colourName;
    }
    public boolean isWorking() {
        return working;
    }
    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    public LED(String colourName, boolean working){
        this.colourName = colourName;
        this.working = working;
    }
}

