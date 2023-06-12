package Dashboard;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.MatteBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class PanelProduct extends JPanel {
	// ============== image for package
	private ImageIcon pic4r = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\21.jpg")
					.getImage().getScaledInstance(266, 145, Image.SCALE_DEFAULT));
	private ImageIcon picpolaroid = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\polaroid 2.png")
					.getImage().getScaledInstance(266, 145, Image.SCALE_DEFAULT));
	private ImageIcon pictwin = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\twin strip - 6.png")
					.getImage().getScaledInstance(266, 257, Image.SCALE_DEFAULT));
	private ImageIcon pictdedi = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\dedication - 10.jpg")
					.getImage().getScaledInstance(266, 257, Image.SCALE_DEFAULT));
	
	///=============== image for product =================
	private ImageIcon photo = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\photopaper.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon standee = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\4rstandee.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon twinstandee = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\twinpaper.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon magnet = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\magnetics.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon shoutout = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\shoutsout.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon ink = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\ink.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	private ImageIcon headdress = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\headdress.jpg")
					.getImage().getScaledInstance(174, 71, Image.SCALE_DEFAULT));
	
	//=================== image checked============
	private ImageIcon checked = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\checked.png")
					.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
	private ImageIcon addIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\ProductImage\\add (1).png")
					.getImage().getScaledInstance(53, 39, Image.SCALE_DEFAULT));
	

	/**
	 * Create the panel.
	 */
	public PanelProduct() {
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
	    scrollContent.setPreferredSize(new Dimension(1001, 1490)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    scrollContent.setLayout(null);
	    	    
	    // === package =====
	    JPanel standardpanel = new JPanel();
	    standardpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    standardpanel.setBackground(new Color(255, 255, 255));
	    standardpanel.setBounds(105, 71, 355, 244);
	    scrollContent.add(standardpanel);	 
	    standardpanel.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("4R");
	    lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 25));
	    lblNewLabel.setBounds(140, 9, 32, 30);
	    standardpanel.add(lblNewLabel);
	    
	    JLabel standardlbl = new JLabel("");
	    standardlbl.setIcon(pic4r);
	    standardlbl.setBounds(42, 50, 266, 145);
	    standardpanel.add(standardlbl);
	    
	    JPanel polaroidpanel = new JPanel();
	    polaroidpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    polaroidpanel.setBackground(new Color(255, 255, 255));
	    polaroidpanel.setBounds(496, 71, 355, 244);
	    scrollContent.add(polaroidpanel);
	    polaroidpanel.setLayout(null);
	    
	    JLabel lblPolaroid = new JLabel("Polaroid");
	    lblPolaroid.setFont(new Font("Anton", Font.PLAIN, 25));
	    lblPolaroid.setBounds(131, 7, 93, 30);
	    polaroidpanel.add(lblPolaroid);
	    
	    JLabel polaroid = new JLabel("");
	    polaroid.setIcon(picpolaroid);
	    polaroid.setBounds(44, 42, 266, 145);
	    polaroidpanel.add(polaroid);
	    
	    JPanel twinstrippanel = new JPanel();
	    twinstrippanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    twinstrippanel.setBackground(Color.WHITE);
	    twinstrippanel.setBounds(105, 326, 355, 335);
	    scrollContent.add(twinstrippanel);
	    twinstrippanel.setLayout(null);
	    
	    JLabel lblNewLabel_2 = new JLabel("Twin Strip");
	    lblNewLabel_2.setFont(new Font("Anton", Font.PLAIN, 25));
	    lblNewLabel_2.setBounds(121, 7, 112, 30);
	    twinstrippanel.add(lblNewLabel_2);
	    
	    JLabel twinstriplbl = new JLabel("");
	    twinstriplbl.setIcon(pictwin);
	    twinstriplbl.setBounds(44, 42, 266, 257);
	    twinstrippanel.add(twinstriplbl);
	    
	    JPanel dedicationpanel = new JPanel();
	    dedicationpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    dedicationpanel.setBackground(Color.WHITE);
	    dedicationpanel.setBounds(496, 326, 355, 335);
	    scrollContent.add(dedicationpanel);
	    dedicationpanel.setLayout(null);
	    
	    JLabel dedicationlbl = new JLabel("");
	    dedicationlbl.setIcon(pictdedi);
	    dedicationlbl.setBounds(36, 48, 266, 257);
	    dedicationpanel.add(dedicationlbl);
	    
	    JLabel lblPolaroid_1 = new JLabel("Dedication");
	    lblPolaroid_1.setFont(new Font("Anton", Font.PLAIN, 25));
	    lblPolaroid_1.setBounds(130, 7, 120, 30);
	    dedicationpanel.add(lblPolaroid_1);
	    // === package end here ====
	    
	    // === product ====
	    JLabel lblProduct = new JLabel("Product");
	    lblProduct.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    lblProduct.setBounds(10, 690, 278, 63);
	    scrollContent.add(lblProduct);
	    
	    JPanel productPanel = new JPanel();
	    productPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel.setBackground(new Color(255, 255, 255));
	    productPanel.setBounds(82, 780, 958, 93);
	    scrollContent.add(productPanel);
	    productPanel.setLayout(null);
	    
	    JLabel photolbl = new JLabel("");
	    photolbl.setIcon(photo);
	    photolbl.setVisible(false);
	    photolbl.setBounds(10, 11, 174, 71);
	    productPanel.add(photolbl);
	    
	    JLabel phototextlbl = new JLabel("Photo Paper");
	    phototextlbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl.setBounds(375, 32, 163, 47);
	    productPanel.add(phototextlbl);
	    
	    JLabel available1lbl = new JLabel("Available");
	    available1lbl.setIcon(checked);
	    available1lbl.setVisible(false);
	    available1lbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl.setBounds(735, 32, 97, 47);
	    productPanel.add(available1lbl);
	    
	    JPanel add1panel = new JPanel();
	    add1panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl.setIcon(photo); // display plhoto
	                photolbl.setVisible(true);// photolbl display
	                available1lbl.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add1panel.setBackground(new Color(255, 255, 255));
	    add1panel.setBounds(895, 32, 53, 39);
	    productPanel.add(add1panel);
	    add1panel.setLayout(null);


	    
	    JLabel addIconlbl = new JLabel("");
	    addIconlbl.setIcon(addIcon);
	    addIconlbl.setBounds(0, 0, 53, 39);
	    add1panel.add(addIconlbl);
	    
	    JPanel productPanel2 = new JPanel();
	    productPanel2.setLayout(null);
	    productPanel2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel2.setBackground(Color.WHITE);
	    productPanel2.setBounds(82, 882, 958, 93);
	    scrollContent.add(productPanel2);
	    
	    JLabel photolbl_1 = new JLabel("");
	    photolbl_1.setIcon(standee);
	    photolbl_1.setVisible(false);
	    photolbl_1.setBounds(10, 11, 174, 71);
	    productPanel2.add(photolbl_1);
	    
	    JLabel lblStandee = new JLabel("Standee\r\n");
	    lblStandee.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    lblStandee.setBounds(377, 35, 163, 47);
	    productPanel2.add(lblStandee);
	    
	    JLabel available1lbl_1 = new JLabel("Available");
	    available1lbl_1.setIcon(checked);
	    available1lbl_1.setVisible(false);
	    available1lbl_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_1.setBounds(734, 35, 97, 47);
	    productPanel2.add(available1lbl_1);
	    
	    JPanel add2panel = new JPanel();
	    add2panel.setLayout(null);
	    add2panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl_1.setIcon(standee); // display plhoto
	                photolbl_1.setVisible(true);// photolbl display
	                available1lbl_1.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add2panel.setBackground(Color.WHITE);
	    add2panel.setBounds(895, 35, 53, 39);
	    productPanel2.add(add2panel);
	    
	    JLabel addIconlbl2 = new JLabel("");
	    addIconlbl2.setIcon(addIcon);
	    addIconlbl2.setBounds(0, 0, 53, 39);
	    add2panel.add(addIconlbl2);
	    
	    JPanel productPanel3 = new JPanel();
	    productPanel3.setLayout(null);
	    productPanel3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel3.setBackground(Color.WHITE);
	    productPanel3.setBounds(82, 984, 958, 93);
	    scrollContent.add(productPanel3);
	    
	    JLabel photolbl_2 = new JLabel("");
	    photolbl_2.setIcon(twinstandee);
	    photolbl_2.setVisible(false);
	    photolbl_2.setBounds(10, 11, 174, 71);
	    productPanel3.add(photolbl_2);
	    
	    JLabel phototextlbl_2 = new JLabel("Twin Standee");
	    phototextlbl_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_2.setBounds(377, 35, 163, 47);
	    productPanel3.add(phototextlbl_2);
	    
	    JLabel available1lbl_2 = new JLabel("Available");
	    available1lbl_2.setIcon(checked);
	    available1lbl_2.setVisible(false);
	    available1lbl_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl_2.setBounds(734, 35, 97, 47);
	    productPanel3.add(available1lbl_2);
	    
	    JPanel add4panel = new JPanel();
	    add4panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl_2.setIcon(twinstandee); // display plhoto
	                photolbl_2.setVisible(true);// photolbl display
	                available1lbl_2.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add4panel.setLayout(null);
	    add4panel.setBackground(Color.WHITE);
	    add4panel.setBounds(895, 29, 53, 39);
	    productPanel3.add(add4panel);
	    
	    JLabel addIconlbl3 = new JLabel("");
	    addIconlbl3.setIcon(addIcon);
	    addIconlbl3.setBounds(0, 0, 53, 39);
	    add4panel.add(addIconlbl3);
	    
	    JPanel productPanel4 = new JPanel();
	    productPanel4.setLayout(null);
	    productPanel4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel4.setBackground(Color.WHITE);
	    productPanel4.setBounds(82, 1086, 958, 93);
	    scrollContent.add(productPanel4);
	    
	    JLabel photolbl4 = new JLabel("");
	    photolbl4.setIcon(magnet);
	    photolbl4.setVisible(false);
	    photolbl4.setBounds(10, 11, 174, 71);
	    productPanel4.add(photolbl4);
	    
	    JLabel phototextlbl4 = new JLabel("Magnet");
	    phototextlbl4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl4.setBounds(377, 35, 163, 47);
	    productPanel4.add(phototextlbl4);
	    
	    JLabel available1lbl4 = new JLabel("Available");
	    available1lbl4.setIcon(checked);
	    available1lbl4.setVisible(false);
	    available1lbl4.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl4.setBounds(734, 35, 97, 47);
	    productPanel4.add(available1lbl4);
	    
	    JPanel add5panel = new JPanel();
	    add5panel.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl4.setIcon(magnet); // display plhoto
	                photolbl4.setVisible(true);// photolbl display
	                available1lbl4.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add5panel.setLayout(null);
	    add5panel.setBackground(Color.WHITE);
	    add5panel.setBounds(895, 30, 53, 39);
	    productPanel4.add(add5panel);
	    
	    JLabel addIconlbl5 = new JLabel("");
	    addIconlbl5.setIcon(addIcon);
	    addIconlbl5.setBounds(0, 0, 53, 39);
	    add5panel.add(addIconlbl5);
	    
	    JPanel productPanel7 = new JPanel();
	    productPanel7.setLayout(null);
	    productPanel7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel7.setBackground(Color.WHITE);
	    productPanel7.setBounds(82, 1290, 958, 93);
	    scrollContent.add(productPanel7);
	    
	    JLabel photolbl7 = new JLabel("");
	    photolbl7.setIcon(shoutout);
	    photolbl7.setVisible(false);
	    photolbl7.setBounds(10, 11, 174, 71);
	    productPanel7.add(photolbl7);
	    
	    JLabel phototextlbl7 = new JLabel("Shoutsout");
	    phototextlbl7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl7.setBounds(368, 32, 163, 47);
	    productPanel7.add(phototextlbl7);
	    
	    JLabel available1lbl7 = new JLabel("Available");
	    available1lbl7.setIcon(checked);
	    available1lbl7.setVisible(false);
	    available1lbl7.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl7.setBounds(741, 32, 97, 47);
	    productPanel7.add(available1lbl7);
	    
	    JPanel add7panels = new JPanel();
	    add7panels.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl7.setIcon(shoutout); // display plhoto
	                photolbl7.setVisible(true);// photolbl display
	                available1lbl7.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add7panels.setLayout(null);
	    add7panels.setBackground(Color.WHITE);
	    add7panels.setBounds(895, 32, 53, 39);
	    productPanel7.add(add7panels);
	    
	    JLabel addIconlbl7s = new JLabel("");
	    addIconlbl7s.setIcon(addIcon);
	    addIconlbl7s.setBounds(0, 0, 53, 39);
	    add7panels.add(addIconlbl7s);
	    
	    JPanel productPanel6 = new JPanel();
	    productPanel6.setLayout(null);
	    productPanel6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel6.setBackground(Color.WHITE);
	    productPanel6.setBounds(82, 1188, 958, 93);
	    scrollContent.add(productPanel6);
	    
	    JLabel photolbl5icons = new JLabel("");
	    photolbl5icons.setIcon(ink);
	    photolbl5icons.setVisible(false);
	    photolbl5icons.setBounds(10, 11, 174, 71);
	    productPanel6.add(photolbl5icons);
	    
	    JLabel phototextlbl_3_2 = new JLabel("INK");
	    phototextlbl_3_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3_2.setBounds(377, 35, 163, 47);
	    productPanel6.add(phototextlbl_3_2);
	    
	    JLabel available1lbl5s = new JLabel("Available");
	    available1lbl5s.setVisible(false);
	    available1lbl5s.setIcon(checked);
	    available1lbl5s.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl5s.setBounds(734, 35, 97, 47);
	    productPanel6.add(available1lbl5s);
	    
	    JPanel add5panels = new JPanel();
	    add5panels.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl5icons.setIcon(ink); // display plhoto
	                photolbl5icons.setVisible(true);// photolbl display
	                available1lbl5s.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add5panels.setLayout(null);
	    add5panels.setBackground(Color.WHITE);
	    add5panels.setBounds(895, 35, 53, 39);
	    productPanel6.add(add5panels);
	    
	    JLabel addIconlbl7 = new JLabel("");
	    addIconlbl7.setIcon(addIcon);
	    addIconlbl7.setBounds(0, 0, 53, 39);
	    add5panels.add(addIconlbl7);
	    
	    JPanel productPanel4_3 = new JPanel();
	    productPanel4_3.setLayout(null);
	    productPanel4_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    productPanel4_3.setBackground(Color.WHITE);
	    productPanel4_3.setBounds(82, 1392, 958, 93);
	    scrollContent.add(productPanel4_3);
	    
	    JLabel photolbl43 = new JLabel("");
	    photolbl43.setIcon(headdress);
	    photolbl43.setVisible(false);
	    photolbl43.setBounds(10, 11, 174, 71);
	    productPanel4_3.add(photolbl43);
	    
	    JLabel phototextlbl_3_3 = new JLabel("HeadDress");
	    phototextlbl_3_3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
	    phototextlbl_3_3.setBounds(372, 32, 163, 47);
	    productPanel4_3.add(phototextlbl_3_3);
	    
	    JLabel available1lbl43 = new JLabel("Available");
	    available1lbl43.setIcon(checked);
	    available1lbl43.setVisible(false);
	    available1lbl43.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
	    available1lbl43.setBounds(734, 35, 97, 47);
	    productPanel4_3.add(available1lbl43);
	    
	    JPanel add43panels = new JPanel();
	    add43panels.setLayout(null);
	    add43panels.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));

	            JFileChooser fileChooser = new JFileChooser();
	            int returnValue = fileChooser.showOpenDialog(null);
	            if (returnValue == JFileChooser.APPROVE_OPTION) {
	                File selectedFile = fileChooser.getSelectedFile();

	                // Display the selected file in showStandardPictureLbl
	                ImageIcon imageIcon = new ImageIcon(
	                        new ImageIcon(selectedFile.getAbsolutePath())
	                                .getImage()
	                                .getScaledInstance(174, 71, Image.SCALE_DEFAULT)
	                );
	                photolbl43.setIcon(headdress); // display plhoto
	                photolbl43.setVisible(true);// photolbl display
	                available1lbl43.setVisible(true); // available lbl display
	            }
	        }

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            setBackground(new Color(0, 244, 222));
	        }

	        @Override
	        public void mouseExited(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }

	        @Override
	        public void mouseReleased(MouseEvent e) {
	            setBackground(new Color(255, 255, 255));
	        }
	    });
	    add43panels.setBackground(Color.WHITE);
	    add43panels.setBounds(895, 32, 53, 39);
	    productPanel4_3.add(add43panels);
	    
	    JLabel addIconlbl43 = new JLabel("");
	    addIconlbl43.setIcon(addIcon);
	    addIconlbl43.setBounds(0, 0, 53, 39);
	    add43panels.add(addIconlbl43);
	    
	    JLabel packagelbl = new JLabel("Package");
	    packagelbl.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
	    packagelbl.setBounds(10, 11, 278, 63);
	    scrollContent.add(packagelbl);
	    
	    // ==== end here ====

	}

}
