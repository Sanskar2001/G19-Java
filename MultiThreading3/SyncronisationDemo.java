
class Printer {
    //    void display(String str) {
    //        synchronized (this) {
    //            for (int i = 0; i < str.length(); i++) {
    //                System.out.print(str.charAt(i));
    //            }
    //        }
    //    }
    
        synchronized void display(String str) {
    
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i));
    
            }
        }
    }
    
    class ThreadA extends  Thread
    {
        Printer printer;
    
        public ThreadA(Printer printer)
        {
            this.printer=printer;
        }
    
        public void run() {
           printer.display("Hello");
        }
    }
    class  ThreadB extends  Thread
    {
    
        Printer printer;
    
        public  ThreadB(Printer printer)
        {
            this.printer=printer;
        }
        public void run() {
           printer.display("World");
        }
    }
    
    
    
    public class Main {
        public static void main(String[] args) {
    
            Printer printer=new Printer();
        ThreadA threadA=new ThreadA(printer);
        ThreadB threadB=new ThreadB(printer);
    
        threadA.start();
        threadB.start();
    
        }
    }