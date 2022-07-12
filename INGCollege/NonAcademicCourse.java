public class NonAcademicCourse extends Course{
 //instance variable start
 String InsName, Sdate, Cdate, Edate, prereq;
 int duration;
 boolean isreg, isrem;
 //instance variable end
 //Constructor start
 NonAcademicCourse(String courseId,String courseName, int duration, String pr){
 super(courseId,courseName,duration);
 this.prereq = pr;
 this.Sdate=this.Cdate=this.Edate="";
 this.isreg=this.isrem= false;
 }
 //Constructor end
 //Accessor Methods Star
 public String getInsName(){
 return InsName;
 }
 public String getSdate(){
 return Sdate;
 }
 public String getCdate(){
 return Cdate;
 }
 public String getEdate(){
 return Edate;
 }
 public String getprereq(){
 return prereq;
 }
 public int getDuration(){
 return duration;
 }
 public boolean getisreg(){
 return isreg;
 }
 public boolean getisrem(){
 return isrem;
 }
 //Accessor Methods end
 void setinsname(String newinsname){ //Method to set Instructor name
 if(isreg!=true){
 InsName=newinsname;
 }
 else{
 System.out.println("It is not possible to change the name");
 }
 }
 void register(String cln, String insname, String sdate, String cdate, String edate){
//Method to register
 if (isreg!=true){
 setcourseLeader(cln);
 setinsname(insname);
 this.Sdate=sdate;
 this.Cdate=cdate;
 this.Edate = edate;
 isreg=true;
 }
 else{
 System.out.println("The Course is already registered");
 }
 }
 void remove(){ //Method to remove
 if(isrem!=true){
 super.setcourseLeader("");
 InsName = "";
 Sdate = "";
 Cdate = "";
 Edate = "";
 isreg = false;
 isrem = true;
 }
 else{
 System.out.println("There is no course");
 }
 }
 void display(){ //Method to display
 if(this.isreg==true){
 super.display();
 System.out.println("Instructor name: "+getInsName());
 System.out.println("Prerequisites: "+getprereq());
 System.out.println("Starting Date: "+getSdate());
 System.out.println("Completion Date: "+getCdate());
 System.out.println("Exam Date: "+getEdate());
 }
 if(this.isrem==true){
 return;
 }
 if(this.isreg==false){
 super.display();
 }
 }
}