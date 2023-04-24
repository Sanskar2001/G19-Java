class Player {
    
    int playerId;
    int health;
    Gun gun;
    boolean helmet; // helmet increases hp by 50
    boolean armour; // armour increases hp by 50


    public Player(int playerId)
    {
        this.playerId=playerId;
        this.health=100;
        this.gun= new Gun(Gunname.Pan, 0, 0, 20);
        this.helmet=false;
        this.armour=false;
    }

    public Player(int playerId,Gun gun)
    {
        this.playerId=playerId;
        this.gun=gun;
        this.health=100;
        this.helmet=false;
        this.armour=false;
    }

    public Player(int playerId,Gun gun,boolean helmet,boolean armour)
    {
        this.playerId=playerId;
        this.gun=gun;
        this.armour=armour;
        this.helmet=helmet;

       this.health=100;

       if(armour)
       this.health+=50;

       if(helmet)
       this.health+=50;
    }
}
