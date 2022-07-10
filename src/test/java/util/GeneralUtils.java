package util;
import java.security.SecureRandom;

public class GeneralUtils {

	public static String generateRandomString(int count, String ALPHABET) {
	    	
	    SecureRandom RANDOM = new SecureRandom();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; ++i) {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return sb.toString();
	        
	}
	
	public static String generateRandomString(int count) {
    	
       return generateRandomString(count, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
       
	}

	
	public static void main(String[] args) throws Exception {
		
	}




}
