package universitymanagementsys;

import java.awt.*;
//import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
        
import javax.swing.JFrame;


public class UpdateTeacher extends JFrame implements ActionListener{
 
    JTextField tfcourse, tfaddress , tfphone, tfemail,tfbranch, tfEmpId ;
    JLabel lebelrollno;
    Choice cEmpId;
    JButton submit ,cancel;
    
    
    //1. generate random rollno
/*    Random ran = new Random();
    long first3 = Math.abs((ra n.nextLong() % 900L) + 100L);
*/
    
   UpdateTeacher(){
        setSize(900,650);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("Update Teacher Details");
        heading.setBounds(50 , 10 ,500 ,50);
        heading.setFont(new Font("Tahoma" , Font.ITALIC , 35));
        add(heading);
        
         JLabel lblrollnumber = new JLabel ("Select Employee Id");
         lblrollnumber.setBounds(50,100,200,20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN,20));
        add(lblrollnumber);
        
        cEmpId = new Choice();
        cEmpId.setBounds(250, 100,200,20);
        add(cEmpId);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM teacher");
            while(rs.next()){
                cEmpId.add(rs.getString("empId"));
            }
            
        }catch(Exception e){
        
            e.printStackTrace();
        }
        
        
        // name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50 , 150 ,100 ,30);
        lblname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblname);
        
       JLabel labelname = new JLabel();
       labelname.setBounds(200,150,150,30);
     lblname.setFont(new Font("Tahoma" , Font.PLAIN, 18));
        add(labelname);
        
         // father's name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400 , 150 ,200 ,30);
        lblfname.setFont(new Font("Tahoma" , Font.PLAIN, 18));
        add(lblfname);
        
       JLabel  labelfname = new JLabel();
       labelfname.setBounds(600,150,150,30);
       add( labelfname);
        
        
        // roll no
        JLabel lblrollno = new JLabel("Employee Id");
        lblrollno.setBounds(50 , 200 ,200 ,30);
        lblrollno.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblrollno);
        
        //1. generate random rollno
       /* lebelrollno = new JLabel("0133EC211"+first3);
        lebelrollno.setBounds(200,200,200,30);
        lebelrollno.setFont(new Font("serif" , Font.BOLD , 20));
        add(lebelrollno);
        */
       
        tfEmpId = new JTextField();
         tfEmpId .setBounds(200,200,150,30);
        add( tfEmpId );        

        
         // dob
        JLabel lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(400 , 200 ,200 ,30);
        lbldob.setFont(new Font("serif" , Font.BOLD , 20));
        add(lbldob);
        
       JLabel labeldob   = new JLabel();
       labeldob.setBounds(600 , 200 ,150 ,30);
        lbldob.setFont(new Font("serif" , Font.BOLD , 20));
       add(labeldob);
        
        
         // address
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50 , 250 ,150 ,30);
        lbladdress.setFont(new Font("serif" , Font.BOLD , 20));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
         // phone 
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400 , 250 ,150 ,30);
        lblphone.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        // email
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50 , 300 ,150 ,30);
        lblemail.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
         // X  
        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400 , 300 ,150 ,30);
        lblx.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblx);
       JLabel labelx= new JLabel();
        labelx.setBounds(600,300,150,30);
        add(labelx);
        
        // XII
        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(50 , 350 ,150 ,30);
        lblxii.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblxii);
       JLabel labelxii = new JLabel();
       labelxii.setBounds(200,350,150,30);
        add(labelxii);
        
         // aadhar 
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400 , 350 ,200 ,30);
        lblaadhar.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblaadhar);
        JLabel labelaadhar = new JLabel();
        labelaadhar.setBounds(600,350,150,30);
        add(labelaadhar );
        
        // course = drop down
        JLabel lblcourse = new JLabel("Education");
        lblcourse.setBounds(50 , 400 ,150 ,30);
        lblcourse.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblcourse);
        
       // String course [] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","Mcom","BA","MA"};
        tfcourse = new JTextField();
        tfcourse.setBounds(200,400,150,30);
        //cbcourse.setBackground(Color.white);
        add(tfcourse);
        
        // Branch = drop down
        JLabel lblbrance = new JLabel("Department");
        lblbrance.setBounds(400 , 400 ,150 ,30);
        lblbrance.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblbrance);
        
        //String branch [] = {"Computer Science","Electronics & Communication","Mechanical","IT","Cyber","Civil","Electrical","AIML","AIDS"};
        tfbranch = new JTextField();
        tfbranch.setBounds(600,400,150,30);
        add(tfbranch);
         try{
             Conn c=new Conn();
             String query="select *  from teacher where empId='"+cEmpId.getSelectedItem()+"'";
             ResultSet rs=c.s.executeQuery(query);
             while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
               // lebelrollno.setText(rs.getString("rollno"));
                tfcourse.setText(rs.getString("education "));
                tfbranch.setText(rs.getString("department"));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         cEmpId.addItemListener(new ItemListener(){
       public void itemStateChanged(ItemEvent ie){
           try{
             Conn c=new Conn();
             String query="select *  from teacher where empId='"+cEmpId.getSelectedItem()+"'";
             ResultSet rs=c.s.executeQuery(query);
             while(rs.next()){
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labeldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                labelx.setText(rs.getString("class_x"));
                labelxii.setText(rs.getString("class_xii"));
                labelaadhar.setText(rs.getString("aadhar"));
               // lebelrollno.setText(rs.getString("rollno"));
                tfcourse.setText(rs.getString("education "));
               // tfbranch.setText(rs.getString("department"));
             }
         }catch(Exception e){
             e.printStackTrace();
         }

           }
        });
         
       submit = new JButton("Update");
       submit.setBounds(250 , 500 ,120,30);
       submit.setBackground(Color.black);
       submit.setForeground(Color.white);
       submit.addActionListener(this);
       submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
       add(submit);
        
       cancel = new JButton("Cancel");
       cancel.setBounds(450 ,500 ,120,30);
       cancel.setBackground(Color.black);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
       cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
       add(cancel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String empId= cEmpId.getSelectedItem();
            String Address = tfaddress.getText();
            String Phone = tfphone.getText();
            String Email = tfemail.getText();
            String Course = tfcourse.getText();
            String Branch = tfbranch.getText();
   
            try{
                String query = "UPDATE teacher SET  Address='" + Address + "', Phone='" + Phone + "', Email='" + Email + "', education='" + Course + "', department='" + Branch + "' WHERE empId='" +empId+ "'";

                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
                setVisible(false);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new UpdateTeacher();
    }  
}
 