package university_management_system;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class UMS extends JFrame {
	
	
	private JTextField txtRoot;
	private JPasswordField passwordField;
	static String sqlusername="";
	static String sqlpassword="";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UMS() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("UMS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Josiah P\\Pictures\\edit_tools_icon_129035.png"));
		frame1();
		
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UMS frame = new UMS();
					frame.logInsql();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	void frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 334);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Continue as a Lecturer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame3();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setBounds(120, 183, 191, 50);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continue as a Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame2();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(120, 103, 191, 50);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to University Management System");
		lblNewLabel.setBounds(37, 47, 354, 22);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		panel.add(lblNewLabel);
	}
	
void frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 334);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Portal");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(113, 47, 202, 49);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInFrame frame = new SignInFrame(sqlusername,sqlpassword);
				frame.signInStudent();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(157, 120, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpFrame frame = new SignUpFrame(sqlusername,sqlpassword);
				frame.signUpStudent();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(157, 193, 111, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Already had an account");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(157, 106, 111, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create an new account");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(157, 179, 111, 13);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame1();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_2.setBounds(10, 10, 58, 21);
		panel.add(btnNewButton_2);
	}

void frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 334);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblLecturerPortal = new JLabel("Lecturer Portal");
		lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLecturerPortal.setBounds(113, 47, 202, 49);
		panel.add(lblLecturerPortal);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignInFrame frame = new SignInFrame(sqlusername,sqlpassword);
				frame.signInLecturer();
				frame.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(157, 120, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpFrame frame = new SignUpFrame(sqlusername,sqlpassword);
				frame.signUpLecturer();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(157, 193, 111, 39);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Already had an account");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(157, 106, 111, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create an new account");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(157, 179, 111, 13);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame1();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_2.setBounds(10, 10, 58, 21);
		panel.add(btnNewButton_2);
	}

void logInsql() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setBounds(100, 100, 332, 245);
	this.setLocationRelativeTo(null);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	contentPane.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblLecturerPortal = new JLabel("MySQL login");
	lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
	lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblLecturerPortal.setBounds(42, 10, 202, 49);
	panel.add(lblLecturerPortal);
	
	JButton btnNewButton = new JButton("Login");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			sqlusername=txtRoot.getText();
			@SuppressWarnings("deprecation")
			String password=passwordField.getText();
			sqlpassword=password;
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=latin1",sqlusername,sqlpassword);
				Statement stmt01 = con.createStatement();
			    String sql01 = "CREATE DATABASE if not exists ums_josiah";
			    stmt01.executeUpdate(sql01);
			    Statement stmt02 = con.createStatement();
			    String sql02 = "use ums_josiah";
			    stmt02.executeUpdate(sql02);
			    Statement stmt03 = con.createStatement();
			    String sql03 = "create table if not exists course(courseno int(2) NOT NULL, coursename varchar(50),primary key(courseno))";
			    stmt03.executeUpdate(sql03);
			    Statement stmt04 = con.createStatement();
			    String sql04 = "create table if not exists student(username varchar(15) NOT NULL,password varchar(15) NOT NULL, name varchar(30) NOT NULL, age int(2) NOT NULL,gender varchar(6) NOT NULL,address varchar(30) NOT NULL,primary key(username))";
			    stmt04.executeUpdate(sql04);
			    Statement stmt05 = con.createStatement();
			    String sql05 = "create table if not exists lecturer(username varchar(15) NOT NULL,password varchar(15) NOT NULL, name varchar(30) NOT NULL, age int(2) NOT NULL,gender varchar(6) NOT NULL,address varchar(30) NOT NULL,primary key(username))";
			    stmt05.executeUpdate(sql05);
			    Statement stmt06 = con.createStatement();
			    String sql06 = "create table if not exists course_student(username varchar(15) NOT NULL,courseno int(3) NOT NULL, foreign key(username) REFERENCES student(username),foreign key(courseno) REFERENCES course(courseno))";
			    stmt06.executeUpdate(sql06);
			    Statement stmt07 = con.createStatement();
			    String sql07 = "create table if not exists course_lecturer(username varchar(15) NOT NULL,courseno int(3) NOT NULL, foreign key(username) REFERENCES lecturer(username),foreign key(courseno) REFERENCES course(courseno))";
			    stmt07.executeUpdate(sql07);
			    Statement stmt08 = con.createStatement();
			    String sql08 = "insert ignore into course set courseno=1,coursename=\"SENG 11111-Introduction to programming\"";
			    stmt08.executeUpdate(sql08);
			    Statement stmt09 = con.createStatement();
			    String sql09 = "insert ignore into course set courseno=2,coursename=\"SENG 11112-Fundamentals of Engineering\"";
			    stmt09.executeUpdate(sql09);
			    Statement stmt010 = con.createStatement();
			    String sql010 = "insert ignore into course set courseno=3,coursename=\"SENG 11113-Data Structures and Algorithem\"";
			    stmt010.executeUpdate(sql010);
				UMS ums=new UMS();
				ums.frame1();
				ums.setVisible(true);
				setVisible(false);
			    // processing here
			} catch(Exception e1) {
			   Object frame = null;
			   JOptionPane.showMessageDialog((Component) frame, e1.getMessage());
			}
			
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnNewButton.setBounds(127, 160, 71, 29);
	panel.add(btnNewButton);
	
	JLabel lblNewLabel = new JLabel("User Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel.setBounds(42, 66, 95, 29);
	panel.add(lblNewLabel);
	
	txtRoot = new JTextField();
	txtRoot.setText("root");
	txtRoot.setFont(new Font("Tahoma", Font.PLAIN, 14));
	txtRoot.setBounds(147, 68, 132, 29);
	panel.add(txtRoot);
	txtRoot.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Password");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblNewLabel_1.setBounds(42, 107, 95, 29);
	panel.add(lblNewLabel_1);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(147, 109, 132, 29);
	panel.add(passwordField);;
}
}
