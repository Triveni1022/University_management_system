package universitymanagementsys;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        
        setSize(1550,870);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sirt2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb  = new JMenuBar();
        
        // new Information
        
        JMenu newInformation  = new JMenu ("New Information");
        newInformation.setForeground(Color.blue);
        newInformation.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this );
        newInformation.add(studentInfo);
        
        // Details
        
        JMenu details  = new JMenu ("View Details");
        details.setForeground(Color.red);
        //
        details.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        // Leave
        
        JMenu leave  = new JMenu ("Apply Leave");
        leave.setForeground(Color.blue);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        leave.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.white);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        
        // Leave Details
        
        JMenu leaveDetails  = new JMenu ("Leave Details");
        leaveDetails.setForeground(Color.red);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        leaveDetails.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.white);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.white);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        
        // exam
        
        JMenu exam  = new JMenu ("Examination");
        exam.setForeground(Color.blue);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        exam.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Result");
        examinationdetails.setBackground(Color.white);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        //entermarks.addActionListener(this );
        entermarks.setBackground(Color.white);
        entermarks.addActionListener(this );
        exam.add(entermarks);
        
        
        // UpdateInfo
        
        JMenu updateInfo  = new JMenu ("Update Details");
        updateInfo.setForeground(Color.red);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        updateInfo.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.white);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.white);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        
        // fee
        
        JMenu fee  = new JMenu ("Fee Details");
        fee.setForeground(Color.blue);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        fee.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.white);
        feeform.addActionListener(this);

        fee.add(feeform);
        
        
        // Utility
        
        JMenu utility  = new JMenu ("Utility");
        utility.setForeground(Color.red);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        utility.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);
        
        //about
         JMenu about = new JMenu ("About");
        about.setForeground(Color.blue);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
       about.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.white);
        ab.addActionListener(this);
        about.add(ab);
        
        
        // exit
        
        JMenu exit  = new JMenu ("Exit");
        exit.setForeground(Color.red);
        //newInformation.setFont(new Font ("Tahoma" , Font.BOLD , 15));
        exit.setFont(new Font ("Constantia" , Font.BOLD , 15));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        setJMenuBar(mb);
       
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       String msg = ae.getActionCommand();
       
       if(msg.equals("Exit")){
           setVisible(false);
       }else if(msg.equals("Calculator")){
           try{
               Runtime .getRuntime().exec("calc.exe");
           }catch(Exception e){
               
           }
       }else if(msg.equals("Notepad")){
           try{
               Runtime .getRuntime().exec("notepad.exe");
           }catch(Exception e){
               
           }
       }
       else if(msg.equals("New Faculty Information")){
           new AddTeacher();
       }
       else if(msg.equals("New Student Information")){
           new AddStudent();
       }
       else if(msg.equals("View Faculty Details")){
           new TeacherDetails();
       }
       else if(msg.equals("View Student Details")){
           new StudentDetails();
       }else if(msg.equals("Faculty Leave")){
           new TeacherLeave();
       }else if(msg.equals("Student Leave")){
           new StudentLeave();
       }else if(msg.equals("Faculty Leave Details")){
           new TeacherLeaveDetails();
       }else if(msg.equals("Student Leave Details")){
           new StudentLeaveDetails();
           
       }else if(msg.equals("Update Faculty Details")){
           new UpdateTeacher();
       }
       else if(msg.equals("Update Student Details")){
           new UpdateStudent();
       }
       
       else if(msg.equals("Enter Marks")){
           new EnterMarks();
       }
       else if(msg.equals("Examination Result")){
           new ExaminationDetails();
       }
       else if(msg.equals("Fee Structure")){
           new FeeStructure();
       } else if(msg.equals("About")){
           new About();
       }
       else if(msg.equals("Student Fee Form")){
           new StudentFeeForm();
       }
       
       
    }

    public static void main(String args[]){
        new Project();
    }
}