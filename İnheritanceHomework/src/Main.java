
public class Main {

	public static void main(String[] args) {

		User user=new User();
      	Student student =new Student();
      	Instructor instructor =new Instructor();
      	instructor.course="Java Programlama Temelleri";
        instructor.price=25.00;
        
        InstructorManager manager=new InstructorManager() ;
        	
        manager.InsctructorCoursesAdd(instructor);
        
        instructor.price=29.99;
        manager.InsctructorCoursesPriceUpdate(instructor);
       
        student.firstName="Cengiz";
        student.lastName="Sen";
        student.studentClass="12/C";
        student.studentNumber="515";
        
        
        StudentManager manager2=new StudentManager();
        manager2.Add(student);
	}

}
