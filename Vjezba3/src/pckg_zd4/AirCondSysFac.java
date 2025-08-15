package pckg_zd4;

public class AirCondSysFac {

    private SubSys1 subSystem1;
    private SubSys2 subSystem2;
    private SubSys3 subSystem3;
    private SubSystemEnergy subSystemEnergy;
    private SubSystemTimer subSystemTimer;

    public AirCondSysFac() {
        subSystem1 = new SubSys1();
        subSystem2 = new SubSys2();
        subSystem3 = new SubSys3();
        subSystemEnergy = new SubSystemEnergy();
        subSystemTimer = new SubSystemTimer();
    }

    public void startAirconditioningSystem() {
        System.out.println("=== START: Air Conditioning System ===");

        subSystem1.setMode("AutoCool");
        subSystem2.setTemperature(23.0f);
        subSystem2.fanSpeed(2);
        subSystem3.turnIonizer(true);
        subSystemEnergy.on();
        subSystemEnergy.mode("Eco");
        subSystemEnergy.start();
        subSystemTimer.program(6);
        subSystemTimer.on(true);

        System.out.println("=== System is running ===\n");
    }

    public void stopAirconditioningSystem() {
        System.out.println("=== STOP: Air Conditioning System ===");

        subSystemTimer.on(false);
        subSystemTimer.program(0);
        subSystemEnergy.mode("Off");
        subSystemEnergy.on();
        subSystem3.turnIonizer(false);
        subSystem2.fanSpeed(0);
        subSystem2.setTemperature(0f);
        subSystem1.setMode("Off");

        System.out.println("=== System is stopped ===\n");
    }
}
