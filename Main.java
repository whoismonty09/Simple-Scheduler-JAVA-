import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
    public void run() {
        System.out.println("Task executed at: " + System.currentTimeMillis());
    }
}

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new Task(), 0, 2000);
    }
}
