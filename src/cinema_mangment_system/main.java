package cinema_mangment_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1, b2;

    main() {
        setLayout(null);

        JLabel nameLabel = new JLabel("User Name");
        nameLabel.setBounds(40, 40, 150, 30);
        nameLabel.setFont(new Font("kotb", Font.BOLD, 20));
        nameLabel.setForeground(Color.WHITE);
        add(nameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40, 90, 150, 30);
        passwordLabel.setFont(new Font("madro7", Font.BOLD, 20));
        passwordLabel.setForeground(Color.WHITE);
        add(passwordLabel);

        textField = new JTextField();
        textField.setBounds(200, 40, 150, 30);
        textField.setFont(new Font("ziad", Font.PLAIN, 15));
        textField.setBackground(new Color(230, 215, 215));
        add(textField);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(200, 90, 150, 30);
        jPasswordField.setFont(new Font("hady", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 255, 255));
        add(jPasswordField);

        ImageIcon imageIcon = new ImageIcon(main.class.getResource("/icon/login_48dp_FILL0_wght400_GRAD0_opsz48.png"));
        Image l1 = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(l1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(400, 0, 200, 200);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(100, 150, 100, 30);
        b1.setFont(new Font("taher", Font.PLAIN, 15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("clear");
        b2.setBounds(250, 150, 100, 30);
        b2.setFont(new Font("heiba", Font.PLAIN, 15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(62, 98, 202));
        setSize(650, 250);
        setLocation(400, 270);
        setTitle("Cinema Management System");
        setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String username = textField.getText();
            String password = new String(jPasswordField.getPassword());

            if (username.equals("heiba") && password.equals("123456")) {
                face face = new face();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        } else if (e.getSource() == b2) {
            textField.setText("");
            jPasswordField.setText("");
        }
    }

    public static void main(String[] args) {
        new main();
    }
}
