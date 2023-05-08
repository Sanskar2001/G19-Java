class Restraunt implements Dominos{
    
    int totalStaff;

    public Restraunt()
    {
        totalStaff=0;
    }

    public void hireStaff()
    {
        System.out.println("Hired a person!");
        totalStaff++;
    }

    public void fireStaff()
    {
        System.out.println("Fired a person!");
        totalStaff--;
    }

    public void bake()
    {
        System.out.println("We bake our own bread");
    }

    public void sellPizzas()
    {
        System.out.println("Sold a pizza");
    }

}
