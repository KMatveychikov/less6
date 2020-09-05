public class Dog extends Animal {

    public Dog(String name, String type, String color, int age, int maxRunRange, int maxSwimRange, int maxJumpRange) {
        super(name, type, color, age, maxRunRange, maxSwimRange, maxJumpRange);
    }

    public static void main(String[] args) {
        Dog dog0 = new Dog("Sharik","dvorteryer","black",3,300, 90, 2);
        Dog dog1 = new Dog("Barbos","setter","brown",3,400, 100, 3);
        Dog dog2 = new Dog("Palma","kolly","orange",3,500, 110, 4);

        dog0.info();
        System.out.println("побежал и " + dog0.run(300));
        System.out.println("поплыл и " + dog0.swim(80));
        System.out.println("прыгнул и " + dog0.jump(3));
        System.out.println("----------------");

        dog1.info();
        System.out.println("побежал и " + dog1.run(300));
        System.out.println("поплыл и " + dog1.swim(110));
        System.out.println("прыгнул и " + dog1.jump(3));
        System.out.println("----------------");
    }
}
