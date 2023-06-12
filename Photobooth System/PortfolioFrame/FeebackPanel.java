package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class FeebackPanel extends JPanel {

	// images
		private ImageIcon stars = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\star.png")
						.getImage().getScaledInstance(30, 33, Image.SCALE_DEFAULT));
		private ImageIcon Circle = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\s.PNG")
						.getImage().getScaledInstance(204, 209, Image.SCALE_DEFAULT));
		private ImageIcon profile1 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile1.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile2 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile2.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile3 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile3.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile4 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile4.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile5 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile5.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile6 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile6.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile7 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\Jbicon.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		
		private ImageIcon star = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\star.png")
						.getImage().getScaledInstance(47, 36, Image.SCALE_DEFAULT));
		private ImageIcon starss1 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\star2.png")
						.getImage().getScaledInstance(55, 36, Image.SCALE_DEFAULT));
		private ImageIcon starss2 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\stars.png")
						.getImage().getScaledInstance(55, 36, Image.SCALE_DEFAULT));
		private ImageIcon starss3 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\three-stars.png")
						.getImage().getScaledInstance(55, 36, Image.SCALE_DEFAULT));
		private ImageIcon starss4 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\4-stars.png")
						.getImage().getScaledInstance(55, 36, Image.SCALE_DEFAULT));
		private ImageIcon starss5 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\5-stars.png")
						.getImage().getScaledInstance(55, 36, Image.SCALE_DEFAULT));
		
		private ImageIcon mess = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\paper-plane.PNG")
						.getImage().getScaledInstance(78, 58, Image.SCALE_DEFAULT));
		private JTextField texFeedbacktField;
		private JLabel feedbacktextlbl8;
		private JLabel feedbacktextlbl81;
		private  JLabel stars1;
		private  JLabel stars2;
		private  JLabel stars3;
		private  JLabel stars4;
		private  JLabel stars5;
		
		
		public static boolean isFirstClick = true;
	/**
	 * Create the panel.
	 */
	public FeebackPanel() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1280, 718);		
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(102, 244, 222));
		leftPanel.setBounds(0, 0, 224, 607);
		mainPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel ratingslbl = new JLabel("Ratings 5.0");
		ratingslbl.setForeground(new Color(255, 255, 255));
		ratingslbl.setFont(new Font("Anton", Font.PLAIN, 20));
		ratingslbl.setBounds(10, 65, 106, 33);
		leftPanel.add(ratingslbl);
		
		JLabel startlbl = new JLabel("");
		startlbl.setIcon(stars);
		startlbl.setFont(new Font("Anton", Font.PLAIN, 20));
		startlbl.setBounds(105, 65, 30, 33);
		leftPanel.add(startlbl);
		
		JLabel ratinglbl = new JLabel("");
		ratinglbl.setIcon(Circle);
		ratinglbl.setBounds(10, 109, 204, 209);
		leftPanel.add(ratinglbl);
		
		JLabel lblNewLabel = new JLabel("95%");
		lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 38));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(70, 179, 81, 76);
		leftPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Show Data");
		lblNewLabel_1.setFont(new Font("Anton", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 316, 99, 45);
		leftPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2018-2023");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Anton", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(105, 316, 99, 45);
		leftPanel.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(223, 0, 1057, 607);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    mainPanel.add(scrollPane);
	    
	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setLayout(null);
	    scrollContent.setPreferredSize(new Dimension(1001, 1550)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    
	    JPanel feedbackpanel1 = new JPanel();
	    feedbackpanel1.setOpaque(false);
	    feedbackpanel1.setBounds(35, 43, 982, 142);
	    scrollContent.add(feedbackpanel1);
	    feedbackpanel1.setLayout(null);
	    
	    JLabel profile1lbl = new JLabel("");
	    profile1lbl.setIcon(profile1);
	    profile1lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel1.add(profile1lbl);
	    
	    JLabel profilename1lbl = new JLabel("Lea Aleria");
	    profilename1lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl.setBounds(135, 11, 131, 34);
	    feedbackpanel1.add(profilename1lbl);

	    JPanel panel = new JPanel();
	    panel.setBounds(121, 89, 366, 53);
	    feedbackpanel1.add(panel);
	    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel.setLayout(null);

	    
	    JLabel feedbacktextlbl = new JLabel("Value for money. Courteos staff.");
	    feedbacktextlbl.setBounds(10, 11, 232, 28);
	    panel.add(feedbacktextlbl);
	    feedbacktextlbl.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl.setForeground(new Color(0, 0, 0));
	    
	    JLabel star1 = new JLabel("");
	    star1.setIcon(star);
	    star1.setBounds(121, 42, 47, 36);
	    feedbackpanel1.add(star1);
	    
	    JLabel star2 = new JLabel("");
	    star2.setIcon(star);
	    star2.setBounds(181, 42, 47, 36);
	    feedbackpanel1.add(star2);
	    
	    JLabel star3 = new JLabel("");
	    star3.setIcon(star);
	    star3.setBounds(238, 42, 47, 36);
	    feedbackpanel1.add(star3);
	    
	    JLabel star4 = new JLabel("");
	    star4.setIcon(star);
	    star4.setBounds(295, 42, 47, 36);
	    feedbackpanel1.add(star4);
	    
	    JLabel star5 = new JLabel("");
	    star5.setIcon(star);
	    star5.setBounds(352, 42, 47, 36);
	    feedbackpanel1.add(star5);
	    
	    JPanel feedbackpanel2 = new JPanel();
	    feedbackpanel2.setLayout(null);
	    feedbackpanel2.setOpaque(false);
	    feedbackpanel2.setBounds(35, 189, 982, 197);
	    scrollContent.add(feedbackpanel2);
	    
	    JLabel profile2lbl = new JLabel("");
	    profile2lbl.setIcon(profile2);
	    profile2lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel2.add(profile2lbl);
	    
	    JLabel profilename1lbl_1 = new JLabel("Angelyne Yu-Cheng");
	    profilename1lbl_1.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl_1.setBounds(135, 11, 214, 34);
	    feedbackpanel2.add(profilename1lbl_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setLayout(null);
	    panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel_1.setBounds(121, 92, 369, 94);
	    feedbackpanel2.add(panel_1);
	    
	    JLabel feedbacktextlbl_1 = new JLabel("Great quality in affordable price!,");
	    feedbacktextlbl_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1.setBounds(10, 11, 349, 28);
	    panel_1.add(feedbacktextlbl_1);
	    
	    JLabel feedbacktextlbl_1_1 = new JLabel("Thankyou you Blissful Shots");
	    feedbacktextlbl_1_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_1.setBounds(10, 50, 349, 28);
	    panel_1.add(feedbacktextlbl_1_1);
	    
	    JLabel star6 = new JLabel("");
	    star6.setIcon(star);
	    star6.setBounds(135, 45, 47, 36);
	    feedbackpanel2.add(star6);
	    
	    JLabel sta7 = new JLabel("");
	    sta7.setIcon(star);
	    sta7.setBounds(195, 45, 47, 36);
	    feedbackpanel2.add(sta7);
	    
	    JLabel star8 = new JLabel("");
	    star8.setIcon(star);
	    star8.setBounds(252, 45, 47, 36);
	    feedbackpanel2.add(star8);
	    
	    JLabel star9 = new JLabel("");
	    star9.setIcon(star);
	    star9.setBounds(309, 45, 47, 36);
	    feedbackpanel2.add(star9);
	    
	    JLabel star10 = new JLabel("");
	    star10.setIcon(star);
	    star10.setBounds(366, 45, 47, 36);
	    feedbackpanel2.add(star10);
	    
	    JPanel feedbackpanel2_1 = new JPanel();
	    feedbackpanel2_1.setLayout(null);
	    feedbackpanel2_1.setOpaque(false);
	    feedbackpanel2_1.setBounds(35, 388, 982, 202);
	    scrollContent.add(feedbackpanel2_1);
	    
	    JLabel profile3lbl = new JLabel("");
	    profile3lbl.setIcon(profile3);
	    profile3lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel2_1.add(profile3lbl);
	    
	    JLabel profilename1lbl_1_1 = new JLabel("Roselle Castillo");
	    profilename1lbl_1_1.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl_1_1.setBounds(135, 11, 214, 34);
	    feedbackpanel2_1.add(profilename1lbl_1_1);
	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setLayout(null);
	    panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel_1_1.setBounds(121, 97, 369, 94);
	    feedbackpanel2_1.add(panel_1_1);
	    
	    JLabel feedbacktextlbl_1_2 = new JLabel("Replies to inquiries very timely. Easy to deal \r\n");
	    feedbacktextlbl_1_2.setForeground(Color.BLACK);
	    feedbacktextlbl_1_2.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_2.setBounds(10, 11, 349, 28);
	    panel_1_1.add(feedbacktextlbl_1_2);
	    
	    JLabel feedbacktextlbl_1_1_1 = new JLabel("with, very nice staff. Highly recommended!");
	    feedbacktextlbl_1_1_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1_1_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_1_1.setBounds(10, 50, 349, 28);
	    panel_1_1.add(feedbacktextlbl_1_1_1);
	    
	    JLabel star11 = new JLabel("");
	    star11.setIcon(star);
	    star11.setBounds(135, 50, 47, 36);
	    feedbackpanel2_1.add(star11);
	    
	    JLabel star12 = new JLabel("");
	    star12.setIcon(star);
	    star12.setBounds(195, 50, 47, 36);
	    feedbackpanel2_1.add(star12);
	    
	    JLabel star13 = new JLabel("");
	    star13.setIcon(star);
	    star13.setBounds(252, 50, 47, 36);
	    feedbackpanel2_1.add(star13);
	    
	    JLabel star14 = new JLabel("");
	    star14.setIcon(star);
	    star14.setBounds(309, 50, 47, 36);
	    feedbackpanel2_1.add(star14);
	    
	    JLabel star15 = new JLabel("");
	    star15.setIcon(star);
	    star15.setBounds(366, 50, 47, 36);
	    feedbackpanel2_1.add(star15);
	    
	    JPanel feedbackpane6 = new JPanel();
	    feedbackpane6.setLayout(null);
	    feedbackpane6.setOpaque(false);
	    feedbackpane6.setBounds(35, 939, 708, 324);
	    scrollContent.add(feedbackpane6);
	    
	    JLabel profile6lbl = new JLabel("");
	    profile6lbl.setIcon(profile6);
	    profile6lbl.setBounds(10, 11, 101, 94);
	    feedbackpane6.add(profile6lbl);
	    
	    JLabel profilename6lbl = new JLabel("Erike Bea Ambion");
	    profilename6lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename6lbl.setBounds(135, 11, 214, 34);
	    feedbackpane6.add(profilename6lbl);
	    
	    JPanel panel6 = new JPanel();
	    panel6.setLayout(null);
	    panel6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel6.setBounds(121, 107, 369, 206);
	    feedbackpane6.add(panel6);
	    
	    JLabel feedbacktextlbl6 = new JLabel("Thank you so much for making our wedding day");
	    feedbacktextlbl6.setForeground(Color.BLACK);
	    feedbacktextlbl6.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl6.setBounds(10, 11, 349, 28);
	    panel6.add(feedbacktextlbl6);
	    
	    JLabel feedbacktextlbl61 = new JLabel("memorable and for always being available");
	    feedbacktextlbl61.setForeground(Color.BLACK);
	    feedbacktextlbl61.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl61.setBounds(10, 50, 349, 28);
	    panel6.add(feedbacktextlbl61);
	    
	    JLabel lblToContactI = new JLabel("to contact. I also liked the different pen colors");
	    lblToContactI.setForeground(Color.BLACK);
	    lblToContactI.setFont(new Font("Anton", Font.PLAIN, 18));
	    lblToContactI.setBounds(10, 90, 349, 28);
	    panel6.add(lblToContactI);
	    
	    JLabel lblUsedToWrite = new JLabel(" used to write messages from our guests.");
	    lblUsedToWrite.setForeground(Color.BLACK);
	    lblUsedToWrite.setFont(new Font("Anton", Font.PLAIN, 18));
	    lblUsedToWrite.setBounds(10, 129, 349, 28);
	    panel6.add(lblUsedToWrite);
	    
	    JLabel lblWeWillKeep = new JLabel("We will keep them forever.");
	    lblWeWillKeep.setBounds(10, 168, 349, 28);
	    panel6.add(lblWeWillKeep);
	    lblWeWillKeep.setForeground(Color.BLACK);
	    lblWeWillKeep.setFont(new Font("Anton", Font.PLAIN, 18));
	    
	    JLabel star26 = new JLabel("");
	    star26.setIcon(star);
	    star26.setBounds(135, 56, 47, 36);
	    feedbackpane6.add(star26);
	    
	    JLabel star27 = new JLabel("");
	    star27.setIcon(star);
	    star27.setBounds(195, 56, 47, 36);
	    feedbackpane6.add(star27);
	    
	    JLabel star28 = new JLabel("");
	    star28.setIcon(star);
	    star28.setBounds(252, 56, 47, 36);
	    feedbackpane6.add(star28);
	    
	    JLabel star29 = new JLabel("");
	    star29.setIcon(star);
	    star29.setBounds(309, 56, 47, 36);
	    feedbackpane6.add(star29);
	    
	    JLabel star30 = new JLabel("");
	    star30.setIcon(star);
	    star30.setBounds(366, 56, 47, 36);
	    feedbackpane6.add(star30);
	    
	    JPanel feedbackpanel5 = new JPanel();
	    feedbackpanel5.setLayout(null);
	    feedbackpanel5.setOpaque(false);
	    feedbackpanel5.setBounds(35, 740, 982, 207);
	    scrollContent.add(feedbackpanel5);
	    
	    JLabel profile5lbl = new JLabel("");
	    profile5lbl.setIcon(profile5);
	    profile5lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel5.add(profile5lbl);
	    
	    JLabel profilename5lbl = new JLabel("Ayies RB");
	    profilename5lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename5lbl.setBounds(135, 11, 214, 34);
	    feedbackpanel5.add(profilename5lbl);
	    
	    JPanel panel5 = new JPanel();
	    panel5.setLayout(null);
	    panel5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel5.setBounds(121, 102, 369, 94);
	    feedbackpanel5.add(panel5);
	    
	    JLabel feedbacktextlbl5 = new JLabel("highly recommended. great service ");
	    feedbacktextlbl5.setForeground(Color.BLACK);
	    feedbacktextlbl5.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl5.setBounds(10, 11, 349, 28);
	    panel5.add(feedbacktextlbl5);
	    
	    JLabel feedbacktextlbl00 = new JLabel("and corteous staff");
	    feedbacktextlbl00.setForeground(Color.BLACK);
	    feedbacktextlbl00.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl00.setBounds(10, 50, 349, 28);
	    panel5.add(feedbacktextlbl00);
	    
	    JLabel star21 = new JLabel("");
	    star21.setIcon(star);
	    star21.setBounds(135, 56, 47, 36);
	    feedbackpanel5.add(star21);
	    
	    JLabel star22 = new JLabel("");
	    star22.setIcon(star);
	    star22.setBounds(195, 56, 47, 36);
	    feedbackpanel5.add(star22);
	    
	    JLabel star23 = new JLabel("");
	    star23.setIcon(star);
	    star23.setBounds(252, 56, 47, 36);
	    feedbackpanel5.add(star23);
	    
	    JLabel star24 = new JLabel("");
	    star24.setIcon(star);
	    star24.setBounds(309, 56, 47, 36);
	    feedbackpanel5.add(star24);
	    
	    JLabel star25 = new JLabel("");
	    star25.setIcon(star);
	    star25.setBounds(366, 56, 47, 36);
	    feedbackpanel5.add(star25);
	    
	    JPanel feedbackpanel4 = new JPanel();
	    feedbackpanel4.setLayout(null);
	    feedbackpanel4.setOpaque(false);
	    feedbackpanel4.setBounds(35, 594, 982, 164);
	    scrollContent.add(feedbackpanel4);
	    
	    JLabel profile4lbl = new JLabel("");
	    profile4lbl.setIcon(profile4);
	    profile4lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel4.add(profile4lbl);
	    
	    JLabel profilename4lbl = new JLabel("Ann D Dequinab");
	    profilename4lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename4lbl.setBounds(135, 11, 131, 34);
	    feedbackpanel4.add(profilename4lbl);
	    
	    JPanel panel4 = new JPanel();
	    panel4.setLayout(null);
	    panel4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel4.setBounds(121, 100, 367, 53);
	    feedbackpanel4.add(panel4);
	    
	    JLabel feedbacktext4lbl = new JLabel("great service, easy to deal with.");
	    feedbacktext4lbl.setForeground(Color.BLACK);
	    feedbacktext4lbl.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktext4lbl.setBounds(10, 11, 316, 28);
	    panel4.add(feedbacktext4lbl);
	    
	    JLabel star20 = new JLabel("");
	    star20.setIcon(star);
	    star20.setBounds(364, 56, 47, 36);
	    feedbackpanel4.add(star20);
	    
	    JLabel star19 = new JLabel("");
	    star19.setIcon(star);
	    star19.setBounds(307, 56, 47, 36);
	    feedbackpanel4.add(star19);
	    
	    JLabel star18 = new JLabel("");
	    star18.setIcon(star);
	    star18.setBounds(250, 56, 47, 36);
	    feedbackpanel4.add(star18);
	    
	    JLabel star17 = new JLabel("");
	    star17.setIcon(star);
	    star17.setBounds(193, 56, 47, 36);
	    feedbackpanel4.add(star17);
	    
	    JLabel star16 = new JLabel("");
	    star16.setIcon(star);
	    star16.setBounds(133, 56, 47, 36);
	    feedbackpanel4.add(star16);
	    
	    JPanel feedbackpanel7 = new JPanel();
	    feedbackpanel7.setLayout(null);
	    feedbackpanel7.setOpaque(false);
	    feedbackpanel7.setBounds(35, 1258, 708, 220);
	    scrollContent.add(feedbackpanel7);
	    
	    JLabel profile8lbl = new JLabel("");
	    profile8lbl.setIcon(profile7);
	    profile8lbl.setVisible(false);
	    profile8lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel7.add(profile8lbl);
	    
	    JLabel profilename8lbl = new JLabel("Kidrauhl");
	    profilename8lbl.setVisible(false);
	    profilename8lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename8lbl.setBounds(135, 11, 214, 34);
	    feedbackpanel7.add(profilename8lbl);
	    
	    JPanel panel8 = new JPanel();
	    panel8.setLayout(null);
	    panel8.setVisible(false);
	    panel8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel8.setBounds(119, 115, 369, 94);
	    feedbackpanel7.add(panel8);
	    
	    feedbacktextlbl8 = new JLabel("");
	    feedbacktextlbl8.setForeground(Color.BLACK);
	    feedbacktextlbl8.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl8.setBounds(10, 11, 349, 28);
	    panel8.add(feedbacktextlbl8);
	    
	    feedbacktextlbl81 = new JLabel("");
	    feedbacktextlbl81.setForeground(Color.BLACK);
	    feedbacktextlbl81.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl81.setBounds(10, 50, 349, 28);
	    panel8.add(feedbacktextlbl81);
	    
	    stars1 = new JLabel("");
	    stars1.setIcon(star);
	    stars1.setVisible(false);
	    stars1.setBounds(130, 69, 47, 36);
	    feedbackpanel7.add(stars1);
	    
	    stars2 = new JLabel("");
	    stars2.setIcon(star);
	    stars2.setVisible(false);
	    stars2.setBounds(190, 69, 47, 36);
	    feedbackpanel7.add(stars2);
	    
	    stars3 = new JLabel("");
	    stars3.setIcon(star);
	    stars3.setVisible(false);
	    stars3.setBounds(247, 69, 47, 36);
	    feedbackpanel7.add(stars3);
	    
	    stars4 = new JLabel("");
	    stars4.setIcon(star);
	    stars4.setVisible(false);
	    stars4.setBounds(304, 69, 47, 36);
	    feedbackpanel7.add(stars4);
	    
	    stars5 = new JLabel("");
	    stars5.setIcon(star);
	    stars5.setVisible(false);
	    stars5.setBounds(361, 69, 47, 36);
	    feedbackpanel7.add(stars5);
	    
	    JPanel FeedbackPanel = new JPanel();
	    FeedbackPanel.setForeground(new Color(0, 244, 222));
	    FeedbackPanel.setBackground(new Color(255, 255, 255));
	    FeedbackPanel.setBounds(0, 1482, 663, 58);
	    scrollContent.add(FeedbackPanel);
	    FeedbackPanel.setLayout(null);
	    
	    texFeedbacktField = new JTextField();
	    texFeedbacktField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    texFeedbacktField.setForeground(new Color(0, 0, 0));
	    texFeedbacktField.setFont(new Font("Anton", Font.PLAIN, 20));
	    texFeedbacktField.setText("Enter Feedback");
	    texFeedbacktField.setBounds(0, 0, 588, 58);
	    texFeedbacktField.addFocusListener(new FocusAdapter() {
	        @Override
	        public void focusLost(FocusEvent e) {
	            if (texFeedbacktField.getText().equals("")) {
	                texFeedbacktField.setForeground(new Color(96, 96, 96));
	                texFeedbacktField.setText("Enter Feedback");
	            }
	        }

	        @Override
	        public void focusGained(FocusEvent e) {
	            if (texFeedbacktField.getText().equals("Enter Feedback")) {
	                texFeedbacktField.setForeground(Color.BLACK);
	                texFeedbacktField.setText("");
	            }
	        }
	    });
	    texFeedbacktField.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyTyped(KeyEvent e) {
	            char c = e.getKeyChar();
	            if (texFeedbacktField.getText().length() >= 37 && c != KeyEvent.VK_BACK_SPACE) {
	                e.consume();
	            }
	        }
	    });
	    FeedbackPanel.add(texFeedbacktField);
	    texFeedbacktField.setColumns(37);
	    
	    JPanel feedbackbuttonpanel = new JPanel();
	    feedbackbuttonpanel.setBackground(new Color(255, 255, 255));
	    feedbackbuttonpanel.setBounds(588, 0, 75, 58);
	    FeedbackPanel.add(feedbackbuttonpanel);
	    feedbackbuttonpanel.setLayout(null);
	    
	    JLabel arrowsend = new JLabel("");
	    arrowsend.setIcon(mess);
	    arrowsend.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		arrowsend.setBackground(new Color(0, 244, 222));
	    		String send = texFeedbacktField.getText();

	            if (isFirstClick) {
	                feedbacktextlbl8.setText(send);
	                isFirstClick = false;
	                panel8.setVisible(true);
	                profilename8lbl.setVisible(true);
	                profile8lbl.setVisible(true);
	                
	            } else {
	                feedbacktextlbl81.setText(send);
	                isFirstClick = true;
	            }
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		arrowsend.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		arrowsend.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		arrowsend.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    arrowsend.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    arrowsend.setBounds(0, 0, 75, 58);
	    feedbackbuttonpanel.add(arrowsend);

	    
	   
	    
	    JPanel starsendpanel = new JPanel();	    
	    starsendpanel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		starsendpanel.setBackground(new Color(0, 244, 222));
	    		
	    		stars1.setVisible(true);
	    		stars2.setVisible(false);
	    		stars3.setVisible(false);
	    		stars4.setVisible(false);
	    		stars5.setVisible(false);
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		starsendpanel.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		starsendpanel.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		starsendpanel.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    starsendpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    starsendpanel.setForeground(new Color(0, 244, 222));
	    starsendpanel.setBackground(new Color(255, 255, 255));
	    starsendpanel.setBounds(662, 1482, 75, 58);
	    scrollContent.add(starsendpanel);
	    starsendpanel.setLayout(null);
	    
	    JLabel blank1 = new JLabel("");
	    blank1.setIcon(starss1);
	    blank1.setBounds(10, 11, 55, 36);
	    starsendpanel.add(blank1);
	    
	    JPanel starsend2panel = new JPanel();
	    starsend2panel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		starsend2panel.setBackground(new Color(0, 244, 222));
	    		
	    		stars1.setVisible(true);
	    		stars2.setVisible(true);
	    		stars3.setVisible(false);
	    		stars4.setVisible(false);
	    		stars5.setVisible(false);
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		starsend2panel.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		starsend2panel.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		starsend2panel.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    starsend2panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    starsend2panel.setForeground(new Color(0, 244, 222));
	    starsend2panel.setBackground(new Color(255, 255, 255));
	    starsend2panel.setBounds(737, 1482, 75, 58);
	    scrollContent.add(starsend2panel);
	    starsend2panel.setLayout(null);
	    
	    JLabel blank2 = new JLabel("");
	    blank2.setIcon(starss2);
	    blank2.setBounds(10, 11, 55, 36);
	    starsend2panel.add(blank2);
	    
	    JPanel starsend3panel = new JPanel();
	    starsend3panel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		starsend3panel.setBackground(new Color(0, 244, 222));
	    		
	    		stars1.setVisible(true);
	    		stars2.setVisible(true);
	    		stars3.setVisible(true);
	    		stars4.setVisible(false);
	    		stars5.setVisible(false);
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		starsend3panel.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		starsend3panel.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		starsend3panel.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    starsend3panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    starsend3panel.setForeground(new Color(0, 244, 222));
	    starsend3panel.setBackground(new Color(255, 255, 255));
	    starsend3panel.setBounds(812, 1482, 75, 58);
	    scrollContent.add(starsend3panel);
	    starsend3panel.setLayout(null);
	    
	    JLabel blank3 = new JLabel("");
	    blank3.setIcon(starss3);
	    blank3.setBounds(10, 11, 55, 36);
	    starsend3panel.add(blank3);
	    
	    JPanel starsend4panel = new JPanel();
	    starsend4panel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		starsend4panel.setBackground(new Color(0, 244, 222));
	    		stars1.setVisible(true);
	    		stars2.setVisible(true);
	    		stars3.setVisible(true);
	    		stars4.setVisible(true);
	    		stars5.setVisible(false);
	    		
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		starsend4panel.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		starsend4panel.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		starsend4panel.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    starsend4panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    starsend4panel.setForeground(new Color(0, 244, 222));
	    starsend4panel.setBackground(new Color(255, 255, 255));
	    starsend4panel.setBounds(887, 1482, 75, 58);
	    scrollContent.add(starsend4panel);
	    starsend4panel.setLayout(null);
	    
	    JLabel blan4 = new JLabel("");
	    blan4.setIcon(starss4);
	    blan4.setBounds(10, 11, 55, 36);
	    starsend4panel.add(blan4);
	    
	    JPanel starsend5panel = new JPanel();
	    starsend5panel.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		starsend5panel.setBackground(new Color(0, 244, 222));
	    		
	    		stars1.setVisible(true);
	    		stars2.setVisible(true);
	    		stars3.setVisible(true);
	    		stars4.setVisible(true);
	    		stars5.setVisible(true);
	    	}
	    	@Override
	    	public void mouseEntered(MouseEvent e) {
	    		starsend5panel.setBackground(new Color(0, 244, 222));
	    	}
	    	@Override
	    	public void mouseExited(MouseEvent e) {
	    		starsend5panel.setBackground(new Color(255, 255, 255));
	    	}
	    	@Override
	    	public void mouseReleased(MouseEvent e) {
	    		starsend5panel.setBackground(new Color(255, 255, 255));
	    	}
	    });
	    starsend5panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 244, 222)));
	    starsend5panel.setForeground(new Color(0, 244, 222));
	    starsend5panel.setBackground(new Color(255, 255, 255));
	    starsend5panel.setBounds(963, 1482, 75, 58);
	    scrollContent.add(starsend5panel);
	    starsend5panel.setLayout(null);
	    
	    JLabel blank5 = new JLabel("");
	    blank5.setIcon(starss5);
	    blank5.setBounds(10, 11, 55, 36);
	    starsend5panel.add(blank5);
	    

	    
	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
		
		
	}
}
