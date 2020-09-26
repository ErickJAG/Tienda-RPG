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

public class GUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;

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
		
		String opcion= "";
		
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent describir) {
				String command = describir.getActionCommand();
		        System.out.println("Selected: " + command);
			}
		};
		
		
		
	
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 630);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setForeground(SystemColor.text);
		PanelPrincipal.setBackground(new Color(0, 51, 0));
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		SpringLayout sl_PanelPrincipal = new SpringLayout();
		PanelPrincipal.setLayout(sl_PanelPrincipal);
		
		JPanel PanelInventario = new JPanel();
		PanelInventario.setOpaque(false);
		PanelInventario.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Inventario", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelInventario.setBackground(new Color(51, 102, 102));
		sl_PanelPrincipal.putConstraint(SpringLayout.NORTH, PanelInventario, 5, SpringLayout.NORTH, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.WEST, PanelInventario, 5, SpringLayout.WEST, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.SOUTH, PanelInventario, -144, SpringLayout.SOUTH, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.EAST, PanelInventario, -443, SpringLayout.EAST, PanelPrincipal);
		PanelPrincipal.add(PanelInventario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Tienda", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		sl_PanelPrincipal.putConstraint(SpringLayout.EAST, panel_1, -5, SpringLayout.EAST, PanelPrincipal);
		panel_1.setBackground(new Color(51, 102, 102));
		sl_PanelPrincipal.putConstraint(SpringLayout.NORTH, panel_1, 5, SpringLayout.NORTH, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.WEST, panel_1, 11, SpringLayout.EAST, PanelInventario);
		sl_PanelPrincipal.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, PanelInventario);
		PanelPrincipal.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		sl_PanelPrincipal.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, PanelInventario);
		sl_PanelPrincipal.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, PanelInventario);
		sl_PanelPrincipal.putConstraint(SpringLayout.SOUTH, panel_2, -11, SpringLayout.SOUTH, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, PanelInventario);
		panel_2.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Stats", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel_2.setOpaque(false);
		panel_2.setBackground(new Color(0, 102, 102));
		PanelInventario.setLayout(null);
		
		JLabel LogoInventario = new JLabel("");
		LogoInventario.setIcon(new ImageIcon(GUI.class.getResource("/App/Inventory Indicator.png")));
		LogoInventario.setBounds(10, 10, 41, 48);
		PanelInventario.add(LogoInventario);
		
		JPanel PanelArmasInv = new JPanel();
		PanelArmasInv.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armas", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelArmasInv.setOpaque(false);
		PanelArmasInv.setBounds(44, 52, 173, 140);
		PanelInventario.add(PanelArmasInv);
		PanelArmasInv.setLayout(null);
		
		JButton BtnArmaI1 = new JButton("");
		BtnArmaI1.setActionCommand("IArma1");
		BtnArmaI1.setBackground(new Color(0, 51, 0));
		BtnArmaI1.setRequestFocusEnabled(false);
		BtnArmaI1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaI1.setForeground(Color.GREEN);
		BtnArmaI1.setBorderPainted(false);
		BtnArmaI1.setFocusPainted(false);
		BtnArmaI1.setFocusTraversalKeysEnabled(false);
		BtnArmaI1.setFocusable(false);
		BtnArmaI1.setBounds(10, 20, 153, 21);
		BtnArmaI1.addActionListener(actionListener);
		PanelArmasInv.add(BtnArmaI1);
		
		JButton BtnArmaI2 = new JButton("");
		BtnArmaI2.setActionCommand("IArma2");
		BtnArmaI2.setRequestFocusEnabled(false);
		BtnArmaI2.setForeground(Color.GREEN);
		BtnArmaI2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaI2.setFocusable(false);
		BtnArmaI2.setFocusTraversalKeysEnabled(false);
		BtnArmaI2.setFocusPainted(false);
		BtnArmaI2.setBorderPainted(false);
		BtnArmaI2.setBackground(new Color(0, 51, 0));
		BtnArmaI2.setBounds(10, 41, 153, 21);
		BtnArmaI2.addActionListener(actionListener);
		PanelArmasInv.add(BtnArmaI2);
		
		JButton BtnArmaI3 = new JButton("");
		BtnArmaI3.setActionCommand("IArma3");
		BtnArmaI3.setRequestFocusEnabled(false);
		BtnArmaI3.setForeground(Color.GREEN);
		BtnArmaI3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaI3.setFocusable(false);
		BtnArmaI3.setFocusTraversalKeysEnabled(false);
		BtnArmaI3.setFocusPainted(false);
		BtnArmaI3.setBorderPainted(false);
		BtnArmaI3.setBackground(new Color(0, 51, 0));
		BtnArmaI3.setBounds(10, 61, 153, 21);
		BtnArmaI3.addActionListener(actionListener);
		PanelArmasInv.add(BtnArmaI3);
		
		JButton BtnArmaI4 = new JButton("");
		BtnArmaI4.setActionCommand("IArma4");
		BtnArmaI4.setRequestFocusEnabled(false);
		BtnArmaI4.setForeground(Color.GREEN);
		BtnArmaI4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaI4.setFocusable(false);
		BtnArmaI4.setFocusTraversalKeysEnabled(false);
		BtnArmaI4.setFocusPainted(false);
		BtnArmaI4.setBorderPainted(false);
		BtnArmaI4.setBackground(new Color(0, 51, 0));
		BtnArmaI4.setBounds(10, 82, 153, 21);
		BtnArmaI4.addActionListener(actionListener);
		PanelArmasInv.add(BtnArmaI4);
		
		JButton BtnArmaI5 = new JButton("");
		BtnArmaI5.setActionCommand("IArma5");
		BtnArmaI5.setBorderPainted(false);
		BtnArmaI5.setRequestFocusEnabled(false);
		BtnArmaI5.setForeground(Color.GREEN);
		BtnArmaI5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaI5.setFocusable(false);
		BtnArmaI5.setFocusTraversalKeysEnabled(false);
		BtnArmaI5.setFocusPainted(false);
		BtnArmaI5.setBackground(new Color(0, 51, 0));
		BtnArmaI5.setBounds(10, 102, 153, 21);
		BtnArmaI5.addActionListener(actionListener);
		PanelArmasInv.add(BtnArmaI5);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setOpaque(false);
		panel_4_1.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armadura", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel_4_1.setBounds(236, 52, 173, 140);
		PanelInventario.add(panel_4_1);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setActionCommand("IArmadura1");
		btnNewButton_1_3.setRequestFocusEnabled(false);
		btnNewButton_1_3.setForeground(Color.GREEN);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_3.setFocusPainted(false);
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(0, 51, 0));
		btnNewButton_1_3.setBounds(10, 20, 153, 21);
		btnNewButton_1_3.addActionListener(actionListener);
		panel_4_1.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setActionCommand("IArmadura2");
		btnNewButton_1_1_1.setRequestFocusEnabled(false);
		btnNewButton_1_1_1.setForeground(Color.GREEN);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1.setFocusable(false);
		btnNewButton_1_1_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBackground(new Color(0, 51, 0));
		btnNewButton_1_1_1.setBounds(10, 41, 153, 21);
		btnNewButton_1_1_1.addActionListener(actionListener);
		panel_4_1.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_3 = new JButton("");
		btnNewButton_1_2_3.setActionCommand("IArmadura3");
		btnNewButton_1_2_3.setRequestFocusEnabled(false);
		btnNewButton_1_2_3.setForeground(Color.GREEN);
		btnNewButton_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_3.setFocusable(false);
		btnNewButton_1_2_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_3.setFocusPainted(false);
		btnNewButton_1_2_3.setBorderPainted(false);
		btnNewButton_1_2_3.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_3.setBounds(10, 61, 153, 21);
		btnNewButton_1_2_3.addActionListener(actionListener);
		panel_4_1.add(btnNewButton_1_2_3);
		
		JButton btnNewButton_1_2_1_1 = new JButton("");
		btnNewButton_1_2_1_1.setActionCommand("IArmadura4");
		btnNewButton_1_2_1_1.setRequestFocusEnabled(false);
		btnNewButton_1_2_1_1.setForeground(Color.GREEN);
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_1_1.setFocusable(false);
		btnNewButton_1_2_1_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_1_1.setFocusPainted(false);
		btnNewButton_1_2_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_1_1.setBounds(10, 82, 153, 21);
		btnNewButton_1_2_1_1.addActionListener(actionListener);
		panel_4_1.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_2_1 = new JButton("");
		btnNewButton_1_2_2_1.setActionCommand("IArmadura5");
		btnNewButton_1_2_2_1.setRequestFocusEnabled(false);
		btnNewButton_1_2_2_1.setForeground(Color.GREEN);
		btnNewButton_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_2_1.setFocusable(false);
		btnNewButton_1_2_2_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_2_1.setFocusPainted(false);
		btnNewButton_1_2_2_1.setBorderPainted(false);
		btnNewButton_1_2_2_1.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_2_1.setBounds(10, 102, 153, 21);
		btnNewButton_1_2_2_1.addActionListener(actionListener);
		panel_4_1.add(btnNewButton_1_2_2_1);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setOpaque(false);
		panel_4_2.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Consumibles", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel_4_2.setBounds(44, 227, 173, 140);
		PanelInventario.add(panel_4_2);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setActionCommand("IConsumible1");
		btnNewButton_1_4.setRequestFocusEnabled(false);
		btnNewButton_1_4.setForeground(Color.GREEN);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_4.setFocusable(false);
		btnNewButton_1_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_4.setFocusPainted(false);
		btnNewButton_1_4.setBorderPainted(false);
		btnNewButton_1_4.setBackground(new Color(0, 51, 0));
		btnNewButton_1_4.setBounds(10, 20, 153, 21);
		btnNewButton_1_4.addActionListener(actionListener);
		panel_4_2.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setActionCommand("IConsumible2");
		btnNewButton_1_1_2.setRequestFocusEnabled(false);
		btnNewButton_1_1_2.setForeground(Color.GREEN);
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_2.setFocusable(false);
		btnNewButton_1_1_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_2.setFocusPainted(false);
		btnNewButton_1_1_2.setBorderPainted(false);
		btnNewButton_1_1_2.setBackground(new Color(0, 51, 0));
		btnNewButton_1_1_2.setBounds(10, 41, 153, 21);
		btnNewButton_1_1_2.addActionListener(actionListener);
		panel_4_2.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_2_4 = new JButton("");
		btnNewButton_1_2_4.setActionCommand("IConsumible3");
		btnNewButton_1_2_4.setRequestFocusEnabled(false);
		btnNewButton_1_2_4.setForeground(Color.GREEN);
		btnNewButton_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_4.setFocusable(false);
		btnNewButton_1_2_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_4.setFocusPainted(false);
		btnNewButton_1_2_4.setBorderPainted(false);
		btnNewButton_1_2_4.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_4.setBounds(10, 61, 153, 21);
		btnNewButton_1_2_4.addActionListener(actionListener);
		panel_4_2.add(btnNewButton_1_2_4);
		
		JButton btnNewButton_1_2_1_2 = new JButton("");
		btnNewButton_1_2_1_2.setActionCommand("IConsumible4");
		btnNewButton_1_2_1_2.setRequestFocusEnabled(false);
		btnNewButton_1_2_1_2.setForeground(Color.GREEN);
		btnNewButton_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_1_2.setFocusable(false);
		btnNewButton_1_2_1_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_1_2.setFocusPainted(false);
		btnNewButton_1_2_1_2.setBorderPainted(false);
		btnNewButton_1_2_1_2.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_1_2.setBounds(10, 82, 153, 21);
		btnNewButton_1_2_1_2.addActionListener(actionListener);
		panel_4_2.add(btnNewButton_1_2_1_2);
		
		JButton btnNewButton_1_2_2_2 = new JButton("");
		btnNewButton_1_2_2_2.setActionCommand("IConsumible5");
		btnNewButton_1_2_2_2.setRequestFocusEnabled(false);
		btnNewButton_1_2_2_2.setForeground(Color.GREEN);
		btnNewButton_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_2_2.setFocusable(false);
		btnNewButton_1_2_2_2.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_2_2.setFocusPainted(false);
		btnNewButton_1_2_2_2.setBorderPainted(false);
		btnNewButton_1_2_2_2.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_2_2.setBounds(10, 102, 153, 21);
		btnNewButton_1_2_2_2.addActionListener(actionListener);
		panel_4_2.add(btnNewButton_1_2_2_2);
		
		JButton BtnEquiparI = new JButton("Equipar");
		BtnEquiparI.setActionCommand("Equip");
		BtnEquiparI.setBorderPainted(false);
		BtnEquiparI.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 255, 0)));
		BtnEquiparI.setForeground(new Color(51, 255, 51));
		BtnEquiparI.setOpaque(false);
		BtnEquiparI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BtnEquiparI.setBackground(new Color(255, 255, 0));
		BtnEquiparI.setFocusPainted(false);
		BtnEquiparI.setFocusTraversalKeysEnabled(false);
		BtnEquiparI.setFocusable(false);
		BtnEquiparI.setBounds(261, 227, 129, 48);
		BtnEquiparI.addActionListener(actionListener);
		PanelInventario.add(BtnEquiparI);
		
		JButton BtnVender = new JButton("Vender");
		BtnVender.setActionCommand("Sell");
		BtnVender.setOpaque(false);
		BtnVender.setForeground(new Color(51, 255, 51));
		BtnVender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BtnVender.setFocusable(false);
		BtnVender.setFocusTraversalKeysEnabled(false);
		BtnVender.setFocusPainted(false);
		BtnVender.setBorderPainted(false);
		BtnVender.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 255, 0)));
		BtnVender.setBackground(Color.YELLOW);
		BtnVender.setBounds(261, 319, 129, 48);
		PanelInventario.add(BtnVender);
		PanelPrincipal.add(panel_2);
		BtnVender.addActionListener(actionListener);
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
		sl_PanelPrincipal.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_1);
		sl_PanelPrincipal.putConstraint(SpringLayout.WEST, panel_3, 0, SpringLayout.WEST, panel_1);
		sl_PanelPrincipal.putConstraint(SpringLayout.SOUTH, panel_3, -11, SpringLayout.SOUTH, PanelPrincipal);
		sl_PanelPrincipal.putConstraint(SpringLayout.EAST, panel_3, -5, SpringLayout.EAST, PanelPrincipal);
		panel_3.setOpaque(false);
		panel_3.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Descripcion", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel_3.setBackground(new Color(0, 102, 102));
		panel_1.setLayout(null);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setOpaque(false);
		panel_4_3.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armas", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		panel_4_3.setBounds(35, 51, 173, 140);
		panel_1.add(panel_4_3);
		
		JButton btnNewButton_1_5 = new JButton("Bate de Metal");
		btnNewButton_1_5.setActionCommand("TArma1");
		btnNewButton_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_5.setRequestFocusEnabled(false);
		btnNewButton_1_5.setForeground(Color.GREEN);
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_5.setFocusable(false);
		btnNewButton_1_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_5.setFocusPainted(false);
		btnNewButton_1_5.setBorderPainted(false);
		btnNewButton_1_5.setBackground(new Color(0, 51, 0));
		btnNewButton_1_5.setBounds(10, 20, 153, 21);
		btnNewButton_1_5.addActionListener(actionListener);
		panel_4_3.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_1_3 = new JButton("Daga Siniestra");
		btnNewButton_1_1_3.setActionCommand("TArma2");
		btnNewButton_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_3.setRequestFocusEnabled(false);
		btnNewButton_1_1_3.setForeground(Color.GREEN);
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_3.setFocusable(false);
		btnNewButton_1_1_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_3.setFocusPainted(false);
		btnNewButton_1_1_3.setBorderPainted(false);
		btnNewButton_1_1_3.setBackground(new Color(0, 51, 0));
		btnNewButton_1_1_3.setBounds(10, 41, 153, 21);
		btnNewButton_1_1_3.addActionListener(actionListener);
		panel_4_3.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_2_5 = new JButton("Guante Magico");
		btnNewButton_1_2_5.setActionCommand("TArma3");
		btnNewButton_1_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_5.setRequestFocusEnabled(false);
		btnNewButton_1_2_5.setForeground(Color.GREEN);
		btnNewButton_1_2_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_5.setFocusable(false);
		btnNewButton_1_2_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_5.setFocusPainted(false);
		btnNewButton_1_2_5.setBorderPainted(false);
		btnNewButton_1_2_5.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_5.setBounds(10, 61, 153, 21);
		btnNewButton_1_2_5.addActionListener(actionListener);
		panel_4_3.add(btnNewButton_1_2_5);
		
		JButton btnNewButton_1_2_1_3 = new JButton("Lanza Oscura");
		btnNewButton_1_2_1_3.setActionCommand("TArma4");
		btnNewButton_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_3.setRequestFocusEnabled(false);
		btnNewButton_1_2_1_3.setForeground(Color.GREEN);
		btnNewButton_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_1_3.setFocusable(false);
		btnNewButton_1_2_1_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_1_3.setFocusPainted(false);
		btnNewButton_1_2_1_3.setBorderPainted(false);
		btnNewButton_1_2_1_3.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_1_3.setBounds(10, 82, 153, 21);
		btnNewButton_1_2_1_3.addActionListener(actionListener);
		panel_4_3.add(btnNewButton_1_2_1_3);
		
		JButton btnNewButton_1_2_2_3 = new JButton("Zweihander");
		btnNewButton_1_2_2_3.setActionCommand("TArma5");
		btnNewButton_1_2_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_2_3.setRequestFocusEnabled(false);
		btnNewButton_1_2_2_3.setForeground(Color.GREEN);
		btnNewButton_1_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_2_3.setFocusable(false);
		btnNewButton_1_2_2_3.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_2_3.setFocusPainted(false);
		btnNewButton_1_2_2_3.setBorderPainted(false);
		btnNewButton_1_2_2_3.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_2_3.setBounds(10, 102, 153, 21);
		btnNewButton_1_2_2_3.addActionListener(actionListener);
		panel_4_3.add(btnNewButton_1_2_2_3);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setLayout(null);
		panel_4_4.setOpaque(false);
		panel_4_4.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armadura", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel_4_4.setBounds(221, 51, 173, 140);
		panel_1.add(panel_4_4);
		
		JButton btnNewButton_1_6 = new JButton("Cadenas");
		btnNewButton_1_6.setActionCommand("TArmadura1");
		btnNewButton_1_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_6.setRequestFocusEnabled(false);
		btnNewButton_1_6.setForeground(Color.GREEN);
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_6.setFocusable(false);
		btnNewButton_1_6.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_6.setFocusPainted(false);
		btnNewButton_1_6.setBorderPainted(false);
		btnNewButton_1_6.setBackground(new Color(0, 51, 0));
		btnNewButton_1_6.setBounds(10, 20, 153, 21);
		btnNewButton_1_6.addActionListener(actionListener);
		panel_4_4.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_1_4 = new JButton("Chaqueta Pesada");
		btnNewButton_1_1_4.setActionCommand("TArmadura2");
		btnNewButton_1_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_4.setRequestFocusEnabled(false);
		btnNewButton_1_1_4.setForeground(Color.GREEN);
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_4.setFocusable(false);
		btnNewButton_1_1_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_4.setFocusPainted(false);
		btnNewButton_1_1_4.setBorderPainted(false);
		btnNewButton_1_1_4.setBackground(new Color(0, 51, 0));
		btnNewButton_1_1_4.setBounds(10, 41, 153, 21);
		btnNewButton_1_1_4.addActionListener(actionListener);
		panel_4_4.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_2_6 = new JButton("Bata Oscura");
		btnNewButton_1_2_6.setActionCommand("TArmadura3");
		btnNewButton_1_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_6.setRequestFocusEnabled(false);
		btnNewButton_1_2_6.setForeground(Color.GREEN);
		btnNewButton_1_2_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_6.setFocusable(false);
		btnNewButton_1_2_6.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_6.setFocusPainted(false);
		btnNewButton_1_2_6.setBorderPainted(false);
		btnNewButton_1_2_6.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_6.setBounds(10, 61, 153, 21);
		btnNewButton_1_2_6.addActionListener(actionListener);
		panel_4_4.add(btnNewButton_1_2_6);
		
		JButton btnNewButton_1_2_1_4 = new JButton("Capa Angelical");
		btnNewButton_1_2_1_4.setActionCommand("TArmadura4");
		btnNewButton_1_2_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_4.setRequestFocusEnabled(false);
		btnNewButton_1_2_1_4.setForeground(Color.GREEN);
		btnNewButton_1_2_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_1_4.setFocusable(false);
		btnNewButton_1_2_1_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_1_4.setFocusPainted(false);
		btnNewButton_1_2_1_4.setBorderPainted(false);
		btnNewButton_1_2_1_4.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_1_4.setBounds(10, 82, 153, 21);
		btnNewButton_1_2_1_4.addActionListener(actionListener);
		panel_4_4.add(btnNewButton_1_2_1_4);
		
		JButton btnNewButton_1_2_2_4 = new JButton("Placa Paladin");
		btnNewButton_1_2_2_4.setActionCommand("TArmadura5");
		btnNewButton_1_2_2_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_2_4.setRequestFocusEnabled(false);
		btnNewButton_1_2_2_4.setForeground(Color.GREEN);
		btnNewButton_1_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_2_4.setFocusable(false);
		btnNewButton_1_2_2_4.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_2_4.setFocusPainted(false);
		btnNewButton_1_2_2_4.setBorderPainted(false);
		btnNewButton_1_2_2_4.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_2_4.setBounds(10, 102, 153, 21);
		btnNewButton_1_2_2_4.addActionListener(actionListener);
		panel_4_4.add(btnNewButton_1_2_2_4);
		
		JPanel panel_4_5 = new JPanel();
		panel_4_5.setLayout(null);
		panel_4_5.setOpaque(false);
		panel_4_5.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Consumibles", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		panel_4_5.setBounds(35, 225, 173, 140);
		panel_1.add(panel_4_5);
		
		JButton btnNewButton_1_7 = new JButton("Medicina");
		btnNewButton_1_7.setActionCommand("TConsumible1");
		btnNewButton_1_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_7.setRequestFocusEnabled(false);
		btnNewButton_1_7.setForeground(Color.GREEN);
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_7.setFocusable(false);
		btnNewButton_1_7.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_7.setFocusPainted(false);
		btnNewButton_1_7.setBorderPainted(false);
		btnNewButton_1_7.setBackground(new Color(0, 51, 0));
		btnNewButton_1_7.setBounds(10, 20, 153, 21);
		btnNewButton_1_7.addActionListener(actionListener);
		panel_4_5.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_1_5 = new JButton("Pocion de Mana");
		btnNewButton_1_1_5.setActionCommand("TConsumible2");
		btnNewButton_1_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_5.setRequestFocusEnabled(false);
		btnNewButton_1_1_5.setForeground(Color.GREEN);
		btnNewButton_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_5.setFocusable(false);
		btnNewButton_1_1_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_1_5.setFocusPainted(false);
		btnNewButton_1_1_5.setBorderPainted(false);
		btnNewButton_1_1_5.setBackground(new Color(0, 51, 0));
		btnNewButton_1_1_5.setBounds(10, 41, 153, 21);
		btnNewButton_1_1_5.addActionListener(actionListener);
		panel_4_5.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_2_7 = new JButton("Gema Reflectora");
		btnNewButton_1_2_7.setActionCommand("TConsumible3");
		btnNewButton_1_2_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_7.setRequestFocusEnabled(false);
		btnNewButton_1_2_7.setForeground(Color.GREEN);
		btnNewButton_1_2_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_7.setFocusable(false);
		btnNewButton_1_2_7.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_7.setFocusPainted(false);
		btnNewButton_1_2_7.setBorderPainted(false);
		btnNewButton_1_2_7.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_7.setBounds(10, 61, 153, 21);
		btnNewButton_1_2_7.addActionListener(actionListener);
		panel_4_5.add(btnNewButton_1_2_7);
		
		JButton btnNewButton_1_2_1_5 = new JButton("1-UP");
		btnNewButton_1_2_1_5.setActionCommand("TConsumible4");
		btnNewButton_1_2_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_5.setRequestFocusEnabled(false);
		btnNewButton_1_2_1_5.setForeground(Color.GREEN);
		btnNewButton_1_2_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_1_5.setFocusable(false);
		btnNewButton_1_2_1_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_1_5.setFocusPainted(false);
		btnNewButton_1_2_1_5.setBorderPainted(false);
		btnNewButton_1_2_1_5.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_1_5.setBounds(10, 82, 153, 21);
		btnNewButton_1_2_1_5.addActionListener(actionListener);
		panel_4_5.add(btnNewButton_1_2_1_5);
		
		JButton btnNewButton_1_2_2_5 = new JButton("Restaurador");
		btnNewButton_1_2_2_5.setActionCommand("TConsumible5");
		btnNewButton_1_2_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_2_5.setRequestFocusEnabled(false);
		btnNewButton_1_2_2_5.setForeground(Color.GREEN);
		btnNewButton_1_2_2_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_2_2_5.setFocusable(false);
		btnNewButton_1_2_2_5.setFocusTraversalKeysEnabled(false);
		btnNewButton_1_2_2_5.setFocusPainted(false);
		btnNewButton_1_2_2_5.setBorderPainted(false);
		btnNewButton_1_2_2_5.setBackground(new Color(0, 51, 0));
		btnNewButton_1_2_2_5.setBounds(10, 102, 153, 21);
		btnNewButton_1_2_2_5.addActionListener(actionListener);
		panel_4_5.add(btnNewButton_1_2_2_5);
		
		JButton BtnComprar = new JButton("Comprar");
		BtnComprar.setActionCommand("Buy");
		BtnComprar.setOpaque(false);
		BtnComprar.setForeground(new Color(51, 255, 51));
		BtnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BtnComprar.setFocusable(false);
		BtnComprar.setFocusTraversalKeysEnabled(false);
		BtnComprar.setFocusPainted(false);
		BtnComprar.setBorderPainted(false);
		BtnComprar.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 255, 0)));
		BtnComprar.setBackground(Color.YELLOW);
		BtnComprar.setBounds(243, 221, 129, 48);
		BtnComprar.addActionListener(actionListener);
		panel_1.add(BtnComprar);
		
		JButton btnDescripcion = new JButton("Descripcion");
		btnDescripcion.setActionCommand("Description");
		btnDescripcion.setOpaque(false);
		btnDescripcion.setForeground(new Color(51, 255, 51));
		btnDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDescripcion.setFocusable(false);
		btnDescripcion.setFocusTraversalKeysEnabled(false);
		btnDescripcion.setFocusPainted(false);
		btnDescripcion.setBorderPainted(false);
		btnDescripcion.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 255, 0)));
		btnDescripcion.setBackground(Color.YELLOW);
		btnDescripcion.setBounds(243, 317, 129, 48);
		btnDescripcion.addActionListener(actionListener);
		panel_1.add(btnDescripcion);
		
		JLabel LogoInventario_1 = new JLabel("");
		LogoInventario_1.setIcon(new ImageIcon(GUI.class.getResource("/App/Shop Indicator.png")));
		LogoInventario_1.setBounds(10, 10, 50, 48);
		panel_1.add(LogoInventario_1);
		PanelPrincipal.add(panel_3);
		panel_3.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
		
	
}
