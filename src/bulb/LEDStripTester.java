package bulb;

import java.util.Scanner;

public class LEDStripTester {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int numberOfLEDs = Integer.parseInt(scanner.nextLine());
        LED[] array = new LED[numberOfLEDs];
        for (int i =0 ; i<array.length; i++) {
            String colourName = scanner.next();
            boolean working = scanner.nextBoolean();
            array[i] = new LED(colourName, working);
        }
        LEDStrip strip = new LEDStrip(array);
        strip.printStripStatus();
        scanner.close();
    }
}
