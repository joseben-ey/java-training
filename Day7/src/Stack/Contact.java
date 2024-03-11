package Stack;

import java.util.Date;

public class Contact {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String mobileNumber;

   public boolean validateContact() {
        if (firstName == null || firstName.isEmpty() ||
            lastName == null || lastName.isEmpty() ||
            mobileNumber == null || mobileNumber.isEmpty()) {
            return false;
        }
        return true;
    }

    public Contact(String firstName, String lastName, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



}