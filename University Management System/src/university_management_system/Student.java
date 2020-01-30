package university_management_system;
import java.awt.Component;
import java.sql.*;

import javax.swing.JOptionPane;

public class Student extends Member{
	
	String sqlpassword;
	String sqlusername;
	Student(String sqlusername,String sqlpassword)
	{
		this.sqlpassword=sqlpassword;
		this.sqlusername=sqlusername;
	}

	void signIn(String userName, String password) 
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums_josiah?characterEncoding=latin1",sqlusername,sqlpassword);
			
			String user="";
			String[] course1= {"","",""};
			int i=0;
			PreparedStatement stmt1=con.prepareStatement("select * from student where student.username=? and student.password=?");  
			stmt1.setString(1,userName);
			stmt1.setString(2,password);
			ResultSet rs=stmt1.executeQuery(); 
			while(rs.next()){
			user=rs.getString(1);
			super.username=rs.getString(1);
			super.password=rs.getString(2);
			super.name=rs.getString(3);
			super.age=rs.getInt(4);
			super.gender=rs.getString(5);
			super.address=rs.getString(6);}
			
			PreparedStatement stmt2=con.prepareStatement("select coursename from course_student,course where course_student.courseno=course.courseno and course_student.username=? ");
			stmt2.setString(1,userName);
			ResultSet rs1=stmt2.executeQuery();
			while(rs1.next()) {
			course1[i]=rs1.getString(1);
			i++;
				}
			con.close();
			
			if(user=="")
			{
				Object frame1 = null;
				JOptionPane.showMessageDialog((Component) frame1, "Invalid Username or Password!");
				SignInFrame frame = new SignInFrame(sqlusername,sqlpassword);
				frame.signInStudent();
				frame.setVisible(true);				
			}
			else
			{
	
				SignInFrame newframe=new SignInFrame(sqlusername,sqlpassword);
				newframe.review("Student",super.name,super.age, super.gender, super.address, course1);
				newframe.setVisible(true);
				
			}
		}
		catch(Exception e)
		{ 
			Object frame = null;
			JOptionPane.showMessageDialog((Component) frame, e.getMessage());
			
		}
		
		
		

	}
	
	void usernameCheck(String userName, String password)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums_josiah?characterEncoding=latin1",sqlusername,sqlpassword);
			
			String user="";
			PreparedStatement stmt1=con.prepareStatement("select * from student where student.username=?");  
			stmt1.setString(1,userName);
			ResultSet rs=stmt1.executeQuery(); 
			while(rs.next()){
			user=rs.getString(1);
			}
			con.close();
			
			if(user=="")
			{
				SignUpFrame frame = new SignUpFrame(sqlusername,sqlpassword);
				frame.getDetailsStudents(userName,password);
				frame.setVisible(true);
				
			}
			else
			{
				Object frame1 = null;
				JOptionPane.showMessageDialog((Component) frame1, "The Username you entered is already in use!");
				SignUpFrame frame = new SignUpFrame(sqlusername,sqlpassword);
				frame.signUpStudent();
				frame.setVisible(true);							
			}
			
			
		}
		catch(Exception e)
		{ 
			Object frame = null;
			JOptionPane.showMessageDialog((Component) frame, e.getMessage());
		}
	}
	
	void signUp(String username,String password,String name,int age,String gender,String address,String course1,String course2,String course3) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ums_josiah?characterEncoding=latin1",sqlusername,sqlpassword);
			  
		    PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
			stmt.setString(1,username); 
			stmt.setString(2,password);
			stmt.setString(3,name);
			stmt.setInt(4,age);
			stmt.setString(5,gender);
			stmt.setString(6,address);
			stmt.executeUpdate(); 
			
			if(course1!="")
			{
				PreparedStatement stmt1=con.prepareStatement("insert into course_student values(?,?)");
				stmt1.setString(1,username);
				stmt1.setInt(2,1);
				stmt1.executeUpdate(); 
			}
			if(course2!="")
			{
				PreparedStatement stmt2=con.prepareStatement("insert into course_student values(?,?)");
				stmt2.setString(1,username);
				stmt2.setInt(2,2);
				stmt2.executeUpdate(); 
			}
			if(course3!="")
			{
				PreparedStatement stmt3=con.prepareStatement("insert into course_student values(?,?)");
				stmt3.setString(1,username);
				stmt3.setInt(2,3);
				stmt3.executeUpdate(); 
			}
			
			con.close(); 
			
			Student student=new Student(sqlusername,sqlpassword);
			student.signIn(username, password);
			
		}
		catch(Exception e)
		{ 
			Object frame = null;
			JOptionPane.showMessageDialog((Component) frame, e.getMessage());
		}
	}
}
