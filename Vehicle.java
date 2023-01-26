public interface Vehicle {

    final int gears = 5;

    void SpeedUp(int a);

    void SlowDown(int a);

    void ChangeGear(int a);

    default void out() {
        System.out.println("Default");
    }

    static int math(int b) {
        return b + 9;
    }

}
