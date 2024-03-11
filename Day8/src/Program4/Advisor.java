package Program4;

import java.util.Random;

public class Advisor {
	public static final String[] advices = {
	            "Never begin to stop and never stop to begin.",
	            "Only the destination isn't important, one should enjoy the journey.",
	            "Impossible itself says 'I'm possible'"
	    };

	    public static void main(String[] args) {
	        Random random = new Random();
	        int randomIndex = random.nextInt(advices.length);
	        System.out.println("Free advice: " + advices[randomIndex]);
	    }
}
