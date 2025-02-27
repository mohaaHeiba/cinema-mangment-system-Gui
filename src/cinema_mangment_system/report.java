package cinema_mangment_system;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class report extends JFrame {

    JTable table;

    public report() {

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(62, 105, 202));
        add(panel);

        JLabel headerLabel = new JLabel("Report", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        headerLabel.setForeground(Color.WHITE);
        panel.add(headerLabel, BorderLayout.NORTH);

        String[] columnNames = {"Ticket", "Movie Name", "Price", "Seat"};
        Object[][] data = {
                {"1", "Movie A", "$10", "A1"},
                {"2", "Movie B", "$12", "B2"},
                {"3", "Movie C", "$8", "C3"},
                {"4", "Movie D", "$15", "D4"},
                {"5", "Movie E", "$11", "E5"},
                {"6", "Movie F", "$9", "F6"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        table = new JTable(tableModel);
        table.setBackground(new Color(7, 16, 64));
        table.setForeground(Color.WHITE);
        table.setFillsViewportHeight(true);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setForeground(Color.WHITE);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(backButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new report();
    }
}

