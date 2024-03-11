package Program3;

import java.util.concurrent.TimeUnit;

public class ConferenceRoom {
	private boolean isAvailable = true;

    public synchronized boolean isAvailable() {
        return isAvailable;
    }

    public synchronized void bookRoom(String managerName) throws InterruptedException {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(managerName + " booked the conference room.");
            conductMeeting(managerName);
            isAvailable = true;
        } else {
            System.out.println(managerName + " could not book the conference room - already occupied.");
        }
    }

    private void conductMeeting(String managerName) throws InterruptedException {
        System.out.println(managerName + " is conducting a meeting.");
        Thread.sleep(5); 
        System.out.println(managerName + " finished the meeting.");
    }
}
