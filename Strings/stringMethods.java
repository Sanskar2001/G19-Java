class Car
{
    int noOfWheels;
    int hp;

    public Car(int noOfWheels,int hp)
    {
        this.noOfWheels=noOfWheels;
        this.hp=hp;
    }
    public String toString()
    {
        return "no of wheels="+noOfWheels+"\nhp="+hp;
    }
}


class stringMethods {

    public static void main(String[] args) {
        Car car=new Car(4, 500);

        toString(car);
        System.out.println(car);
    }
}
