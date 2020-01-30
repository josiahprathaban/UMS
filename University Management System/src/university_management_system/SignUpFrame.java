package university_management_system;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class SignUpFrame extends JFrame {
	
	static String sqlusername="";
	static String sqlpassword="";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public SignUpFrame(String sqlusername,String sqlpassword) {
		SignUpFrame.sqlusername=sqlusername;
		SignUpFrame.sqlpassword=sqlpassword;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Josiah P\\Pictures\\edit_tools_icon_129035.png"));
		setTitle("UMS");
		signUpStudent();
	}

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	


	void signUpStudent() {
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
		
		JLabel lblLecturerPortal = new JLabel("Sign Up as a Student");
		lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLecturerPortal.setBounds(112, 31, 202, 49);
		panel.add(lblLecturerPortal);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				username=textField.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				@SuppressWarnings("deprecation")
				String confirm=passwordField_1.getText();
					if(username.equals("") || password.equals(""))
					{
						Object frame = null;
						JOptionPane.showMessageDialog((Component) frame, "Filed(s) is/are empty!");
					}
					else if(password.contains(confirm)) 
					{
						Student student=new Student(sqlusername,sqlpassword);
						student.usernameCheck(username,password);
						setVisible(false);
						
					}
					else
					{
						Object frame1 = null;
						JOptionPane.showMessageDialog((Component) frame1, "Passwords not match!");
						passwordField.setText(null);
						passwordField_1.setText(null);
					}
					
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(262, 219, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame2();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_2.setBounds(10, 10, 58, 21);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(51, 90, 95, 29);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(156, 92, 217, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 129, 95, 29);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 129, 217, 29);
		panel.add(passwordField);;
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(156, 168, 217, 29);
		panel.add(passwordField_1);;
		
		JLabel lblNewLabel_2 = new JLabel("Confirm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(51, 168, 95, 31);
		panel.add(lblNewLabel_2);
	}
	
void signUpLecturer() {
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
		
		JLabel lblLecturerPortal = new JLabel("Sign Up as a Lecturer");
		lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLecturerPortal.setBounds(112, 31, 202, 49);
		panel.add(lblLecturerPortal);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				@SuppressWarnings("deprecation")
				String confirm=passwordField_1.getText();
				if(username.equals("") || password.equals(""))
				{
					Object frame = null;
					JOptionPane.showMessageDialog((Component) frame, "Filed(s) is/are empty!");
				}
				else if(password.contains(confirm)) 
				{
					Lecturer lecturer=new Lecturer(sqlusername,sqlpassword);
					lecturer.usernameCheck(username,password);
					setVisible(false);
					
				}
				else
				{
					Object frame1 = null;
					JOptionPane.showMessageDialog((Component) frame1, "Passwords not match!");
					passwordField.setText(null);
					passwordField_1.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(262, 219, 111, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UMS frame=new UMS();
				frame.frame3();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_2.setBounds(10, 10, 58, 21);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(51, 90, 95, 29);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(156, 92, 217, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 129, 95, 29);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 131, 217, 29);
		panel.add(passwordField);;
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(156, 170, 217, 29);
		panel.add(passwordField_1);;
		
		JLabel lblNewLabel_2 = new JLabel("Confirm");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(51, 168, 95, 31);
		panel.add(lblNewLabel_2);
	}

void getDetailsStudents(String username,String password) {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 376);
	this.setLocationRelativeTo(null);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	contentPane.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblLecturerPortal = new JLabel("Sign Up as a Student");
	lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
	lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblLecturerPortal.setBounds(116, 22, 202, 21);
	panel.add(lblLecturerPortal);
	
	JButton btnNewButton_2 = new JButton("back");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SignUpFrame frame=new SignUpFrame(sqlusername,sqlpassword);
			frame.signUpStudent();
			frame.setVisible(true);
			setVisible(false);
		}
	});
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
	btnNewButton_2.setBounds(10, 10, 58, 21);
	panel.add(btnNewButton_2);
	
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel.setBounds(78, 53, 58, 21);
	panel.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(146, 56, 207, 19);
	panel.add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Age");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_1.setBounds(78, 87, 45, 21);
	panel.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Gender");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_2.setBounds(78, 118, 58, 21);
	panel.add(lblNewLabel_2);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
	rdbtnNewRadioButton.setSelected(true);
	rdbtnNewRadioButton.setBackground(Color.WHITE);
	rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton.setBounds(146, 120, 49, 21);
	panel.add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
	rdbtnNewRadioButton_1.setBackground(Color.WHITE);
	rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton_1.setBounds(197, 120, 63, 21);
	panel.add(rdbtnNewRadioButton_1);
	
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
	rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton_2.setBackground(Color.WHITE);
	rdbtnNewRadioButton_2.setBounds(262, 120, 103, 21);
	panel.add(rdbtnNewRadioButton_2);
	ButtonGroup bg=new ButtonGroup();
	bg.add(rdbtnNewRadioButton);
	bg.add(rdbtnNewRadioButton_1);
	bg.add(rdbtnNewRadioButton_2);
	
	JLabel lblNewLabel_3 = new JLabel("Address");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_3.setBounds(78, 149, 58, 21);
	panel.add(lblNewLabel_3);
	
	textField_1 = new JTextField();
	textField_1.setBounds(146, 152, 207, 19);
	panel.add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Enroll for Cources");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_4.setBounds(78, 180, 117, 26);
	panel.add(lblNewLabel_4);
	
	JCheckBox chckbxNewCheckBox = new JCheckBox(" SENG 11111-Introduction to programming");
	chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox.setBackground(Color.WHITE);
	chckbxNewCheckBox.setBounds(94, 206, 259, 21);
	panel.add(chckbxNewCheckBox);
	
	JCheckBox chckbxNewCheckBox_1 = new JCheckBox("SENG 11112-Fundamentals of Engineering");
	chckbxNewCheckBox_1.setBackground(Color.WHITE);
	chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox_1.setBounds(94, 228, 271, 21);
	panel.add(chckbxNewCheckBox_1);
	
	JCheckBox chckbxNewCheckBox_2 = new JCheckBox("SENG 11113-Data Structures and Algorithem");
	chckbxNewCheckBox_2.setBackground(Color.WHITE);
	chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox_2.setBounds(94, 251, 285, 21);
	panel.add(chckbxNewCheckBox_2);
	
	textField_2 = new JTextField();
	textField_2.setBounds(146, 90, 96, 19);
	panel.add(textField_2);
	textField_2.setColumns(10);
	
	JButton btnNewButton = new JButton("Confirm");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			int age=Integer.parseInt(textField_2.getText());
			String gender="";
			if(rdbtnNewRadioButton.isSelected())
				gender=rdbtnNewRadioButton.getText();
			if(rdbtnNewRadioButton_1.isSelected())
				gender=rdbtnNewRadioButton_1.getText();
			if(rdbtnNewRadioButton_2.isSelected())
				gender=rdbtnNewRadioButton_2.getText();
			String address=textField_1.getText();
			
			String course1="";
			if(chckbxNewCheckBox.isSelected())
				course1=chckbxNewCheckBox.getText();
			String course2="";
			if(chckbxNewCheckBox_1.isSelected())
				course2=chckbxNewCheckBox_1.getText();
			String course3="";
			if(chckbxNewCheckBox_2.isSelected())
				course3=chckbxNewCheckBox_2.getText();
			Student student=new Student(sqlusername,sqlpassword);
			student.signUp(username, password, name, age, gender, address, course1, course2, course3);
			setVisible(false);
				
			
			
			
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnNewButton.setBounds(175, 286, 85, 32);
	panel.add(btnNewButton);
	
	
}

