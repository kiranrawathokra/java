import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MarkAttendance {
    JFrame frame =new JFrame();
    JLabel Studentlastnmlbl,Datelbl,Studentfirstnmlbl,MarkAttandancelbl;
    JTextField StudentFirstrnm,Date,StudentLastnm,MarkAttandance;

   MarkAttendance(){
    frame.setBounds(50, 100, 600, 600);
    frame.setTitle("Anganwadi Menagment");
    frame.setVisible(true);
    frame.setLayout(null);
    JButton Cancel= new JButton("Cancel");
    JButton Save= new JButton("Save");
    Studentfirstnmlbl = new JLabel("First Name :");
    Studentlastnmlbl=new JLabel("LastrName");
    Datelbl=new JLabel("Date");
    MarkAttandancelbl=new JLabel("MarkAttandance");
    
    StudentFirstrnm =new JTextField();
    StudentLastnm =new JTextField();
    Date =new JTextField();
    MarkAttandance =new JTextField();


    Studentfirstnmlbl.setBounds(60, 50, 150, 30);
    Studentlastnmlbl.setBounds(320,50,150,30);
    Datelbl.setBounds(60,100,150,30);
    MarkAttandancelbl.setBounds(320,100,150,30);
    
    StudentFirstrnm.setBounds(150, 50, 160, 30);
    StudentLastnm.setBounds(450, 50, 150, 30);
    Date.setBounds(150, 100, 160, 30);
    MarkAttandance.setBounds(450, 100, 160, 30);
    Save.setBounds(150, 300, 100, 30);
   Cancel.setBounds(350, 300, 100, 30);


    frame.add(Studentfirstnmlbl);
    frame.add(StudentFirstrnm);
    frame.add(Studentlastnmlbl);
    frame.add(StudentLastnm);
    frame.add(Datelbl);
    frame.add(Date);
    frame.add(MarkAttandancelbl);
    frame.add(MarkAttandance);
    frame.add(Save);
    frame.add(Cancel);
    
    
    Save.addActionListener(new ActionListener() {
   @Override
public void actionPerformed(ActionEvent e) {
       String url = "jdbc:mysql://localhost:3306/jagruti_anganwadi";
String username = "root";
 String password = "";
try { 
 Connection connection = DriverManager.getConnection(url, username, password);

 String sql="insert into `jagruti_anganwadi`.`attendance`"+"(`FirstName`,`LastName`,`Date`,`MarkAttenance`)"
 + "values('" + StudentFirstrnm.getText() + "','" + StudentLastnm.getText() + "','" /*+ Long.parseLong(Date.getText()) + "','"*/ +Date.getText() + "','" + MarkAttandance.getText() + "')";
 
 Statement statement = connection.createStatement();
 int rowsinsert = statement.executeUpdate(sql);//"' ,F_Name='"+fname_t.getText()
 if (rowsinsert > 0) {
  System.out.println("All fields were insert successfully!");
 JOptionPane.showMessageDialog(frame,"Insert Student successful");
 frame.dispose();

 }
 } catch (Exception Student) {
System.out.print(Student);

 }
 }
}); 

Cancel.addActionListener(event->{
 frame.dispose();
});


   } 
    
}
