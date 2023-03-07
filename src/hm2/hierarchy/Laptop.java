package hm2.hierarchy;
public class Laptop extends PC {
    private Boolean license;

    public Laptop(){

    }

    public Laptop (String operationSystem, String model, boolean license){
        super(operationSystem,model);
        this.license = license;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "license=" + license +
                "} " + super.toString();
    }
}
