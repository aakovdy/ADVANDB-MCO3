package main;

public class TransactionThread implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

 
    /*
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
    */

}
