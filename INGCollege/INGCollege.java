// Importing the required libraries
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;

public class INGCollege implements ActionListener{

    // Creating instances of the objects that will be used
    private JFrame frame;
    private JPanel panel;
    private JLabel heading;
    private JButton academicCourseButton, nonacademicCourseButton;
    Color background = new Color(000000);
    Color title = new Color(0xFF4C29);
    Color fgColor = new Color(0xfffafa);
    Color buttonBg = new Color(0x2f496e);
    Color cBox = new Color(0x3d5a82);
    Border line = new LineBorder(Color.BLACK);
    Border margin = new EmptyBorder(5, 15, 5, 15);
    Border compound = new CompoundBorder(line, margin);
    class AcademicCourseFrame implements ActionListener{

        // Creating instances of the objects that will be used
        private JFrame frame;
        private JPanel panel;
        private JButton addButton, regButton, displayButton, clearButton,backButton;
        private JLabel acCourse, cName, cID, duration, cLeader, insName, lvl, cr, sDate,eDate,noa;
        private JTextField cNameTF, cIDTF, durationTF, cLeaderTF, insNameTF, lvlTF, crTF, noaTF;
        private JComboBox<String> startDday, startDmonth, startDyear, endDday, endDmonth, endDyear;
        private String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        private String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December",};
        private String years[] = {"2021","2022","2023","2024"};
        private ArrayList<Course> course = new ArrayList<>();
        private String getcourseID(){return cIDTF.getText();}
        private String getcoursename(){return cNameTF.getText();}
        private String getcleader(){return cLeaderTF.getText();}
        private String getinsname(){return insNameTF.getText();}
        private String getlvl(){return lvlTF.getText();}
        private int getcr(){return Integer.parseInt(crTF.getText());}
        private int getduration(){return Integer.parseInt(durationTF.getText());}
        private int getnoa(){return Integer.parseInt(noaTF.getText());}
        private String getsdate(){return startDday.getSelectedItem()+" "+startDmonth.getSelectedItem()+" "+startDyear.getSelectedItem();}
        private String getedate(){return endDday.getSelectedItem()+" "+endDmonth.getSelectedItem()+" "+endDyear.getSelectedItem();}


