import java.util.concurrent.TimeUnit;

public class ConferenceRoomBookingSystem {

    private static final ConferenceRoom conferenceRoom = new ConferenceRoom();

    public static void main(String[] args) {
        Thread manager1 = new Thread(new ConferenceRoomBookingJob(conferenceRoom, "Manager 1"));
        Thread manager2 = new Thread(new ConferenceRoomBookingJob(conferenceRoom, "Manager 2"));

        manager1.start();
        manager2.start();
    }
}

class ConferenceRoom {
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
        TimeUnit.SECONDS.sleep(5); // Simulate meeting duration
        System.out.println(managerName + " finished the meeting.");
    }
}

class ConferenceRoomBookingJob implements Runnable {

    private final ConferenceRoom conferenceRoom;
    private final String managerName;

    public ConferenceRoomBookingJob(ConferenceRoom conferenceRoom, String managerName) {
        this.conferenceRoom = conferenceRoom;
        this.managerName = managerName;
    }

    @Override
    public void run() {
        try {
            conferenceRoom.bookRoom(managerName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
