public abstract class Animal {

    protected String name;
    protected String type;
    protected String color;
    protected int age;
    protected int maxRunRange;
    protected int maxSwimRange;
    protected int maxJumpRange;
    //protected int runRange;
    //protected int swimRange;
    //protected int jumpRange;


    public Animal(String name, String type, String color, int age, int maxRunRange, int maxSwimRange, int maxJumpRange){
        this.name = name;
        this.type = type;
        this.color = color;
        this.age = age;
        this.maxRunRange = maxRunRange;
        this.maxSwimRange = maxSwimRange;
        this.maxJumpRange = maxJumpRange;
    }



    public void info(){
        System.out.println("Имя - " + name);
        System.out.println("Порода - " + type);
        System.out.println("Цвет - " + color);
        System.out.println("Возраст - " + age);
        System.out.println("-------------");
    }

    public String run(int runRange){

        if(runRange<maxRunRange) {
            return "добежал";
        } else {
            return "не добежал";
        }

    }

    public String swim(int swimRange){
        if(swimRange<=maxSwimRange) {
            return "доплыл";
        } else {
            return "не доплыл";}

        }


    public String jump(int jumpRange){
        if(jumpRange<maxJumpRange) {
            return "допрыгнул";
        } else {
            return "не допрыгнул";
        }
    }
}
