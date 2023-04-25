import java.util.concurrent.TimeUnit;

public class RunnableExample implements Runnable{

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        System.out.println("Starting thread");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Starting thread");

    }
}
