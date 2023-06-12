package Dashboard;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PanelDashboard extends JPanel {
    private ImageIcon homeImage = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\search.png")
                    .getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
    private ImageIcon withdrawIcon = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\money-withdrawal.png")
                    .getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
    private ImageIcon pesosIcon = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\peso.png")
                    .getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
	private ImageIcon bdo = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\bdo.png")
            .getImage().getScaledInstance(78, 36, Image.SCALE_DEFAULT));
	private ImageIcon bpi = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\bpi.png")
            .getImage().getScaledInstance(78, 36, Image.SCALE_DEFAULT));
	private ImageIcon maya = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\maya.jpg")
            .getImage().getScaledInstance(78, 36, Image.SCALE_DEFAULT));
	private ImageIcon gcash = new ImageIcon(
            new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\PanelDashboardImage\\gcash.png")
            .getImage().getScaledInstance(78, 36, Image.SCALE_DEFAULT));
	private JTextField phonefields;
	private JTextField enteramount;
	private JPasswordField pinfields;
	 private JLabel Transferlbl;
    private JPanel contentPane;
    private JTable table;
    private JPanel viewPanel;
    private JPanel mainPanel;
    private JPanel incomePanel;
    private JScrollPane scrollPane;
    public static JLabel incomeLbl;
    private static JPanel IncomePanel;
    private int[] selectedRows;
    private double amount;
    private double totalIncome;
    private JPanel withdrawpanel;
    private JLabel withdrawal;
    private String withdrawalPin = "134213"; // Withdrawal PIN
    private String withdrawalNum = "092955274"; // withdrawal Number


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1084, 628);
        PanelDashboard panelDashboard = new PanelDashboard();
        frame.getContentPane().add(panelDashboard);
        frame.setVisible(true);
    }


    public PanelDashboard() {

        setBounds(196, 90, 1084, 628);
        setLayout(null);
        mainPanel = new JPanel();
        mainPanel.setBounds(-20, 0, 1150, 628);
        add(mainPanel);
        mainPanel.setLayout(null);

        viewPanel = new JPanel();
        viewPanel.setBackground(new Color(188, 233, 227));
        viewPanel.setLayout(null);
        viewPanel.addMouseListener(new PanelButtonMouseAdapter(viewPanel));
        viewPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(2, 4, 5), null));
        viewPanel.setBounds(20, 69, 235, 83);
        mainPanel.add(viewPanel);

        viewPanel.setBounds(122, 69, 235, 83);
        mainPanel.add(viewPanel);
        viewPanel.setLayout(null);

        JLabel homeLbl = new JLabel("View Book");
        homeLbl.setBackground(new Color(188, 233, 227));
        homeLbl.setFont(new Font("Dialog", Font.BOLD, 14));
        homeLbl.setIcon(homeImage);
        homeLbl.setBounds(53, 27, 150, 25);
        viewPanel.add(homeLbl);

        incomePanel = new JPanel();
        incomePanel.setBackground(new Color(188, 233, 227));
        incomePanel.setLayout(null);
        incomePanel.addMouseListener(new PanelButtonMouseAdapter(incomePanel));
        incomePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(2, 4, 5), null));
        incomePanel.setBounds(481, 69, 235, 83);
        mainPanel.add(incomePanel);

        incomeLbl = new JLabel("Income");
        incomeLbl.setIcon(pesosIcon);
        incomeLbl.setFont(new Font("Dialog", Font.BOLD, 14));
        incomeLbl.setBounds(53, 27, 150, 25);
        incomePanel.add(incomeLbl);
        
        withdrawpanel = new JPanel();
        withdrawpanel.setLayout(null);
        withdrawpanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(2, 4, 5), null));
        withdrawpanel.setBackground(new Color(188, 233, 227));
        withdrawpanel.setBounds(838, 69, 235, 83);
        withdrawpanel.addMouseListener(new PanelButtonMouseAdapter(withdrawpanel));
        mainPanel.add(withdrawpanel);
        
        withdrawal = new JLabel("Withdraw");
        withdrawal.setIcon(withdrawIcon);
        withdrawal.setFont(new Font("Dialog", Font.BOLD, 14));
        withdrawal.setBounds(53, 27, 150, 25);
        withdrawpanel.add(withdrawal);
    }

    private class PanelButtonMouseAdapter extends MouseAdapter {

        JPanel panel;

        public PanelButtonMouseAdapter(JPanel panel) {
            this.panel = panel;
        }

        public void mouseEntered(MouseEvent e) {
            panel.setBackground(new Color(250, 246, 110));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panel.setBackground(new Color(188, 233, 227));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            panel.setBackground(new Color(250, 246, 110));

            if (panel == withdrawpanel) {
                // Display the withdrawal frame for entering pin and amount
                JFrame withdrawFrame = new JFrame();
                withdrawFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                withdrawFrame.setBounds(100, 100, 566, 413);
                
                JPanel withdrawPanel = new JPanel();
                withdrawPanel.setLayout(null);
                withdrawPanel.setBounds(0, 0, 549, 380);
                withdrawPanel.setBackground(new Color(255, 255, 255));
                withdrawFrame.getContentPane().add(withdrawPanel);
                withdrawFrame.setVisible(true);

                Transferlbl = new JLabel("Bank Money Transfer");
        		Transferlbl.setFont(new Font("Anton", Font.PLAIN, 40));
        		Transferlbl.setBounds(120, 11, 366, 63);
        		withdrawPanel.add(Transferlbl);
        		
        		JRadioButton bdobtn = new JRadioButton("");
        		bdobtn.setBackground(new Color(255, 255, 255));
        		bdobtn.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				pinfields.setVisible(true);
        				phonefields.setVisible(false);
        			}
        		});
        		bdobtn.setBounds(59, 125, 22, 23);
        		withdrawPanel.add(bdobtn);
        		
        		JLabel text1 = new JLabel("Please choose the bank for your income transfer and fill up all the fields.");
        		text1.setFont(new Font("Anton", Font.PLAIN, 15));
        		text1.setBounds(69, 70, 444, 34);
        		withdrawPanel.add(text1);
        		
        		JLabel atmlbl1 = new JLabel("");
        		atmlbl1.setIcon(bdo);
        		atmlbl1.setBounds(87, 112, 78, 36);
        		withdrawPanel.add(atmlbl1);
        		
        		JRadioButton bpibutton = new JRadioButton("");
        		bpibutton.setBackground(new Color(255, 255, 255));
        		bpibutton.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        				pinfields.setVisible(true);
        				phonefields.setVisible(false);
        			}
        		});
        		bpibutton.setBounds(166, 125, 22, 23);
        		withdrawPanel.add(bpibutton);
        		
        		JLabel atmlbl2 = new JLabel("");
        		atmlbl2.setIcon(bpi);
        		atmlbl2.setBounds(194, 112, 78, 36);
        		withdrawPanel.add(atmlbl2);
        		
        		JRadioButton mayabutton = new JRadioButton("");
        		mayabutton.setBackground(new Color(255, 255, 255));
        		mayabutton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				pinfields.setVisible(false);
        				phonefields.setVisible(true);
        			}
        		});
        		mayabutton.setBounds(282, 125, 22, 23);
        		withdrawPanel.add(mayabutton);
        		
        		JLabel atmlbl3 = new JLabel("");
        		atmlbl3.setIcon(maya);
        		atmlbl3.setBounds(310, 112, 78, 36);
        		withdrawPanel.add(atmlbl3);
        		
        		JRadioButton gcashbutton = new JRadioButton("");
        		gcashbutton.setBackground(new Color(255, 255, 255));
        		gcashbutton.addMouseListener(new MouseAdapter() {
        			@Override
        			public void mouseClicked(MouseEvent e) {
        				pinfields.setVisible(false);
        				phonefields.setVisible(true);
        			}
        		});
        		gcashbutton.setBounds(397, 125, 22, 23);
        		withdrawPanel.add(gcashbutton);
        		
        		JLabel atmlbl4 = new JLabel("");
        		atmlbl4.setIcon(gcash);
        		atmlbl4.setBounds(425, 112, 78, 36);
        		withdrawPanel.add(atmlbl4);
        		
        		phonefields = new JTextField();
        		phonefields.setFont(new Font("Anton", Font.PLAIN, 20));
        		phonefields.setVisible(false);
        		phonefields.setText("Enter Phone Number");
        		phonefields.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
        		phonefields.setBounds(105, 176, 366, 56);
        		phonefields.addFocusListener(new FocusAdapter() {
        			@Override
        			public void focusLost(FocusEvent e) {
        				if (phonefields.getText().equals("")) {
        					phonefields.setForeground(new Color(96, 96, 96));
        					phonefields.setText("Enter Phone Number");
        				}
        			}

        			@Override
        			public void focusGained(FocusEvent e) {
        				if (phonefields.getText().equals("Enter Phone Number")) {
        					phonefields.setForeground(Color.BLACK);
        					phonefields.setText("");
        				}
        			}
        		});
        		phonefields.addKeyListener(new KeyAdapter() {
                    @Override // this is why 6 only number can input in PIN Field
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c) || phonefields.getText().length() >= 9) {
                            e.consume();
                        }
                    }
                });
        		
        		withdrawPanel.add(phonefields);
        		phonefields.setColumns(10);

        		enteramount = new JTextField();
        		enteramount.setFont(new Font("Anton", Font.PLAIN, 30));
        		enteramount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
        		enteramount.setText("Enter Amount");
        		enteramount.addFocusListener(new FocusAdapter() {
        			@Override
        			public void focusLost(FocusEvent e) {
        				if (enteramount.getText().equals("")) {
        					enteramount.setForeground(new Color(96, 96, 96));
        					enteramount.setText("Enter Amount");
        				}
        			}

        			@Override
        			public void focusGained(FocusEvent e) {
        				if (enteramount.getText().equals("Enter Amount")) {
        					enteramount.setForeground(Color.BLACK);
        					enteramount.setText("");
        				}
        			}
        		});
        		enteramount.setColumns(10);
        		enteramount.setBounds(105, 245, 366, 79);
        		withdrawPanel.add(enteramount);
        		
        		pinfields = new JPasswordField();
        		pinfields.setFont(new Font("Tohama", Font.PLAIN, 20));
        		pinfields.setText("Enter PIN Number");
        		pinfields.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
        		pinfields.setBounds(105, 176, 366, 56);
        		pinfields.addFocusListener(new FocusAdapter(){
        			@Override
        			public void focusLost(FocusEvent e) {
        				if (pinfields.getText().equals("")) {
        					pinfields.setForeground(new Color(96, 96, 96));
        					pinfields.setText("Enter PIN Number");
        					pinfields.setEchoChar((char) 0);
        				}
        			}

        			@Override
        			public void focusGained(FocusEvent e) {
        				if (pinfields.getText().equals("Enter PIN Number")) {
        					pinfields.setEchoChar('●');
        					pinfields.setForeground(Color.BLACK);
        					pinfields.setText("");
        				}
        			}

        		});
        		pinfields.addKeyListener(new KeyAdapter() {
                    @Override // this is why 6 only number can input in PIN Field
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c) || pinfields.getText().length() >= 6) {
                            e.consume();
                        }
                    }
                });
        		withdrawPanel.add(pinfields);

                JButton withdrawbutton = new JButton("Transfer");
        		withdrawbutton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
        		withdrawbutton.setFont(new Font("Anton", Font.PLAIN, 15));
        		withdrawbutton.setBounds(212, 335, 134, 34);
        		withdrawbutton.addActionListener(new ActionListener() {
        			public void actionPerformed(ActionEvent e) {
        			    String pin = new String(pinfields.getPassword());
        			    String num = new String(phonefields.getText());
        			    double withdrawalAmount = Double.parseDouble(enteramount.getText());
        			    double withdrawalAmount2 = Double.parseDouble(enteramount.getText());

        			    // Check if the pin is correct and the withdrawal amount is valid
        			    if (validatePin(pin)) {
        			        if (withdrawalAmount <= totalIncome) {
        			            // Update the total income after withdrawal
        			            totalIncome -= withdrawalAmount;
        			            incomeLbl.setText("Income: " + totalIncome);

        			            // Display a success message
        			            JOptionPane.showMessageDialog(null, "Withdrawal successful!");

        			            // Close the withdrawal frame
        			            withdrawFrame.dispose();
        			        } else {
        			            // Display an error message for insufficient funds
        			            JOptionPane.showMessageDialog(null, "Insufficient funds! Please enter a valid withdrawal amount.");
        			        }
        			    } else if (validateNum(num)) {
        			        if (withdrawalAmount2 <= totalIncome) {
        			            // Update the total income after withdrawal
        			            totalIncome -= withdrawalAmount2;
        			            incomeLbl.setText("Income: " + totalIncome);

        			            // Display a success message
        			            JOptionPane.showMessageDialog(null, "Withdrawal successful!");

        			            // Close the withdrawal frame
        			            withdrawFrame.dispose();
        			        } else {
        			            // Display an error message for insufficient funds
        			            JOptionPane.showMessageDialog(null, "Insufficient funds! Please enter a valid withdrawal amount.");
        			        }
        			    } else {
        			        // Display an error message for both invalid Number and withdrawal amount
        			        JOptionPane.showMessageDialog(null, "Invalid Number or withdrawal amount!");
        			    }
        			}

        			// Helper method to validate the PIN
        			private boolean validatePin(String pin) {
        			    return pin.equals(withdrawalPin);
        			}

        			// Helper method to validate the phone number
        			private boolean validateNum(String num) {
        			    return num.equals(withdrawalNum);
        			}

                });
                withdrawPanel.add(withdrawbutton);
            } else {
                // Read and populate the JTable with data from the text file
                String filepath = "C:\\data.txt";
                File file = new File(filepath);

                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Organizer");
                model.addColumn("Celebrant");
                model.addColumn("Contact");
                model.addColumn("Event Place");
                model.addColumn("Event Type");
                model.addColumn("Amount");
                model.addColumn("Layout");
                model.addColumn("Design");
                model.addColumn("Backdrops");
                model.addColumn("Magnetic");
                model.addColumn("Extend");
                model.addColumn("FileName");
                model.addColumn("Date");

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String firstLine = br.readLine().trim();
                    String[] columnsName = firstLine.split(",");
                    model.setColumnIdentifiers(columnsName);

                    Object[] tableLines = br.lines().toArray();

                    for (int i = 0; i < tableLines.length; i++) {
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split("/");
                        model.addRow(dataRow);
                    }

                    br.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                table = new JTable(model);
                table.setDefaultEditor(Object.class, null);

                scrollPane = new JScrollPane(table);
                scrollPane.setBounds(122, 180, 955, 391);
                mainPanel.add(scrollPane);

                JButton confirmbtn = new JButton("Confirm");
                confirmbtn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Get the selected rows
                        selectedRows = table.getSelectedRows();
                        totalIncome = 0.0; // Remove this line to preserve the previous totalIncome value

                        // Calculate the total income from the selected rows
                        for (int row : selectedRows) {
                            String amountString = table.getValueAt(row, 5).toString();
                            // Extract the numeric value from the amount string
                            amount = extractNumericValue(amountString);
                            totalIncome += amount;
                        }
    

                        // Display confirmation dialog
                        int confirmOption = JOptionPane.showConfirmDialog(null, "Book confirmed?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
                        if (confirmOption == JOptionPane.OK_OPTION) {

                        	// Set the text of incomeLbl to show the total income
                            incomeLbl.setText("Income: " + totalIncome);
                        }
                    }

                    // Helper method to extract the numeric value from a string
                    private double extractNumericValue(String amountString) {
                        StringBuilder numericValueBuilder = new StringBuilder();
                        for (char c : amountString.toCharArray()) {
                            if (Character.isDigit(c) || c == '.') {
                                numericValueBuilder.append(c);
                            }
                        }
                        try {
                            return Double.parseDouble(numericValueBuilder.toString());
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid amount format: " + amountString);
                            return 0.0; // Return 0 if the amount cannot be parsed
                        }
                    }
                });
                confirmbtn.setBounds(988, 583, 89, 23);
                mainPanel.add(confirmbtn);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            panel.setBackground(new Color(250, 246, 110));
        }
    }
}

