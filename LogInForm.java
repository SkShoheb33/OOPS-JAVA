import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;  
class LogInForm extends JFrame implements ActionListener{
	Color clr = new Color(152,251,152);
	JLabel userLabel;
	JLabel passwordLabel;
	JTextField username;
	JTextField password;
	JButton login;
	JButton cancel;
	LogInForm(){
		setBackground(clr);
		setTitle("LOG IN FORM");
		userLabel = new JLabel("Username :");
		add(userLabel);
		userLabel.setBounds(100,90,100,50);
		passwordLabel = new JLabel("password :");
		add(passwordLabel);
		passwordLabel.setBounds(100,140,100,50);
		username = new JTextField();
		add(username);
		username.setBounds(200,100,200,25);
		password = new JTextField();
		password.setBounds(200,150,200,25);
		add(password);
		login = new JButton("LOGIN");
		add(login);
		login.setBounds(100,200,100,30);
		cancel = new JButton("CANCLE");
		cancel.setBounds(300,200,100,30);
		add(cancel);
		login.addActionListener(this);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String str1 = username.getText();
		String str2 = password.getText();
		if(str1.equals("shaikshoheb9k@gmail.com")&&str2.equals("12345")){
			if(e.getSource() == login){
				Label wel = new Label("WELCOME");
				wel.setBounds(300,300,100,50);
				add(wel);
			}
		}else{
			Label wrong = new Label("Wrong password");
			wrong.setBounds(300,300,100,50);
			add(wrong);
		}
	}
	public static void main(String args[]){
		LogInForm obj = new LogInForm();
	}
}