class carClient {

    
public static void main(String[] args) {
    

    Car car=new Car();
    SportsCar sportsCar=new SportsCar();


    car.move();
    sportsCar.move();

    Car demoCar=new SportsCar();
    

    demoCar.move();

    sportsCar.getNoofDoors();


    //  A Car is moving....
    //    Car is moving....
    //    Sports Car is moving...

    // B Car is moving....
    //  Sports car is moving..
    //  Sports car is moving

    // C Car is moving 
    //  Car is moving 
    //  Car is moving 

    final int x=120;

    // x=5; cannot re assign value to a final variable

}


}
