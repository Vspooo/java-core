package hm1;

public class Dog {
   private String name;
   private Number age;
   private String breed;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Number getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Dog(){

    }

    public Dog(String name, Number age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}