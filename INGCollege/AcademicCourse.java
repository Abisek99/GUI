public class AcademicCourse extends Course{
 //instance variable start
 String Lname,lvl,sDate,cDate;
 int countAsmts,cr;
 boolean isReg;
 //instance variable end
 //Constructor start
 AcademicCourse(String courseId, String courseName, int duration, String lvl, int cr,
int countAsmts){
 super(courseId, courseName, duration);
 setcountAsmts(countAsmts);
 this.Lname=this.sDate=this.cDate="";
 this.lvl = lvl;
 this.cr = cr;
 this.isReg = false;
 }
 //Constructor end
 //Accessor methods start
 public String getLname(){
 return Lname;
 }
 public String getlevel(){
 return lvl;
 }
 public int getcredit(){
 return cr;
 }
 public String getstartdate(){
 return sDate;
 }
 public String getcompdate(){
 return cDate;
 }
 public int getcountAsmts(){
 return countAsmts;
 }
 public boolean getregstatus(){
 return isReg;
 }
 //Accessor methods end
 void setLname(String nameinp){ //Method to set Lecturer name
 Lname = nameinp;
 }
 void setcountAsmts(int countAsmtsinp){ //Method to set no of assessments
 countAsmts = countAsmtsinp;
 }
 void register(String courseLeader,String Lname, String sDate, String cDate){
//Method to register course
 if(isReg==false){
 super.setcourseLeader(courseLeader);
 setLname(Lname);
 this.sDate = sDate;
 this.cDate = cDate;
 this.isReg = true;
 }
 else{
 System.out.println("The course is already registered");
 System.out.println("Lecturer name: "+getLname());
 System.out.println("Start date: "+getstartdate());
 System.out.println("End date: "+getcompdate());
 }
 }
 void display(){ //Method to display
 if(isReg==true){
 super.display();
 System.out.println("Lecturer name: "+getLname());
 System.out.println("Level: "+getlevel());
 System.out.println("Credit: "+getcredit());
 System.out.println("Start date: "+getstartdate());
 System.out.println("End date: "+getcompdate());
 System.out.println("No of assessment: "+ getcountAsmts());
 }
 else{
 super.display();
 }
 }
}