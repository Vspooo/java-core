package hm1;

public class Dog {
    String name;
    Number age;
    String breed;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    public Dog(String name, Number age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}