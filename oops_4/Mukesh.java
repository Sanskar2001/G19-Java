class Mukesh extends Dhirubhai
{


    int reliancePetroleum;
    int relianceRetail;

    public Mukesh()
    {
        super(10,10); // super is calling parent's constructor
        System.out.println("Mukesh Ambani is born");
        this.reliancePetroleum=0;
        relianceRetail=0;
    }

    void workHard()
    {
        reliancePetroleum++;
        relianceRetail++;
        vimal++;
        reliance++;
    }

    int getNetWorth()
    {
        return vimal+reliance+relianceRetail+reliancePetroleum;
    }




    
}
