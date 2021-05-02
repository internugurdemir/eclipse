
public class Student extends User{

	   String description;
	    int courseProgress;

	    public Student(String description1, int courseProgress) {
	        this.description = description1;
	        this.courseProgress = courseProgress;
	    }

	    public Student() {

	    }

	    public String getStudentInfo() {
	        return description;
	    }

	    public void setStudentInfo(String description1) {
	        this.description = description1;
	    }

	    public int getCourseProgress() {
	        return courseProgress;
	    }

	    public void setCourseProgress(int courseProgress) {
	        this.courseProgress = courseProgress;
	    }
}
