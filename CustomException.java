package exception;

public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;

	  @Override
	  public String toString() {
	    return "Please check your inputs format as per instruction";
	  }
}
