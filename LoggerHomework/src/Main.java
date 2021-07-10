
public class Main {

	public static void main(String[] args) {
   
		/*SmsLogger logger=new SmsLogger();
	     logger.log("Sms Gönderildi");	*/		
		
		
	  Logger[] logger =new Logger[] {
			  new FileLogger(),new DatabaseLogger(),
			  
	  };
	  
	  for(Logger loggers:logger) {
		  loggers.log("Log Mesaji");
	  }
	  
	  
	  LogManager logManager=new LogManager(new SmsLogger());
	  logManager.Add();
	  
	  
	  
		
	}

}
