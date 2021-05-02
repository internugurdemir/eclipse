
public class StudentManager extends UserManager{
	
		public void add(Student student) {
			System.out.println("Student Added : " + student.getID());
		}

		public void delete(Student student) {
			System.out.println("Student Deleted : " + student.getID());
		}

		public void update(Student student) {
			System.out.println("Student Updated : " + student.getID());
		}
}
