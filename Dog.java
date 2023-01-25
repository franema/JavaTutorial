public class Dog {
    
    protected String name;
    private int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
        add2();
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
}


