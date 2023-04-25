enum OS
{
    iOS,Android
}

class SmartPhone extends Phone
{
    OS os;

    public SmartPhone(OS os)
    {
        this.os=os;
    }


    void capturePhoto()
    {
        System.out.println("Capturing photo...");
    }

    void call()
    {
        System.out.println("Calling using Voice Over LTE\n");
    }
}
