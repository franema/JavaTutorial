package JavaBeginner;
public class Dog {

    protected static int count = 0;
    
    protected String name;
    private int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
    }

    public void speak() {
        System.out.println(" i'm " + this.name + " and i'm " + this.age + " years old ");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int add2() {
        return this.age + 2;
    }

    public static void display() {
        System.out.println("I'm a Dog");
    }
}


