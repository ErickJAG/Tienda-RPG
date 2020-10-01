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
	private JPanel PanelGeneral;
	public static JButton BtnArmaI1;
	public static JButton BtnArmaI2;
	public static JButton BtnArmaI3;
	public static JButton BtnArmaI4;
	public static JButton BtnArmaI5;
	public static JButton BtnArmaduraI1;
	public static JButton BtnArmaduraI2;
	public static JButton BtnArmaduraI3;
	public static JButton BtnArmaduraI4;
	public static JButton BtnArmaduraI5;
	public static JButton BtnConsumibleI1;
	public static JButton BtnConsumibleI2;
	public static JButton BtnConsumibleI3;
	public static JButton BtnConsumibleI4;
	public static JButton BtnConsumibleI5;
	public static JButton BtnArmaT1;
	public static JButton BtnArmaT2;
	public static JButton BtnArmaT3;
	public static JButton BtnArmaT4;
	public static JButton BtnArmaT5;
	public static JButton BtnArmaduraT1;
	public static JButton BtnArmaduraT2;
	public static JButton BtnArmaduraT3;
	public static JButton BtnArmaduraT4;
	public static JButton BtnArmaduraT5;
	public static JButton BtnConsumibleT1;
	public static JButton BtnConsumibleT2;
	public static JButton BtnConsumibleT3;
	public static JButton BtnConsumibleT4;
	public static JButton BtnConsumibleT5;
	private static String OpcionTie= "";
	private static String OpcionInv= "";
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
		Character personaje = new Character();
		personaje.Ataque= 10;
        personaje.Vida= 100;
        personaje.Dinero= 5000;
        personaje.Mana= 15;
        personaje.Defensa= 25;
        personaje.Velocidad= 125;
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent describir) {	
				String command = describir.getActionCommand();
				if (command == "IArma1"){
					if(!(BtnArmaI1.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(102, 0, 255));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaI1.getActionCommand();
					}
				}else if(command == "IArma2"){
					if(!(BtnArmaI2.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(102, 0, 255));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaI2.getActionCommand();
					}
				}else if(command == "IArma3"){
					if(!(BtnArmaI3.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(102, 0, 255));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaI3.getActionCommand();
					}
				}else if(command == "IArma4"){
					if(!(BtnArmaI4.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(102, 0, 255));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaI4.getActionCommand();
					}
				}else if(command == "IArma5"){
					if(!(BtnArmaI5.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(102, 0, 255));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaI5.getActionCommand();
					}
				}else if(command == "IArmadura1"){
					if(!(BtnArmaduraI1.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(102, 0, 255));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaduraI1.getActionCommand();
					}
				}else if(command == "IArmadura2"){
					if(!(BtnArmaduraI2.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(102, 0, 255));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaduraI2.getActionCommand();
					}
				}else if(command == "IArmadura3"){
					if(!(BtnArmaduraI3.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(102, 0, 255));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaduraI3.getActionCommand();
					}
				}else if(command == "IArmadura4"){
					if(!(BtnArmaduraI4.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(102, 0, 255));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaduraI4.getActionCommand();
					}
				}else if(command == "IArmadura5"){
					if(!(BtnArmaduraI5.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(102, 0, 255));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnArmaduraI5.getActionCommand();
					}
				}else if(command == "IConsumible1"){
					if(!(BtnConsumibleI1.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(102, 0, 255));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnConsumibleI1.getActionCommand();
					}
				}else if(command == "IConsumible2"){
					if(!(BtnConsumibleI2.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(102, 0, 255));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnConsumibleI2.getActionCommand();
					}
				}else if(command == "IConsumible3"){
					if(!(BtnConsumibleI3.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(102, 0, 255));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnConsumibleI3.getActionCommand();
					}
				}else if(command == "IConsumible4"){
					if(!(BtnConsumibleI4.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(102, 0, 255));
						BtnConsumibleI5.setBackground(new Color(0, 51, 0));
						OpcionInv = BtnConsumibleI4.getActionCommand();
					}
				}else if(command == "IConsumible5"){
					if(!(BtnConsumibleI5.getText()).equals("")) {
						BtnArmaI1.setBackground(new Color(0, 51, 0));
						BtnArmaI2.setBackground(new Color(0, 51, 0));
						BtnArmaI3.setBackground(new Color(0, 51, 0));
						BtnArmaI4.setBackground(new Color(0, 51, 0));
						BtnArmaI5.setBackground(new Color(0, 51, 0));
						BtnArmaduraI1.setBackground(new Color(0, 51, 0));
						BtnArmaduraI2.setBackground(new Color(0, 51, 0));
						BtnArmaduraI3.setBackground(new Color(0, 51, 0));
						BtnArmaduraI4.setBackground(new Color(0, 51, 0));
						BtnArmaduraI5.setBackground(new Color(0, 51, 0));
						BtnConsumibleI1.setBackground(new Color(0, 51, 0));
						BtnConsumibleI2.setBackground(new Color(0, 51, 0));
						BtnConsumibleI3.setBackground(new Color(0, 51, 0));
						BtnConsumibleI4.setBackground(new Color(0, 51, 0));
						BtnConsumibleI5.setBackground(new Color(102, 0, 255));
						OpcionInv = BtnConsumibleI5.getActionCommand();
					}
				}else if (command == "TArma1"){
					OpcionTie = BtnArmaT1.getText();
					BtnArmaT1.setBackground(new Color(102, 0, 255));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArma2"){
					OpcionTie = BtnArmaT2.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(102, 0, 255));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArma3"){
					OpcionTie = BtnArmaT3.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(102, 0, 255));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArma4"){
					OpcionTie = BtnArmaT4.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(102, 0, 255));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArma5"){
					OpcionTie = BtnArmaT5.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(102, 0, 255));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArmadura1"){
					OpcionTie = BtnArmaduraT1.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(102, 0, 255));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArmadura2"){
					OpcionTie =  BtnArmaduraT2.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(102, 0, 255));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArmadura3"){
					OpcionTie =  BtnArmaduraT3.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(102, 0, 255));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArmadura4"){
					OpcionTie =  BtnArmaduraT4.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(102, 0, 255));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TArmadura5"){
					OpcionTie =  BtnArmaduraT5.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(102, 0, 255));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TConsumible1"){
					OpcionTie = BtnConsumibleT1.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(102, 0, 255));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TConsumible2"){
					OpcionTie = BtnConsumibleT2.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(102, 0, 255));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TConsumible3"){
					OpcionTie = BtnConsumibleT3.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(102, 0, 255));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TConsumible4"){
					OpcionTie = BtnConsumibleT4.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(102, 0, 255));
					BtnConsumibleT5.setBackground(new Color(0, 51, 0));
				}else if(command == "TConsumible5"){
					OpcionTie = BtnConsumibleT5.getText();
					BtnArmaT1.setBackground(new Color(0, 51, 0));
					BtnArmaT2.setBackground(new Color(0, 51, 0));
					BtnArmaT3.setBackground(new Color(0, 51, 0));
					BtnArmaT4.setBackground(new Color(0, 51, 0));
					BtnArmaT5.setBackground(new Color(0, 51, 0));
					BtnArmaduraT1.setBackground(new Color(0, 51, 0));
					BtnArmaduraT2.setBackground(new Color(0, 51, 0));
					BtnArmaduraT3.setBackground(new Color(0, 51, 0));
					BtnArmaduraT4.setBackground(new Color(0, 51, 0));
					BtnArmaduraT5.setBackground(new Color(0, 51, 0));
					BtnConsumibleT1.setBackground(new Color(0, 51, 0));
					BtnConsumibleT2.setBackground(new Color(0, 51, 0));
					BtnConsumibleT3.setBackground(new Color(0, 51, 0));
					BtnConsumibleT4.setBackground(new Color(0, 51, 0));
					BtnConsumibleT5.setBackground(new Color(102, 0, 255));
				}else if(command == "Equip" & ! OpcionInv.equals("")){
					OpcionInv = "";//aqui se llama a metodo character para equipar
				}else if(command.equals("Sell") & ! OpcionInv.equals("")){//aqui se llama a metodo character para vender
					Character.vender(OpcionInv);
				}else if(command.equals("Buy") & ! OpcionTie.equals("")){
					Character.comprar(OpcionTie);//aqui se llama a metodo de tienda para comprar
				}else if(command == "Descrition" & ! OpcionTie.equals("")){
					OpcionTie = "";//aqui se llama a metodo de tienda para mostrar stats
				}
			}
		};
		
		
		
	
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 630);
		PanelGeneral = new JPanel();
		PanelGeneral.setForeground(SystemColor.text);
		PanelGeneral.setBackground(new Color(0, 51, 0));
		PanelGeneral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelGeneral);
		SpringLayout sl_PanelGeneral = new SpringLayout();
		PanelGeneral.setLayout(sl_PanelGeneral);
		
		JPanel PanelInventarioo = new JPanel();
		PanelInventarioo.setOpaque(false);
		PanelInventarioo.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Inventario", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelInventarioo.setBackground(new Color(51, 102, 102));
		sl_PanelGeneral.putConstraint(SpringLayout.NORTH, PanelInventarioo, 5, SpringLayout.NORTH, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.WEST, PanelInventarioo, 5, SpringLayout.WEST, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.SOUTH, PanelInventarioo, -144, SpringLayout.SOUTH, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.EAST, PanelInventarioo, -443, SpringLayout.EAST, PanelGeneral);
		PanelGeneral.add(PanelInventarioo);
		
		JPanel PanelTienda = new JPanel();
		PanelTienda.setOpaque(false);
		PanelTienda.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Tienda", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		sl_PanelGeneral.putConstraint(SpringLayout.EAST, PanelTienda, -5, SpringLayout.EAST, PanelGeneral);
		PanelTienda.setBackground(new Color(51, 102, 102));
		sl_PanelGeneral.putConstraint(SpringLayout.NORTH, PanelTienda, 5, SpringLayout.NORTH, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.WEST, PanelTienda, 11, SpringLayout.EAST, PanelInventarioo);
		sl_PanelGeneral.putConstraint(SpringLayout.SOUTH, PanelTienda, 0, SpringLayout.SOUTH, PanelInventarioo);
		PanelGeneral.add(PanelTienda);
		
		JPanel PanelStats = new JPanel();
		sl_PanelGeneral.putConstraint(SpringLayout.NORTH, PanelStats, 6, SpringLayout.SOUTH, PanelInventarioo);
		sl_PanelGeneral.putConstraint(SpringLayout.WEST, PanelStats, 0, SpringLayout.WEST, PanelInventarioo);
		sl_PanelGeneral.putConstraint(SpringLayout.SOUTH, PanelStats, -11, SpringLayout.SOUTH, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.EAST, PanelStats, 0, SpringLayout.EAST, PanelInventarioo);
		PanelStats.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Stats", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelStats.setOpaque(false);
		PanelStats.setBackground(new Color(0, 102, 102));
		PanelInventarioo.setLayout(null);
		
		JLabel LogoInventario = new JLabel("");
		LogoInventario.setIcon(new ImageIcon(GUI.class.getResource("/App/Inventory Indicator.png")));
		LogoInventario.setBounds(10, 10, 41, 48);
		PanelInventarioo.add(LogoInventario);
		
		JPanel PanelInvArmas = new JPanel();
		PanelInvArmas.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armas", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelInvArmas.setOpaque(false);
		PanelInvArmas.setBounds(44, 52, 173, 140);
		PanelInventarioo.add(PanelInvArmas);
		PanelInvArmas.setLayout(null);
		
		BtnArmaI1 = new JButton("");
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
		PanelInvArmas.add(BtnArmaI1);
		
		BtnArmaI2 = new JButton("");
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
		PanelInvArmas.add(BtnArmaI2);
		
		BtnArmaI3 = new JButton("");
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
		PanelInvArmas.add(BtnArmaI3);
		
		BtnArmaI4 = new JButton("");
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
		PanelInvArmas.add(BtnArmaI4);
		
		BtnArmaI5 = new JButton("");
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
		PanelInvArmas.add(BtnArmaI5);
		
		JPanel PanelInvArmor = new JPanel();
		PanelInvArmor.setLayout(null);
		PanelInvArmor.setOpaque(false);
		PanelInvArmor.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armadura", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		PanelInvArmor.setBounds(236, 52, 173, 140);
		PanelInventarioo.add(PanelInvArmor);
		
		BtnArmaduraI1 = new JButton("");
		BtnArmaduraI1.setActionCommand("IArmadura1");
		BtnArmaduraI1.setRequestFocusEnabled(false);
		BtnArmaduraI1.setForeground(Color.GREEN);
		BtnArmaduraI1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraI1.setFocusable(false);
		BtnArmaduraI1.setFocusTraversalKeysEnabled(false);
		BtnArmaduraI1.setFocusPainted(false);
		BtnArmaduraI1.setBorderPainted(false);
		BtnArmaduraI1.setBackground(new Color(0, 51, 0));
		BtnArmaduraI1.setBounds(10, 20, 153, 21);
		BtnArmaduraI1.addActionListener(actionListener);
		PanelInvArmor.add(BtnArmaduraI1);
		
		BtnArmaduraI2 = new JButton("");
		BtnArmaduraI2.setActionCommand("IArmadura2");
		BtnArmaduraI2.setRequestFocusEnabled(false);
		BtnArmaduraI2.setForeground(Color.GREEN);
		BtnArmaduraI2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraI2.setFocusable(false);
		BtnArmaduraI2.setFocusTraversalKeysEnabled(false);
		BtnArmaduraI2.setFocusPainted(false);
		BtnArmaduraI2.setBorderPainted(false);
		BtnArmaduraI2.setBackground(new Color(0, 51, 0));
		BtnArmaduraI2.setBounds(10, 41, 153, 21);
		BtnArmaduraI2.addActionListener(actionListener);
		PanelInvArmor.add(BtnArmaduraI2);
		
		BtnArmaduraI3 = new JButton("");
		BtnArmaduraI3.setActionCommand("IArmadura3");
		BtnArmaduraI3.setRequestFocusEnabled(false);
		BtnArmaduraI3.setForeground(Color.GREEN);
		BtnArmaduraI3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraI3.setFocusable(false);
		BtnArmaduraI3.setFocusTraversalKeysEnabled(false);
		BtnArmaduraI3.setFocusPainted(false);
		BtnArmaduraI3.setBorderPainted(false);
		BtnArmaduraI3.setBackground(new Color(0, 51, 0));
		BtnArmaduraI3.setBounds(10, 61, 153, 21);
		BtnArmaduraI3.addActionListener(actionListener);
		PanelInvArmor.add(BtnArmaduraI3);
		
		BtnArmaduraI4 = new JButton("");
		BtnArmaduraI4.setActionCommand("IArmadura4");
		BtnArmaduraI4.setRequestFocusEnabled(false);
		BtnArmaduraI4.setForeground(Color.GREEN);
		BtnArmaduraI4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraI4.setFocusable(false);
		BtnArmaduraI4.setFocusTraversalKeysEnabled(false);
		BtnArmaduraI4.setFocusPainted(false);
		BtnArmaduraI4.setBorderPainted(false);
		BtnArmaduraI4.setBackground(new Color(0, 51, 0));
		BtnArmaduraI4.setBounds(10, 82, 153, 21);
		BtnArmaduraI4.addActionListener(actionListener);
		PanelInvArmor.add(BtnArmaduraI4);
		
		BtnArmaduraI5 = new JButton("");
		BtnArmaduraI5.setActionCommand("IArmadura5");
		BtnArmaduraI5.setRequestFocusEnabled(false);
		BtnArmaduraI5.setForeground(Color.GREEN);
		BtnArmaduraI5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraI5.setFocusable(false);
		BtnArmaduraI5.setFocusTraversalKeysEnabled(false);
		BtnArmaduraI5.setFocusPainted(false);
		BtnArmaduraI5.setBorderPainted(false);
		BtnArmaduraI5.setBackground(new Color(0, 51, 0));
		BtnArmaduraI5.setBounds(10, 102, 153, 21);
		BtnArmaduraI5.addActionListener(actionListener);
		PanelInvArmor.add(BtnArmaduraI5);
		
		JPanel PanelInvConsu = new JPanel();
		PanelInvConsu.setLayout(null);
		PanelInvConsu.setOpaque(false);
		PanelInvConsu.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Consumibles", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		PanelInvConsu.setBounds(44, 227, 173, 140);
		PanelInventarioo.add(PanelInvConsu);
		
		BtnConsumibleI1 = new JButton("");
		BtnConsumibleI1.setActionCommand("IConsumible1");
		BtnConsumibleI1.setRequestFocusEnabled(false);
		BtnConsumibleI1.setForeground(Color.GREEN);
		BtnConsumibleI1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleI1.setFocusable(false);
		BtnConsumibleI1.setFocusTraversalKeysEnabled(false);
		BtnConsumibleI1.setFocusPainted(false);
		BtnConsumibleI1.setBorderPainted(false);
		BtnConsumibleI1.setBackground(new Color(0, 51, 0));
		BtnConsumibleI1.setBounds(10, 20, 153, 21);
		BtnConsumibleI1.addActionListener(actionListener);
		PanelInvConsu.add(BtnConsumibleI1);
		
		BtnConsumibleI2 = new JButton("");
		BtnConsumibleI2.setActionCommand("IConsumible2");
		BtnConsumibleI2.setRequestFocusEnabled(false);
		BtnConsumibleI2.setForeground(Color.GREEN);
		BtnConsumibleI2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleI2.setFocusable(false);
		BtnConsumibleI2.setFocusTraversalKeysEnabled(false);
		BtnConsumibleI2.setFocusPainted(false);
		BtnConsumibleI2.setBorderPainted(false);
		BtnConsumibleI2.setBackground(new Color(0, 51, 0));
		BtnConsumibleI2.setBounds(10, 41, 153, 21);
		BtnConsumibleI2.addActionListener(actionListener);
		PanelInvConsu.add(BtnConsumibleI2);
		
		BtnConsumibleI3 = new JButton("");
		BtnConsumibleI3.setActionCommand("IConsumible3");
		BtnConsumibleI3.setRequestFocusEnabled(false);
		BtnConsumibleI3.setForeground(Color.GREEN);
		BtnConsumibleI3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleI3.setFocusable(false);
		BtnConsumibleI3.setFocusTraversalKeysEnabled(false);
		BtnConsumibleI3.setFocusPainted(false);
		BtnConsumibleI3.setBorderPainted(false);
		BtnConsumibleI3.setBackground(new Color(0, 51, 0));
		BtnConsumibleI3.setBounds(10, 61, 153, 21);
		BtnConsumibleI3.addActionListener(actionListener);
		PanelInvConsu.add(BtnConsumibleI3);
		
		BtnConsumibleI4 = new JButton("");
		BtnConsumibleI4.setActionCommand("IConsumible4");
		BtnConsumibleI4.setRequestFocusEnabled(false);
		BtnConsumibleI4.setForeground(Color.GREEN);
		BtnConsumibleI4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleI4.setFocusable(false);
		BtnConsumibleI4.setFocusTraversalKeysEnabled(false);
		BtnConsumibleI4.setFocusPainted(false);
		BtnConsumibleI4.setBorderPainted(false);
		BtnConsumibleI4.setBackground(new Color(0, 51, 0));
		BtnConsumibleI4.setBounds(10, 82, 153, 21);
		BtnConsumibleI4.addActionListener(actionListener);
		PanelInvConsu.add(BtnConsumibleI4);
		
		BtnConsumibleI5 = new JButton("");
		BtnConsumibleI5.setActionCommand("IConsumible5");
		BtnConsumibleI5.setRequestFocusEnabled(false);
		BtnConsumibleI5.setForeground(Color.GREEN);
		BtnConsumibleI5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleI5.setFocusable(false);
		BtnConsumibleI5.setFocusTraversalKeysEnabled(false);
		BtnConsumibleI5.setFocusPainted(false);
		BtnConsumibleI5.setBorderPainted(false);
		BtnConsumibleI5.setBackground(new Color(0, 51, 0));
		BtnConsumibleI5.setBounds(10, 102, 153, 21);
		BtnConsumibleI5.addActionListener(actionListener);
		PanelInvConsu.add(BtnConsumibleI5);
		
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
		PanelInventarioo.add(BtnEquiparI);
		
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
		PanelInventarioo.add(BtnVender);
		PanelGeneral.add(PanelStats);
		BtnVender.addActionListener(actionListener);
		PanelStats.setLayout(null);
		
		JLabel StatAtk = new JLabel();
		StatAtk.setText(String.valueOf(personaje.Ataque));
		StatAtk.setIcon(new ImageIcon(GUI.class.getResource("/App/Attack Indicator.png")));
		StatAtk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatAtk.setForeground(Color.RED);
		StatAtk.setBounds(59, 24, 89, 35);
		PanelStats.add(StatAtk);
		
		JLabel StatDfs = new JLabel();
		StatDfs.setText(String.valueOf(personaje.Defensa));
		StatDfs.setIcon(new ImageIcon(GUI.class.getResource("/App/Defense Indicator.png")));
		StatDfs.setForeground(Color.MAGENTA);
		StatDfs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatDfs.setBounds(59, 69, 89, 35);
		PanelStats.add(StatDfs);
		
		JLabel StatMna = new JLabel();
		StatMna.setText(String.valueOf(personaje.Mana));
		StatMna.setIcon(new ImageIcon(GUI.class.getResource("/App/Mana Indicator.png")));
		StatMna.setForeground(new Color(102, 102, 255));
		StatMna.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatMna.setBounds(167, 24, 89, 35);
		PanelStats.add(StatMna);
		
		JLabel StatSpd = new JLabel();
		StatSpd.setText(String.valueOf(personaje.Velocidad));
		StatSpd.setIcon(new ImageIcon(GUI.class.getResource("/App/Speed Indicator.png")));
		StatSpd.setForeground(Color.CYAN);
		StatSpd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatSpd.setBounds(167, 69, 89, 35);
		PanelStats.add(StatSpd);
		
		JLabel StatHlth = new JLabel();
		StatHlth.setText(String.valueOf(personaje.Vida));
		StatHlth.setIcon(new ImageIcon(GUI.class.getResource("/App/Health Indicator.png")));
		StatHlth.setForeground(new Color(255, 153, 255));
		StatHlth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatHlth.setBounds(279, 24, 89, 35);
		PanelStats.add(StatHlth);
		
		JLabel StatMny = new JLabel();
		StatMny.setText(String.valueOf(personaje.Dinero));
		StatMny.setIcon(new ImageIcon(GUI.class.getResource("/App/Money Indicator.png")));
		StatMny.setForeground(new Color(255, 255, 0));
		StatMny.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatMny.setBounds(279, 69, 112, 35);
		PanelStats.add(StatMny);
		
		JPanel PanelDesc = new JPanel();
		sl_PanelGeneral.putConstraint(SpringLayout.NORTH, PanelDesc, 6, SpringLayout.SOUTH, PanelTienda);
		sl_PanelGeneral.putConstraint(SpringLayout.WEST, PanelDesc, 0, SpringLayout.WEST, PanelTienda);
		sl_PanelGeneral.putConstraint(SpringLayout.SOUTH, PanelDesc, -11, SpringLayout.SOUTH, PanelGeneral);
		sl_PanelGeneral.putConstraint(SpringLayout.EAST, PanelDesc, -5, SpringLayout.EAST, PanelGeneral);
		PanelDesc.setOpaque(false);
		PanelDesc.setBorder(new TitledBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 255, 0)), "Descripcion", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelDesc.setBackground(new Color(0, 102, 102));
		PanelTienda.setLayout(null);
		
		JPanel PanelTieArmas = new JPanel();
		PanelTieArmas.setLayout(null);
		PanelTieArmas.setOpaque(false);
		PanelTieArmas.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armas", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GREEN));
		PanelTieArmas.setBounds(35, 51, 173, 140);
		PanelTienda.add(PanelTieArmas);
		
		BtnArmaT1 = new JButton("Bate de Metal");
		BtnArmaT1.setActionCommand("TArma1");
		BtnArmaT1.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaT1.setRequestFocusEnabled(false);
		BtnArmaT1.setForeground(Color.GREEN);
		BtnArmaT1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaT1.setFocusable(false);
		BtnArmaT1.setFocusTraversalKeysEnabled(false);
		BtnArmaT1.setFocusPainted(false);
		BtnArmaT1.setBorderPainted(false);
		BtnArmaT1.setBackground(new Color(0, 51, 0));
		BtnArmaT1.setBounds(10, 20, 153, 21);
		BtnArmaT1.addActionListener(actionListener);
		PanelTieArmas.add(BtnArmaT1);
		
		BtnArmaT2 = new JButton("Daga Siniestra");
		BtnArmaT2.setActionCommand("TArma2");
		BtnArmaT2.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaT2.setRequestFocusEnabled(false);
		BtnArmaT2.setForeground(Color.GREEN);
		BtnArmaT2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaT2.setFocusable(false);
		BtnArmaT2.setFocusTraversalKeysEnabled(false);
		BtnArmaT2.setFocusPainted(false);
		BtnArmaT2.setBorderPainted(false);
		BtnArmaT2.setBackground(new Color(0, 51, 0));
		BtnArmaT2.setBounds(10, 41, 153, 21);
		BtnArmaT2.addActionListener(actionListener);
		PanelTieArmas.add(BtnArmaT2);
		
		BtnArmaT3 = new JButton("Guante Magico");
		BtnArmaT3.setActionCommand("TArma3");
		BtnArmaT3.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaT3.setRequestFocusEnabled(false);
		BtnArmaT3.setForeground(Color.GREEN);
		BtnArmaT3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaT3.setFocusable(false);
		BtnArmaT3.setFocusTraversalKeysEnabled(false);
		BtnArmaT3.setFocusPainted(false);
		BtnArmaT3.setBorderPainted(false);
		BtnArmaT3.setBackground(new Color(0, 51, 0));
		BtnArmaT3.setBounds(10, 61, 153, 21);
		BtnArmaT3.addActionListener(actionListener);
		PanelTieArmas.add(BtnArmaT3);
		
		BtnArmaT4 = new JButton("Lanza Oscura");
		BtnArmaT4.setActionCommand("TArma4");
		BtnArmaT4.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaT4.setRequestFocusEnabled(false);
		BtnArmaT4.setForeground(Color.GREEN);
		BtnArmaT4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaT4.setFocusable(false);
		BtnArmaT4.setFocusTraversalKeysEnabled(false);
		BtnArmaT4.setFocusPainted(false);
		BtnArmaT4.setBorderPainted(false);
		BtnArmaT4.setBackground(new Color(0, 51, 0));
		BtnArmaT4.setBounds(10, 82, 153, 21);
		BtnArmaT4.addActionListener(actionListener);
		PanelTieArmas.add(BtnArmaT4);
		
		BtnArmaT5 = new JButton("Zweihander");
		BtnArmaT5.setActionCommand("TArma5");
		BtnArmaT5.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaT5.setRequestFocusEnabled(false);
		BtnArmaT5.setForeground(Color.GREEN);
		BtnArmaT5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaT5.setFocusable(false);
		BtnArmaT5.setFocusTraversalKeysEnabled(false);
		BtnArmaT5.setFocusPainted(false);
		BtnArmaT5.setBorderPainted(false);
		BtnArmaT5.setBackground(new Color(0, 51, 0));
		BtnArmaT5.setBounds(10, 102, 153, 21);
		BtnArmaT5.addActionListener(actionListener);
		PanelTieArmas.add(BtnArmaT5);
		
		JPanel PanelTieArmor = new JPanel();
		PanelTieArmor.setLayout(null);
		PanelTieArmor.setOpaque(false);
		PanelTieArmor.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Armadura", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		PanelTieArmor.setBounds(221, 51, 173, 140);
		PanelTienda.add(PanelTieArmor);
		
		BtnArmaduraT1 = new JButton("Cadenas");
		BtnArmaduraT1.setActionCommand("TArmadura1");
		BtnArmaduraT1.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaduraT1.setRequestFocusEnabled(false);
		BtnArmaduraT1.setForeground(Color.GREEN);
		BtnArmaduraT1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraT1.setFocusable(false);
		BtnArmaduraT1.setFocusTraversalKeysEnabled(false);
		BtnArmaduraT1.setFocusPainted(false);
		BtnArmaduraT1.setBorderPainted(false);
		BtnArmaduraT1.setBackground(new Color(0, 51, 0));
		BtnArmaduraT1.setBounds(10, 20, 153, 21);
		BtnArmaduraT1.addActionListener(actionListener);
		PanelTieArmor.add(BtnArmaduraT1);
		
		BtnArmaduraT2 = new JButton("Chaqueta Pesada");
		BtnArmaduraT2.setActionCommand("TArmadura2");
		BtnArmaduraT2.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaduraT2.setRequestFocusEnabled(false);
		BtnArmaduraT2.setForeground(Color.GREEN);
		BtnArmaduraT2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraT2.setFocusable(false);
		BtnArmaduraT2.setFocusTraversalKeysEnabled(false);
		BtnArmaduraT2.setFocusPainted(false);
		BtnArmaduraT2.setBorderPainted(false);
		BtnArmaduraT2.setBackground(new Color(0, 51, 0));
		BtnArmaduraT2.setBounds(10, 41, 153, 21);
		BtnArmaduraT2.addActionListener(actionListener);
		PanelTieArmor.add(BtnArmaduraT2);
		
		BtnArmaduraT3 = new JButton("Bata Oscura");
		BtnArmaduraT3.setActionCommand("TArmadura3");
		BtnArmaduraT3.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaduraT3.setRequestFocusEnabled(false);
		BtnArmaduraT3.setForeground(Color.GREEN);
		BtnArmaduraT3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraT3.setFocusable(false);
		BtnArmaduraT3.setFocusTraversalKeysEnabled(false);
		BtnArmaduraT3.setFocusPainted(false);
		BtnArmaduraT3.setBorderPainted(false);
		BtnArmaduraT3.setBackground(new Color(0, 51, 0));
		BtnArmaduraT3.setBounds(10, 61, 153, 21);
		BtnArmaduraT3.addActionListener(actionListener);
		PanelTieArmor.add(BtnArmaduraT3);
		
		BtnArmaduraT4 = new JButton("Capa Angelical");
		BtnArmaduraT4.setActionCommand("TArmadura4");
		BtnArmaduraT4.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaduraT4.setRequestFocusEnabled(false);
		BtnArmaduraT4.setForeground(Color.GREEN);
		BtnArmaduraT4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraT4.setFocusable(false);
		BtnArmaduraT4.setFocusTraversalKeysEnabled(false);
		BtnArmaduraT4.setFocusPainted(false);
		BtnArmaduraT4.setBorderPainted(false);
		BtnArmaduraT4.setBackground(new Color(0, 51, 0));
		BtnArmaduraT4.setBounds(10, 82, 153, 21);
		BtnArmaduraT4.addActionListener(actionListener);
		PanelTieArmor.add(BtnArmaduraT4);
		
		BtnArmaduraT5 = new JButton("Placa Paladin");
		BtnArmaduraT5.setActionCommand("TArmadura5");
		BtnArmaduraT5.setHorizontalAlignment(SwingConstants.LEFT);
		BtnArmaduraT5.setRequestFocusEnabled(false);
		BtnArmaduraT5.setForeground(Color.GREEN);
		BtnArmaduraT5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnArmaduraT5.setFocusable(false);
		BtnArmaduraT5.setFocusTraversalKeysEnabled(false);
		BtnArmaduraT5.setFocusPainted(false);
		BtnArmaduraT5.setBorderPainted(false);
		BtnArmaduraT5.setBackground(new Color(0, 51, 0));
		BtnArmaduraT5.setBounds(10, 102, 153, 21);
		BtnArmaduraT5.addActionListener(actionListener);
		PanelTieArmor.add(BtnArmaduraT5);
		
		JPanel PanelTieConsu = new JPanel();
		PanelTieConsu.setLayout(null);
		PanelTieConsu.setOpaque(false);
		PanelTieConsu.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Consumibles", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		PanelTieConsu.setBounds(35, 225, 173, 140);
		PanelTienda.add(PanelTieConsu);
		
		BtnConsumibleT1 = new JButton("Medicina");
		BtnConsumibleT1.setActionCommand("TConsumible1");
		BtnConsumibleT1.setHorizontalAlignment(SwingConstants.LEFT);
		BtnConsumibleT1.setRequestFocusEnabled(false);
		BtnConsumibleT1.setForeground(Color.GREEN);
		BtnConsumibleT1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleT1.setFocusable(false);
		BtnConsumibleT1.setFocusTraversalKeysEnabled(false);
		BtnConsumibleT1.setFocusPainted(false);
		BtnConsumibleT1.setBorderPainted(false);
		BtnConsumibleT1.setBackground(new Color(0, 51, 0));
		BtnConsumibleT1.setBounds(10, 20, 153, 21);
		BtnConsumibleT1.addActionListener(actionListener);
		PanelTieConsu.add(BtnConsumibleT1);
		
		BtnConsumibleT2 = new JButton("Pocion de Mana");
		BtnConsumibleT2.setActionCommand("TConsumible2");
		BtnConsumibleT2.setHorizontalAlignment(SwingConstants.LEFT);
		BtnConsumibleT2.setRequestFocusEnabled(false);
		BtnConsumibleT2.setForeground(Color.GREEN);
		BtnConsumibleT2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleT2.setFocusable(false);
		BtnConsumibleT2.setFocusTraversalKeysEnabled(false);
		BtnConsumibleT2.setFocusPainted(false);
		BtnConsumibleT2.setBorderPainted(false);
		BtnConsumibleT2.setBackground(new Color(0, 51, 0));
		BtnConsumibleT2.setBounds(10, 41, 153, 21);
		BtnConsumibleT2.addActionListener(actionListener);
		PanelTieConsu.add(BtnConsumibleT2);
		
		BtnConsumibleT3 = new JButton("Gema Reflectora");
		BtnConsumibleT3.setActionCommand("TConsumible3");
		BtnConsumibleT3.setHorizontalAlignment(SwingConstants.LEFT);
		BtnConsumibleT3.setRequestFocusEnabled(false);
		BtnConsumibleT3.setForeground(Color.GREEN);
		BtnConsumibleT3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleT3.setFocusable(false);
		BtnConsumibleT3.setFocusTraversalKeysEnabled(false);
		BtnConsumibleT3.setFocusPainted(false);
		BtnConsumibleT3.setBorderPainted(false);
		BtnConsumibleT3.setBackground(new Color(0, 51, 0));
		BtnConsumibleT3.setBounds(10, 61, 153, 21);
		BtnConsumibleT3.addActionListener(actionListener);
		PanelTieConsu.add(BtnConsumibleT3);
		
		BtnConsumibleT4 = new JButton("1-UP");
		BtnConsumibleT4.setActionCommand("TConsumible4");
		BtnConsumibleT4.setHorizontalAlignment(SwingConstants.LEFT);
		BtnConsumibleT4.setRequestFocusEnabled(false);
		BtnConsumibleT4.setForeground(Color.GREEN);
		BtnConsumibleT4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleT4.setFocusable(false);
		BtnConsumibleT4.setFocusTraversalKeysEnabled(false);
		BtnConsumibleT4.setFocusPainted(false);
		BtnConsumibleT4.setBorderPainted(false);
		BtnConsumibleT4.setBackground(new Color(0, 51, 0));
		BtnConsumibleT4.setBounds(10, 82, 153, 21);
		BtnConsumibleT4.addActionListener(actionListener);
		PanelTieConsu.add(BtnConsumibleT4);
		
		BtnConsumibleT5 = new JButton("Restaurador");
		BtnConsumibleT5.setActionCommand("TConsumible5");
		BtnConsumibleT5.setHorizontalAlignment(SwingConstants.LEFT);
		BtnConsumibleT5.setRequestFocusEnabled(false);
		BtnConsumibleT5.setForeground(Color.GREEN);
		BtnConsumibleT5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnConsumibleT5.setFocusable(false);
		BtnConsumibleT5.setFocusTraversalKeysEnabled(false);
		BtnConsumibleT5.setFocusPainted(false);
		BtnConsumibleT5.setBorderPainted(false);
		BtnConsumibleT5.setBackground(new Color(0, 51, 0));
		BtnConsumibleT5.setBounds(10, 102, 153, 21);
		BtnConsumibleT5.addActionListener(actionListener);
		PanelTieConsu.add(BtnConsumibleT5);
		
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
		PanelTienda.add(BtnComprar);
		
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
		PanelTienda.add(btnDescripcion);
		
		JLabel LogoTienda = new JLabel("");
		LogoTienda.setIcon(new ImageIcon(GUI.class.getResource("/App/Shop Indicator.png")));
		LogoTienda.setBounds(10, 10, 50, 48);
		PanelTienda.add(LogoTienda);
		PanelGeneral.add(PanelDesc);
		PanelDesc.setLayout(null);
		
		 
					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void cambiaText(String texto,String num) {
		if (texto.equals("")) {
			OpcionInv="";
			BtnArmaI1.setBackground(new Color(0, 51, 0));
			BtnArmaI2.setBackground(new Color(0, 51, 0));
			BtnArmaI3.setBackground(new Color(0, 51, 0));
			BtnArmaI4.setBackground(new Color(0, 51, 0));
			BtnArmaI5.setBackground(new Color(0, 51, 0));
			BtnArmaduraI1.setBackground(new Color(0, 51, 0));
			BtnArmaduraI2.setBackground(new Color(0, 51, 0));
			BtnArmaduraI3.setBackground(new Color(0, 51, 0));
			BtnArmaduraI4.setBackground(new Color(0, 51, 0));
			BtnArmaduraI5.setBackground(new Color(0, 51, 0));
			BtnConsumibleI1.setBackground(new Color(0, 51, 0));
			BtnConsumibleI2.setBackground(new Color(0, 51, 0));
			BtnConsumibleI3.setBackground(new Color(0, 51, 0));
			BtnConsumibleI4.setBackground(new Color(0, 51, 0));
			BtnConsumibleI5.setBackground(new Color(0, 51, 0));
		}
		if (num.equals("1")){
			BtnArmaI1.setText(texto);
		}else if(num.equals("2")){
			BtnArmaI2.setText(texto);
		}else if(num.equals("3")){
			BtnArmaI3.setText(texto);
		}else if(num.equals("4")){
			BtnArmaI4.setText(texto);
		}else if(num.equals("5")){
			BtnArmaI5.setText(texto);
		}else if (num.equals("6")){
			BtnArmaduraI1.setText(texto);
		}else if(num.equals("7")){
			BtnArmaduraI2.setText(texto);
		}else if(num.equals("8")){
			BtnArmaduraI3.setText(texto);
		}else if(num.equals("9")){
			BtnArmaduraI4.setText(texto);
		}else if(num.equals("10")){
			BtnArmaduraI5.setText(texto);
		}else if (num.equals("11")){
			BtnConsumibleI1.setText(texto);
		}else if(num.equals("12")){
			BtnConsumibleI2.setText(texto);
		}else if(num.equals("13")){
			BtnConsumibleI3.setText(texto);
		}else if(num.equals("14")){
			BtnConsumibleI4.setText(texto);
		}else if(num.equals("15")){
			BtnConsumibleI5.setText(texto);
		}
	}
		
	
}