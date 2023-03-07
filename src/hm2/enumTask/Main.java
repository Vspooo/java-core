package hm2.enumTask;

public class Main {
    public static  void main(String[] args){

        Skills [] skills = {new Skills("HTML+CSS",9),new Skills("JS",8),new Skills("QA/QC",8)};
        Car car = new Car("BMW M5 F90", 2015,330);
        User userOne = new User(1,"Vasya","Pupkin","egdfghr2@gmail.com",22,Gender.MALE, skills,car);
        System.out.println(userOne);

        Skills [] skills1 = {new Skills("JAVA",7),new Skills("C#",9),new Skills("C++",8)};
        Car car1 = new Car("Tesla model S",2017,330);
        User userTwo = new User(2,"Vika","Kokos","dfghfghfg@gmail.com",34,Gender.FEMALE,skills1,car1);
        System.out.println(userTwo);


    }
}
