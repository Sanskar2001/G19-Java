class stringDemo
{
    public static void main(String[] args) {
        
        String str="G19";
        String str2= new String("Chitkara");

        byte arr[]={65,66,67};
        String str3=new String(arr);

        System.out.println(str3);


        String str4="G19";
        String str5=new String("G19");
        String str6=new String("G19");
        System.out.println(str5==str6);
        System.out.println(str5.equals(str6));

        System.out.println(str4.charAt(0));


    }
}