package cinema_mangment_system;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class AddMovie extends JFrame {

    private JTextField titleField;
    private JTextField genreField;
    private JTextField durationField;

    public AddMovie() {
        setTitle("Add Movie");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        buildGUI();

        setVisible(true);
    }

    private void buildGUI() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField(20);

        JLabel genreLabel = new JLabel("Genre:");
        genreField = new JTextField(20);

        JLabel durationLabel = new JLabel("Duration (min):");
        durationField = new JTextField(20);

        JButton saveButton = new JButton("Add Movie");
        JButton cancelButton = new JButton("Cancel");

        saveButton.addActionListener(e -> addMovie());
        cancelButton.addActionListener(e -> dispose());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);
        gbc.gridy = 1;
        panel.add(genreLabel, gbc);
        gbc.gridy = 2;
        panel.add(durationLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(titleField, gbc);
        gbc.gridy = 1;
        panel.add(genreField, gbc);
        gbc.gridy = 2;
        panel.add(durationField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        // Add a custom border to the panel
        Border border = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLUE, 7), // Increased thickness to 4 pixels
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
        panel.setBorder(border);

        add(panel);

        saveButton.setBackground(new Color(50, 150, 200));
        cancelButton.setBackground(new Color(200, 50, 50));
        saveButton.setForeground(Color.WHITE);
        cancelButton.setForeground(Color.WHITE);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void addMovie() {
        String title = titleField.getText();
        String genre = genreField.getText();
        String duration = durationField.getText();

        if (title.isEmpty() || genre.isEmpty() || duration.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int durationMinutes = Integer.parseInt(duration);
            if (durationMinutes <= 0) {
                JOptionPane.showMessageDialog(this, "Duration must be a positive number", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Duration must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int option = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to add this movie?\nTitle: " + title + "\nGenre: " + genre + "\nDuration: " + duration + " min",
                "Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Movie added successfully:\nTitle: " + title + "\nGenre: " + genre + "\nDuration: " + duration + " min",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }

    private void clearFields() {
        titleField.setText("");
        genreField.setText("");
        durationField.setText("");
    }

    public static void main(String[] args) {
        new AddMovie();
    }
}
