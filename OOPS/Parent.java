package OOPS;

public class Parent extends GrandParent {
    public Parent() {
        super();
        System.out.println("parent's const called");
    }

    public String getParentInfo() {
        return super.getInfo(); // super to access parent's method,field
    }
}
