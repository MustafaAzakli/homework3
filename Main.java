package homework3;

public class Main {

	public static void main(String[] args) {
		
		
			Student student1 = new Student();
			student1.setId(1);
			student1.setFirstName("Mustafa");
			student1.setLastName("Azaklý");
			student1.setEmail("mustafa.azakli.ma@gmail.com");
			student1.setPassword("0167920");
			student1.setCourse("Java Kamp");
			
			Instructor instructor = new Instructor();
			instructor.setId(1);
			instructor.setFirstName("Engin");
			instructor.setLastName("Demirog");
			instructor.setEmail("engin@gmail.com");
			instructor.setPassword("456789458");
			instructor.setDescription("MCT,PMP,ITIL");
			instructor.setCourse("Java Kamp");
			
			StudentManager studentManager = new StudentManager();
			studentManager.add(student1);
			studentManager.rollCall(student1);
			
			
			InstructorManager instructorManager = new InstructorManager();
			
			instructorManager.add(instructor);
			instructorManager.addCourse(instructor);

		
	}

}
