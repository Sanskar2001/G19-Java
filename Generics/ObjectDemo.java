class ObjectDemo
{
    public static void main(String[] args) {
        

        int x=12;
        char ch='a';

        Object obj1="abc";
        System.out.println(obj1);
        Object obj2=12;
        System.out.println(obj2);


        int []arr=new int[5];


        Object [] myarr=new Object[3];
        myarr[0]="Hello";
        myarr[1]=120;
        myarr[2]='a';


        for(int i=0;i<3;i++)
        {
            System.out.println(myarr[i]);
        }


        // for(int i=0;i<3;i++)
        // {
        //     String currentString=(String)myarr[i];
        //     currentString.charAt(0);
        // }


        // T abc=120;
        // T myStr="abc";



            Container<Integer> myContainer1=new Container<Integer>(120);
            Container<String> myContainer2=new Container<String>("Hello");
            Container<Character> myContainer3=new Container<Character>('a');

            myContainer1.displayValue();
            myContainer2.displayValue();
            myContainer3.displayValue();








    }
}