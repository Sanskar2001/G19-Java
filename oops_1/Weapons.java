class Gun
{
    String gunName;
    float calibre;
    int ammo;
    int damage;

    public Gun(String gunName,float calibre,int ammo,int damage)
    {
        this.gunName=gunName;
        this.calibre=calibre;
        this.ammo=ammo;
        this.damage=damage;
    }

    public void display()
    {
        System.out.println(this.gunName);
        System.out.println(this.calibre);
        System.out.println(this.ammo);
        System.out.println(this.damage);
    }


}

class Weapons
{
    public static void main(String[] args) {
        

        Gun gun=new Gun("AKM", 7.62f, 30, 50);

        // gun.display();


        System.out.println(gun.gunName);
        System.out.println(gun.calibre);
        System.out.println(gun.ammo);
        System.out.println(gun.damage);
    }
}