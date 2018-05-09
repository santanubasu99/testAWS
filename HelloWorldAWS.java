import org.apache.log4j.Logger;

public class HelloWorldAWS {

	private static Logger logger = Logger.getLogger(HelloWorldAWS.class);

	public static void main(String a[]) {
		logger.info("Hello, World!");
		
		int i = 1;
		
		try {
			if (i == 1)
				throw new Exception("Test Exception for AWS log");
		} catch (Exception e) {
			logger.error("", e);
		}
	}
	
	
	
}