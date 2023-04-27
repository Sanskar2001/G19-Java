class Car
{
    int wheels;
    int hp;
    int noOfDoors;
    final int enginePollutionLevel; // this data member can't be changed once the value is assigned

    public Car()
    {
        noOfDoors=4;
        enginePollutionLevel=4;
    }

    void move()
    {
        System.out.println("Car is moving....");
    }
}