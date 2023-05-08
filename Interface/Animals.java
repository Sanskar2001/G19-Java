class TerrestialAnimal
{
    void move()
    {
        System.out.println("Moving on land");
    }
}

class AquaticAnimal
{

    void move()
    {
        System.out.println("Swimming in water");
    }
}

/* This is not valid in java due to the diamond problem 
class Turtle extends AquaticAnimal,TerrestialAnimal
{

}
*/

interface ITerrestialAnimal
{
  public void move();
}

interface IAquaticAnimal
{
    public void move();
}

class Turtle implements ITerrestialAnimal,IAquaticAnimal
{
    public void move()
    {
        System.out.println("Turtle can swim in water and move on land");
    }
}


class Animals {


    public static void main(String[] args) {

        Turtle turtle=new Turtle();

        turtle.move();
        
    }
    
}
