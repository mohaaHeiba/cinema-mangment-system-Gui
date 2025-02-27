package cinema_mangment_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class user extends JFrame {

    JTextField ticket1TextField;
    JTextField ticket2TextField;
    JTextField ticket3TextField;
    JTextField discountTextField;

    user() {

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Buy Ticket");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        titleLabel.setForeground(Color.BLUE);

        JLabel ticket1Label = new JLabel("How many Tickets:");
        ticket1TextField = new JTextField();
        JLabel ticket2Label = new JLabel("Pick seat number:");
        ticket2TextField = new JTextField();
        JLabel ticket3Label = new JLabel("Date booking:");
        ticket3TextField = new JTextField();
        JLabel discountLabel = new JLabel("Discount Code:");
        discountTextField = new JTextField();

        panel.add(titleLabel);
        panel.add(new JLabel());
        panel.add(ticket1Label);
        panel.add(ticket1TextField);
        panel.add(ticket2Label);
        panel.add(ticket2TextField);
        panel.add(ticket3Label);
        panel.add(ticket3TextField);
        panel.add(discountLabel);
        panel.add(discountTextField);

        JLabel timeLabel = new JLabel("Current Time:");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
        JLabel currentTimeLabel = new JLabel(dateFormat.format(new Date()));

        JPanel timePanel = new JPanel(new BorderLayout());
        timePanel.add(timeLabel, BorderLayout.WEST);
        timePanel.add(currentTimeLabel, BorderLayout.CENTER);

        JButton checkoutButton = new JButton("Checkout");
        JButton backButton = new JButton("Back");

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int ticketCount = Integer.parseInt(ticket1TextField.getText());
                    String discountCode = discountTextField.getText();

                    double ticketPrice = 10.0;
                    double discount = 0.0;

                    if (discountCode.equals("abo heiba")) {
                        discount = 0.90;
                    }
                     else if(discountCode.equals("ziad shaker")) {
                        discount = 0.95;
                    }
                    else if(discountCode.equals("hady")) {
                        discount = -0.73;
                    }

                    double totalPrice = ticketCount * ticketPrice;
                    totalPrice = totalPrice - (totalPrice * discount);

                    JOptionPane.showMessageDialog(user.this, "Total Price after discount: $" + totalPrice);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(user.this, "Please enter a valid number of tickets.");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(checkoutButton);
        buttonPanel.add(backButton);

        add(panel, BorderLayout.CENTER);
        add(timePanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Cinema Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new user();
    }
}
