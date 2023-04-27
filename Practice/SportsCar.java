class SportsCar extends Car {

    int seatingCapacity;

     int noOfDoors;


     public SportsCar()
     {
        noOfDoors=2;
     // enginePollutionLevel=6; This is not valid as this data member is final
     
    }

    void move()
    {
        System.out.println("Sports Car is moving....");
    }

    void getNoofDoors()
    {
        
        System.out.println("No of doors="+noOfDoors);
    }
}
