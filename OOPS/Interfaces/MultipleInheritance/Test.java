package OOPS.Interfaces.MultipleInheritance;

public class Test {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.takePhoto();
        s.takeVideo();
        s.makeCall("879857349857");
        s.playMusic();
        s.stopMusic();

        System.out.println(Smartphone.sim); // class can access static constants
        Phone.showPrice(); // interface access static methods

        s.classObjAccess(); // obj access default methods
    }
}
