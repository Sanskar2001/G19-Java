 class engineClient {
    

    public static void main(String[] args) {
        
        Engine engine=new 
        Engine(false, 5, 10,
         0, 5000);

         Engine engine2=new Engine(false,6,11,0,6000);


         System.out.println(Engine.manufacturer);
        //  System.out.println(engine.getManufacturer());
        //  System.out.println(engine2.getManufacturer());
        

        //  Engine engine2=new Engine(false,4,0);

        //  System.out.println(engine2.getIsEngineOn());
        //  System.out.println(engine2.getNoOFPistons());
        //  System.out.println(engine2.getCurrentRpm());


        // Engine engine3=new Engine(false);

        // System.out.println(engine3.getIsEngineOn());


        // System.out.println(engine.isEngineOn);
        // System.out.println(engine.fuelEfficieny);
        // System.out.println(engine.noOFPistons);
        // System.out.println(engine.currentRpm);
        // System.out.println(engine.maxRpm);


        // System.out.println(engine.isEngineOn);
        // engine.isEngineOn=true;
        // System.out.println(engine.isEngineOn);

        // System.out.println("BEFORE:"+engine.checkEngineStatus());
        // engine.ignitionOn();
        // System.out.println("AFTER:"+engine.checkEngineStatus());



        // engine.setIsEngineOn(true);
        // System.out.println(engine.getIsEngineOn());
        // engine.setIsEngineOn(false);
        // System.out.println(engine.getIsEngineOn());


        // System.out.println(engine.getCurrentRpm());
        // engine.accelerate();
        // System.out.println(engine.getCurrentRpm());
        // engine.accelerate();
        // System.out.println(engine.getCurrentRpm());
    }
}
