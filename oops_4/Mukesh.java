class Mukesh extends Dhirubhai
{


    int reliancePetroleum;
    int relianceRetail;

    public Mukesh()
    {
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
