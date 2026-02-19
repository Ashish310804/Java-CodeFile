import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class InventoryGUI extends JFrame {

    private JTextField nameField, codeField, qtyField, priceField, searchField;
    private DefaultTableModel tableModel;

    public InventoryGUI() {
        setTitle("Real-Time Inventory Management System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Input panel for adding items
        JPanel inputPanel = new JPanel(new GridLayout(2, 5, 10, 10));

        nameField = new JTextField();
        codeField = new JTextField();
        qtyField = new JTextField();
        priceField = new JTextField();

        inputPanel.add(new JLabel("Item Name:"));
        inputPanel.add(new JLabel("Item Code:"));
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(new JLabel(""));

        inputPanel.add(nameField);
        inputPanel.add(codeField);
        inputPanel.add(qtyField);
        inputPanel.add(priceField);

        JButton addButton = new JButton("Add Item");
        inputPanel.add(addButton);

        // Table for inventory
        tableModel = new DefaultTableModel(
                new String[]{"Item Name", "Code", "Quantity", "Price", "Value", "Status"}, 
                0
        );
        JTable table = new JTable(tableModel);

        // Row coloring for low stock
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable t, Object value,
                    boolean isSelected, boolean hasFocus, int row, int col) {

                Component c = super.getTableCellRendererComponent(t, value, isSelected, hasFocus, row, col);
                int qty = Integer.parseInt(t.getValueAt(row, 2).toString());
                c.setBackground(qty < 5 ? Color.PINK : Color.WHITE);
                return c;
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);

        // Search Panel
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search Item:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Add item button action
        addButton.addActionListener(e -> addInventoryItem());

        // Search button action
        searchButton.addActionListener(e -> searchItem());

        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(searchPanel, BorderLayout.SOUTH);
    }

    private void addInventoryItem() {
        try {
            String name = nameField.getText();
            String code = codeField.getText();
            int qty = Integer.parseInt(qtyField.getText());
            double price = Double.parseDouble(priceField.getText());
            double value = qty * price;

            String status = qty < 5 ? "Low Stock" : "OK";

            tableModel.addRow(new Object[]{name, code, qty, price, value, status});

            nameField.setText("");
            codeField.setText("");
            qtyField.setText("");
            priceField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid quantity or price!");
        }
    }

    private void searchItem() {
        String keyword = searchField.getText().toLowerCase();

        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String name = tableModel.getValueAt(i, 0).toString().toLowerCase();
            String code = tableModel.getValueAt(i, 1).toString().toLowerCase();

            if (name.contains(keyword) || code.contains(keyword)) {
                JOptionPane.showMessageDialog(this,
                        "Item Found:\nName: " + name + "\nCode: " + code);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Item not found!");
    }

    public static void main(String[] args) {
        new InventoryGUI().setVisible(true);
    }
}

