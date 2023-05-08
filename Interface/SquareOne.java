class SquareOne {



    public static void main(String[] args) {
        
        Restraunt restraunt=new Restraunt();


        restraunt.hireStaff();
        restraunt.bake();
        restraunt.bake();
        restraunt.sellPizzas();
        restraunt.sellPizzas();
        restraunt.fireStaff();


        Dominos dominos=new Restraunt();

        dominos.bake();
        dominos.hireStaff();
        dominos.fireStaff();
        dominos.sellPizzas();
    }
    


}
