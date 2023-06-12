package Dashboard;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class PanelExpenses extends JPanel {
	private ImageIcon ex1 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ExpensesImage\\Expenses1.PNG")
					.getImage().getScaledInstance(415, 390, Image.SCALE_DEFAULT));
	private ImageIcon ex2 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ExpensesImage\\Expenses2.PNG")
					.getImage().getScaledInstance(415, 390, Image.SCALE_DEFAULT));

	private ImageIcon ex3 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ExpensesImage\\Expenses3.PNG")
					.getImage().getScaledInstance(415, 390, Image.SCALE_DEFAULT));

	private ImageIcon ex4 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ExpensesImage\\Expenses4.PNG")
					.getImage().getScaledInstance(415, 390, Image.SCALE_DEFAULT));
	private ImageIcon rev1 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ExpensesImage\\Revenue.PNG")
					.getImage().getScaledInstance(692, 198, Image.SCALE_DEFAULT));


	/**
	 * Create the panel.
	 */
	public PanelExpenses() {
		setBackground(new Color(255, 255, 255));
		setBounds(196, 90, 1084, 628); // Update height to 780
	    setLayout(null);

	    JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1084, 628); 	
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(0, 0, 1084, 628);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    mainPanel.add(scrollPane);
	    

	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setPreferredSize(new Dimension(1001, 1300)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    scrollContent.setLayout(null);
	    
	    JLabel expensesLbl = new JLabel("Expenses");
	    expensesLbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    expensesLbl.setBounds(10, 11, 401, 74);
	    scrollContent.add(expensesLbl);
	    
	    JLabel expense1lbl = new JLabel("");
	    expense1lbl.setIcon(ex1);
	    expense1lbl.setBounds(10, 109, 424, 390);
	    scrollContent.add(expense1lbl);
	    
	    JLabel expense2lbl = new JLabel("");
	    expense2lbl.setIcon(ex2);
	    expense2lbl.setBounds(581, 109, 424, 399);
	    scrollContent.add(expense2lbl);
	    
	    JLabel expense3lbl = new JLabel("");
	    expense3lbl.setIcon(ex3);
	    expense3lbl.setBounds(10, 540, 424, 399);
	    scrollContent.add(expense3lbl);
	    
	    JLabel expense4lbl = new JLabel("");
	    expense4lbl.setIcon(ex4);
	    expense4lbl.setBounds(581, 540, 424, 399);
	    scrollContent.add(expense4lbl);
	    
	    JLabel revenuelbl = new JLabel("Revenue");
	    revenuelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    revenuelbl.setBounds(10, 1010, 401, 74);
	    scrollContent.add(revenuelbl);
	    
	    JLabel revenue2lbl = new JLabel("");
	    revenue2lbl.setIcon(rev1);
	    revenue2lbl.setBounds(10, 1100, 692, 198);
	    scrollContent.add(revenue2lbl);

	}
}