void getDetailsLecturer(String username,String password) {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 376);
	this.setLocationRelativeTo(null);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	contentPane.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblLecturerPortal = new JLabel("Sign Up as a Lecturer");
	lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
	lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblLecturerPortal.setBounds(116, 22, 202, 21);
	panel.add(lblLecturerPortal);
	
	JButton btnNewButton_2 = new JButton("back");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			SignUpFrame frame=new SignUpFrame(sqlusername,sqlpassword);
			frame.signUpLecturer();
			frame.setVisible(true);
			setVisible(false);
		}
	});
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 8));
	btnNewButton_2.setBounds(10, 10, 58, 21);
	panel.add(btnNewButton_2);
	
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel.setBounds(78, 53, 58, 21);
	panel.add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(146, 56, 207, 19);
	panel.add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Age");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_1.setBounds(78, 87, 45, 21);
	panel.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Gender");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_2.setBounds(78, 118, 58, 21);
	panel.add(lblNewLabel_2);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
	rdbtnNewRadioButton.setSelected(true);
	rdbtnNewRadioButton.setBackground(Color.WHITE);
	rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton.setBounds(146, 120, 49, 21);
	panel.add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
	rdbtnNewRadioButton_1.setBackground(Color.WHITE);
	rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton_1.setBounds(197, 120, 63, 21);
	panel.add(rdbtnNewRadioButton_1);
	
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
	rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	rdbtnNewRadioButton_2.setBackground(Color.WHITE);
	rdbtnNewRadioButton_2.setBounds(262, 120, 103, 21);
	panel.add(rdbtnNewRadioButton_2);
	
	ButtonGroup bg=new ButtonGroup();
	bg.add(rdbtnNewRadioButton);
	bg.add(rdbtnNewRadioButton_1);
	bg.add(rdbtnNewRadioButton_2);
	
	JLabel lblNewLabel_3 = new JLabel("Address");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_3.setBounds(78, 149, 58, 21);
	panel.add(lblNewLabel_3);
	
	textField_1 = new JTextField();
	textField_1.setBounds(146, 152, 207, 19);
	panel.add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Enroll for Cources");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_4.setBounds(78, 180, 117, 26);
	panel.add(lblNewLabel_4);
	JCheckBox chckbxNewCheckBox = new JCheckBox(" SENG 11111-Introduction to programming");
	chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox.setBackground(Color.WHITE);
	chckbxNewCheckBox.setBounds(94, 206, 259, 21);
	panel.add(chckbxNewCheckBox);
	
	JCheckBox chckbxNewCheckBox_1 = new JCheckBox("SENG 11112-Fundamentals of Engineering");
	chckbxNewCheckBox_1.setBackground(Color.WHITE);
	chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox_1.setBounds(94, 228, 271, 21);
	panel.add(chckbxNewCheckBox_1);
	
	JCheckBox chckbxNewCheckBox_2 = new JCheckBox("SENG 11113-Data Structures and Algorithem");
	chckbxNewCheckBox_2.setBackground(Color.WHITE);
	chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	chckbxNewCheckBox_2.setBounds(94, 251, 285, 21);
	panel.add(chckbxNewCheckBox_2);
	
	textField_3 = new JTextField();
	textField_3.setBounds(146, 90, 96, 19);
	panel.add(textField_3);
	textField_3.setColumns(10);
	
	JButton btnNewButton = new JButton("Confirm");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			int age=Integer.parseInt(textField_3.getText());
			String gender="";
			if(rdbtnNewRadioButton.isSelected())
				gender=rdbtnNewRadioButton.getText();
			if(rdbtnNewRadioButton_1.isSelected())
				gender=rdbtnNewRadioButton_1.getText();
			if(rdbtnNewRadioButton_2.isSelected())
				gender=rdbtnNewRadioButton_2.getText();
			String address=textField_1.getText();
			
			String course1="";
			if(chckbxNewCheckBox.isSelected())
				course1=chckbxNewCheckBox.getText();
			String course2="";
			if(chckbxNewCheckBox_1.isSelected())
				course2=chckbxNewCheckBox_1.getText();
			String course3="";
			if(chckbxNewCheckBox_2.isSelected())
				course3=chckbxNewCheckBox_2.getText();
			Lecturer lecturer=new Lecturer(sqlusername,sqlpassword);
			lecturer.signUp(username, password, name, age, gender, address, course1, course2, course3);
			setVisible(false);
			
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnNewButton.setBounds(175, 286, 85, 32);
	panel.add(btnNewButton);
	
	
}

}
