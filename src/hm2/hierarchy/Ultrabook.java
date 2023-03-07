package hm2.hierarchy;
public class Ultrabook extends Laptop {
    private boolean license;
    private boolean guarantee;

    public Ultrabook(String operationSystem, String model, boolean license, boolean guarantee) {
        super(operationSystem, model, license);
        this.guarantee = guarantee;
        this.license = license;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "license=" + license +
                ", guarantee=" + guarantee +
                "} " + super.toString();
    }
}
