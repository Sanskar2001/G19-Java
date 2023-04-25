class Dhirubhai
{
    int vimal;
    int reliance;

    public Dhirubhai()
    {
        System.out.println("Dhirubhai Ambani is born");
        this.vimal=0;
        reliance=0;
    }

    void workHard()
    {
        this.reliance++;
        this.vimal++;
    }

    int getNetWorth()
    {
        return vimal+reliance;
    }

}