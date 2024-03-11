package Program3;

public class ConferenceRoomBookingJob implements Runnable{
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
