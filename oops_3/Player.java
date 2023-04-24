class Player {
    
    int playerId;
    int health;
    Gun gun;
    boolean helmet; // helmet increases hp by 50
    boolean armour; // armour increases hp by 50
    boolean isAlive; // to check whether player is active or down


    public Player(int playerId)
    {
        this.playerId=playerId;
        this.health=100;
        this.gun= new Gun(Gunname.Pan, 0, 0, 20);
        this.helmet=false;
        this.armour=false;
        this.isAlive=true;
    }

    public Player(int playerId,Gun gun)
    {
        this.playerId=playerId;
        this.gun=gun;
        this.health=100;
        this.helmet=false;
        this.armour=false;
        this.isAlive=true;
    }

    public Player(int playerId,Gun gun,boolean helmet,boolean armour)
    {
        this.playerId=playerId;
        this.gun=gun;
        this.armour=armour;
        this.helmet=helmet;
        this.isAlive=true;

       this.health=100;

       if(armour)
       this.health+=50;

       if(helmet)
       this.health+=50;
    }

    void attack(Player p)
    {
        p.health=p.health-this.gun.getDamage();
        if(p.health<=0)
        p.isAlive=false;
    }

    void revive(Player p)
    {
        if(p.isAlive==false)
        p.health=100;
    }

    // getters
    int getPlayerId()
    {
        return this.playerId;
    }

    int getHealth()
    {
        return this.health;
    }

    Gun getGun()
    {
        return this.gun;
    }

    boolean getHelmet()
    {
        return this.helmet;
    }

    boolean getArmour()
    {
        return this.armour;
    }

    boolean getIsAlive()
    {
        return this.isAlive;
    }


    // setters
    void setPlayerId(int playerId)
    {
         this.playerId=playerId;
    }

    void setHealth(int health)
    {
         this.health=health;
    }

    void setGun(Gun gun)
    {
         this.gun=gun;
    }

    void setHelmet(boolean helmet)
    {
         this.helmet=helmet;
    }

    void setArmour(boolean armour)
    {
         this.armour=armour;
    }

    void getIsAlive(boolean isAlive)
    {
         this.isAlive=true;;
    }


}

