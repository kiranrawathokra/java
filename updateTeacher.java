import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//import java.text.DateFormat;
public class updateTeacher {  
   updateTeacher() 
    {  
        JFrame updateTeacher = new JFrame("Update Students");  
        updateTeacher.setBounds(300, 200, 700, 450);  
        JLabel massageLabel,subjectLabel,firstnamLabel,lastnamLabel,phoneLabel,e_mailLabel,TeacherId,showmassge;  
        JTextField id,firstnamField,lastnamField,phoneField,subjectField;  
        int phone;  
        String firstnm,lastnm,e_mail;  
        JFormattedTextField e_mailField;  
        TeacherId = new JLabel("Teacher Id : ");  
        TeacherId.setBounds(50, 50, 150, 30);  
        JButton search = new JButton("Search");  
        search.setBounds(430, 50, 100, 40);  
        firstnamLabel = new JLabel("First Name : ");  
        firstnamLabel.setBounds(50, 100, 150, 30);  
        lastnamLabel = new JLabel("Last Name : ");  
        lastnamLabel.setBounds(335, 100, 150, 30);  
        //emaiLabel = new JLabel("Email : ");  
        //emaiLabel.setBounds(50, 150, 150, 30);  
        phoneLabel = new JLabel("Phone No. : "); 
         
        phoneLabel.setBounds(335, 150, 150, 30);  
        subjectLabel = new JLabel("Subject : ");  
        subjectLabel.setBounds(50, 150, 150, 30);    
        e_mailLabel = new JLabel("E-mail");  
        showmassge = new JLabel();
        e_mailLabel.setBounds(50, 200, 150, 30);
updateTeacher.add(TeacherId);  
updateTeacher.add(search);  
updateTeacher.add(firstnamLabel);  
updateTeacher.add(lastnamLabel);  
updateTeacher.add(subjectLabel);  
updateTeacher.add(phoneLabel);  
updateTeacher.add(e_mailLabel);  
updateTeacher.add(showmassge);  
id = new JTextField("");  
id.setBounds(140, 50, 150, 30);  
firstnamField = new JTextField("");  
firstnamField.setBounds(140, 100, 150, 30);  
lastnamField = new JTextField("");  
lastnamField.setBounds(430, 100, 150, 30);  
 
phoneField = new JTextField("");  
phoneField.setBounds(430, 150, 150, 30);  
subjectField = new JTextField("");  
subjectField.setBounds(140, 150, 150, 30);  
  
e_mailField = new JFormattedTextField();//(DateFormat.getDateInstance(DateFormat.SHORT));  
e_mailField.setBounds(140, 200, 150, 30);  
updateTeacher.add(id);  
updateTeacher.add(firstnamField);  
updateTeacher.add(lastnamField);  
updateTeacher.add(phoneField);  
updateTeacher.add(subjectField);  
updateTeacher.add(e_mailField);  
JButton cancel = new JButton("Cancel");  
cancel.setBounds(300, 330, 100, 40);  
JButton update = new JButton("Update");  
update.setBounds(430, 330, 100, 40);  
updateTeacher.add(cancel);  
updateTeacher.add(update);  
updateTeacher.setLayout(null);  
updateTeacher.setVisible(true);  
update.addActionListener(new ActionListener() {   
    @Override   
    public void actionPerformed(ActionEvent e) {    
        String url = "jdbc:mysql://localhost:3306/jagruti_anganwadi";    
        String username = "root";    
        String password = "";    
        try {     
            Class.forName("com.mysql.cj.jdbc.Driver");     
            Connection connection = DriverManager.getConnection(url, username, password);     
            String query = "UPDATE teacher SET FirstName=?, LastName=?,Phone=?,Subject=?,E-mail=? WHERE ID=?";     
            PreparedStatement preparedStatement = connection.prepareStatement(query);     
            preparedStatement.setString(1, firstnamField.getText());     
            preparedStatement.setString(2, lastnamField.getText());     
            //preparedStatement.setString(3, emailField.getText());     
            preparedStatement.setString(3, phoneField.getText());     
            preparedStatement.setString(4, subjectField.getText());     
            preparedStatement.setString(5, e_mailField.getText());  // Changed index from 7 to 6    
            preparedStatement.setString(6, id.getText());         
            int rowsUpdated = preparedStatement.executeUpdate();     
            if (rowsUpdated > 0) {       
                JOptionPane.showMessageDialog(updateTeacher, "Student updated successfully.");     
            } else {       
                JOptionPane.showMessageDialog(updateTeacher, "Error: Unable to update the student.");     
            }         
            preparedStatement.close();     
            connection.close();   
        } catch (ClassNotFoundException | SQLException ex) 
        {     
            ex.printStackTrace();     
            // Handle database errors and display an error message     
            JOptionPane.showMessageDialog(updateTeacher, "Error: Unable to update the student.");   
        }  
    }  
});

search.addActionListener(new ActionListener() {   
    @Override   
    public void actionPerformed(ActionEvent e) {    
    String url = "jdbc:mysql://localhost:3306/jagruti_anganwadi";    
    String username = "root";    
    String password = "";
    try {     
        Class.forName("com.mysql.cj.jdbc.Driver");     
        Connection connection = DriverManager.getConnection(url, username, password);     
        String query = "SELECT * FROM teacher WHERE Id=?";     
        PreparedStatement preparedStatement = connection.prepareStatement(query);     
        preparedStatement.setString(1, id.getText());     
        ResultSet resultSet = preparedStatement.executeQuery();     
        if (resultSet.next()) {       
            firstnamField.setText(resultSet.getString("FirstName"));       
            lastnamField.setText(resultSet.getString("LastName"));       
            //emailField.setText(resultSet.getString("Email"));       
            phoneField.setText(resultSet.getString("Phone"));       
            subjectField.setText(resultSet.getString("Subject"));      
            //addressField.setText(resultSet.getString("Address"));       
            e_mailField.setText(resultSet.getString("E_mail"));     
        } else 
        {       
            JOptionPane.showMessageDialog(updateTeacher, "Teacher not found.");     
        }     
        resultSet.close();     
        preparedStatement.close();     
        connection.close();   
    } catch (ClassNotFoundException | SQLException ex) 
    {     
        ex.printStackTrace();     
        JOptionPane.showMessageDialog(updateTeacher, "Error: Unable to search for the Teacher.");   
    }}  
}); 
}


    }
