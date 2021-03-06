package priorytety;

public class Main {

    public static void main(String[] args) {
 
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Thread watek1 = new Thread(new Thread1(), "Mały");
        Thread watek2 = new Thread(new Thread2(), "Duży");
        
        System.out.println(watek1.getPriority());
        System.out.println(watek2.getPriority());
    
        watek1.setPriority(Thread.MIN_PRIORITY);
        watek2.setPriority(Thread.MAX_PRIORITY);
        
        watek1.start();
        watek2.start();
    }
    
}

class Thread1 implements Runnable
{
    @Override
    public void run() {
        while(true)
            System.out.println(Thread.currentThread().getName());
    }
}

class Thread2 implements Runnable
{
    @Override
    public void run() {
        while(true)
            System.out.println(Thread.currentThread().getName());
    }
}