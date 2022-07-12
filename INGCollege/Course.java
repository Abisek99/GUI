public class Course{
 //instance variable start
 String courseId, courseName, courseLeader;
 int duration;
 //instance variable end

 //Constructor start
 Course(String cId,String cName, int dur){
 this.courseId = cId;
 this.courseName = cName;
 this.duration = dur;
 this.courseLeader="";
 }
 //Constructor end
 //Accessor methods start
 public String getcourseId(){
 return courseId;
 }
 public String getcourseName(){
 return courseName;
 }
 public String getcourseLeader(){
 return courseLeader;
 }
 public int getduration(){
 return duration;
 }
 //Accessor methods end
 void setcourseLeader(String ncourseLeader){ //Method to set new course leader name
 this.courseLeader = ncourseLeader;
 }
 void display(){ //Method to display
 System.out.println("Course id:"+getcourseId());
 System.out.println("Course name:"+getcourseName());
 System.out.println("Duration:"+getduration());
 if(courseLeader.isEmpty()==false){
 System.out.println("Course Leader:"+getcourseLeader());
 }
 }
}