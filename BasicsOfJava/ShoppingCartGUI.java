import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
public class ShoppingCartGUI extends JFrame {
    private JTextField itemField, qtyField, priceField;
    private JLabel totalLabel;
    private DefaultTableModel tableModel;
    private double total = 0.0;

    public ShoppingCartGUI() {
        setTitle("Mini Shopping Cart");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        inputPanel.add(new JLabel("Item Name:"));
        itemField = new JTextField();
        inputPanel.add(itemField);

        inputPanel.add(new JLabel("Quantity:"));
        qtyField = new JTextField();
        inputPanel.add(qtyField);

        inputPanel.add(new JLabel("Price per Item:"));
        priceField = new JTextField();
        inputPanel.add(priceField);

        JButton addButton = new JButton("Add to Cart");
        inputPanel.add(addButton);

        // Table to display items
        tableModel = new DefaultTableModel(new String[]{"Item", "Qty", "Price", "Amount"}, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Total label
        totalLabel = new JLabel("Total: ₹0.00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add button functionality
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItemToCart();
            }
        });

        // Layout
        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(totalLabel, BorderLayout.SOUTH);
    }

    private void addItemToCart() {
        String item = itemField.getText();
        String qtyText = qtyField.getText();
        String priceText = priceField.getText();

        if (item.isEmpty() || qtyText.isEmpty() || priceText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        try {
            int qty = Integer.parseInt(qtyText);
            double price = Double.parseDouble(priceText);

            double amount = qty * price;
            total += amount;

            // Add row to table
            tableModel.addRow(new Object[]{item, qty, price, amount});

            // Update total dynamically
            totalLabel.setText("Total: ₹" + total);

            // Clear fields
            itemField.setText("");
            qtyField.setText("");
            priceField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid quantity or price!");
        }
    }

    public static void main(String[] args) {
        new ShoppingCartGUI().setVisible(true);
    }
}

