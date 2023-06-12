package PhotoboothBookingSystem;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import Dashboard.PanelDashboard;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;

public class StandardPanel extends JPanel {
	
	/// == layout Standard / 4r picture==
		private ImageIcon four1 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\1.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four2 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\2.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four3 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\3.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four4 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\4.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four5 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\5.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four6 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\6.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four7 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\7.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four8 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\8.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four9 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\9.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four10 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\10.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four11 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\11.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four12 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\12.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four13 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\13.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four14 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\14.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four15 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\15.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four16 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\16.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four17 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\17.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four18 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\18.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four19 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\19.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four20 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\20.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four21 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\21.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		
		
		// ============================= curtain image ============================
		private ImageIcon c1 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\green.png")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c2 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\black2.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c3 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\curtaintinsel.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c4 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\cold.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c5 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\pinkvioletcurtain.jpeg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c6 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\pinkcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c7 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\violetcurtatin.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c8 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\silver.jpeg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c9 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\redcurtain.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
	private ImageIcon c10 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\curtainBackdropImage\\curtainlightwhite.jpg")
				.getImage().getScaledInstance(354, 229, Image.SCALE_DEFAULT));
		
		private ImageIcon bdo = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\bdo.png")
				.getImage().getScaledInstance(145, 79, Image.SCALE_DEFAULT));
		private ImageIcon rcbc = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\rcbc.jpg")
				.getImage().getScaledInstance(145, 79, Image.SCALE_DEFAULT));
		private ImageIcon bpi = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\bpi.png")
				.getImage().getScaledInstance(145, 79, Image.SCALE_DEFAULT));
		
		// layout arraylist for combo box
		private static String[] layoutStandardChoose = { "Choose 4R/Standard Layout Design", "1. Disney Princess (Arial)", "2. Butterfly", "3. Wreck it ralph (Vanellope)",
				"4. Flower Roses" , "5. BTS" , "6. Barbie" , "7. Frozen" , "8. Encanto", "9. Jungle", "10. Flower (2)","11. Racing", "12. Disney Princess (Arial2)",
				"13. SuperDad", "14. Ligthing Mcqueen", "15. Mickey Mouse", "16. Disney Princess (Cinderella)", 
				"17. Umbrella","18. 80's","19. Unicorn","20. Smurf","21. Babyshark"};	
		// curtain or backdrop arraylist for combobox
		private static String[] curtain = { "Choose Backdrops", "1. Green Screen", "2. Black", "3. Tinsel",
				"4. Gold" , "5. Pink White", "6. Pink", "7. Violet", "8. Silver","9. Red" , "10. Light White"};	
	
		private JComboBox standardComboBox;
		private JPanel buttonStandardPanel;
		private JPanel buttonInsertDesignPanel;
		private  JPanel buttonBooknowPanel;
		private JPanel  paymentPanel;
		private JLabel showStandardPictureLbl;
		private JLabel  standardlayoutlbl;
	    private JTextField eventplaceField;
	    private JTextField organizernameField;
	    private JTextField PhoneNumberField;
	    private JButton fileButton;
	    private JTextField TotaltextField;
	    private JTextField EnterName;
	    private JTextField Amount;
	    private JPasswordField enterPINfield;
	    private JPanel  buttoncheckoutpanel;
	    private JCheckBox magneticchckbox;
	    private  JPanel buttonpurchase;
	    private JPanel buttonChooseBackground;
	    private JPanel backgroundshoowpanel;
	    private JLabel lblshowbackground;
	    private JComboBox curtainCombobox;
	    private JTextField eventtypeField;
	    private JTextField txtEnterCelebrantName;
	    private JCheckBox extendthirtycheckbox;
	    private JCheckBox extendonehourcheckbox;
	    private JTextField monthField;
	    private JTextField dayField;
	    private JTextField yearField;
	    
	    
	    private  String magneticPrice;
	    private  String designPrice;
	    private  String layoutName;
	    private  String ownlayoutPrice;
	    private  String ownlayoutDesign;
	    private  Double totalPrice;  
	    private  String organizerName;
	    private  String celebrantName;
	    private  String magnetics;
	    private  String eventtypes;
	    private  String phoneNumber;
	    private  String eventPlaces;
	    private  String designLayout;
	    private  String curtainLayout;
	    private  String fileName; // for jchooser file
	    private  String thirtyminsPrice;
	    private  String onehourPrice;
	    private  String thirtymins2;
	    private  String onehour2;
	    private  String months;
	    private  String days;
	    private  String years;
	    private  String  date; 
	
	/**
	 * Create the panel.
	 */
	public StandardPanel() {
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
	    scrollContent.setPreferredSize(new Dimension(1001, 2750)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	       
	    
		
		  JPanel showstandardPanel = new JPanel(); showstandardPanel.setBorder(new
		  MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		  showstandardPanel.setBackground(new Color(255, 255, 255));
		  showstandardPanel.setBounds(186, 11, 885, 417);
		  scrollContent.add(showstandardPanel); showstandardPanel.setLayout(null);
		  
		  JLabel standardbookingsystemlbl = new JLabel("Standard Booking System");
		  standardbookingsystemlbl.setFont(new Font("Anton", Font.PLAIN, 25));
		  standardbookingsystemlbl.setBounds(315, 0, 317, 48);
		  showstandardPanel.add(standardbookingsystemlbl);
		  
		  // this is why reason why you select design on combo box will show
		  showStandardPictureLbl = new JLabel(""); showStandardPictureLbl.setBounds(58,
		  45, 790, 361); showstandardPanel.add(showStandardPictureLbl);
		  
		 
		 JPanel step1Panel = new JPanel(); step1Panel.setBorder(new MatteBorder(2, 2,
		  2, 2, (Color) new Color(102, 244, 222))); step1Panel.setBackground(new
		  Color(255, 255, 255)); step1Panel.setBounds(186, 430, 885, 83);
		  scrollContent.add(step1Panel); step1Panel.setLayout(null);
		  
		  JLabel step1text = new
		  JLabel("Step 1: Click on \" Standard Photo Layout\" to display the layout options for choosing a design."
		  ); step1text.setFont(new Font("Anton", Font.PLAIN, 15));
		  step1text.setBounds(173, 0, 586, 23); step1Panel.add(step1text);
		  
		  buttonStandardPanel = new JPanel(); buttonStandardPanel.setBorder(new
		  MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		  buttonStandardPanel.setBackground(new Color(255, 255, 255));
		  buttonStandardPanel.setBounds(293, 31, 291, 41);
		  buttonStandardPanel.addMouseListener(new
		  PanelButtonMouseAdapter(buttonStandardPanel));
		  step1Panel.add(buttonStandardPanel); buttonStandardPanel.setLayout(null);
		  
		  standardlayoutlbl = new JLabel("Standard Layout");
		  standardlayoutlbl.setFont(new Font("Anton", Font.PLAIN, 16));
		  standardlayoutlbl.setBounds(90, 0, 122, 41);
		  buttonStandardPanel.add(standardlayoutlbl);
		 
	    
	    JPanel step2Panel = new JPanel();
	    step2Panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    step2Panel.setBackground(new Color(255, 255, 255));
	    step2Panel.setBounds(186, 524, 885, 75);
	    scrollContent.add(step2Panel);
	    step2Panel.setLayout(null);
	    
	    JLabel lblStepSelect = new JLabel("Step 2: Select the desired design for the photo layout.");
	    lblStepSelect.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblStepSelect.setBounds(173, 0, 358, 23);
	    step2Panel.add(lblStepSelect);
	    // combo box standard
	    standardComboBox = new JComboBox(layoutStandardChoose);
	    standardComboBox.setFont(new Font("Anton", Font.PLAIN, 15));
	    standardComboBox.setBounds(263, 36, 391, 28);
	    standardComboBox.setVisible(false); // Initially hide the standardComboBox
	    step2Panel.add(standardComboBox);
	    standardComboBox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            String selectedlayout = standardComboBox.getSelectedItem().toString();
		            switch (selectedlayout) {
		            case "Choose 4R/Standard Layout Design":
		            	showStandardPictureLbl.setIcon(null);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "1. Disney Princess (Arial)":
		            	showStandardPictureLbl.setIcon(four1);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "2. Butterfly":
		            	showStandardPictureLbl.setIcon(four2);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "3. Wreck it ralph (Vanellope)":
		            	showStandardPictureLbl.setIcon(four3);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "4. Flower Roses":
		            	showStandardPictureLbl.setIcon(four4);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "5. BTS":
		            	showStandardPictureLbl.setIcon(four5);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "6. Barbie":
		            	showStandardPictureLbl.setIcon(four6);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "7. Frozen":
		            	showStandardPictureLbl.setIcon(four7);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "8. Encanto":
		            	showStandardPictureLbl.setIcon(four8);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "9. Jungle":
		            	showStandardPictureLbl.setIcon(four9);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "10. Flower (2)":
		            	showStandardPictureLbl.setIcon(four10);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "11. Racing":
		            	showStandardPictureLbl.setIcon(four11);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "12. Disney Princess (Arial2)":
		            	showStandardPictureLbl.setIcon(four12);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "13. SuperDad":
		            	showStandardPictureLbl.setIcon(four13);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "14. Ligthing Mcqueen":
		            	showStandardPictureLbl.setIcon(four14);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "15. Mickey Mouse":
		            	showStandardPictureLbl.setIcon(four15);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "16. Disney Princess (Cinderella)":
		            	showStandardPictureLbl.setIcon(four16);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "17. Umbrella":
		            	showStandardPictureLbl.setIcon(four17);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "18. 80's":
		            	showStandardPictureLbl.setIcon(four18);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "19. Unicorn":
		            	showStandardPictureLbl.setIcon(four19);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "20. Smurf":
		            	showStandardPictureLbl.setIcon(four20);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "21. Babyshark":
		            	showStandardPictureLbl.setIcon(four21);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            default:
		            	showStandardPictureLbl.setIcon(null);
		                break;
		            }
		        }
		    }
		});
	    
	    JPanel step5panel = new JPanel();
	    step5panel.setLayout(null);
	    step5panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    step5panel.setBackground(Color.WHITE);
	    step5panel.setBounds(186, 1130, 885, 522);
	    scrollContent.add(step5panel);
	    
	    JLabel lblStepSelect2 = new JLabel("Step 5 : Input Date of Main Event");
	    lblStepSelect2.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblStepSelect2.setBounds(173, 24, 549, 48);
	    step5panel.add(lblStepSelect2);
	    
	    JPanel calendarPanel = new JPanel();
		calendarPanel.setBounds(911, 24, 322, 228);
		step5panel.add(calendarPanel);
		calendarPanel.setLayout(null);
		
		JLabel lblStepFill = new JLabel("Step 6 : Fill out the entire form.");
		lblStepFill.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepFill.setBounds(159, 158, 549, 48);
		step5panel.add(lblStepFill);
		
		eventplaceField = new JTextField();
		eventplaceField.setFont(new Font("Anton", Font.PLAIN, 15));
		eventplaceField.setText("Enter Event Place");
		eventplaceField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		eventplaceField.setBounds(194, 276, 426, 48);
		eventplaceField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (eventplaceField.getText().equals("")) {
					eventplaceField.setForeground(new Color(96, 96, 96));
					eventplaceField.setText("Enter Event Place");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (eventplaceField.getText().equals("Enter Event Place")) {
					eventplaceField.setForeground(Color.BLACK);
					eventplaceField.setText("");
				}
			}
		});
		step5panel.add(eventplaceField);
		eventplaceField.setColumns(10);
		
		
		organizernameField = new JTextField();
		organizernameField.setFont(new Font("Anton", Font.PLAIN, 15));
		organizernameField.setText("Enter Organizer Name");
		organizernameField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		organizernameField.setColumns(10);
		organizernameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (organizernameField.getText().equals("")) {
					organizernameField.setForeground(new Color(96, 96, 96));
					organizernameField.setText("Enter Organizer Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (organizernameField.getText().equals("Enter Organizer Name")) {
					organizernameField.setForeground(Color.BLACK);
					organizernameField.setText("");
				}
			}
		});
		organizernameField.setBounds(195, 394, 426, 48);
		step5panel.add(organizernameField);
		
		PhoneNumberField = new JTextField();
		PhoneNumberField.setFont(new Font("Anton", Font.PLAIN, 15));
		PhoneNumberField.setText("Enter Contact Number");
		PhoneNumberField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		PhoneNumberField.setColumns(10);
		PhoneNumberField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (PhoneNumberField.getText().equals("")) {
					PhoneNumberField.setForeground(new Color(96, 96, 96));
					PhoneNumberField.setText("Enter Contact Number");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (PhoneNumberField.getText().equals("Enter Contact Number")) {
					PhoneNumberField.setForeground(Color.BLACK);
					PhoneNumberField.setText("");
				}
			}
		});
		PhoneNumberField.addKeyListener(new KeyAdapter() {
            @Override // this is why 9 only number can input in Phone Number
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) || PhoneNumberField.getText().length() >= 9) {
                    e.consume();
                }
            }
        });
		PhoneNumberField.setBounds(195, 453, 426, 48);
		step5panel.add(PhoneNumberField);
		
		eventtypeField = new JTextField();
		eventtypeField.setText("Enter Event Type");
		eventtypeField.setFont(new Font("Anton", Font.PLAIN, 15));
		eventtypeField.setColumns(10);
		eventtypeField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		eventtypeField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (eventtypeField.getText().equals("")) {
					eventtypeField.setForeground(new Color(96, 96, 96));
					eventtypeField.setText("Enter Event Type");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (eventtypeField.getText().equals("Enter Event Type")) {
					eventtypeField.setForeground(Color.BLACK);
					eventtypeField.setText("");
				}
			}
		});
		eventtypeField.setBounds(194, 217, 426, 48);
		step5panel.add(eventtypeField);
		
		txtEnterCelebrantName = new JTextField();
		txtEnterCelebrantName.setText("Enter Celebrant Name");
		txtEnterCelebrantName.setFont(new Font("Anton", Font.PLAIN, 15));
		txtEnterCelebrantName.setColumns(10);
		txtEnterCelebrantName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		txtEnterCelebrantName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEnterCelebrantName.getText().equals("")) {
					txtEnterCelebrantName.setForeground(new Color(96, 96, 96));
					txtEnterCelebrantName.setText("Enter Celebrant Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (txtEnterCelebrantName.getText().equals("Enter Celebrant Name")) {
					txtEnterCelebrantName.setForeground(Color.BLACK);
					txtEnterCelebrantName.setText("");
				}
			}
		});
		txtEnterCelebrantName.setBounds(195, 335, 426, 48);
		step5panel.add(txtEnterCelebrantName);
		
		monthField = new JTextField();
		monthField.setFont(new Font("Anton", Font.PLAIN, 15));
		monthField.setBounds(268, 75, 66, 41);
		monthField.setText("MM");
		monthField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		monthField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (monthField.getText().equals("")) {
					monthField.setForeground(new Color(96, 96, 96));
					monthField.setText("MM");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (monthField.getText().equals("MM")) {
					monthField.setForeground(Color.BLACK);
					monthField.setText("");
				}
			}
		});
		step5panel.add(monthField);
		monthField.setColumns(10);
		
		dayField = new JTextField();
		dayField.setFont(new Font("Anton", Font.PLAIN, 15));
		dayField.setColumns(10);
		dayField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		dayField.setBounds(344, 75, 66, 41);
		dayField.setText("DD");
		dayField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (dayField.getText().equals("")) {
					dayField.setForeground(new Color(96, 96, 96));
					dayField.setText("DD");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (dayField.getText().equals("DD")) {
					dayField.setForeground(Color.BLACK);
					dayField.setText("");
				}
			}
		});
		dayField.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c) || dayField.getText().length() >= 2) {
		            e.consume();
		        }
		        if (monthField.getText().equals("2") || monthField.getText().equals("02")) {
		            if (!(Character.isDigit(c) && Integer.parseInt(dayField.getText() + c) <= 29)) {
		                e.consume();
		            }
		        }
		    }
		});
		step5panel.add(dayField);
		
		yearField = new JTextField();
		yearField.setFont(new Font("Anton", Font.PLAIN, 15));
		yearField.setColumns(10);
		yearField.setBounds(420, 75, 106, 41);
		yearField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		yearField.setText("YYYY");
		yearField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (yearField.getText().equals("")) {
					yearField.setForeground(new Color(96, 96, 96));
					yearField.setText("YYYY");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (yearField.getText().equals("YYYY")) {
					yearField.setForeground(Color.BLACK);
					yearField.setText("");
				}
			}
		});
		yearField.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c) || yearField.getText().length() >= 4) {
		            e.consume();
		        }
		    }
		});
		step5panel.add(yearField);
		
		
		fileButton = new JButton("Insert File");
		fileButton.setFont(new Font("Anton", Font.PLAIN, 10));
		fileButton.setBounds(365, 27, 120, 37);
		fileButton.setVisible(false); // Set the fileButton initially invisible
		step2Panel.add(fileButton);

		fileButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser();
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            fileName = selectedFile.getName();
		            fileButton.setText(fileName);

		            // Display the selected file in showStandardPictureLbl
		            ImageIcon imageIcon = new ImageIcon(
		                    new ImageIcon(selectedFile.getAbsolutePath())
		                            .getImage()
		                            .getScaledInstance(790, 361, Image.SCALE_DEFAULT)
		            );
		            showStandardPictureLbl.setIcon(imageIcon);
		        }
        // Save the file name in a text file
        
        try {
            FileWriter writer = new FileWriter("C:\\data.txt", true);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        			}
				}
			
		});
		
		JPanel Step7panel = new JPanel();
		Step7panel.setLayout(null);
		Step7panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		Step7panel.setBackground(Color.WHITE);
		Step7panel.setBounds(186, 1665, 885, 543);
		scrollContent.add(Step7panel);
		
		JLabel lblStepDo = new JLabel("Step 7: Do you want your picture to be magnetic? It's up to you if you want it or not. There is");
		lblStepDo.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepDo.setBounds(173, 11, 579, 48);
		Step7panel.add(lblStepDo);
		
		magneticchckbox = new JCheckBox("             Magnetic");
		magneticchckbox.setFont(new Font("Anton", Font.PLAIN, 15));
		magneticchckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
		magneticchckbox.setBounds(331, 83, 193, 48);
		Step7panel.add(magneticchckbox);
		
		JLabel lblStepClick = new JLabel("Step 9 : Click \"Check Out\" if you want to see the total price.");
		lblStepClick.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepClick.setBounds(173, 360, 549, 48);
		Step7panel.add(lblStepClick);
		
		JLabel lblAnAdditionalCost = new JLabel("an additional cost of 1000 if you want it to be magnetic.");
		lblAnAdditionalCost.setFont(new Font("Anton", Font.PLAIN, 15));
		lblAnAdditionalCost.setBounds(173, 31, 579, 48);
		Step7panel.add(lblAnAdditionalCost);
		
		buttoncheckoutpanel = new JPanel();
		buttoncheckoutpanel.setLayout(null);
		buttoncheckoutpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		buttoncheckoutpanel.setBackground(Color.WHITE);
		buttoncheckoutpanel.setBounds(278, 405, 291, 41);
		buttoncheckoutpanel.addMouseListener(new PanelButtonMouseAdapter3(buttoncheckoutpanel));
		Step7panel.add(buttoncheckoutpanel);
		
		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setFont(new Font("Anton", Font.PLAIN, 15));
		lblCheckOut.setBounds(108, 0, 142, 41);
		buttoncheckoutpanel.add(lblCheckOut);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Anton", Font.PLAIN, 15));
		lblTotal.setBounds(217, 457, 51, 48);
		Step7panel.add(lblTotal);
		
		TotaltextField = new JTextField();
		TotaltextField.setFont(new Font("Anton", Font.PLAIN, 15));
		TotaltextField.setBounds(278, 457, 291, 48);
		Step7panel.add(TotaltextField);
		TotaltextField.setEditable(false);
		TotaltextField.setColumns(10);
		
		JLabel lblStepUnlimited = new JLabel("Step 8 : Unlimited Shots for 2 Hours per Book");
		lblStepUnlimited.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepUnlimited.setBounds(173, 142, 579, 48);
		Step7panel.add(lblStepUnlimited);
		
		JLabel lblPleaseNote = new JLabel("Please note : that some clients may choose to extend their booking in in advance, while others may opt to extend it");
		lblPleaseNote.setForeground(Color.RED);
		lblPleaseNote.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPleaseNote.setBounds(82, 176, 753, 39);
		Step7panel.add(lblPleaseNote);
		
		JLabel lblInAdvanceWhile = new JLabel(" on-site at the event location. However, if you are undecided, you can skip this step for now.");
		lblInAdvanceWhile.setForeground(Color.RED);
		lblInAdvanceWhile.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInAdvanceWhile.setBounds(145, 198, 665, 39);
		Step7panel.add(lblInAdvanceWhile);
		
		JLabel lblLocationHoweverIf = new JLabel("Please be aware that each extension of 30 minutes costs 500, and each extension of 1 hour costs 1000.");
		lblLocationHoweverIf.setForeground(Color.RED);
		lblLocationHoweverIf.setFont(new Font("Arial", Font.PLAIN, 14));
		lblLocationHoweverIf.setBounds(103, 223, 707, 39);
		Step7panel.add(lblLocationHoweverIf);
		
	    extendthirtycheckbox = new JCheckBox("             30 Minute");
		extendthirtycheckbox.setFont(new Font("Anton", Font.PLAIN, 15));
		extendthirtycheckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
		extendthirtycheckbox.setBounds(192, 269, 193, 48);
		Step7panel.add(extendthirtycheckbox);
		
		extendonehourcheckbox = new JCheckBox("             1 Hour\r\n");
		extendonehourcheckbox.setFont(new Font("Anton", Font.PLAIN, 15));
		extendonehourcheckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
		extendonehourcheckbox.setBounds(426, 269, 193, 48);
		Step7panel.add(extendonehourcheckbox);
	    
		JPanel Step8panel = new JPanel();
	    Step8panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    Step8panel.setBackground(new Color(255, 255, 255));
	    Step8panel.setBounds(186, 2215, 885, 513);
	    scrollContent.add(Step8panel);
	    Step8panel.setLayout(null);
	    
	    JLabel lblStepIs = new JLabel("Step 10: Is the price acceptable to you? If yes, click \"Book Now!\".");
	    lblStepIs.setBounds(173, 11, 549, 48);
	    Step8panel.add(lblStepIs);
	    lblStepIs.setFont(new Font("Anton", Font.PLAIN, 15));
	    
	     buttonBooknowPanel = new JPanel();
	    buttonBooknowPanel.setBounds(278, 57, 291, 41);
	    Step8panel.add(buttonBooknowPanel);
	    buttonBooknowPanel.setLayout(null);
	    buttonBooknowPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonBooknowPanel.setBackground(Color.WHITE);
	    buttonBooknowPanel.addMouseListener(new PanelButtonMouseAdapter4(buttonBooknowPanel));
	 
	    
	    JLabel lblBookNow = new JLabel("Book Now!");
	    lblBookNow.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblBookNow.setBounds(108, 0, 142, 41);
	    buttonBooknowPanel.add(lblBookNow);
	    
	    paymentPanel = new JPanel();
	    paymentPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    paymentPanel.setBackground(new Color(255, 255, 255));
	    paymentPanel.setBounds(150, 109, 583, 393);
	    paymentPanel.setVisible(false); // Initially hide the paymentPanel
	    Step8panel.add(paymentPanel);
	    paymentPanel.setLayout(null);
	    
	    EnterName = new JTextField();
	    EnterName.setFont(new Font("Anton", Font.PLAIN, 15));
	    EnterName.setBounds(268, 176, 264, 46);
	    EnterName.setText("Enter Name");
	    EnterName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    EnterName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (EnterName.getText().equals("")) {
					EnterName.setForeground(new Color(96, 96, 96));
					EnterName.setText("Enter Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (EnterName.getText().equals("Enter Name")) {
					EnterName.setForeground(Color.BLACK);
					EnterName.setText("");
				}
			}
		});
	    paymentPanel.add(EnterName);
	    EnterName.setColumns(10);
	    
	    Amount = new JTextField();
	    Amount.setFont(new Font("Anton", Font.PLAIN, 15));
	    Amount.setColumns(10);
	    Amount.setText("Enter Amount");
	    Amount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    Amount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (Amount.getText().equals("")) {
					Amount.setForeground(new Color(96, 96, 96));
					Amount.setText("Enter Amount");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (Amount.getText().equals("Enter Amount")) {
					Amount.setForeground(Color.BLACK);
					Amount.setText("");
				}
			}
		});
	    Amount.setBounds(268, 233, 264, 46);
	    paymentPanel.add(Amount);
	    
	    enterPINfield= new JPasswordField();
	    enterPINfield.setText("Enter PIN Number");
	    enterPINfield.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    enterPINfield.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e) {
				if (enterPINfield.getText().equals("")) {
					enterPINfield.setForeground(new Color(96, 96, 96));
					enterPINfield.setText("Enter PIN Number");
					enterPINfield.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (enterPINfield.getText().equals("Enter PIN Number")) {
					enterPINfield.setEchoChar('●');
					enterPINfield.setForeground(Color.BLACK);
					enterPINfield.setText("");
				}
			}

		});
	    enterPINfield.addKeyListener(new KeyAdapter() {
            @Override // this is why 6 only number can input in PIN Field
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) || enterPINfield.getText().length() >= 6) {
                    e.consume();
                }
            }
        });
	    enterPINfield.setForeground(new Color(96, 96, 96));
	    enterPINfield.setEchoChar('●');
	    enterPINfield.setBounds(268, 119, 264, 46);
	    paymentPanel.add(enterPINfield);
	    
	    buttonpurchase = new JPanel();
	    buttonpurchase.setLayout(null);
	    buttonpurchase.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonpurchase.setBackground(Color.WHITE);
	    buttonpurchase.setBounds(304, 290, 203, 46);
	    buttonpurchase.addMouseListener(new PanelButtonMouseAdapter5(buttonpurchase));
	    paymentPanel.add(buttonpurchase);
	    
	    JLabel lblPur = new JLabel("Pay Now");
	    lblPur.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblPur.setBounds(67, 0, 126, 41);
	    buttonpurchase.add(lblPur);
	    
	    JRadioButton bdobutton = new JRadioButton("");
	    bdobutton.setBackground(new Color(255, 255, 255));
	    bdobutton.setBounds(61, 137, 21, 23);
	    paymentPanel.add(bdobutton);
	    
	    JRadioButton bpibutton = new JRadioButton("");
	    bpibutton.setBackground(Color.WHITE);
	    bpibutton.setBounds(61, 226, 21, 23);
	    paymentPanel.add(bpibutton);
	    
	    JRadioButton rcbcbutton = new JRadioButton("");
	    rcbcbutton.setBackground(Color.WHITE);
	    rcbcbutton.setBounds(61, 324, 21, 23);
	    paymentPanel.add(rcbcbutton);
	    
	    JLabel bdolbl = new JLabel(" ");
	    bdolbl.setIcon(bdo);
	    bdolbl.setBounds(84, 99, 145, 79);
	    paymentPanel.add(bdolbl);
	    
	    JLabel rcbclbl = new JLabel("");
	    rcbclbl.setIcon(rcbc);
	    rcbclbl.setBounds(84, 192, 145, 79);
	    paymentPanel.add(rcbclbl);
	    
	    JLabel bpilbl = new JLabel("");
	    bpilbl.setIcon(bpi);
	    bpilbl.setBounds(84, 291, 145, 79);
	    paymentPanel.add(bpilbl);
	    
	    JLabel textlbls11 = new JLabel("Payment Info");
	    textlbls11.setFont(new Font("Anton", Font.PLAIN, 20));
	    textlbls11.setBounds(231, 11, 114, 31);
	    paymentPanel.add(textlbls11);
	    
	    JLabel textlbls10 = new JLabel("Please choose a bank and fill out all the fields.");
	    textlbls10.setFont(new Font("Anton", Font.PLAIN, 20));
	    textlbls10.setBounds(108, 57, 420, 31);
	    paymentPanel.add(textlbls10);
	     
	     JPanel Step3panel = new JPanel();
	     Step3panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	     Step3panel.setBackground(new Color(255, 255, 255));
	     Step3panel.setBounds(186, 610, 885, 124);
	     scrollContent.add(Step3panel);
	     Step3panel.setLayout(null);
	     
	     JLabel lblStepIf = new JLabel("Step 3: If you have your own design, select any layout style that represents your design.");
	     lblStepIf.setBounds(157, 11, 549, 48);
	     Step3panel.add(lblStepIf);
	     lblStepIf.setFont(new Font("Anton", Font.PLAIN, 15));
	     
	     buttonInsertDesignPanel = new JPanel();
	     buttonInsertDesignPanel.setBounds(300, 51, 291, 41);
	     Step3panel.add(buttonInsertDesignPanel);
	     buttonInsertDesignPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	     buttonInsertDesignPanel.setBackground(new Color(255, 255, 255));
	     buttonInsertDesignPanel.addMouseListener(new PanelButtonMouseAdapter2(buttonInsertDesignPanel));
	     buttonInsertDesignPanel.setLayout(null);
	     
	      JLabel insertyourowndesigntextlbl = new JLabel("Insert your Own Design");
	      insertyourowndesigntextlbl.setFont(new Font("Anton", Font.PLAIN, 15));
	      insertyourowndesigntextlbl.setBounds(69, 0, 181, 41);
	      buttonInsertDesignPanel.add(insertyourowndesigntextlbl);
	      
	      JPanel Step4panel = new JPanel();
	      Step4panel.setBorder(new MatteBorder(2, 2, 2, 1, (Color) new Color(102, 244, 222)));
	      Step4panel.setBackground(new Color(255, 255, 255));
	      Step4panel.setBounds(186, 745, 885, 365);
	      scrollContent.add(Step4panel);
	      Step4panel.setLayout(null);
	      
	      JLabel lblStepChoose = new JLabel("Step 4: Choose a Background for the Layout");
	      lblStepChoose.setFont(new Font("Anton", Font.PLAIN, 15));
	      lblStepChoose.setBounds(197, 11, 549, 48);
	      Step4panel.add(lblStepChoose);
	      
	     // ========================= Step 4 background panel and lbl ================================================
	    buttonChooseBackground = new JPanel();
	  	buttonChooseBackground.setLayout(null);
	  	buttonChooseBackground.addMouseListener(new PanelButtonMouseAdapter6(buttonChooseBackground));
	  	buttonChooseBackground.setBorder(new MatteBorder(2, 2, 2, 2, new Color(102, 244, 222)));
	  	buttonChooseBackground.setBackground(Color.WHITE);
	  	buttonChooseBackground.setBounds(312, 51, 291, 41);
	  	Step4panel.add(buttonChooseBackground);

	  	JLabel lblChooseBackground = new JLabel("Choose Background");
	  	lblChooseBackground.setFont(new Font("Anton", Font.PLAIN, 15));
	  	lblChooseBackground.setBounds(69, 0, 181, 41);
	  	buttonChooseBackground.add(lblChooseBackground);

	  	backgroundshoowpanel = new JPanel();
	  	backgroundshoowpanel.setVisible(false);
	  	backgroundshoowpanel.setBorder(new MatteBorder(2, 2, 2, 2, new Color(102, 244, 222)));
	  	backgroundshoowpanel.setBackground(new Color(255, 255, 255));
	  	backgroundshoowpanel.setBounds(32, 103, 835, 251);
	  	Step4panel.add(backgroundshoowpanel);
	  	backgroundshoowpanel.setLayout(null);

	  	lblshowbackground = new JLabel("");
	  	lblshowbackground.setBounds(460, 22, 354, 229);
	  	backgroundshoowpanel.add(lblshowbackground);

	  	JLabel lblNewLabel = new JLabel("Please note: If the layout you have selected already includes a");
	  	lblNewLabel.setForeground(Color.RED);
	  	lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
	  	lblNewLabel.setBounds(10, 11, 451, 39);
	  	backgroundshoowpanel.add(lblNewLabel);

	  	JLabel lblItIsA = new JLabel("background, it indicates that it is a green screen. If you do not");
	  	lblItIsA.setForeground(Color.RED);
	  	lblItIsA.setFont(new Font("Arial", Font.PLAIN, 14));
	  	lblItIsA.setBounds(10, 30, 451, 39);
	  	backgroundshoowpanel.add(lblItIsA);

	  	JLabel lblTheFlexibilityTo = new JLabel("want that particular background in your layout, you have the flexibility");
	  	lblTheFlexibilityTo.setForeground(Color.RED);
	  	lblTheFlexibilityTo.setFont(new Font("Arial", Font.PLAIN, 14));
	  	lblTheFlexibilityTo.setBounds(10, 47, 451, 39);
	  	backgroundshoowpanel.add(lblTheFlexibilityTo);
	  	
	  	// ============ COMBO BOX WITH FUNCTION OF ITEMSTATECHANGED=================================
	  	curtainCombobox = new JComboBox(curtain);
	  	curtainCombobox.setBounds(10, 142, 416, 31);
	  	backgroundshoowpanel.add(curtainCombobox);
	  	curtainCombobox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            String selectedlayout = curtainCombobox.getSelectedItem().toString();
		            switch (selectedlayout) {
		            case "Choose Backdrops":
		            	lblshowbackground.setIcon(null);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "1. Green Screen":
		            	lblshowbackground.setIcon(c1);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "2. Black":
		            	lblshowbackground.setIcon(c2);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "3. Tinsel":
		            	lblshowbackground.setIcon(c3);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "4. Gold":
		            	lblshowbackground.setIcon(c4);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "5. Pink White":
		            	lblshowbackground.setIcon(c5);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "6. Pink":
		            	lblshowbackground.setIcon(c6);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "7. Violet":
		            	lblshowbackground.setIcon(c7);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "8. Silver":
		            	lblshowbackground.setIcon(c8);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "9. Red":
		            	lblshowbackground.setIcon(c9);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            case "10. Light White":
		            	lblshowbackground.setIcon(c10);
		            	lblshowbackground.setBounds(460, 22, 354, 229);
		                break;
		            default:
		            	lblshowbackground.setIcon(null);
		                break;
		            }
		        }
		    }
		});
	  	//=========================== END HERE====================================================================
	  	JLabel lblFlexibilityToChoose = new JLabel("flexibility to choose a different one instead.\r\n");
	  	lblFlexibilityToChoose.setForeground(Color.RED);
	  	lblFlexibilityToChoose.setFont(new Font("Arial", Font.PLAIN, 14));
	  	lblFlexibilityToChoose.setBounds(10, 68, 451, 39);
	  	backgroundshoowpanel.add(lblFlexibilityToChoose);
	    // ============================== end here===================================================================
	    scrollPane.setPreferredSize(new Dimension(1500, 500)); // set the size of the scroll pane to fit the labels

	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		 boolean isComboBoxVisible = false;
		 
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
	    public void mouseEntered(MouseEvent e){
						
			panel.setBackground(new Color(102, 244, 222));
		}
					
		@Override
		public void mouseExited(MouseEvent e) {
	        if (!isComboBoxVisible) {
	            panel.setBackground(new Color(240, 240, 240));
	        }
	    }
					
		@Override
		public void mousePressed(MouseEvent e) {
	        panel.setBackground(new Color(102, 244, 222));
	        if (isComboBoxVisible) {
	            standardComboBox.setVisible(false);
	            isComboBoxVisible = false;
	        } else {
	            standardComboBox.setVisible(true);
	            fileButton.setVisible(false);
	            isComboBoxVisible = true;
	        }
	        
		}
	    
		@Override
	   public void mouseReleased(MouseEvent e){
		  panel.setBackground(new Color(102, 244, 222));
		   }
		}	
	
	private class PanelButtonMouseAdapter2 extends MouseAdapter{
		
		 JPanel panel2;
		 boolean isButtonVisible = false;
		 
		 public PanelButtonMouseAdapter2(JPanel panel2) {
			    this.panel2 = panel2;
			}

			public void mouseEntered(MouseEvent e){
			    panel2.setBackground(new Color(102, 244, 222));
			}

			@Override
			public void mouseExited(MouseEvent e) {
			    if (!isButtonVisible) {
			        panel2.setBackground(new Color(255, 255, 255));
			    }
			}

			@Override
			public void mousePressed(MouseEvent e) {
			    panel2.setBackground(new Color(102, 244, 222));
			    if (isButtonVisible) {
			        fileButton.setVisible(false);			        
			        isButtonVisible = false;
			    } else {
			        fileButton.setVisible(true);
			        standardComboBox.setVisible(false);
			        isButtonVisible = true;
			    }
			}

			@Override
			public void mouseReleased(MouseEvent e){
			    panel2.setBackground(new Color(102, 244, 222));
			}
	}
	
	// check out price
	private class PanelButtonMouseAdapter3 extends MouseAdapter{
	    
	    JPanel panel3;
	    boolean isButtonVisible = false;
	     
	    public PanelButtonMouseAdapter3(JPanel panel3) {
	        this.panel3 = panel3;
	    }

	    public void mouseEntered(MouseEvent e){
	        panel3.setBackground(new Color(102, 244, 222));
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	        panel3.setBackground(new Color(240, 240, 240));
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	        panel3.setBackground(new Color(102, 244, 222));
	        
	        PhotoboothPricingEncapsulation ppe = new PhotoboothPricingEncapsulation();
	        PanelDashboard pd = new PanelDashboard();

	        layoutName = standardlayoutlbl.getText();
	        ownlayoutPrice = fileButton.getText().toString();
	        designPrice = standardComboBox.getSelectedItem().toString();

	        if (magneticchckbox.isSelected()) {
	            magneticPrice = magneticchckbox.getText();
	        } else {
	            magneticPrice = null; // Set magneticPrice to null if the checkbox is not selected;
	        }
	        

	        if (ownlayoutPrice.isEmpty()) {
	            ownlayoutPrice = null; // Set ownlayoutPrice to null if fileButton.getText() is empty;
	        }

	        if (designPrice.isEmpty()) {
	            designPrice = null; // Set designPrice to null if standardComboBox.getSelectedItem() is empty;
	        }
	        
	        
			if(extendthirtycheckbox.isSelected()) {
	        	thirtyminsPrice = extendthirtycheckbox.getText();
	        } else {
	        	thirtyminsPrice = null; // set thirtymins to null if the checkbox is not selected
	        }
			
			if(extendonehourcheckbox.isSelected()) {
				onehourPrice = extendonehourcheckbox.getText();
			} else {
				onehourPrice = null; // set onehourPrice to null if the checkbox is not selected
			}
	        
	        totalPrice = ppe.calculatePackageStandard(designPrice, magneticPrice, thirtyminsPrice, onehourPrice); // calculate all 
	        totalPrice = ppe.calculatePackageStandard2(ownlayoutPrice, magneticPrice, thirtyminsPrice, onehourPrice); // calculate all
	        TotaltextField.setText(Double.toString(totalPrice));

	        
	       
	    }

	    @Override
	    public void mouseReleased(MouseEvent e){
	        panel3.setBackground(new Color(102, 244, 222));
	    }
	}

	// for payment method 
	private class PanelButtonMouseAdapter4 extends MouseAdapter{
		
		JPanel panel4;
		boolean isPaymentButton = false;

		public PanelButtonMouseAdapter4(JPanel panel4) {
		    this.panel4 = panel4;
		}

		public void mouseEntered(MouseEvent e){
		    panel4.setBackground(new Color(102, 244, 222));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isPaymentButton) {
		        panel4.setBackground(new Color(255, 255, 255));
		    }
		    
		}

		@Override
		public void mousePressed(MouseEvent e) {
		    panel4.setBackground(new Color(102, 244, 222));
		    if (isPaymentButton) {
		    	paymentPanel.setVisible(false);
		        isPaymentButton = false;
		    } else {
		    	paymentPanel.setVisible(true);
		        isPaymentButton = true;
		    }
		
		  
		}

		@Override
		public void mouseReleased(MouseEvent e){
		    panel4.setBackground(new Color(102, 244, 222));
		}
	}
	
	private class PanelButtonMouseAdapter5 extends MouseAdapter{
		
		JPanel panel5;
		boolean isPaymentButton = false;

		public PanelButtonMouseAdapter5(JPanel panel5) {
		    this.panel5 = panel5;
		}

		public void mouseEntered(MouseEvent e){
		    panel5.setBackground(new Color(245, 244, 121));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isPaymentButton) {
		        panel5.setBackground(new Color(255, 255, 255));
		    }
		    
		}

		@Override
		public void mousePressed(MouseEvent e) {
		    panel5.setBackground(new Color(245, 244, 121));
		    
		    String amount = Amount.getText();
		    String pin = String.valueOf(enterPINfield.getPassword());
		    
		    // ...

		    PanelDashboard pD = new PanelDashboard();
		    organizerName = organizernameField.getText().toString(); // 1. get organizer name
		    celebrantName = txtEnterCelebrantName.getText();// 2. get celebrant name
		    eventtypes = eventtypeField.getText(); // 3. get Event type 
		    eventPlaces = eventplaceField.getText().toString(); //4. get Event place
		    phoneNumber = PhoneNumberField.getText();// 5. get contact number 
		    designLayout = standardComboBox.getSelectedItem().toString();// 6. get combo box design select
		    curtainLayout = curtainCombobox.getSelectedItem().toString();// 7. get combo box backdrops select
		    magnetics = magneticchckbox.getText(); //8. check if magnetics
		    thirtymins2 = extendthirtycheckbox.getText(); // 9. get thirtymins txt
		    onehour2 = extendonehourcheckbox.getText();// 10. get one hour text
		    ownlayoutDesign = fileButton.getText().toString();// 11. get the insert design
		    months = monthField.getText();
		    days = dayField.getText();
		    years = yearField.getText();

		     date = months + ":" + days + ":" + years; // get date from field
		    String extendTime = "";

		    if (extendthirtycheckbox.isSelected()) {
		        extendTime += extendthirtycheckbox.getText();
		    }

		    if (extendonehourcheckbox.isSelected()) {
		        if (!extendTime.isEmpty()) {
		            extendTime += "/";
		        }
		        extendTime += extendonehourcheckbox.getText();
		    }

		     months = monthField.getText();
		     days = dayField.getText();
		     years = yearField.getText();

		     
		    


		    if (ownlayoutDesign.isEmpty() || designLayout.isEmpty() || eventPlaces.isEmpty() || organizerName.isEmpty() || phoneNumber.isEmpty() || date == null) {
		        // Show fail message (fill out all steps in booking system)
		        JOptionPane.showMessageDialog(null, "Please fill out all steps in the booking system.");
		    } else if (amount.isEmpty()) {
		        JOptionPane.showMessageDialog(StandardPanel.this, "Amount field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
		    } else {
		    	double amount5 = 4500.0; // standard pice + magnetic + 1 hour + 30 mins extend
		        double amount4 = 4000.0; // standard price + magnetic + 1 hour extend
		        double amount3 = 3500.0; // standard price + magnetic + 30 mins extend
		        double amount1 = 3500.0; // standard price + magnetic
		        double amount2 = 2500.0; // standard price 
		        double totalAmount;

		        if (enterPINfield.getText().equals("134221")) {
		            try {
		                totalAmount = Double.parseDouble(Amount.getText());

		                if (totalAmount == amount1 || totalAmount == amount2 || totalAmount == amount3 || totalAmount == amount4 || totalAmount == amount5) {
		                   
		                    
		                 // Update incomeLbl label
		                    String paymentStatus = " Paid";
		                    pD.incomeLbl.setText("Income: $" + String.format("%.2f", totalAmount) + " " + paymentStatus);

		                    // Write data to the file
		                    FileWriter writer = new FileWriter("C:\\data.txt", true);
		                    // Prepare the data to be written, removing leading and trailing spaces from "magnetics" and "extendTime"
		                    String data = organizerName + "/" + celebrantName + "/" + phoneNumber + "/" + eventPlaces + "/" + eventtypes + "/" + totalAmount + paymentStatus  + "/" + "Standard" + "/" + designLayout + "/" + curtainLayout + "/" + magnetics.trim() + "/" + extendTime.trim() + "/" + ownlayoutDesign + "/" + date + "\n";
		                    writer.write(data);
		                    writer.close();

		                   

		                    // Show success message
		                    JOptionPane.showMessageDialog(null, "Booking successful! See you at the event!");
		                } else if (totalAmount < amount4 || totalAmount < amount3 || totalAmount < amount2 || totalAmount < amount1) {
		                	 // Show partial payment message
		                    String paymentStatus = " DP";
		                    JOptionPane.showMessageDialog(null, "Booking successful! Please make the remaining payment. See you at the event!");
		                    
		                    // Write data to the file
		                    FileWriter writer = new FileWriter("C:\\data.txt", true);
		                    // Prepare the data to be written, removing leading and trailing spaces from "magnetics" and "extendTime"
		                    String data = organizerName + "/" + celebrantName + "/" + phoneNumber + "/" + eventPlaces + "/" + eventtypes + "/" + totalAmount + paymentStatus  + "/" + "Standard" + "/" + designLayout + "/" + curtainLayout + "/" + magnetics.trim() + "/" + extendTime.trim() + "/" + ownlayoutDesign + "/" + date + "\n";
		                    writer.write(data);
		                    writer.close();
		                    
		                } else if (totalAmount > amount1  || totalAmount > amount2 || totalAmount > amount3 || totalAmount > amount4 || totalAmount > amount5) {
		                    // Show overpayment message
		                    JOptionPane.showMessageDialog(null, "Payment failed! Overpayment.");
		                } else {
		                    // Show incorrect PIN message
		                    JOptionPane.showMessageDialog(null, "PIN incorrect. Payment failed.");
		                }
		            } catch (NumberFormatException | IOException ex) {
		                ex.printStackTrace();
		            }
		        } else {
		            // Show incorrect PIN message
		            JOptionPane.showMessageDialog(null, "PIN incorrect. Payment failed.");
		        }
		    }
		}

		@Override
		public void mouseReleased(MouseEvent e){
		    panel5.setBackground(new Color(102, 244, 222));
		}
	}
	
	

	// Add the following code to show/hide the backgroundshoowpanel when buttonChooseBackground is clicked

	private class PanelButtonMouseAdapter6 extends MouseAdapter {
	    JPanel panel6;
	    boolean panelVisible = false;
	    
	    public PanelButtonMouseAdapter6(JPanel panel6) {
	        this.panel6 = panel6;
	    }
	    
	    public void mouseEntered(MouseEvent e) {
	        panel6.setBackground(new Color(102, 244, 222));
	    }
	    
	    @Override
	    public void mouseExited(MouseEvent e) {
	        if (!panelVisible) {
	            panel6.setBackground(new Color(255, 255, 255));
	        }
	    }
	    
	    @Override
	    public void mousePressed(MouseEvent e) {
	        panel6.setBackground(new Color(102, 244, 222));
	        if (panelVisible) {
	            backgroundshoowpanel.setVisible(false);
	            panelVisible = false;
	        } else {
	            backgroundshoowpanel.setVisible(true);
	            panelVisible = true;
	        }
	    }
	    
	    public void mouseReleased(MouseEvent e) {
	        panel6.setBackground(new Color(102, 244, 222));
	    }
	}
}
