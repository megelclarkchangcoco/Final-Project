package Dashboard;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JLabel Transferlbl;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 413);
		setTitle("Transfer Money");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel withdrawalpanel = new JPanel();
		withdrawalpanel.setBackground(new Color(255, 255, 255));
		withdrawalpanel.setBounds(0, 0, 549, 380);
		contentPane.add(withdrawalpanel);
		withdrawalpanel.setLayout(null);
		
		Transferlbl = new JLabel("Bank Money Transfer");
		Transferlbl.setFont(new Font("Anton", Font.PLAIN, 40));
		Transferlbl.setBounds(120, 11, 366, 63);
		withdrawalpanel.add(Transferlbl);
		
		JRadioButton bdobtn = new JRadioButton("");
		bdobtn.setBackground(new Color(255, 255, 255));
		bdobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinfields.setVisible(true);
				phonefields.setVisible(false);
			}
		});
		bdobtn.setBounds(59, 125, 22, 23);
		withdrawalpanel.add(bdobtn);
		
		JLabel text1 = new JLabel("Please choose the bank for your income transfer and fill up all the fields.");
		text1.setFont(new Font("Anton", Font.PLAIN, 15));
		text1.setBounds(69, 70, 444, 34);
		withdrawalpanel.add(text1);
		
		JLabel atmlbl1 = new JLabel("");
		atmlbl1.setIcon(bdo);
		atmlbl1.setBounds(87, 112, 78, 36);
		withdrawalpanel.add(atmlbl1);
		
		JRadioButton bpibutton = new JRadioButton("");
		bpibutton.setBackground(new Color(255, 255, 255));
		bpibutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pinfields.setVisible(true);
				phonefields.setVisible(false);
			}
		});
		bpibutton.setBounds(166, 125, 22, 23);
		withdrawalpanel.add(bpibutton);
		
		JLabel atmlbl2 = new JLabel("");
		atmlbl2.setIcon(bpi);
		atmlbl2.setBounds(194, 112, 78, 36);
		withdrawalpanel.add(atmlbl2);
		
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
		withdrawalpanel.add(mayabutton);
		
		JLabel atmlbl3 = new JLabel("");
		atmlbl3.setIcon(maya);
		atmlbl3.setBounds(310, 112, 78, 36);
		withdrawalpanel.add(atmlbl3);
		
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
		withdrawalpanel.add(gcashbutton);
		
		JLabel atmlbl4 = new JLabel("");
		atmlbl4.setIcon(gcash);
		atmlbl4.setBounds(425, 112, 78, 36);
		withdrawalpanel.add(atmlbl4);
		
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
                if (!Character.isDigit(c) || pinfields.getText().length() >= 9) {
                    e.consume();
                }
            }
        });
		
		withdrawalpanel.add(phonefields);
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
		withdrawalpanel.add(enteramount);
		
		pinfields = new JPasswordField();
		pinfields.setFont(new Font("Anton", Font.PLAIN, 20));
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
		withdrawalpanel.add(pinfields);
		
		JButton withdrawbutton = new JButton("Transfer");
		withdrawbutton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
		withdrawbutton.setFont(new Font("Anton", Font.PLAIN, 15));
		withdrawbutton.setBounds(212, 335, 134, 34);
		withdrawalpanel.add(withdrawbutton);
	}
}
