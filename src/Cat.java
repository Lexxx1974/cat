public class Cat {
    public double weight;
    public String name;
    public int age;
    public String color;

    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void meow(){
        System.out.println("Meow");
    }

    public void pee() {
        weight -= 20;
    }

    public void eat() {
        weight += 50;
    }

}

