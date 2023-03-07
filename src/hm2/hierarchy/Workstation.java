package hm2.hierarchy;

public class Workstation extends Laptop{
    private String nameOFdatabase;
    public int countOfDatabases;

    public Workstation(){}

    public Workstation(String operationSystem, String model, boolean license, String nameOFdatabase, int countOfDatabases) {

        super(operationSystem, model, license);
        this.nameOFdatabase = nameOFdatabase;
        this.countOfDatabases = countOfDatabases;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "database='" + nameOFdatabase + '\'' +
                ", countOfDatabases=" + countOfDatabases +
                "} " + super.toString();
    }
}
