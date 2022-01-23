package todo;


import java.awt.AWTException;
import java.awt.SystemTray;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
 
public class timer {
    Timer timerRef;
    TimerTask task;
    int delay = 0;
    int period = 1000;

    public timer(LocalDate date, LocalTime time,String event) {
        timerRef = new Timer();
        TimerTask timertask = new MyTimerTask(date, time, timerRef, event);
        timerRef.schedule(timertask, delay, period);
    }

}

class MyTimerTask extends TimerTask {
    LocalDate date;
    LocalTime time;
    Timer timerRef;
    String event;
    public MyTimerTask(LocalDate date, LocalTime time, Timer timerRef, String event) {
        this.date = date;
        this.time = time;
        this.timerRef = timerRef;
        this.event = event;
    }
    @Override
    public void run() {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();

        if (nowDate.equals(this.date) && nowTime.getHour() == this.time.getHour() && nowTime.getMinute() == this.time.getMinute()) {
            
            /**
             * Throw Notification
             */
            if (SystemTray.isSupported()) {
                Notification td = new Notification(event);
                try {
                    td.throwMessage();
                } catch (AWTException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("System tray not supported!");
            }
            timerRef.cancel();
        }

    }
}