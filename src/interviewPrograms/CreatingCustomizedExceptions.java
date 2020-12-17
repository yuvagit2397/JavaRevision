package interviewPrograms;

import java.util.Random;

public class CreatingCustomizedExceptions {
	static String uName = "paanai";
	static String pWord = "paanai";

	public static void credentials() throws InvalidLoginCredential {
		if (uName.equalsIgnoreCase(pWord)) {
			throw new InvalidLoginCredential("uName and password are same");
		} else {
			System.out.println("valid credentials");
		}
	}

	public static void main(String[] args) throws InvalidLoginCredential  {
		credentials();
		
		
	}
}
