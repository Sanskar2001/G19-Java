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
}