        public AcademicCourseFrame(){                               // Constructor for the AcademicCourse Frame
            frame = new JFrame("Academic Course Registration Form");   //Creating the object of the frame
            panel = new JPanel();                                   //Creating the object of the panel
            panel.setBackground(background);                        //Setting the background color of the panel
            panel.setLayout(null);                                  //Setting the Layout of the panel


            // Creation and setting of properties of Labels
            acCourse = new JLabel("Academic Course");
            acCourse.setFont(new Font("Arial",Font.BOLD,20));
            acCourse.setForeground(title);
            acCourse.setBounds(250,10,200,25);
            cID = new JLabel("Course ID");
            cID.setForeground(fgColor);
            cID.setBounds(70,50,90,25);
            cName = new JLabel("Course Name");
            cName.setForeground(fgColor);
            cName.setBounds(70,85,90,25);
            duration = new JLabel("Duration");
            duration.setForeground(fgColor);
            duration.setBounds(350,50,90,25);
            cLeader = new JLabel("Course Leader");
            cLeader.setForeground(fgColor);
            cLeader.setBounds(350,140,100,25);
            insName = new JLabel("Instructor Name");
            insName.setForeground(fgColor);
            insName.setBounds(70,140,100,25);
            lvl = new JLabel("Level");
            lvl.setForeground(fgColor);
            lvl.setBounds(70,175,130,25);
            cr = new JLabel("Credit");
            cr.setForeground(fgColor);
            cr.setBounds(350,175,130,25);
            sDate = new JLabel("Start Date");
            sDate.setForeground(fgColor);
            sDate.setBounds(70,215,130,25);
            eDate = new JLabel("End Date");
            eDate.setForeground(fgColor);
            eDate.setBounds(70,250,130,25);
            noa = new JLabel("<html><body>Number of<br>Assessment</body></html>");
            noa.setForeground(fgColor);
            noa.setBounds(430,215,90,25);


            // Creation and setting of properties of Text Field
            cIDTF = new JTextField();
            cIDTF.setBorder(compound);
            cIDTF.setBounds(180,50,130,25);
            cNameTF = new JTextField();
            cNameTF.setBorder(compound);
            cNameTF.setBounds(180,85,130,25);
            durationTF = new JTextField();
            durationTF.setBorder(compound);
            durationTF.setBounds(450, 50, 130,25);
            cLeaderTF = new JTextField();
            cLeaderTF.setBorder(compound);
            cLeaderTF.setBounds(450,140,130,25);
            insNameTF = new JTextField();
            insNameTF.setBorder(compound);
            insNameTF.setBounds(180,140,130,25);
            lvlTF = new JTextField();
            lvlTF.setBorder(compound);
            lvlTF.setBounds(180, 175, 130, 25);
            crTF = new JTextField();
            crTF.setBorder(compound);
            crTF.setBounds(450,175,130,25);
            noaTF = new JTextField();
            noaTF.setBounds(530,215,50,25);
            noaTF.setBorder(compound);


            // Creation and setting of properties of Combo boxes
            startDday = new JComboBox<>(days);
            startDday.setBounds(180,215,45,25);
            startDday.setFocusable(false);
            startDday.setBackground(cBox);
            startDday.setForeground(fgColor);
            startDday.setBorder(line);
            startDmonth = new JComboBox<>(months);
            startDmonth.setBounds(225,215,90,25);
            startDmonth.setFocusable(false);
            startDmonth.setBackground(cBox);
            startDmonth.setForeground(fgColor);
            startDmonth.setBorder(line);
            startDyear = new JComboBox<>(years);
            startDyear.setBounds(315,215,60,25);
            startDyear.setFocusable(false);
            startDyear.setBackground(cBox);
            startDyear.setForeground(fgColor);
            startDyear.setBorder(line);
            endDday = new JComboBox<>(days);
            endDday.setBounds(180,250,45,25);
            endDday.setFocusable(false);
            endDday.setBackground(cBox);
            endDday.setForeground(fgColor);
            endDday.setBorder(line);
            endDmonth = new JComboBox<>(months);
            endDmonth.setBounds(225,250,90,25);
            endDmonth.setFocusable(false);
            endDmonth.setBackground(cBox);
            endDmonth.setForeground(fgColor);
            endDmonth.setBorder(line);
            endDyear = new JComboBox<>(years);
            endDyear.setBounds(315,250,60,25);
            endDyear.setFocusable(false);
            endDyear.setBackground(cBox);
            endDyear.setForeground(fgColor);
            endDyear.setBorder(line);


            // Creation and setting of properties of Buttons
            addButton = new JButton();
            addButton.setText("Add");
            addButton.setBounds(500,85,80,30);
            addButton.setForeground(fgColor);
            addButton.setBackground(buttonBg);
            addButton.setBorder(compound);
            addButton.setFocusable(false);
            addButton.addActionListener(this);
            regButton = new JButton("Register");
            regButton.setBorder(compound);
            regButton.setForeground(fgColor);
            regButton.setBackground(buttonBg);
            regButton.setBounds(450,270,130,25);
            regButton.setFocusable(false);
            regButton.addActionListener(this);
            displayButton = new JButton("Display");
            displayButton.setBounds(180,300,130,25);
            displayButton.setForeground(fgColor);
            displayButton.setBackground(buttonBg);
            displayButton.setBorder(compound);
            displayButton.setFocusable(false);
            displayButton.addActionListener(this);
            clearButton = new JButton("Clear");
            clearButton.setBounds(320,300,130,25);
            clearButton.setForeground(fgColor);
            clearButton.setBackground(buttonBg);
            clearButton.setBorder(compound);
            clearButton.setFocusable(false);
            backButton = new JButton("Back");
            backButton.setBounds(10, 10, 100, 25);
            backButton.setForeground(fgColor);
            backButton.setBackground(buttonBg);
            backButton.setBorder(compound);
            backButton.setFocusable(false);
            backButton.addActionListener(this);



            // Adding all objects to the panel
            panel.add(acCourse);
            panel.add(cName);
            panel.add(cID);
            panel.add(duration);
            panel.add(cLeader);
            panel.add(insName);
            panel.add(lvl);
            panel.add(cr);
            panel.add(regButton);
            panel.add(displayButton);
            panel.add(clearButton);
            panel.add(cNameTF);
            panel.add(cIDTF);
            panel.add(durationTF);
            panel.add(cLeaderTF);
            panel.add(insNameTF);
            panel.add(addButton);
            panel.add(lvlTF);
            panel.add(crTF);
            panel.add(startDday);
            panel.add(sDate);
            panel.add(startDmonth);
            panel.add(startDyear);
            panel.add(endDday);
            panel.add(eDate);
            panel.add(endDmonth);
            panel.add(endDyear);
            panel.add(noa);
            panel.add(noaTF);
            panel.add(backButton);


            frame.add(panel);                                       // Adding the panel to the Frame


            // Setting the properties of the frame
            frame.setSize(650,380);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
        }
        public void register(){                                     // Register Function
            try{
                for(Course cx: course){
                    if(getcourseID().equals(cx.getcourseId())){
                        if(cx instanceof AcademicCourse){
                            AcademicCourse ac = (AcademicCourse) cx;
                            if(ac.getregstatus()==true){
                                JOptionPane.showMessageDialog(frame,"The Academic Course is already registered","Information",JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                ac.register(getcleader(), getinsname(), getsdate(), getedate());
                                JOptionPane.showMessageDialog(frame,"The Academic Course is registered","Information", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
            catch (Exception NumberFormatException){
                JOptionPane.showMessageDialog(frame,"Fill the form properly");
            }
        }
        public void display(){                                      // Display Function
            System.out.println("Academic Courses");
            System.out.println("-----------------------------------------------------------");
            for (Course cx: course){
                if(cx instanceof AcademicCourse){
                    AcademicCourse ac = (AcademicCourse) cx;
                    ac.display();
                }
                System.out.println("-----------------------------------------------------------");
            }
        }
        public void add(){                                          // Add Function
            try{
                boolean isExist = false;
                for(Course cx: course){
                    if(cx.getcourseId().equals(getcourseID()))
                    {
                        isExist = true;
                    }
                }
                if(isExist==false){
                    Course c = new AcademicCourse(getcourseID(), getcoursename(), getduration(), getlvl(), getcr(), getnoa());
                    course.add(c);
                    JOptionPane.showMessageDialog(frame,"The course has been added");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"The course already exists");
                }
            }
            catch(Exception NumberFormatException){
                JOptionPane.showMessageDialog(frame,"Fill the form properly");
            }
        }
        public void clear(){                                        // Clear Function
            cIDTF.setText("");
            cLeaderTF.setText("");
            durationTF.setText("");
            cNameTF.setText("");
            lvlTF.setText("");
            crTF.setText("");
            insNameTF.setText("");
            noaTF.setText("");
            startDday.setSelectedIndex(0);
            startDmonth.setSelectedIndex(0);
            startDyear.setSelectedIndex(0);
            endDday.setSelectedIndex(0);
            endDmonth.setSelectedIndex(0);
            endDyear.setSelectedIndex(0);
        }
        public void actionPerformed(ActionEvent e) {                // Function to make buttons perform functions
            if(e.getSource()==addButton){
                add();

            }
            if(e.getSource()==regButton){
                register();
                clear();

            }
            if(e.getSource()==displayButton){
                display();
                clear();
            }
            if(e.getSource()==clearButton){
                clear();
            }
            if(e.getSource()==backButton){
                frame.dispose();
                new INGCollege();
            }
        }
    }
    class NonAcademicCourseFrame implements ActionListener{

        // Creating instances of the objects that will be used
        private JFrame frame;
        private JPanel panel;
        private JButton addButton, regButton, displayButton, clearButton,remButton,backButton;
        private JLabel nacCourse, cName, cID, duration, cLeader, insName, prereq, sDate, cDate, eDate;
        private JTextField cNameTF, cIDTF, durationTF, cLeaderTF, insNameTF, prereqTF;
        private JComboBox<String> startDday, startDmonth, startDyear,compDday, compDmonth, compDyear,examDday, examDmonth, examDyear;
        private String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        private String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December",};
        private String years[] = {"2021","2022","2023","2024"};
        private ArrayList<Course> course = new ArrayList<>();
        private String getcourseID(){return cIDTF.getText();}
        private String getcoursename(){return cNameTF.getText();}
        private String getcleader(){return cLeaderTF.getText();}
        private String getinsname(){return insNameTF.getText();}
        private String getprereq(){return prereqTF.getText();}
        private int getduration(){return Integer.parseInt(durationTF.getText());}
        private String getsdate(){return startDday.getSelectedItem()+" "+startDmonth.getSelectedItem()+" "+startDyear.getSelectedItem();}
        private String getcdate(){return compDday.getSelectedItem()+" "+compDmonth.getSelectedItem()+" "+compDyear.getSelectedItem();}
        private String getedate(){return examDday.getSelectedItem()+" "+examDmonth.getSelectedItem()+" "+examDyear.getSelectedItem();}

        public NonAcademicCourseFrame(){                            // Constructor for the NonAcademicCourse Frame
            frame = new JFrame("Non Academic Course registration form");                                   //Creating the object of the frame
            panel = new JPanel();                                   //Creating the object of the panel
            panel.setBackground(background);                        //Setting the background color of the panel
            panel.setLayout(null);                                  //Setting the layout of the panel




            // Creation and setting of properties of Labels
            nacCourse = new JLabel("Non Academic Course");
            nacCourse.setFont(new Font("Arial",Font.BOLD,20));
            nacCourse.setForeground(title);
            nacCourse.setBounds(200,10,300,25);
            cID = new JLabel("Course ID");
            cID.setForeground(fgColor);
            cID.setBounds(70,50,90,25);
            cName = new JLabel("Course Name");
            cName.setForeground(fgColor);
            cName.setBounds(70,85,90,25);
            duration = new JLabel("Duration");
            duration.setForeground(fgColor);
            duration.setBounds(350,50,90,25);
            cLeader = new JLabel("Course Leader");
            cLeader.setForeground(fgColor);
            cLeader.setBounds(350,140,100,25);
            insName = new JLabel("Instructor Name");
            insName.setForeground(fgColor);
            insName.setBounds(70,140,100,25);
            prereq = new JLabel("Prerequisites");
            prereq.setForeground(fgColor);
            prereq.setBounds(70,175,130,25);
            eDate = new JLabel("<html><body>Exam<br>Date</body></html>");
            eDate.setForeground(fgColor);
            eDate.setBounds(350,175,31,25);
            sDate = new JLabel("Start Date");
            sDate.setForeground(fgColor);
            sDate.setBounds(70,215,130,25);
            cDate = new JLabel("Completion Date");
            cDate.setForeground(fgColor);
            cDate.setBounds(70,250,130,25);




            // Creation and setting of properties of Text Fields
            cIDTF = new JTextField();
            cIDTF.setBorder(compound);
            cIDTF.setBounds(180,50,130,25);
            cNameTF = new JTextField();
            cNameTF.setBorder(compound);
            cNameTF.setBounds(180,85,130,25);
            durationTF = new JTextField();
            durationTF.setBorder(compound);
            durationTF.setBounds(450, 50, 130,25);
            cLeaderTF = new JTextField();
            cLeaderTF.setBorder(compound);
            cLeaderTF.setBounds(450,140,130,25);
            insNameTF = new JTextField();
            insNameTF.setBorder(compound);
            insNameTF.setBounds(180,140,130,25);
            prereqTF = new JTextField();
            prereqTF.setBorder(compound);
            prereqTF.setBounds(180, 175, 130, 25);




            // Creation and setting of properties of Combo boxes
            examDday = new JComboBox<>(days);
            examDday.setBounds(391,175,45,25);
            examDday.setBackground(cBox);
            examDday.setForeground(fgColor);
            examDday.setBorder(line);
            examDmonth = new JComboBox<>(months);
            examDmonth.setBounds(436,175,90,25);
            examDmonth.setBackground(cBox);
            examDmonth.setForeground(fgColor);
            examDmonth.setBorder(line);
            examDyear = new JComboBox<>(years);
            examDyear.setBounds(526,175,55,25);
            examDyear.setBackground(cBox);
            examDyear.setForeground(fgColor);
            examDyear.setBorder(line);
            startDday = new JComboBox<>(days);
            startDday.setBounds(180,215,45,25);
            startDday.setFocusable(false);
            startDday.setBackground(cBox);
            startDday.setForeground(fgColor);
            startDday.setBorder(line);
            startDmonth = new JComboBox<>(months);
            startDmonth.setBounds(225,215,90,25);
            startDmonth.setFocusable(false);
            startDmonth.setBackground(cBox);
            startDmonth.setForeground(fgColor);
            startDmonth.setBorder(line);
            startDyear = new JComboBox<>(years);
            startDyear.setBounds(315,215,60,25);
            startDyear.setFocusable(false);
            startDyear.setBackground(cBox);
            startDyear.setForeground(fgColor);
            startDyear.setBorder(line);
            compDday = new JComboBox<>(days);
            compDday.setBounds(180,250,45,25);
            compDday.setFocusable(false);
            compDday.setBackground(cBox);
            compDday.setForeground(fgColor);
            compDday.setBorder(line);
            compDmonth = new JComboBox<>(months);
            compDmonth.setBounds(225,250,90,25);
            compDmonth.setFocusable(false);
            compDmonth.setBackground(cBox);
            compDmonth.setForeground(fgColor);
            compDmonth.setBorder(line);
            compDyear = new JComboBox<>(years);
            compDyear.setBounds(315,250,60,25);
            compDyear.setFocusable(false);
            compDyear.setBackground(cBox);
            compDyear.setForeground(fgColor);
            compDyear.setBorder(line);



            // Creation and setting of properties of Buttons
            addButton = new JButton();
            addButton.setText("Add");
            addButton.setBounds(500,85,80,30);
            addButton.setForeground(fgColor);
            addButton.setBackground(buttonBg);
            addButton.setBorder(compound);
            addButton.setFocusable(false);
            addButton.addActionListener(this);
            regButton = new JButton("Register");
            regButton.setBorder(compound);
            regButton.setForeground(fgColor);
            regButton.setBackground(buttonBg);
            regButton.setBounds(450,250,130,25);
            regButton.setFocusable(false);
            regButton.addActionListener(this);
            displayButton = new JButton("Display");
            displayButton.setBounds(180,300,130,25);
            displayButton.setForeground(fgColor);
            displayButton.setBackground(buttonBg);
            displayButton.setBorder(compound);
            displayButton.setFocusable(false);
            displayButton.addActionListener(this);
            clearButton = new JButton("Clear");
            clearButton.setBounds(315,300,130,25);
            clearButton.setForeground(fgColor);
            clearButton.setBackground(buttonBg);
            clearButton.setBorder(compound);
            clearButton.setFocusable(false);
            clearButton.addActionListener(this);
            remButton = new JButton("Remove");
            remButton.setBorder(compound);
            remButton.setForeground(fgColor);
            remButton.setBackground(buttonBg);
            remButton.setFocusable(false);
            remButton.setBounds(450, 300, 130, 25);
            remButton.addActionListener(this);
            backButton = new JButton("Back");
            backButton.setBounds(10, 10, 100, 25);
            backButton.setForeground(fgColor);
            backButton.setBackground(buttonBg);
            backButton.setBorder(compound);
            backButton.setFocusable(false);
            backButton.addActionListener(this);



            // Adding all objects to the panel
            panel.add(nacCourse);
            panel.add(cName);
            panel.add(cID);
            panel.add(duration);
            panel.add(cNameTF);
            panel.add(cIDTF);
            panel.add(durationTF);
            panel.add(cLeader);
            panel.add(insName);
            panel.add(cLeaderTF);
            panel.add(insNameTF);
            panel.add(prereq);
            panel.add(prereqTF);
            panel.add(eDate);
            panel.add(sDate);
            panel.add(cDate);
            panel.add(startDday);
            panel.add(startDmonth);
            panel.add(startDyear);
            panel.add(compDday);
            panel.add(compDmonth);
            panel.add(compDyear);
            panel.add(examDday);
            panel.add(examDmonth);
            panel.add(examDyear);
            panel.add(addButton);
            panel.add(clearButton);
            panel.add(regButton);
            panel.add(displayButton);
            panel.add(remButton);
            panel.add(backButton);
            frame.add(panel);




            // Setting the frame properties
            frame.setSize(650,380);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
        }
        public void add(){                                          // Add Function
            try{
                boolean isExist = false;
                for(Course cx: course){
                    if(cx.getcourseId().equals(getcourseID())){
                        isExist = true;
                    }
                }
                if(isExist==false){
                    Course c = new NonAcademicCourse(getcourseID(), getcoursename(), getduration(), getprereq());
                    course.add(c);
                    JOptionPane.showMessageDialog(frame,"The course has been added");
                }
                else{
                    JOptionPane.showMessageDialog(frame,"The course already exists");
                }
            }
            catch(Exception NumberFormatException){
                JOptionPane.showMessageDialog(frame,"Duration needs to be filled with numbers");
            }
        }
        public void register(){                                     // Register Function
            try{
                for(Course cx: course){
                    if(getcourseID().equals(cx.getcourseId())){
                        if(cx instanceof NonAcademicCourse){
                            NonAcademicCourse nac = (NonAcademicCourse) cx;
                            if(nac.getisreg()==true){
                                JOptionPane.showMessageDialog(frame,"The Non Academic Course is already registered");
                            }
                            else{
                                nac.register(getcleader(), getinsname(), getsdate(), getcdate(), getedate());
                                JOptionPane.showMessageDialog(frame,"The Non Academic Course is registered");
                            }
                        }
                    }
                }
            }
            catch (Exception NumberFormatException){
                JOptionPane.showMessageDialog(frame,"Fill the form properly");
            }
        }
        public void display(){                                      // Display Function
            System.out.println("Non Academic Courses");
            System.out.println("-----------------------------------------------------------");
            for (Course cx: course){
                if(cx instanceof NonAcademicCourse){
                    NonAcademicCourse nac = (NonAcademicCourse) cx;
                    nac.display();
                }
                System.out.println("-----------------------------------------------------------");
            }
        }
        public void remove(){                                       // Remove Function
            try{
                for(Course cx: course){
                    if(cx.getcourseId().equals(getcourseID())){
                        if(cx instanceof NonAcademicCourse){
                            NonAcademicCourse nac = (NonAcademicCourse) cx;
                            if(nac.getisrem()==false){
                                nac.remove();
                                JOptionPane.showMessageDialog(frame,"The Course has been removed.");
                            }
                            else if(nac.getisrem()==true){
                                JOptionPane.showMessageDialog(frame,"There is no Course with the Course ID " + cIDTF.getText());
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(frame,"Enter valid CourseID");
                        }
                    }
                }
            }
            
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(frame,"Please fill up the form properly !");
            }
        }
        public void clear(){                                        // Clear Function
            cIDTF.setText("");
            cLeaderTF.setText("");
            durationTF.setText("");
            cNameTF.setText("");
            prereqTF.setText("");
            insNameTF.setText("");
            startDday.setSelectedIndex(0);
            startDmonth.setSelectedIndex(0);
            startDyear.setSelectedIndex(0);
            compDday.setSelectedIndex(0);
            compDmonth.setSelectedIndex(0);
            compDyear.setSelectedIndex(0);
            examDday.setSelectedIndex(0);
            examDmonth.setSelectedIndex(0);
            examDyear.setSelectedIndex(0);
        }
        public void actionPerformed(ActionEvent e) {                // Function to make buttons perform functions
            if(e.getSource()==addButton){
                add();
            }
            if(e.getSource()==regButton){
                register();
                clear();
            }
            if(e.getSource()==clearButton){
                clear();
            }
            if(e.getSource()==remButton){
                remove();
                clear();
            }
            if(e.getSource()==displayButton){
                display();
            }
            if(e.getSource()==backButton){
                frame.dispose();
                new INGCollege();
            }
        }
    }
    public INGCollege(){

        frame = new JFrame("Course Registration Form");             // Creating the object of the Frame
        panel = new JPanel();                                       // Creating the object of the panel
        panel.setBackground(background);                            // Setting the background color of the panel
        panel.setLayout(null);                                      // Setting the layout of the panel


        // Setting the properties of the label Heading
        heading = new JLabel("Select a course");
        heading.setForeground(title);
        heading.setFont(new Font("Arial",Font.BOLD,20));
        heading.setBounds(220,20,200,25);


        // Setting the properties of the Buttons
        academicCourseButton = new JButton();
        academicCourseButton.setBorder(compound);
        academicCourseButton.setBackground(buttonBg);
        academicCourseButton.setForeground(fgColor);
        academicCourseButton.setText("Academic Course");
        academicCourseButton.addActionListener(this);
        academicCourseButton.setFocusable(false);
        academicCourseButton.setBounds(50, 65, 200, 30);
        nonacademicCourseButton = new JButton();
        nonacademicCourseButton.setBorder(compound);
        nonacademicCourseButton.setBackground(buttonBg);
        nonacademicCourseButton.setForeground(fgColor);
        nonacademicCourseButton.setText("Non Academic Course");
        nonacademicCourseButton.setBounds(350, 65, 200, 30);
        nonacademicCourseButton.addActionListener(this);
        nonacademicCourseButton.setFocusable(false);


        // Adding objects to the panel
        panel.add(academicCourseButton);
        panel.add(nonacademicCourseButton);
        panel.add(heading);

        frame.add(panel);                                           // Adding the panel to the frame


        // Setting the properties of the frame
        frame.setSize(600,180);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){                     // Function to make buttons perform functions
        if(e.getSource()==academicCourseButton){
            frame.dispose();
            new AcademicCourseFrame();
        }
        if(e.getSource()==nonacademicCourseButton){
            frame.dispose();
            new NonAcademicCourseFrame();
        }
    }
    public static void main(String[] args){                         // Main method of the INGCollege class
        new INGCollege();
    }
}