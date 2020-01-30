package university_management_system;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class SignInFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static String sqlusername="";
	static String sqlpassword="";

	public SignInFrame(String sqlusername,String sqlpassword) {
		SignInFrame.sqlusername=sqlusername;
		SignInFrame.sqlpassword=sqlpassword;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Josiah P\\Pictures\\edit_tools_icon_129035.png"));
		setTitle("UMS");
		signInStudent();
		
	}

	private JPanel contentPane;
	private JTextField txtRoot;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JPasswordField passwordField;

	void signInStudent() {
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
		
		JLabel lblLecturerPortal = new JLabel("Sign In as a Student");
		lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLecturerPortal.setBounds(112, 39, 202, 49);
		panel.add(lblLecturerPortal);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtRoot.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(username.equals("") || password.equals(""))
				{
					Object frame = null;
					JOptionPane.showMessageDialog((Component) frame, "Filed(s) is/are empty!");
				}
				else
				{
					Student student=new Student(sqlusername,sqlpassword);
					student.signIn(username, password);
					txtRoot.setText(null);
					passwordField.setText(null);
					setVisible(false);
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
		lblNewLabel.setBounds(51, 110, 95, 29);
		panel.add(lblNewLabel);
		
		txtRoot = new JTextField();
		txtRoot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRoot.setBounds(156, 112, 217, 29);
		panel.add(txtRoot);
		txtRoot.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 161, 95, 29);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 163, 217, 29);
		panel.add(passwordField);;
	}

	
void signInLecturer() {
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
		
		JLabel lblLecturerPortal = new JLabel("Sign In as a Lecturer");
		lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
		lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLecturerPortal.setBounds(112, 39, 202, 49);
		panel.add(lblLecturerPortal);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=txtRoot.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(username.equals("") || password.equals(""))
				{
					Object frame = null;
					JOptionPane.showMessageDialog((Component) frame, "Filed(s) is/are empty!");
				}
				else
				{
					Lecturer lecturer=new Lecturer(sqlusername,sqlpassword);
					lecturer.signIn(username, password);
					txtRoot.setText(null);
					passwordField.setText(null);
					setVisible(false);
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
		lblNewLabel.setBounds(51, 110, 95, 29);
		panel.add(lblNewLabel);
		
		txtRoot = new JTextField();
		txtRoot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRoot.setBounds(156, 112, 217, 29);
		panel.add(txtRoot);
		txtRoot.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(51, 161, 95, 29);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 163, 217, 29);
		panel.add(passwordField);;
	}
	
void review(String type,String name, int age, String gender, String address, String[] course) {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 471, 367);
	this.setLocationRelativeTo(null);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	contentPane.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblLecturerPortal = new JLabel("Enrolled as a "+type);
	lblLecturerPortal.setHorizontalAlignment(SwingConstants.CENTER);
	lblLecturerPortal.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblLecturerPortal.setBounds(116, 22, 202, 21);
	panel.add(lblLecturerPortal);
	
	JButton btnNewButton_2 = new JButton("Main menue");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			UMS frame=new UMS();
			frame.frame1();
			frame.setVisible(true);
			setVisible(false);
		}
	});
	btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
	btnNewButton_2.setBounds(194, 267, 102, 32);
	panel.add(btnNewButton_2);
	
	JLabel lblNewLabel = new JLabel("Name");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel.setBounds(78, 53, 58, 21);
	panel.add(lblNewLabel);
	
	txt1 = new JTextField();
	txt1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	txt1.setEditable(false);
	txt1.setText(name);
	txt1.setBounds(146, 56, 207, 19);
	panel.add(txt1);
	txt1.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("Age");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_1.setBounds(78, 87, 45, 21);
	panel.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("Gender");
	lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_2.setBounds(78, 118, 58, 21);
	panel.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("Address");
	lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_3.setBounds(78, 149, 58, 21);
	panel.add(lblNewLabel_3);
	
	txt4 = new JTextField();
	txt4.setFont(new Font("Tahoma", Font.PLAIN, 12));
	txt4.setText(address);
	txt4.setEditable(false);
	txt4.setBounds(146, 152, 207, 19);
	panel.add(txt4);
	txt4.setColumns(10);
	
	JLabel lblNewLabel_4 = new JLabel("Enrolled for Cources");
	lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	lblNewLabel_4.setBounds(78, 180, 117, 26);
	panel.add(lblNewLabel_4);
	
	txt2 = new JTextField();
	txt2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	txt2.setText(String.valueOf(age));
	txt2.setEditable(false);
	txt2.setBounds(146, 90, 207, 19);
	panel.add(txt2);
	txt2.setColumns(10);
	
	txt3 = new JTextField();
	txt3.setFont(new Font("Tahoma", Font.PLAIN, 12));
	txt3.setText(gender);
	txt3.setEditable(false);
	txt3.setBounds(146, 121, 207, 19);
	panel.add(txt3);
	txt3.setColumns(10);
	
	JTextArea txtr1 = new JTextArea();
	txtr1.setFont(new Font("Courier New", Font.PLAIN, 12));
	txtr1.setEditable(false);
	txtr1.setText(course[0]+"\n"+course[1]+"\n"+course[2]);
	txtr1.setBounds(88, 208, 317, 70);
	panel.add(txtr1);
}

}
