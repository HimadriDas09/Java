package OOPS;

public class Child extends Parent {
    public Child() {
        super();
        System.out.println("Child const called");
    }

    public String getParentInfo() {
        return super.getParentInfo();
    }
}
