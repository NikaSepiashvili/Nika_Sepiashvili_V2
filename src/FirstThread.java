public class FirstThread extends Thread {
    @Override
    public void run(){
        Working working = new Working();

        while(true){
            System.out.println(working.GetCount());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
