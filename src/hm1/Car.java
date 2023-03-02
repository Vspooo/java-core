package hm1;

public class Car {
   private String model;
    private Number power;
    private double volumeEngine;
    private boolean turbo;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(Number power) {
        this.power = power;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public Number getPower() {
        return power;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public Car(){

    }

    public Car(String model, Number power, double volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }
}


