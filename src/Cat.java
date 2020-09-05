public class Cat extends Animal {



    public Cat(String name, String type, String color, int age, int maxRunRange, int maxSwimRange, int maxJumpRange) {
        super(name, type, color, age, maxRunRange, maxSwimRange, maxJumpRange);
    }

    public static void main(String[] args) {

        Cat cat0 = new Cat("Барсик", "British","gray",8, 100, 0, 10);
        Cat cat1 = new Cat("Барсик", "Siam","cream",5, 100, 0, 10);
        Cat cat2 = new Cat("Барсик", "Dvorkish","orange",7, 100, 0, 10);

        cat0.info();

        System.out.println("побежал и " + cat0.run(99));
        System.out.println("поплыл и " + cat0.swim(0));
        System.out.println("прыгнул и " + cat0.jump(3));
        System.out.println("----------------");
    }
}
