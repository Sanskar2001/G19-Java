enum Gunname
{
    AKM,DP,M762,M416,AUG,SCARL
}


class Gun
{
    Gunname gunName;
    float calibre;
    int ammo;
    int damage;

    public Gun(Gunname gunName,float calibre,int ammo,int damage)
    {
        this.gunName=gunName;
        this.calibre=calibre;
        this.ammo=ammo;
        this.damage=damage;
    }

    // public void display()
    // {
    //     System.out.println(this.gunName);
    //     System.out.println(this.calibre);
    //     System.out.println(this.ammo);
    //     System.out.println(this.damage);
    // }

    // getters
    Gunname getGunname()
    {
        return this.gunName;
    }

    float getCalibre()
    {
        return this.calibre;
    }

    int getAmmo()
    {
        return this.ammo;
    }

    int getDamage()
    {
        return this.damage;
    }

    // setters

    void setGunname(Gunname gunname)
    {
        this.gunName=gunname;
    }

    void setCalibre(float calibre)
    {
        this.calibre=calibre;
    }

    void setAmmo(int ammo)
    {
        this.ammo=ammo;
    }

    void setDamage(int damage)
    {
        this.damage=damage;
    }


}