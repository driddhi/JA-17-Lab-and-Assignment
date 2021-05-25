import java.util.regex.Pattern;
	
		@SuppressWarnings("serial")
		public class MobileNumberValidation extends RuntimeException {
			
	   
		public MobileNumberValidation(String message) {
	        super(message);
	    }

	public void validatePhoneNumber(String phone) {
	    final String regexStr = "^(91\\\\-)?[0-9]{10}$";
	    
	    if (!Pattern.matches(regexStr, phone)) {
	        
	    	throw new MobileNumberValidation(phone);
	    	}
		}
	}
		class InvalidPhone extends Exception {
			 InvalidPhone(String s){  
				  super(s);  
				 } 
		}


