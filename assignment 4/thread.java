// package Multithreading;

class thread extends Thread {
   public void run(){
    try{
        System.out.println("Thread "+ Thread.currentThread().getId()+" is running....");
    }
    catch(Exception e){
        System.out.println("Exception caught!");
    }
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            thread t1= new thread();
            t1.start();
        }
        thread t1= new thread();
        t1.start();
    }

}
