package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.border.MatteBorder;

public class GalleryPanel extends JPanel {
	
	private ImageIcon heart = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\heart (1).png")
					.getImage().getScaledInstance(46, 32, Image.SCALE_DEFAULT));
	private ImageIcon message = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\comments.png")
					.getImage().getScaledInstance(46, 32, Image.SCALE_DEFAULT));
	private ImageIcon share = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\share.png")
					.getImage().getScaledInstance(46, 32, Image.SCALE_DEFAULT));

	//=========== standard pic====================
	private ImageIcon pic1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\june1.jpg")
					.getImage().getScaledInstance(319, 207, Image.SCALE_DEFAULT));
	private ImageIcon pic2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\june2.jpg")
					.getImage().getScaledInstance(213, 115, Image.SCALE_DEFAULT));
	private ImageIcon pic3 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\june3.jpg")
					.getImage().getScaledInstance(213, 94, Image.SCALE_DEFAULT));
	private ImageIcon pic4 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\june5.jpg")
					.getImage().getScaledInstance(213, 115, Image.SCALE_DEFAULT));
	private ImageIcon pic5 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\june5.jpg")
					.getImage().getScaledInstance(213, 94, Image.SCALE_DEFAULT));
	
	//=========== polaroid pic====================
		private ImageIcon pic6 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\july1.jpg")
						.getImage().getScaledInstance(319, 207, Image.SCALE_DEFAULT));
		private ImageIcon pic7 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\july2.jpg")
						.getImage().getScaledInstance(213, 115, Image.SCALE_DEFAULT));
		private ImageIcon pic8 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\july3.jpg")
						.getImage().getScaledInstance(213, 94, Image.SCALE_DEFAULT));
		private ImageIcon pic9 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\july4.jpg")
						.getImage().getScaledInstance(213, 115, Image.SCALE_DEFAULT));
		private ImageIcon pic10 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\july5.jpg")
						.getImage().getScaledInstance(213, 94, Image.SCALE_DEFAULT));
		
		//============ Twin Strip pic =============
				private ImageIcon pic11 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\may1.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic12 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\may2.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic13 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\may3.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic14 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\may4.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));

				//============ Twin Strip pic =============
				private ImageIcon pic15 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\april1.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic16 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\april2.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic17 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\april3.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
				private ImageIcon pic18 = new ImageIcon(
						new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\april4.jpg")
								.getImage().getScaledInstance(178, 207, Image.SCALE_DEFAULT));
	/**
	 * Create the panel.
	 */
	public GalleryPanel() { 
		setBackground(new Color(255, 255, 255));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		JLabel backgroundlbl = new JLabel("");
	    backgroundlbl.setEnabled(false);
	    backgroundlbl.setBackground(new Color(102, 244, 222));
	    backgroundlbl.setBounds(0, 0, 1280, 607);
	    add(backgroundlbl);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(0, 0, 1280, 607);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    backgroundlbl.add(scrollPane);

	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setPreferredSize(new Dimension(1271, 1140)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    scrollContent.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Photo Gallery");
	    lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 80));
	    lblNewLabel.setBounds(10, 11, 473, 82);
	    scrollContent.add(lblNewLabel);
	    	    
	    JPanel standardPanel = new JPanel();
	    standardPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
	    standardPanel.setBackground(new Color(255, 255, 255));
	    standardPanel.setBounds(10, 118, 1251, 248);
	    scrollContent.add(standardPanel);
	    standardPanel.setLayout(null);
	    
	    JLabel standardpic1 = new JLabel("");
	    standardpic1.setIcon(pic1);
	    standardpic1.setBounds(227, 30, 319, 207);
	    standardPanel.add(standardpic1);
	    
	    JLabel standardpic2 = new JLabel("");
	    standardpic2.setIcon(pic2);
	    standardpic2.setBounds(20, 30, 213, 115);
	    standardPanel.add(standardpic2);
	    
	    JLabel standardpic3 = new JLabel("");
	    standardpic3.setIcon(pic3);
	    standardpic3.setBounds(20, 143, 213, 94);
	    standardPanel.add(standardpic3);
	    
	    JLabel standardpic4 = new JLabel("");
	    standardpic4.setIcon(pic4);
	    standardpic4.setBounds(538, 30, 213, 115);
	    standardPanel.add(standardpic4);
	    
	    JLabel standardpic5 = new JLabel("");
	    standardpic5.setIcon(pic5);
	    standardpic5.setBounds(538, 143, 213, 94);
	    standardPanel.add(standardpic5);
	    
	    JLabel lblNewLabel_2 = new JLabel("City turns 1! | June 1, 2023");
	    lblNewLabel_2.setForeground(new Color(255, 0, 255));
	    lblNewLabel_2.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2.setBounds(857, 30, 294, 33);
	    standardPanel.add(lblNewLabel_2);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Puregold - Jollibee Pritil");
	    lblNewLabel_2_1.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1.setBounds(857, 73, 279, 33);
	    standardPanel.add(lblNewLabel_2_1);
	    
	    JLabel lblNewLabel_2_1_1 = new JLabel("Standard 4r");
	    lblNewLabel_2_1_1.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1_1.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1_1.setBounds(855, 161, 140, 33);
	    standardPanel.add(lblNewLabel_2_1_1);
	    
	    JLabel lblNewLabel_2_1_2 = new JLabel("Keziah Felicity\r\n");
	    lblNewLabel_2_1_2.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1_2.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1_2.setBounds(857, 117, 178, 33);
	    standardPanel.add(lblNewLabel_2_1_2);
	    
	    JLabel heartIcon = new JLabel("");
	    heartIcon.setIcon(heart);
	    heartIcon.setBounds(857, 205, 46, 32);
	    standardPanel.add(heartIcon);
	    
	    JLabel messageIcon = new JLabel("");
	    messageIcon.setIcon(message);
	    messageIcon.setBounds(929, 205, 46, 32);
	    standardPanel.add(messageIcon);
	    
	    JLabel shareIcon = new JLabel("");
	    shareIcon.setIcon(share);
	    shareIcon.setBounds(1002, 205, 46, 32);
	    standardPanel.add(shareIcon);
	    
	    JPanel polaroidPanel = new JPanel();
	    polaroidPanel.setLayout(null);
	    polaroidPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
	    polaroidPanel.setBackground(Color.WHITE);
	    polaroidPanel.setBounds(10, 382, 1251, 248);
	    scrollContent.add(polaroidPanel);
	    
	    JLabel polaroidpic1 = new JLabel("");
	    polaroidpic1.setIcon(pic6);
	    polaroidpic1.setBounds(227, 30, 319, 207);
	    polaroidPanel.add(polaroidpic1);
	    
	    JLabel polaroidpic2 = new JLabel("");
	    polaroidpic2.setIcon(pic7);
	    polaroidpic2.setBounds(20, 30, 213, 115);
	    polaroidPanel.add(polaroidpic2);
	    
	    JLabel polaroidpic3 = new JLabel("");
	    polaroidpic3.setIcon(pic8);
	    polaroidpic3.setBounds(20, 143, 213, 94);
	    polaroidPanel.add(polaroidpic3);
	    
	    JLabel polaroidpic4 = new JLabel("");
	    polaroidpic4.setIcon(pic9);
	    polaroidpic4.setBounds(538, 30, 213, 115);
	    polaroidPanel.add(polaroidpic4);
	    
	    JLabel polaroidpic5 = new JLabel("");
	    polaroidpic5.setIcon(pic10);
	    polaroidpic5.setBounds(538, 143, 213, 94);
	    polaroidPanel.add(polaroidpic5);
	    
	    JLabel lblNewLabel_2_2 = new JLabel("Angel turns 25! | July 21, 2018");
	    lblNewLabel_2_2.setForeground(Color.MAGENTA);
	    lblNewLabel_2_2.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_2.setBounds(857, 30, 294, 33);
	    polaroidPanel.add(lblNewLabel_2_2);
	    
	    JLabel lblNewLabel_2_1_3 = new JLabel("Makati City, Romulo");
	    lblNewLabel_2_1_3.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1_3.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1_3.setBounds(857, 73, 279, 33);
	    polaroidPanel.add(lblNewLabel_2_1_3);
	    
	    JLabel lblNewLabel_2_1_1_1 = new JLabel("Polaroid\r\n");
	    lblNewLabel_2_1_1_1.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1_1_1.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1_1_1.setBounds(855, 161, 140, 33);
	    polaroidPanel.add(lblNewLabel_2_1_1_1);
	    
	    JLabel lblNewLabel_2_1_2_1 = new JLabel("Angel");
	    lblNewLabel_2_1_2_1.setForeground(Color.MAGENTA);
	    lblNewLabel_2_1_2_1.setFont(new Font("Anton", Font.PLAIN, 27));
	    lblNewLabel_2_1_2_1.setBounds(857, 117, 178, 33);
	    polaroidPanel.add(lblNewLabel_2_1_2_1);
	    
	    JLabel heartIcon_1 = new JLabel("");
	    heartIcon_1.setIcon(heart);
	    heartIcon_1.setBounds(857, 205, 46, 32);
	    polaroidPanel.add(heartIcon_1);
	    
	    JLabel messageIcon_1 = new JLabel("");
	    messageIcon_1.setIcon(message);
	    messageIcon_1.setBounds(929, 205, 46, 32);
	    polaroidPanel.add(messageIcon_1);
	    
	    JLabel shareIcon_1 = new JLabel("");
	    shareIcon_1.setIcon(share);
	    shareIcon_1.setBounds(1002, 205, 46, 32);
	    polaroidPanel.add(shareIcon_1);
	    
	    JPanel twinstrippanel = new JPanel();
	    twinstrippanel.setLayout(null);
	    twinstrippanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
	    twinstrippanel.setBackground(Color.WHITE);
	    twinstrippanel.setBounds(10, 635, 1251, 248);
	    scrollContent.add(twinstrippanel);
	    
	    JLabel twinstrippic1 = new JLabel("");
	    twinstrippic1.setIcon(pic11);
	    twinstrippic1.setBounds(32, 30, 178, 207);
	    twinstrippanel.add(twinstrippic1);
	    
	    JLabel text9 = new JLabel("Mykaela Nicole at 18! | Apr. 15, 2023");
	    text9.setForeground(Color.MAGENTA);
	    text9.setFont(new Font("Anton", Font.PLAIN, 27));
	    text9.setBounds(857, 30, 384, 33);
	    twinstrippanel.add(text9);
	    
	    JLabel text7 = new JLabel("Nikkei Rockwell\r\n");
	    text7.setForeground(Color.MAGENTA);
	    text7.setFont(new Font("Anton", Font.PLAIN, 27));
	    text7.setBounds(857, 73, 279, 33);
	    twinstrippanel.add(text7);
	    
	    JLabel text5 = new JLabel("Twin Strip");
	    text5.setForeground(Color.MAGENTA);
	    text5.setFont(new Font("Anton", Font.PLAIN, 27));
	    text5.setBounds(855, 161, 140, 33);
	    twinstrippanel.add(text5);
	    
	    JLabel text6 = new JLabel("Mykaela Nicole");
	    text6.setForeground(Color.MAGENTA);
	    text6.setFont(new Font("Anton", Font.PLAIN, 27));
	    text6.setBounds(857, 117, 178, 33);
	    twinstrippanel.add(text6);
	    
	    JLabel heartIcon3 = new JLabel("");
	    heartIcon3.setIcon(heart);
	    heartIcon3.setBounds(857, 205, 46, 32);
	    twinstrippanel.add(heartIcon3);
	    
	    JLabel messageIcon3 = new JLabel("");
	    messageIcon3.setIcon(message);
	    messageIcon3.setBounds(929, 205, 46, 32);
	    twinstrippanel.add(messageIcon3);
	    
	    JLabel shareIcon3 = new JLabel("");
	    shareIcon3.setIcon(share);
	    shareIcon3.setBounds(1002, 205, 46, 32);
	    twinstrippanel.add(shareIcon3);
	    
	    JLabel twinstrippic2 = new JLabel("");
	    twinstrippic2.setIcon(pic12);
	    twinstrippic2.setBounds(211, 30, 178, 207);
	    twinstrippanel.add(twinstrippic2);
	    
	    JLabel twinstrippic3 = new JLabel("");
	    twinstrippic3.setIcon(pic13);
	    twinstrippic3.setBounds(390, 30, 178, 207);
	    twinstrippanel.add(twinstrippic3);
	    
	    JLabel twinstrippic4 = new JLabel("");
	    twinstrippic4.setIcon(pic14);
	    twinstrippic4.setBounds(568, 30, 178, 207);
	    twinstrippanel.add(twinstrippic4);
	    
	    JPanel dedicationPanel = new JPanel();
	    dedicationPanel.setLayout(null);
	    dedicationPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(105, 244, 222)));
	    dedicationPanel.setBackground(Color.WHITE);
	    dedicationPanel.setBounds(10, 890, 1251, 248);
	    scrollContent.add(dedicationPanel);
	    
	    JLabel dedicationpic1 = new JLabel("");
	    dedicationpic1.setIcon(pic15);
	    dedicationpic1.setBounds(32, 30, 178, 207);
	    dedicationPanel.add(dedicationpic1);
	    
	    JLabel text1 = new JLabel("Nylyn & Nicka | Apr. 22, 2023");
	    text1.setForeground(Color.MAGENTA);
	    text1.setFont(new Font("Anton", Font.PLAIN, 27));
	    text1.setBounds(857, 30, 384, 33);
	    dedicationPanel.add(text1);
	    
	    JLabel text2 = new JLabel("DNC Kusina Resturant");
	    text2.setForeground(Color.MAGENTA);
	    text2.setFont(new Font("Anton", Font.PLAIN, 27));
	    text2.setBounds(857, 73, 279, 33);
	    dedicationPanel.add(text2);
	    
	    JLabel text4 = new JLabel("Dedication");
	    text4.setForeground(Color.MAGENTA);
	    text4.setFont(new Font("Anton", Font.PLAIN, 27));
	    text4.setBounds(855, 161, 140, 33);
	    dedicationPanel.add(text4);
	    
	    JLabel text3 = new JLabel("Nylyn & Nicka");
	    text3.setForeground(Color.MAGENTA);
	    text3.setFont(new Font("Anton", Font.PLAIN, 27));
	    text3.setBounds(857, 117, 178, 33);
	    dedicationPanel.add(text3);
	    
	    JLabel heartIcon4 = new JLabel("");
	    heartIcon4.setIcon(heart);
	    heartIcon4.setBounds(857, 205, 46, 32);
	    dedicationPanel.add(heartIcon4);
	    
	    JLabel messageIcon4 = new JLabel("");
	    messageIcon4.setIcon(message);
	    messageIcon4.setBounds(929, 205, 46, 32);
	    dedicationPanel.add(messageIcon4);
	    
	    JLabel shareIcon4 = new JLabel("");
	    shareIcon4.setIcon(share);
	    shareIcon4.setBounds(1002, 205, 46, 32);
	    dedicationPanel.add(shareIcon4);
	    
	    JLabel dedicationpic2 = new JLabel("");
	    dedicationpic2.setIcon(pic16);
	    dedicationpic2.setBounds(211, 30, 178, 207);
	    dedicationPanel.add(dedicationpic2);
	    
	    JLabel dedicationpic3 = new JLabel("");
	    dedicationpic3.setIcon(pic17);
	    dedicationpic3.setBounds(390, 30, 178, 207);
	    dedicationPanel.add(dedicationpic3);
	    
	    JLabel dedicationpic4 = new JLabel("");
	    dedicationpic4.setIcon(pic18);
	    dedicationpic4.setBounds(568, 30, 178, 207);
	    dedicationPanel.add(dedicationpic4);

	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
		
	}
}
