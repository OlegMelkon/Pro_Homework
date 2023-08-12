package de.telran.Melkonov.Oleg.HW20230801.zoo;

public class ZooTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        Lamb lamb = new Lamb();

        cat.setName("кот");
        cat.setColor("чёрный");
        cat.voice();
        cat.eat("meat");
        cat.jump(1, 5);
        System.out.println(cat.toString());

        dog.setName("собака");
        dog.setColor("бело-коричневый");
        dog.voice();
        dog.eat("meat");
        dog.jump(3, 8);
        System.out.println(dog.toString());

        cow.setName("корова");
        cow.setColor("коричневый");
        cow.voice();
        cow.eat("meat");
        cow.jump(0, 0);
        System.out.println(cow.toString());

        lamb.setName("ягненок");
        lamb.setColor("белый");
        lamb.voice();
        lamb.eat("meat");
        lamb.jump(1, 2);
        System.out.println(lamb.toString());
    }
}
