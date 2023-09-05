import java.util.concurrent.TimeUnit;


public class Main
{
	public static void main(String[] args) {
	    printer("Hello World");
	}
	
	public static void printer(String target) {
	    String display = "";
	    char currentChar;
	    int remFromTarget = target.length();
	    
	    for (int i = 0; i < remFromTarget; ) {
	        for (int j = 32; j < 127; j++) {
	            currentChar = (char)j;
	            if (currentChar == target.charAt(i)) {
	                i++;
	                display = display + currentChar;
	                delayInThread(20);
	                System.out.println(display);
	                break;
	            } else {
	                delayInThread(20);
	                System.out.println(display + currentChar);
	                continue;
	            }
	        }
	    }
	    
	    System.out.println("Final result: " + display);
	}
	
	
	public static void delayInThread(int amount) {
        try {
            TimeUnit.MILLISECONDS.sleep(amount);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
	}
}
