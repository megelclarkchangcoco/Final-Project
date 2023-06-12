package PhotoboothBookingSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import PortfolioFrame.Dedication;
import PortfolioFrame.Polaroid;
import PortfolioFrame.Standard;
import PortfolioFrame.TwinStrip;

public class Home2Panel extends JPanel {
	// images
		private ImageIcon background = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\package1.png")
						.getImage().getScaledInstance(1280, 607, Image.SCALE_DEFAULT));
		private ImageIcon clock = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\clock.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon customize = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\customize.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon phone = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\mobile-application.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon photobooth = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\photo-strip.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon magnets = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\magnet (2).png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon view = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\camera (1).png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon screen = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\backdrop.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon props = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\moustache.png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		private ImageIcon events = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\event (1).png")
						.getImage().getScaledInstance(66, 64, Image.SCALE_DEFAULT));
		
		private JPanel polaroidPanel;
	/**
	 * Create the panel.
	 */
	public Home2Panel() {
		setBackground(new Color(255, 255, 255));
	    setBounds(0, 122, 1280, 780); // Update height to 780
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
	    scrollContent.setPreferredSize(new Dimension(1001, 1330)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    
	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
	    
	    	    
	    	    JPanel standardPanel = new JPanel() {
	    	    	@Override
	    	    	protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2 = (Graphics2D) g.create();
	                int shadowGap = 5;
	                int shadowOffset = 4;
	                g2.setPaint(new Color(0, 0, 0, 50));
	                g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                        getHeight() - shadowGap - shadowOffset, 10, 10);
	                g2.dispose();
	    		        }
	    		    };
	        
	    		    standardPanel.addMouseListener(new MouseAdapter() {
	    	        private Standard layout;
	    	
	    	        @Override
	    	        public void mouseEntered(MouseEvent e) {
	    	            if (layout == null) {
	    	                layout = new Standard();
	    	                layout.setVisible(true);
	    		            }
	    		        }
	    	
	    	        @Override
	    	        public void mouseExited(MouseEvent e) {
	    	            if (layout != null) {
	    	                Point p = e.getPoint();
	    	                if (!standardPanel.contains(p)) {
	    	                    layout.dispose();
	    	                    layout = null;
	    			                }
	    			            }
	    			        }
	    			    });
	    		    
	    		JLabel backgroundlbl = new JLabel("");
	    		backgroundlbl.setIcon(background);
	    		backgroundlbl.setBounds(0, 0, 1280, 607);
	    		scrollContent.add(backgroundlbl);
	    		 
	    		JLabel ourlbl = new JLabel("Our");
	    		ourlbl.setFont(new Font("Anton", Font.PLAIN, 120));
	    	    ourlbl.setForeground(new Color(0, 0, 0));
	    	    ourlbl.setBounds(774, 63, 354, 224);
	    	    backgroundlbl.add(ourlbl);
	    	    
	    	    JLabel lblServices = new JLabel("Booking System");
	    	    lblServices.setForeground(Color.BLACK);
	    	    lblServices.setFont(new Font("Anton", Font.PLAIN, 99));
	    	    lblServices.setBounds(550, 206, 736, 224);
	    	    backgroundlbl.add(lblServices);
	    	    
	    	    standardPanel.setBounds(22, 643, 268, 139);
	    	    scrollContent.add(standardPanel);
	    	    standardPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    	    standardPanel.setBackground(new Color(243, 115, 222));
	    	    standardPanel.setLayout(null);
	    	    
	    	    JLabel standardlbl = new JLabel("Standard 4r");
	    	    standardlbl.setBounds(46, 689, 46, 14);
	    	    standardPanel.add(standardlbl);
	    	    
	    	    JLabel lblrStandard = new JLabel("4r Standard");
	    	    lblrStandard.setForeground(Color.WHITE);
	    	    lblrStandard.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    lblrStandard.setBackground(Color.WHITE);
	    	    lblrStandard.setBounds(33, 32, 211, 70);
	    	    standardPanel.add(lblrStandard);
	    	    
	    	  JPanel dedicationPanel = new JPanel() {
	    		  @Override
	  	    	protected void paintComponent(Graphics g) {
	              super.paintComponent(g);
	              Graphics2D g2 = (Graphics2D) g.create();
	              int shadowGap = 5;
	              int shadowOffset = 4;
	              g2.setPaint(new Color(0, 0, 0, 50));
	              g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                      getHeight() - shadowGap - shadowOffset, 10, 10);
	              g2.dispose();
	  		        }
	  		    };
	      
	  		  dedicationPanel.addMouseListener(new MouseAdapter() {
	  	        private  Dedication layout;
	  	
	  	        @Override
	  	        public void mouseEntered(MouseEvent e) {
	  	            if (layout == null) {
	  	                layout = new Dedication();
	  	                layout.setVisible(true);
	  		            }
	  		        }
	  	
	  	        @Override
	  	        public void mouseExited(MouseEvent e) {
	  	            if (layout != null) {
	  	                Point p = e.getPoint();
	  	                if (!dedicationPanel.contains(p)) {
	  	                    layout.dispose();
	  	                    layout = null;
	  			                }
	  			            }
	  			        }
	  			    });
	    	    
	    	  dedicationPanel.setBounds(349, 643, 268, 139);
	    	  scrollContent.add(dedicationPanel);
	    	  dedicationPanel.setBackground(new Color(249, 245, 109));
	    	  dedicationPanel.setLayout(null);
	    	    
	    	 JLabel lblDedication = new JLabel("Dedication");
	    	 lblDedication.setForeground(Color.WHITE);
	    	 lblDedication.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	 lblDedication.setBackground(Color.WHITE);
	    	 lblDedication.setBounds(32, 33, 197, 70);
	    	 dedicationPanel.add(lblDedication);
	    	    
	    	JPanel twinstripPanel = new JPanel() {
	    	 @Override
	    	protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            int shadowGap = 5;
            int shadowOffset = 4;
            g2.setPaint(new Color(0, 0, 0, 50));
            g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
                    getHeight() - shadowGap - shadowOffset, 10, 10);
            g2.dispose();
		        }
		    };
    
	    twinstripPanel.addMouseListener(new MouseAdapter() {
	        private TwinStrip layout;

	        @Override
	        public void mouseEntered(MouseEvent e) {
	            if (layout == null) {
	                layout = new TwinStrip();
	                layout.setVisible(true);
		            }
		        }
	
	        @Override
	        public void mouseExited(MouseEvent e) {
	            if (layout != null) {
	                Point p = e.getPoint();
	                if (!twinstripPanel.contains(p)) {
	                    layout.dispose();
	                    layout = null;
			                }
			            }
			        }
			    });
		    
	    	    twinstripPanel.setBounds(671, 643, 268, 139);
	    	    scrollContent.add(twinstripPanel);
	    	    
	    	    twinstripPanel.setBackground(new Color(171, 249, 249));
	    	    twinstripPanel.setLayout(null);
	    	    
	    	    JLabel lblNewLabel = new JLabel("Twin Strip");
	    	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    	    lblNewLabel.setBackground(new Color(255, 255, 255));
	    	    lblNewLabel.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    lblNewLabel.setBounds(45, 34, 197, 70);
	    	    twinstripPanel.add(lblNewLabel);

	    	    
	    	    JPanel polaroidPanel = new JPanel() {
	    	    @Override
		    	protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            Graphics2D g2 = (Graphics2D) g.create();
	            int shadowGap = 5;
	            int shadowOffset = 4;
	            g2.setPaint(new Color(0, 0, 0, 50));
	            g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                    getHeight() - shadowGap - shadowOffset, 10, 10);
	            g2.dispose();
			        }
			    };
	    
			    polaroidPanel.addMouseListener(new MouseAdapter() {
		        private Polaroid layout;
		
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            if (layout == null) {
		                layout = new Polaroid();
		                layout.setVisible(true);
			            }
			        }
		
		        @Override
		        public void mouseExited(MouseEvent e) {
		            if (layout != null) {
		                Point p = e.getPoint();
		                if (!polaroidPanel.contains(p)) {
		                    layout.dispose();
		                    layout = null;
				                }
				            }
				        }
				    });
	    	    
	    	    polaroidPanel.setBounds(973, 643, 268, 139);
	    	    scrollContent.add(polaroidPanel);
	    	    polaroidPanel.setBackground(new Color(182, 243, 113));
	    	    polaroidPanel.setLayout(null);
	    	    
	    	    JLabel polaroidlbl = new JLabel("Polaroid");
	    	    polaroidlbl.setForeground(Color.WHITE);
	    	    polaroidlbl.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    polaroidlbl.setBackground(Color.WHITE);
	    	    polaroidlbl.setBounds(47, 34, 197, 70);
	    	    polaroidPanel.add(polaroidlbl);
	    	    
	    	  //======== all inclusions ===============
	    	    JPanel lastPanel = new JPanel();
	    	    lastPanel.setBackground(new Color(255, 255, 255));
	    	    lastPanel.setBounds(0, 900, 1280, 415);
	    	    scrollContent.add(lastPanel);
	    	    lastPanel.setLayout(null);
	    	    
	    	    JLabel Inclusionlbl = new JLabel("INCLUSIONS:");
	    	    Inclusionlbl.setBounds(10, 11, 150, 41);
	    	    Inclusionlbl.setFont(new Font("Anton", Font.PLAIN, 30));
	    	    lastPanel.add(Inclusionlbl);
	    	    
	    	    JLabel forHouriconLbl = new JLabel("");
	    	    forHouriconLbl.setIcon(clock);
	    	    forHouriconLbl.setBounds(32, 81, 66, 64);
	    	    lastPanel.add(forHouriconLbl);
	    	    
	    	    JLabel focCustomizeiconLbl = new JLabel("");
	    	    focCustomizeiconLbl.setIcon(customize);
	    	    focCustomizeiconLbl.setBounds(32, 221, 66, 64);
	    	    lastPanel.add(focCustomizeiconLbl);
	    	    
	    	    JLabel formobilephoneicon = new JLabel("");
	    	    formobilephoneicon.setIcon(phone);
	    	    formobilephoneicon.setBounds(32, 340, 66, 64);
	    	    lastPanel.add(formobilephoneicon);
	    	    
	    	    JLabel hourtextlbl = new JLabel("2 Hour Service");
	    	    hourtextlbl.setBounds(118, 103, 176, 29);
	    	    hourtextlbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lastPanel.add(hourtextlbl);
	    	    
	    	    JLabel lblInsertYourOwn = new JLabel("Insert your Own Layout");
	    	    lblInsertYourOwn.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblInsertYourOwn.setBounds(108, 238, 200, 29);
	    	    lastPanel.add(lblInsertYourOwn);
	    	    
	    	    JLabel lblOnlineGalleryOn = new JLabel("Online Gallery on our\r\n");
	    	    lblOnlineGalleryOn.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblOnlineGalleryOn.setBounds(108, 347, 200, 29);
	    	    lastPanel.add(lblOnlineGalleryOn);
	    	    
	    	    JLabel lblFacebookPage = new JLabel("Facebook Page");
	    	    lblFacebookPage.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblFacebookPage.setBounds(132, 375, 176, 29);
	    	    lastPanel.add(lblFacebookPage);
	    	    
	    	    JLabel forphotoboothIcon = new JLabel("");
	    	    forphotoboothIcon.setIcon(photobooth);
	    	    forphotoboothIcon.setBounds(433, 81, 66, 64);
	    	    lastPanel.add(forphotoboothIcon);
	    	    
	    	    JLabel formagneticicon = new JLabel("");
	    	    formagneticicon.setIcon(magnets);
	    	    formagneticicon.setBounds(433, 221, 66, 64);
	    	    lastPanel.add(formagneticicon);
	    	    
	    	    JLabel forcameraicon = new JLabel("");
	    	    forcameraicon.setIcon(view);
	    	    forcameraicon.setBounds(433, 340, 66, 64);
	    	    lastPanel.add(forcameraicon);
	    	    
	    	    JLabel lblPrintsFor = new JLabel("4 shots in single 4r");
	    	    lblPrintsFor.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblPrintsFor.setBounds(519, 103, 176, 29);
	    	    lastPanel.add(lblPrintsFor);
	    	    
	    	    JLabel lblmagneticsprint = new JLabel("Magnetic Prints for \r\n\tquests");
	    	    lblmagneticsprint.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblmagneticsprint.setBounds(509, 238, 217, 29);
	    	    lastPanel.add(lblmagneticsprint);
	    	    
	    	    JLabel lblliveview = new JLabel("Live view monitor with ");
	    	    lblliveview.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblliveview.setBounds(509, 347, 200, 29);
	    	    lastPanel.add(lblliveview);
	    	    
	    	    JLabel lblliveview2 = new JLabel(" Studio lights setup");
	    	    lblliveview2.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblliveview2.setBounds(533, 375, 176, 29);
	    	    lastPanel.add(lblliveview2);
	    	    
	    	    JLabel lblPrint = new JLabel("Print");
	    	    lblPrint.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblPrint.setBounds(565, 126, 140, 29);
	    	    lastPanel.add(lblPrint);
	    	    
	    	    JLabel lblmagneticsprint2 = new JLabel("(for magnetic packages)");
	    	    lblmagneticsprint2.setFont(new Font("Anton", Font.PLAIN, 15));
	    	    lblmagneticsprint2.setBounds(543, 256, 183, 29);
	    	    lastPanel.add(lblmagneticsprint2);
	    	    
	    	    JLabel forgreenscreenicon = new JLabel("");
	    	    forgreenscreenicon.setIcon(screen);
	    	    forgreenscreenicon.setBounds(888, 81, 66, 64);
	    	    lastPanel.add(forgreenscreenicon);
	    	    
	    	    JLabel lblgreenscreen = new JLabel("GreenScreen Technology");
	    	    lblgreenscreen.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblgreenscreen.setBounds(974, 103, 207, 29);
	    	    lastPanel.add(lblgreenscreen);
	    	    
	    	    JLabel lblgreenscreen2 = new JLabel("or Sequins Backdrop");
	    	    lblgreenscreen2.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblgreenscreen2.setBounds(992, 126, 168, 29);
	    	    lastPanel.add(lblgreenscreen2);
	    	    
	    	    JLabel forpropsicon = new JLabel("");
	    	    forpropsicon.setIcon(props);
	    	    forpropsicon.setBounds(888, 221, 66, 64);
	    	    lastPanel.add(forpropsicon);
	    	    
	    	    JLabel lblprop2 = new JLabel("Free use of Assorted");
	    	    lblprop2.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblprop2.setBounds(974, 238, 217, 29);
	    	    lastPanel.add(lblprop2);
	    	    
	    	    JLabel lblprops = new JLabel("props and markers");
	    	    lblprops.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblprops.setBounds(974, 256, 217, 29);
	    	    lastPanel.add(lblprops);
	    	    
	    	    JLabel foraccepltallevents = new JLabel("");
	    	    foraccepltallevents.setIcon(events);
	    	    foraccepltallevents.setBounds(888, 325, 66, 64);
	    	    lastPanel.add(foraccepltallevents);
	    	    
	    	    JLabel lblacceptevent = new JLabel("Accept all types of events.");
	    	    lblacceptevent.setFont(new Font("Anton", Font.PLAIN, 20));
	    	    lblacceptevent.setBounds(974, 342, 217, 29);
	    	    lastPanel.add(lblacceptevent);
	    	   
	    	   
	    	    
	    	    

	}

}
