import java.io.File;
import java.io.FilenameFilter;

public class Main {

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        firstThread.start();
        secondThread.start();
    }
}
