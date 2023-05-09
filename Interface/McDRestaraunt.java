public class McDRestaraunt implements McDonalds {

    @Override
    public void bake() {
       System.out.println("Baking bread at McDonalds");
       
    }

    @Override
    public void hireStaff() {
        System.out.println("Hired a person");
    }

    @Override
    public void fireStaff() {
    
        System.out.println("Fired a person");
    }

    @Override
    public void sellPizzas() {
      
        System.out.println("Sold a pizza");
    }

    @Override
    public void sellBurgers() {

        System.out.println("Sold a burger");
       
    }
    
}
