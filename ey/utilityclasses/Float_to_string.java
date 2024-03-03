package ey.utilityclasses;

public class Float_to_string {
	
    public static String Float_to_string(float floatValue)
    {
        return Float.toString(floatValue);
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float floatValue = 1;
        String stringValue = Float_to_string(floatValue);
        System.out.println("After converting into string = " + stringValue);
	}

}
