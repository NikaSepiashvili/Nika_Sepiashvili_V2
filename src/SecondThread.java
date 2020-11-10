import java.util.Scanner;

public class SecondThread extends Thread{
    @Override
    public  void run() {
        Scanner myObj = new Scanner(System.in);
        Working working = new Working();

        while(true) {
            System.out.println("sityva:");
            String word = myObj.nextLine();

            String[] fileNames = working.GetFileNames(word);

            System.out.println("shemotanilia: " + word);
            for (String fileName : fileNames) {
                System.out.println("moidzebna: " + fileName);
            }
        }
    }
}
