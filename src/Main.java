public class Main extends Thread {

    public Main(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Running thread" + getName());
        System.out.println("Thread finished" + getName());
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        for(int i=1; i<=5;i++){
            Main main = new Main("Thread" + i);
            main.start();
        }
    }
}
