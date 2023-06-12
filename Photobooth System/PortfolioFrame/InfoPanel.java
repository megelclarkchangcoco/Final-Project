package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class InfoPanel extends JPanel {
	
	private ImageIcon maps = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\map.PNG")
					.getImage().getScaledInstance(876, 439, Image.SCALE_DEFAULT));
	private ImageIcon point = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\placeholder.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\gmail.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon telephone = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\telephone.png")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon facebook = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\facebook.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private JPanel policypanel;
	
	/**
	 * Create the panel.
	 */
	public InfoPanel() {
		setBackground(new Color(244, 252, 239));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		 JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1280, 607);		
		add(mainPanel);
		mainPanel.setLayout(null);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1280, 607);
		scrollPane.setBackground(new Color(225, 254, 253));
		 mainPanel.add(scrollPane);
		    

		 JPanel scrollContent = new JPanel();
		 scrollContent.setBackground(new Color(255, 255, 255));
		 scrollContent.setLayout(null);
		 scrollContent.setPreferredSize(new Dimension(1001, 1835)); // increase the size of the panel to fit all 9 labels
		 scrollPane.setViewportView(scrollContent);
		
		JPanel mappanel = new JPanel();
		mappanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
		mappanel.setBounds(199, 1240, 876, 439);
		scrollContent.add(mappanel);
		mappanel.setOpaque(false);
		mappanel.setLayout(null);
		
		JLabel maplbl = new JLabel("");
		maplbl.setIcon(maps);
		maplbl.setBounds(0, 11, 876, 439);
		mappanel.add(maplbl);
		
		JPanel contactpanel = new JPanel();
		contactpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
		contactpanel.setBounds(199, 1690, 876, 136);
		scrollContent.add(contactpanel);
		contactpanel.setOpaque(false);
		contactpanel.setLayout(null);
		
		JLabel icon1lbl = new JLabel("");
		icon1lbl.setIcon(point);
		icon1lbl.setBounds(10, 11, 46, 44);
		contactpanel.add(icon1lbl);
		
		JLabel lblNewLabel = new JLabel("1360 Quiricada St. Manila, Phillipines, 1013");
		lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel.setBounds(66, 22, 309, 33);
		contactpanel.add(lblNewLabel);
		
		JLabel icon2lbl = new JLabel("");
		icon2lbl.setIcon(gmail);
		icon2lbl.setBounds(10, 69, 46, 44);
		contactpanel.add(icon2lbl);
		
		JLabel lblNewLabel2 = new JLabel("blissfulshotsphotobooth@gmail.com");
		lblNewLabel2.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel2.setBounds(66, 80, 309, 33);
		contactpanel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("0916-296-0814 |  0947-601-4387");
		lblNewLabel3.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel3.setBounds(535, 80, 309, 33);
		contactpanel.add(lblNewLabel3);
		
		JLabel icon3lbl = new JLabel("");
		icon3lbl.setIcon(telephone);
		icon3lbl.setBounds(479, 69, 46, 44);
		contactpanel.add(icon3lbl);
		
		JLabel icon4lbl = new JLabel("");
		icon4lbl.setIcon(facebook);
		icon4lbl.setBounds(479, 11, 46, 44);
		contactpanel.add(icon4lbl);
		
		JLabel lblNewLabel4 = new JLabel("Blissful Shots Photobooth");
		lblNewLabel4.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel4.setBounds(535, 22, 309, 33);
		contactpanel.add(lblNewLabel4);
		
		JPanel historypanel;
		policypanel = new JPanel();
		policypanel.setBorder(new MatteBorder(2, 2, 2, 3, (Color) new Color(105, 244, 222)));
		policypanel.setBackground(Color.WHITE);
		policypanel.setBounds(199, 459, 876, 774);
		scrollContent.add(policypanel);
		policypanel.setLayout(null);
		
		JLabel texts1 = new JLabel("Photobooth Data and Payment Policy.");
		texts1.setFont(new Font("Anton", Font.PLAIN, 40));
		texts1.setBounds(10, 11, 612, 57);
		policypanel.add(texts1);
		
		JLabel textnum1 = new JLabel("1. Personal Information:");
		textnum1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textnum1.setBounds(10, 131, 216, 34);
		policypanel.add(textnum1);
		
		JLabel lblNewLabel_1_1 = new JLabel("We collect and use personal information (names, email addresses, phone numbers)");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(223, 132, 606, 34);
		policypanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("for the purpose of contacting our clients and providing necessary information. We assure you that we prioritize");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(30, 159, 739, 34);
		policypanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("the security of your data, and we do not share this information with any third parties unless required by law.");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(30, 188, 739, 34);
		policypanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(" Our database is highly secure to ensure the safety and confidentiality of your personal information.");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(30, 215, 739, 34);
		policypanel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblPhotoGallery = new JLabel("2. Photo Gallery:\r\n");
		lblPhotoGallery.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhotoGallery.setBounds(10, 260, 216, 34);
		policypanel.add(lblPhotoGallery);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Your photos will be uploaded here for publicity purposes. We may use the photos");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(156, 261, 606, 34);
		policypanel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("your photos, please let us know.");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_2.setBounds(30, 317, 216, 34);
		policypanel.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("to showcase our services and promote our business. However, if you have any concerns regarding the use of");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2.setBounds(30, 288, 739, 34);
		policypanel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblpaymentOptions = new JLabel("3. Payment Options:\r\n");
		lblpaymentOptions.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblpaymentOptions.setBounds(10, 362, 216, 34);
		policypanel.add(lblpaymentOptions);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("We accept cash, credit/debit cards, and online payment gateways. Payment terms are ");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(190, 363, 606, 34);
		policypanel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("subject to the selected method's terms and conditions.");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2_1.setBounds(30, 390, 368, 34);
		policypanel.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblPaymentSecurity = new JLabel("4. Payment Security : \r\n");
		lblPaymentSecurity.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPaymentSecurity.setBounds(10, 434, 216, 34);
		policypanel.add(lblPaymentSecurity);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel(" We ensure secure payment processing, using encryption for online payments and industry ");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1_1.setBounds(190, 435, 606, 34);
		policypanel.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1 = new JLabel("best practices for in-person payments.");
		lblNewLabel_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2_1_1.setBounds(30, 463, 368, 34);
		policypanel.add(lblNewLabel_1_1_1_2_1_1);
		
		JLabel lblPaymentSecurity_1 = new JLabel("5. Refunds and Disputes : \r\n");
		lblPaymentSecurity_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPaymentSecurity_1.setBounds(10, 509, 236, 34);
		policypanel.add(lblPaymentSecurity_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1 = new JLabel("Refunds and dispute resolutions are handled on a case-by-case basis. Contact");
		lblNewLabel_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1_1_1.setBounds(238, 510, 606, 34);
		policypanel.add(lblNewLabel_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1 = new JLabel("customer support within [24/7] for assistance.");
		lblNewLabel_1_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2_1_1_1.setBounds(30, 537, 529, 34);
		policypanel.add(lblNewLabel_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1 = new JLabel(" By using our photobooth services and making a payment, you consent to the collection, use,");
		lblNewLabel_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1_1_1_1.setBounds(202, 573, 642, 34);
		policypanel.add(lblNewLabel_1_1_2_1_1_1_1);
		
		JLabel lblPaymentSecurity_1_1 = new JLabel("6. Customer Consent :\r\n");
		lblPaymentSecurity_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPaymentSecurity_1_1.setBounds(10, 573, 236, 34);
		policypanel.add(lblPaymentSecurity_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1 = new JLabel(" and processing of your personal information and photos as outlined in this policy.");
		lblNewLabel_1_1_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2_1_1_1_1.setBounds(30, 601, 787, 34);
		policypanel.add(lblNewLabel_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1_1_1_1_1 = new JLabel(" We may update this policy as needed, with updates communicated through our website or ");
		lblNewLabel_1_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1_1_1_1_1.setBounds(168, 646, 642, 34);
		policypanel.add(lblNewLabel_1_1_2_1_1_1_1_1);
		
		JLabel lblPaymentSecurity_1_1_1 = new JLabel("7. Policy Updates:\r\n");
		lblPaymentSecurity_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPaymentSecurity_1_1_1.setBounds(10, 646, 236, 34);
		policypanel.add(lblPaymentSecurity_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2_1_1_1_1_1 = new JLabel("other appropriate means.");
		lblNewLabel_1_1_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_2_1_1_1_1_1.setBounds(30, 674, 787, 34);
		policypanel.add(lblNewLabel_1_1_1_2_1_1_1_1_1);
		
		JLabel lblContactCustomerSupport = new JLabel("Contact customer support for any questions or concerns. Thank you for choosing Blissful Shots Photobooth!");
		lblContactCustomerSupport.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactCustomerSupport.setBounds(30, 730, 836, 34);
		policypanel.add(lblContactCustomerSupport);
		
		JPanel historypanels1 = new JPanel();
		historypanels1.setBorder(new MatteBorder(2, 2, 2, 3, (Color) new Color(105, 244, 222)));
		historypanels1.setBackground(new Color(255, 255, 255));
		historypanels1.setBounds(199, 24, 876, 424);
		scrollContent.add(historypanels1);
		historypanels1.setLayout(null);
		
		JLabel historyText = new JLabel("History");
		historyText.setFont(new Font("Anton", Font.PLAIN, 50));
		historyText.setBounds(10, 11, 172, 59);
		historypanels1.add(historyText);
		
		JLabel text1 = new JLabel("-The history of our business starts with our brother, Stary, who bought a camera and some units. Then, his son had");
		text1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1.setBounds(61, 81, 788, 34);
		historypanels1.add(text1);
		
		JLabel lblABirthdayParty = new JLabel("a birthday party, and during the event, he decided to try setting up a photobooth. While operating the photobooth, the owner");
		lblABirthdayParty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblABirthdayParty.setBounds(22, 115, 827, 34);
		historypanels1.add(lblABirthdayParty);
		
		JLabel text1_1_1 = new JLabel("asked him for a calling card, even though they didn't have an established photobooth business at that time. However, he started");
		text1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1.setBounds(22, 149, 844, 34);
		historypanels1.add(text1_1_1);
		
		JLabel text1_1_1_1 = new JLabel("giving out his Facebook contacts and, subsequently, the manager asked for the photobooth contacts of this owner. This led us");
		text1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1_1.setBounds(22, 183, 844, 34);
		historypanels1.add(text1_1_1_1);
		
		JLabel text1_1_1_1_1 = new JLabel("to create a Facebook page and endorse the photobooth, encouraging people to join the page.");
		text1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		text1_1_1_1_1.setBounds(22, 217, 844, 34);
		historypanels1.add(text1_1_1_1_1);
		
		JLabel lblAfterThatOur = new JLabel("After that, our business began to gain momentum, with daily bookings for the photobooth. However, the pandemic");
		lblAfterThatOur.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAfterThatOur.setBounds(78, 262, 788, 34);
		historypanels1.add(lblAfterThatOur);
		
		JLabel lblStruckAndWe = new JLabel("struck, and we had to pause our operations for a year. But after that challenging period, we were able to resume our business,");
		lblStruckAndWe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStruckAndWe.setBounds(39, 291, 837, 34);
		historypanels1.add(lblStruckAndWe);
		
		JLabel lblAndItHas = new JLabel("and it has been continuing successfully until now. Our photobooth business has persevered through the difficulties, and we");
		lblAndItHas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAndItHas.setBounds(39, 319, 827, 34);
		historypanels1.add(lblAndItHas);
		
		JLabel lblRemainCommittedTo = new JLabel("remain committed to providing quality services to our customers.");
		lblRemainCommittedTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRemainCommittedTo.setBounds(39, 352, 827, 34);
		historypanels1.add(lblRemainCommittedTo);
	}
}
