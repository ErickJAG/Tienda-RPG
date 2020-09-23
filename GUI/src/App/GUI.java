package App;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 630);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.text);
		contentPane.setBackground(new Color(0, 51, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Inventario", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel.setBackground(new Color(51, 102, 102));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, -144, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -443, SpringLayout.EAST, contentPane);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Tienda", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -5, SpringLayout.EAST, contentPane);
		panel_1.setBackground(new Color(51, 102, 102));
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 11, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_2, -11, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel);
		panel_2.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Stats", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(0, 102, 102));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(64, 98, 41, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(GUI.class.getResource("/App/Inventory Indicator.png")));
		lblNewLabel_2.setBounds(21, 10, 41, 48);
		panel.add(lblNewLabel_2);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setIcon(new ImageIcon(GUI.class.getResource("/App/Attack Indicator.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(59, 24, 89, 35);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("100");
		lblNewLabel_1_1.setIcon(new ImageIcon(GUI.class.getResource("/App/Defense Indicator.png")));
		lblNewLabel_1_1.setForeground(Color.MAGENTA);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(59, 69, 89, 35);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("100");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\eastorga\\eclipse-workspace\\Pruebas Projecto\\src\\App\\Mana Indicator.png"));
		lblNewLabel_1_2.setForeground(new Color(102, 102, 255));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(167, 24, 89, 35);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("100");
		lblNewLabel_1_3.setIcon(new ImageIcon(GUI.class.getResource("/App/Speed Indicator.png")));
		lblNewLabel_1_3.setForeground(Color.CYAN);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(167, 69, 89, 35);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("100");
		lblNewLabel_1_4.setIcon(new ImageIcon(GUI.class.getResource("/App/Health Indicator.png")));
		lblNewLabel_1_4.setForeground(new Color(255, 153, 255));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(279, 24, 89, 35);
		panel_2.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("100");
		lblNewLabel_1_5.setIcon(new ImageIcon(GUI.class.getResource("/App/Money Indicator.png")));
		lblNewLabel_1_5.setForeground(new Color(255, 255, 0));
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(279, 69, 112, 35);
		panel_2.add(lblNewLabel_1_5);
		
		JPanel panel_3 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_3, -11, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_3, -5, SpringLayout.EAST, contentPane);
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Descripcion", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel_3.setBackground(new Color(0, 102, 102));
		panel_1.setLayout(null);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
	}
}
