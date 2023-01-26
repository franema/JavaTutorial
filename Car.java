public class Car implements Vehicle {
    
    private int gear = 1;
    private int speed = 0;

    public void ChangeGear(int gear) {
        this.gear = gear;
    }

    public void SpeedUp(int amount) {
        this.speed += amount;
    }

    public void SlowDown(int amount) {
        this.speed -= amount;
    }

    public void display() {
        System.out.println("I'm going at " + this.speed + "km/h and I'm in gear " + this.gear);
        out();
    }

    

}
