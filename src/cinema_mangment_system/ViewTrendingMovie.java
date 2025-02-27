package cinema_mangment_system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewTrendingMovie extends JFrame {

    JTable table;

    public ViewTrendingMovie() {

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(new Color(62, 105, 202));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel);

        JLabel headerLabel = new JLabel("Trending Movies", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        headerLabel.setForeground(Color.WHITE);
        panel.add(headerLabel, BorderLayout.NORTH);

        String[] columnNames = {"Movie Name", "Trend Score"};
        Object[][] data = {
                {"The Matrix Resurrections", "5000"},
                {"Dune", "4800"},
                {"No Time to Die", "4600"},
                {"Spider-Man: No Way Home", "4500"},
                {"The Suicide Squad", "4200"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) ;
        table = new JTable(tableModel) {
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (row % 2 == 0) {
                    c.setBackground(new Color(48, 79, 199));
                } else {
                    c.setBackground(new Color(62, 105, 202));
                }
                c.setForeground(Color.WHITE);
                return c;
            }
        };

        table.setBackground(new Color(7, 16, 64));
        table.setForeground(Color.WHITE);
        table.setFillsViewportHeight(true);
        table.setRowHeight(30);
        table.getTableHeader().setFont(new Font("ana", Font.BOLD, 14));
        table.getTableHeader().setBackground(new Color(48, 63, 159));
        table.getTableHeader().setForeground(Color.WHITE);
        table.setFont(new Font("hmmmm", Font.PLAIN, 14));
        panel.add(table, BorderLayout.CENTER);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        backButton.setFont(new Font("3aaaaaa", Font.BOLD, 14));
        backButton.setBackground(new Color(48, 63, 159));
        backButton.setForeground(Color.WHITE);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        panel.add(backButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ViewTrendingMovie();
    }
}
