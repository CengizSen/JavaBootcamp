
public class LogManager {
 private Logger logger;
 
 
 public LogManager(Logger logger) {
	 this.logger=logger;
	 
 }
	
	public void Add() {
		System.out.println("Müsteri Eklendi");
		this.logger.log("log mesaji");
	}
}
