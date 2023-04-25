class phoneClient {

    public static void main(String[] args) {
        

        

        Phone nokiaPhone=new Phone();

        SmartPhone oneplusPhone=new SmartPhone(OS.Android);


    

        // dynamic method dispatch- it is an example of runtime polymorphism in oops
        Phone demoPhone=new SmartPhone(OS.iOS); // calling using voice over LTE will be printed

        demoPhone.call();


        // nokiaPhone.call();
        // oneplusPhone.call();
    }
    
}
