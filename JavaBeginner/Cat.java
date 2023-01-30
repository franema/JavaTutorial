package JavaBeginner;
public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and i'm " + this.getAge() + " years old ");
    }
    
}
