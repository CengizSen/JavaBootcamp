package homework;

public class Main {

	public static void main(String[] args) {
 
		Courses courses1=new Courses(0,"Java Programlama","Javan�n Temelleri",39.00,"Cengiz �en");
		Courses courses2=new Courses(1,"Java Programlama","�leri Seviye Java",39.00,"Cengiz �en");
		Courses courses[]= {courses1,courses2};
		
		   
		     for(Courses course:courses) {
			 System.out.println( 
					           "Kurs Ad�: "+course.name+  
					           "\nKurs Aciklamasi:" + course.description+
					           "\nKurs Fiyati:  " + course.price+
					           "\nKurs Egitmeni:  " + course.instructorName+
					           "\n \n"
					           ); 
			
		                            }
		 Instructor instructor1= new Instructor(0, "Cengiz", "�en");
		 Instructor instructor2= new Instructor(1, "Ahmet", "�en");
       
		 Instructor instructor[] = {instructor1,instructor2};

	     for(Instructor instructors:instructor) {
	    	 System.out.println(instructors.id +" �d de�erine sahip"+ " e�itmen Ad�:"+instructors.firstName);
	    	 
	     }
	     
	     CourseManager courseManager=new CourseManager();
	     courseManager.coursesAdd(courses1);
	     courseManager.coursesDelete(courses1);
	    	 
	     
		     
		

		
		
	}

}
