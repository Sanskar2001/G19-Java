class CustomException {

    static void proposeGirl(boolean response) throws Exception
    {
        System.out.println("तेरी नज़रों ने दिल का किया जो हशर असर ये हुआ अब इनमें ही डूब के हो जाऊँ पार यही है दुआ... ");

        if(response==false)
        throw new Exception("Duniya thukegi mujhpe");
    }

    static void proposeGirl2(boolean response) throws RejectionException
    {
        System.out.println("तेरी नज़रों ने दिल का किया जो हशर असर ये हुआ अब इनमें ही डूब के हो जाऊँ पार यही है दुआ... ");

        if(response==false)
        throw new RejectionException();
    }

    public static void main(String[] args) {


        try{
            proposeGirl(false);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try {
            proposeGirl2(false);
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
        

    }
    
}
