package pckg_zd4;

public class SubSystemTimer {
    public void program(int program) {
        System.out.println("SubSystemTimer -> program: " + program + "h");
    }
    public void on(boolean isOn) {
        System.out.println("SubSystemTimer -> " + (isOn ? "ON" : "OFF"));
    }
}
