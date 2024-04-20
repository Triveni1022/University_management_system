package universitymanagementsys;


import java.awt.*;
//import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
        
import javax.swing.JFrame;

public class AddTeacher extends JFrame implements ActionListener{
 
    JTextField tfname, tffname , tfempid, tfaddress,tfphone,tfemail,tfx,tfxii,tfaadhar;
   //1. JLabel lebelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse;
    JComboBox cbbranch;
    JButton submit ,cancel;
    
    
    //1. generate random rollno
/*    Random ran = new Random();
    long first3 = Math.abs((ran.nextLong() % 900L) + 100L);
*/
    
    AddTeacher(){
        setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310 , 30 ,500 ,50);
        heading.setFont(new Font("serif" , Font.BOLD , 30));
        add(heading);
        
        // name
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50 , 150 ,100 ,30);
        lblname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
         // father's name
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400 , 150 ,200 ,30);
        lblfname.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        
        //emp id
        JLabel lblempid = new JLabel("Employee Id");
        lblempid.setBounds(50 , 200 ,200 ,30);
        lblempid.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblempid);
        
        //1. generate random rollno
       /* lebelrollno = new JLabel("0133EC211"+first3);
        lebelrollno.setBounds(200,200,200,30);
        lebelrollno.setFont(new Font("serif" , Font.BOLD , 20));
        add(lebelrollno);
       */
        tfempid = new JTextField();
        tfempid.setBounds(200,200,150,30);
        add(tfempid);        

        
         // dob
        JLabel lbldob = new JLabel("Date Of Birth");
        lbldob.setBounds(400 , 200 ,200 ,30);
        lbldob.setFont(new Font("serif" , Font.BOLD , 20));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600 , 200 ,150 ,30);
        add(dcdob);
        
        
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
        
        tfx = new JTextField();
        tfx.setBounds(600,300,150,30);
        add(tfx);
        
        
        
        // XII
        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(50 , 350 ,150 ,30);
        lblxii.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200,350,150,30);
        add(tfxii);
        
        
         // aadhar 
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400 , 350 ,200 ,30);
        lblaadhar.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600,350,150,30);
        add(tfaadhar);
        
        
        // course = drop down
        JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(50 , 400 ,150 ,30);
        lblcourse.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblcourse);
        
        String course [] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","M.Tech", "PhD ","Mcom","BA","MA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200,400,150,30);
        cbcourse.setBackground(Color.white);
        add(cbcourse);
        
        
        
        // Branch = drop down
        JLabel lblbrance = new JLabel("Department");
        lblbrance.setBounds(400 , 400 ,150 ,30);
        lblbrance.setFont(new Font("serif" , Font.BOLD , 20));
        add(lblbrance);
        
        String branch [] = {"Computer Science","Electronics & Communication","Mechanical","IT","Cyber","Civil","Electrical","AIML","AIDS"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600,400,150,30);
        cbbranch.setBackground(Color.white);
        add(cbbranch);
        
        
        
       submit = new JButton("Submit");
       submit.setBounds(250 , 550 ,120,30);
       submit.setBackground(Color.black);
       submit.setForeground(Color.white);
       submit.addActionListener(this);
       submit.setFont(new Font("Tahoma" , Font.BOLD , 15));
       add(submit);
        
       cancel = new JButton("Cancel");
       cancel.setBounds(450 ,550 ,120,30);
       cancel.setBackground(Color.black);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
       cancel.setFont(new Font("Tahoma" , Font.BOLD , 15));
       add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String Name = tfname.getText();
            String FName = tffname.getText();
            String Emp_Id = tfempid.getText();
            String DOB = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String Address = tfaddress.getText();
            String Phone = tfphone.getText();
            String Email = tfemail.getText();
            String X = tfx.getText();
            String XII = tfxii.getText();
            String Aadhar = tfaadhar.getText();
            String Course = (String)cbcourse.getSelectedItem();
            String Branch = (String)cbbranch.getSelectedItem();
   
            try{
                //String query = "insert into student values('"+name+"' , '"+fname+"' , '"+rollno+"' , '"+dob+"' , '"+lbladdress+"' , '"+lblphone+"' ,'"+lblemail+"', '"+lblx+"' , '"+lblxii+"', '"+lblaadhar+"' , '"+course+"' , '"+branch+"')";
                String query = "insert into teacher values('"+Name+"' , '"+FName+"' , '"+Emp_Id+"' , '"+DOB+"' , '"+Address+"' , '"+Phone+"' ,'"+Email+"', '"+X+"' , '"+XII+"' , '"+Aadhar+"' , '"+Course+"' , '"+Branch+"')";

                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
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
        new AddTeacher();
    }
    
}

