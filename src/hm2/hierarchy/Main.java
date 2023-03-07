package hm2.hierarchy;

public class Main {
    public static void main(String[] args){

       Laptop laptop = new Laptop("MacOS","MacBook Air Pro",true);
        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook("Windows","Asus Rog",true,false);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("Linux","FAX-14GH",true,"OktenWeb",1);
        System.out.println(workstation);


    }
}
