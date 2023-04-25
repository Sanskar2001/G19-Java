 class Child extends Parent {
    

    int d;

    public Child()
    {
        this.a=10;
        // this.b=12; This data member can't be inherited as it is a private member of Parent Class
        this.d=100;
    }
}
