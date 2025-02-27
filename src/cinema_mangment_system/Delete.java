package cinema_mangment_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete extends JFrame {

    private DefaultListModel<String> listModel;

    Delete() {
        setTitle("Delete Items");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        listModel = new DefaultListModel<>();
        String[] defaultItems = {"harry potter", "harry potter", "harry potter", "harry potter", "harry potter"};
        for (String item : defaultItems) {
            listModel.addElement(item);
        }

        JList<String> itemList = new JList<>(listModel);
        itemList.setFont(new Font("Arial", Font.PLAIN, 14));
        itemList.setBackground(new Color(240, 240, 240));
        itemList.setSelectionBackground(new Color(100, 150, 200));
        JScrollPane scrollPane = new JScrollPane(itemList);

        // Add Item Button
        JButton addButton = new JButton("Add Item");
        addButton.setFont(new Font("Arial", Font.BOLD, 12));
        addButton.setBackground(new Color(100, 200, 100));
        addButton.setForeground(Color.WHITE);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newItem = JOptionPane.showInputDialog("Enter item to add:");
                if (newItem != null && !newItem.isEmpty()) {
                    listModel.addElement(newItem);
                }
            }
        });

        // Delete Selected Item Button
        JButton deleteButton = new JButton("Delete Selected");
        deleteButton.setFont(new Font("Arial", Font.BOLD, 12));
        deleteButton.setBackground(new Color(200, 100, 100));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = itemList.getSelectedIndex();
                if (selectedIndex != -1) {
                    listModel.remove(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an item to delete.");
                }
            }
        });

        // Back Button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        backButton.setBackground(new Color(150, 150, 150));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Panel for Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(backButton);


        getContentPane().setLayout(new BorderLayout(10, 10));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);


        ((JComponent) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        getContentPane().setBackground(new Color(220, 220, 220));


        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Delete();
            }
        });
    }
}
