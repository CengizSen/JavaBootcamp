
public class InstructorManager {

	public void InsctructorCoursesAdd(Instructor instructor) {
		
		System.out.println(instructor.course+" kursunuz  "+instructor.price+" TL fiyattan eklenmi�tir.");
		
	}
       public void InsctructorCoursesDelete(Instructor instructor) {
		
		System.out.println(instructor.course+" kursunuz kaldirilmistir.");
		
       }
       public void InsctructorCoursesPriceUpdate(Instructor instructor) {
   		
   		System.out.println(instructor.course+" kursunuz  "+instructor.price+" TL fiyattan guncellenmistir.");
   		
          }
	
	
}
