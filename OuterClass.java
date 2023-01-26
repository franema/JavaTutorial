public class OuterClass {
    // public class InnerClass {
    //     public void display() {
    //         System.out.println("Inner class");
    //     }
    // }

    // public void inner () {
    //     InnerClass in = new InnerClass();
    //     in.display();
    // }

    public void inner () {
        class InnerClass {
            public void display() {
                System.out.println("inner");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
    }
}
