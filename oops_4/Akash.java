class Akash extends Mukesh
{
    
    int jio;
    int relianceTrends;

    public Akash()
    {
        System.out.println("Akash Ambani is born");

        this.jio=0;
        this.relianceTrends=0;
        this.reliancePetroleum=0;
        this.relianceRetail=0;
        this.vimal=0;
        this.reliance=0;
    }

    void workHard()
    {

        this.jio++;
        this.relianceTrends++;
        this.reliancePetroleum++;
        this.relianceRetail++;
        this.vimal++;
        this.reliance++;
    }


    int  getNetWorth()
    {
        return jio+reliance+reliancePetroleum+relianceRetail+relianceTrends+vimal;
    }


}
