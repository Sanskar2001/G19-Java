 class Add {
    
   
    static int add(int x,int y)
    {
        return x+y;
    }
   
   static float add(float a,float b)
   {
    return a+b;
   }
   
   static int add(int a,int b,int c)
   {
    return a+b+c;
   }

   static float add(float a,float b,float c)
   {
    return a+b+c;
   }

    public static void main(String[] args) {
    
        System.out.println(add(10, 20));

        System.out.println(add(0.1f, 0.9f));

        System.out.println(add(1,2,3));

        System.out.println(add(0.1f,0.9f,1.5f));
    
    }
}
