public class Fan {
    final int SLOW= 1;
    final int Medium= 2;
    final int Fast= 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed= SLOW;
        this.on= false;
        this.radius= 5;
        this.color= "Blue";

    }
    public Fan(int speed, boolean on, double radius, String color ){
        this.speed= speed;
        this.on= on;
        this.radius= radius;
        this.color= color;
    }

    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public int setSpeed(int speed){
        return this.speed= speed;
    }
    public boolean setOn(boolean on){
        return this.on= on;
    }
    public double setRadius(double radius){
        return this.radius= radius;
    }
    public String setColor(String color){
        return this.color= color;
    }

    public String toString(){
        if (this.on == true){
            return "Speed " + this.speed + " Color " + this.color + " Radius " + this.radius + " fan is on";
        }else {
            return "Speed " + this.speed + " Color " + this.color + " Radius " + this.radius + " fan is off";
        }
    }
}
