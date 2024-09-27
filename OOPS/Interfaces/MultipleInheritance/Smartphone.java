package OOPS.Interfaces.MultipleInheritance;

// a class can implement multiple interfaces

public class Smartphone implements Phone, Camera, MusicPlayer {

    private String phoneNo;

    @Override
    public void playMusic() {
        System.out.println("playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("stopping music");
    }

    @Override
    public void takePhoto() {
        System.out.println("taking photo");
    }

    @Override
    public void takeVideo() {
        System.out.println("taking video");
    }

    @Override
    public void makeCall(String number) {
        this.phoneNo = number;
        System.out.println("phone no: " + this.phoneNo);
    }

}
