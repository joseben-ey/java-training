package Program3;

public class ConferenceRoomBookingSystem {
	private static final ConferenceRoom conferenceRoom = new ConferenceRoom();

    public static void main(String[] args) {
        Thread manager1 = new Thread(new ConferenceRoomBookingJob(conferenceRoom, "Manager 1"));
        Thread manager2 = new Thread(new ConferenceRoomBookingJob(conferenceRoom, "Manager 2"));

        manager1.start();
        manager2.start();
    }
}

