public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        int age;
        age = 56;
        System.out.println(age);
        printAge(6);
        printAge(12);
        printName("Oleg");
        Person x = new Person();
        x.sex = "M";
        x.age = age;
        x.name = "Oleg";
        x.sayHello();
        Car car1 = new Car();
        car1.year = 2022;
        car1.dist = 12904;
        car1.color = "blue";
        car1.model = "opel";
        car1.describeMyself();
        Animals animals1 = new Animals();
        animals1.vid = "Dog";
        animals1.age = 4;
        animals1.numberOfTeeth = 32;
        animals1.tip = "mammals";
        animals1.poroda = "collie";
        animals1.weight = 99;
        animals1.pickaBreed();
        int a = 5, b = 10;
        if (a > b) {
            System.out.println("lf? dthyj");
        }
    }

    static void printAge(int age) {

        System.out.println(age);
    }

    static void printName(String name) {
        System.out.println(name);

    }


}


