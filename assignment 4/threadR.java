public class threadR implements Runnable{
    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running....");
        }
        catch(Exception e){
            System.out.println("Exception Caught!");
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Thread t=new Thread(new threadR());
            t.start();
        }
    }
}