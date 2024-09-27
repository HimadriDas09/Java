package OOPS;

public class GrandParent {
    private String name;
    private int age;

    public GrandParent() {
        System.out.println("grandparent const called");
        this.name = "grandpa";
        this.age = 65;
        System.out.println(getInfo());
    }

    public String getInfo() {
        String ans = "granfather name is " + this.name + ", age is " + this.age;
        return ans;
    }
}
