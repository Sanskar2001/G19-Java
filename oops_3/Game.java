class Game {

    public static void main(String[] args) {
        
        Gun g1=new Gun(Gunname.AKM, 7.62f, 30, 50);
        Gun g2=new Gun(Gunname.M416, 5.56f, 30, 40);
        Gun g3=new Gun(Gunname.DP, 7.62f, 60, 55);


        // g1.ammo=1000000;

        // g1.setAmmo(100000);
        
        Player p1=new Player(0, g1, false, false);
        Player p2=new Player(1, g2, false, false);
        Player p3=new Player(2,g3,false,false);


        p1.attack(p2);

        System.out.println(p2.getHealth());
        
        p1.attack(p2);

        System.out.println(p2.getHealth());

        p3.revive(p2);

        System.out.println(p2.getHealth());

    }
    
}
