class CeilingFan {

    static boolean isPowerOn = false;
    static int speed = 0;

    // Turn ON/OFF the fan
    public static void onOrOff() {
        if (!isPowerOn) {
            isPowerOn = true;
            System.out.println("Fan is Turned ON");
        } else {
            isPowerOn = false;
            speed = 0; // Reset speed when fan is turned off
            System.out.println("Fan is Turned OFF");
        }
    }

    // Increase speed
    public static void increaseSpeed() {
        if (isPowerOn) {
            if (speed < 5) {
                speed++;
                System.out.println("Speed Increased to " + speed);
            } else {
                System.out.println("Fan is already at Maximum Speed");
            }
        } else {
            System.out.println("Turn ON the Fan First");
        }
    }

    // Decrease speed
    public static void decreaseSpeed() {
        if (isPowerOn) {
            if (speed > 0) {
                speed--;
                System.out.println("Speed Decreased to " + speed);
            } else {
                System.out.println("Fan is already at Minimum Speed");
            }
        } else {
            System.out.println("Turn ON the Fan First");
        }
    }

    // Display current status
    public static void displayStatus() {
        System.out.println("-------------------------");
        System.out.println("Power Status : " + isPowerOn);
        System.out.println("Fan Speed    : " + speed);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        displayStatus();

        onOrOff();          // Turn ON
        increaseSpeed();
        increaseSpeed();
        increaseSpeed();

        displayStatus();

        decreaseSpeed();
        decreaseSpeed();

        displayStatus();

        onOrOff();          // Turn OFF

        displayStatus();
    }
}