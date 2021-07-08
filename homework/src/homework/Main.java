package homework;

public class Main {

	public static void main(String[] args) {
 
		Courses courses1=new Courses(0,"Java Programlama","Javanýn Temelleri",39.00,"Cengiz Þen");
		Courses courses2=new Courses(1,"Java Programlama","Ýleri Seviye Java",39.00,"Cengiz Þen");
		Courses courses[]= {courses1,courses2};
		
		   
		     for(Courses course:courses) {
			 System.out.println( 
					           "Kurs Adý: "+course.name+  
					           "\nKurs Aciklamasi:" + course.description+
					           "\nKurs Fiyati:  " + course.price+
					           "\nKurs Egitmeni:  " + course.instructorName+
					           "\n \n"
					           ); 
			
		                            }
		 Instructor instructor1= new Instructor(0, "Cengiz", "Þen");
		 Instructor instructor2= new Instructor(1, "Ahmet", "Þen");
       
		 Instructor instructor[] = {instructor1,instructor2};

	     for(Instructor instructors:instructor) {
	    	 System.out.println(instructors.id +" Ýd deðerine sahip"+ " eðitmen Adý:"+instructors.firstName);
	    	 
	     }
	     
	     CourseManager courseManager=new CourseManager();
	     courseManager.coursesAdd(courses1);
	     courseManager.coursesDelete(courses1);
	    	 
	     
		     
		

		
		
	}

}
