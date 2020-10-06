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
import java.awt.Cursor;
import java.awt.Toolkit;
import org.json.JSONObject;

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
	public static JLabel StatWgt;
	public static Integer OpVenta;
	public static Integer OpCompra;
	public static JLabel StatAtk;
	public static JLabel StatMny;
	public static JLabel StatDfs;
	public static JLabel StatHlth;
	public static JLabel StatSpd;
	public static JLabel StatMna;
	public static JLabel Descripcion;
	public static JLabel lblArma;
	public static JLabel lblArmadura;
	private static String OpcionTie="";
	private static String OpcionInv="";
	private static JLabel lblPrecioC;
	private static JLabel lblPrecioV;
	private static Integer AtkBase;
	private static Integer DfsBase;
	private static Integer SpdBase;
	private static Integer MnaBase;
	private static Integer HltBase;
	private static Integer WgtBase;
	public static Character personaje = new Character();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/App/Shop Icon.png")));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setFont(new Font("Tahoma", Font.ITALIC, 13));
		setResizable(false);
		setTitle("Tienda");
		AtkBase=10;
		DfsBase=25;
		SpdBase=125;
		MnaBase=15;
		HltBase=100;
		WgtBase=80;
		personaje.Ataque= 10;
        personaje.Vida= 100;
        personaje.Dinero= 10000;
        personaje.Mana= 15;
        personaje.Defensa= 25;
        personaje.Velocidad= 125;
        personaje.Peso= 80;
        //getJSONArray("products").getJSONObject(i).getJSONObject("reviews").getInt("rating");
        String APIarmas=okhttp.getArmas();
        String APIarmaduras=okhttp.getArmaduras();
        String APIconsumibles=okhttp.getConsumibles();
        JSONObject JArmas = new JSONObject(APIarmas);
        JSONObject JArmadura = new JSONObject(APIarmaduras);
        Armas Arma1 = new Armas();
        Arma1.Ataque=(int)JArmas.getJSONArray("products").getJSONObject(0).getJSONObject("reviews").getInt("rating");
        Arma1.Magia=0;
        Arma1.Velocidad=0;
        Arma1.PrecioC=Armas.DefinirAtributoArma("1", APIarmas);
        Arma1.PrecioV=Arma1.PrecioC/2;
        Armas Arma2 = new Armas();
        Arma2.Ataque=(int)(JArmas.getJSONArray("products").getJSONObject(1).getJSONObject("reviews").getInt("rating"))*5;
        Arma2.Magia=0;
        Arma2.Velocidad=(int)(JArmas.getJSONArray("products").getJSONObject(1).getJSONObject("reviews").getInt("rating"))*10;
        Arma2.PrecioC=Armas.DefinirAtributoArma("2", APIarmas);
        Arma2.PrecioV=Arma2.PrecioC/2;
        Armas Arma3 = new Armas();
        Arma3.Ataque=0;
        Arma3.Magia=(int)(JArmas.getJSONArray("products").getJSONObject(2).getJSONObject("reviews").getInt("rating"))*10;
        Arma3.Velocidad=(int)JArmas.getJSONArray("products").getJSONObject(2).getJSONObject("reviews").getInt("rating");
        Arma3.PrecioC=Armas.DefinirAtributoArma("3", APIarmas);
        Arma3.PrecioV=Arma3.PrecioC/2;
        Armas Arma4 = new Armas();
        Arma4.Ataque=(int)(JArmas.getJSONArray("products").getJSONObject(3).getJSONObject("reviews").getInt("rating"))*10;
        Arma4.Magia=(int)(JArmas.getJSONArray("products").getJSONObject(3).getJSONObject("reviews").getInt("rating"))*-2;
        Arma4.Velocidad=(int)JArmas.getJSONArray("products").getJSONObject(3).getJSONObject("reviews").getInt("rating");
        Arma4.PrecioC=Armas.DefinirAtributoArma("4", APIarmas);
        Arma4.PrecioV=Arma4.PrecioC/2;
        Armas Arma5 = new Armas();
        Arma5.Ataque=(int)(JArmas.getJSONArray("products").getJSONObject(4).getJSONObject("reviews").getInt("rating"))*20;
        Arma5.Magia=0;
        Arma5.Velocidad=(int)(JArmas.getJSONArray("products").getJSONObject(4).getJSONObject("reviews").getInt("rating"))*-10;
        Arma5.PrecioC=Armas.DefinirAtributoArma("5", APIarmas);
        Arma5.PrecioV=Arma5.PrecioC/5;
        Armadura Armadura1 = new Armadura();
        Armadura1.Salud=0;
        Armadura1.Defensa=(int)(JArmadura.getJSONArray("products").getJSONObject(0).getJSONObject("reviews").getInt("rating"))*5;
        Armadura1.Peso=(int)(JArmadura.getJSONArray("products").getJSONObject(0).getJSONObject("reviews").getInt("rating"))*7;
        Armadura1.PrecioC=Armadura.DefinirAtributoArmadura("1", APIarmaduras);
        Armadura1.PrecioV=Armadura1.PrecioC/2;
        Armadura Armadura2 = new Armadura();
        Armadura2.Salud=(int)(JArmadura.getJSONArray("products").getJSONObject(1).getJSONObject("reviews").getInt("rating"))*6;
        Armadura2.Defensa=(int)(JArmadura.getJSONArray("products").getJSONObject(1).getJSONObject("reviews").getInt("rating"))*10;
        Armadura2.Peso=(int)(JArmadura.getJSONArray("products").getJSONObject(1).getJSONObject("reviews").getInt("rating"))*10;
        Armadura2.PrecioC=Armadura.DefinirAtributoArmadura("2", APIarmaduras);
        Armadura2.PrecioV=Armadura2.PrecioC/2;
        Armadura Armadura3 = new Armadura();
        Armadura3.Salud=(int)(JArmadura.getJSONArray("products").getJSONObject(2).getJSONObject("reviews").getInt("rating"))*-10;
        Armadura3.Defensa=(int)(JArmadura.getJSONArray("products").getJSONObject(2).getJSONObject("reviews").getInt("rating"))*9;
        Armadura3.Peso=(int)JArmadura.getJSONArray("products").getJSONObject(2).getJSONObject("reviews").getInt("rating");
        Armadura3.PrecioC=Armadura.DefinirAtributoArmadura("3", APIarmaduras);
        Armadura3.PrecioV=Armadura3.PrecioC/2;
        Armadura Armadura4 = new Armadura();
        Armadura4.Salud=(int)(JArmadura.getJSONArray("products").getJSONObject(3).getJSONObject("reviews").getInt("rating"))*20;
        Armadura4.Defensa=0;
        Armadura4.Peso=(int)(JArmadura.getJSONArray("products").getJSONObject(3).getJSONObject("reviews").getInt("rating"))*3;
        Armadura4.PrecioC=Armadura.DefinirAtributoArmadura("4", APIarmaduras);
        Armadura4.PrecioV=Armadura4.PrecioC/2;
        Armadura Armadura5 = new Armadura();
        Armadura5.Salud=0;
        Armadura5.Defensa=(int)(JArmadura.getJSONArray("products").getJSONObject(4).getJSONObject("reviews").getInt("rating"))*20;
        Armadura5.Peso=(int)(JArmadura.getJSONArray("products").getJSONObject(4).getJSONObject("reviews").getInt("rating"))*15;
        Armadura5.PrecioC=Armadura.DefinirAtributoArmadura("5", APIarmaduras);
        Armadura5.PrecioV=Armadura5.PrecioC/2;
        Consumibles Consumible1 = new Consumibles();
        Consumible1.PrecioC=Consumibles.DefinirAtributoConsu("1", APIconsumibles);
        Consumible1.PrecioV=Consumible1.PrecioC/2;
        Consumibles Consumible2 = new Consumibles();
        Consumible2.PrecioC=Consumibles.DefinirAtributoConsu("2", APIconsumibles);
        Consumible2.PrecioV=Consumible2.PrecioC/2;
        Consumibles Consumible3 = new Consumibles();
        Consumible3.PrecioC=Consumibles.DefinirAtributoConsu("3", APIconsumibles);
        Consumible3.PrecioV=Consumible3.PrecioC/2;
        Consumibles Consumible4 = new Consumibles();
        Consumible4.PrecioC=Consumibles.DefinirAtributoConsu("4", APIconsumibles);
        Consumible4.PrecioV=Consumible4.PrecioC/2;
        Consumibles Consumible5 = new Consumibles();
        Consumible5.PrecioC=Consumibles.DefinirAtributoConsu("5", APIconsumibles);
        Consumible5.PrecioV=Consumible5.PrecioC/2;
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
						OpVenta=Arma1.PrecioV;
						muestraStatsA(Arma1.Ataque,Arma1.Magia,Arma1.Velocidad);
						lblPrecioC.setText("Precio: $"+String.valueOf(Arma1.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Arma1.PrecioV));
						Descripcion.setText("<html>Bate de Metal<br/><br/>Es un bate... pero de metal... creo que es obvio<br/>No es ligero pero tampoco pesado<html>");
						
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
						OpVenta=Arma2.PrecioV;
						muestraStatsA(Arma2.Ataque,Arma2.Magia,Arma2.Velocidad);
						lblPrecioC.setText("Precio: $"+String.valueOf(Arma2.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Arma2.PrecioV));
						Descripcion.setText("<html>Daga Siniestra<br/><br/>Una daga muy misteriosa pero por su tamano esta<br/>logra otorgar gran agilidad<html>");
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
						OpVenta=Arma3.PrecioV;
						muestraStatsA(Arma3.Ataque,Arma3.Magia,Arma3.Velocidad);
						lblPrecioC.setText("Precio: $"+String.valueOf(Arma3.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Arma3.PrecioV));
						Descripcion.setText("<html>Guante Magico<br/><br/>Un guante que por si solo no es muy fuerte<br/>Pero su poder magico boostea el poder de tus hechizos<html>");
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
						OpVenta=Arma4.PrecioV;
						muestraStatsA(Arma4.Ataque,Arma4.Magia,Arma4.Velocidad);
						lblPrecioC.setText("Precio: $"+String.valueOf(Arma4.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Arma4.PrecioV));
						Descripcion.setText("<html>Lanza Oscura<br/><br/>Un arma de alto poder que conlleva un precio a pagar<br/>Su poder oscuro te rebaja tu poder de magia<br/>pero tiene mucho poder fisico a cambio<html>");
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
						OpVenta=Arma5.PrecioV;
						muestraStatsA(Arma5.Ataque,Arma5.Magia,Arma5.Velocidad);
						lblPrecioC.setText("Precio: $"+String.valueOf(Arma5.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Arma5.PrecioV));
						Descripcion.setText("<html>Zweinhander<br/><br/>Gran espadon de doble filo y formidable poder<br/>Es increiblemente pesada<br/>No recomendable llevar una maraton :p<html>");
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
						OpVenta=Armadura1.PrecioV;
						muestraStatsB(Armadura1.Defensa,Armadura1.Salud,Armadura1.Peso);
						lblPrecioC.setText("Precio: $"+String.valueOf(Armadura1.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Armadura1.PrecioV));
						Descripcion.setText("<html>Cota de Malla<br/><br/>No creo que sea tan segura ya que parece cortado<br/>de una reja vieja y oxidada<html>");
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
						OpVenta=Armadura2.PrecioV;
						muestraStatsB(Armadura2.Defensa,Armadura2.Salud,Armadura2.Peso);
						lblPrecioC.setText("Precio: $"+String.valueOf(Armadura2.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Armadura2.PrecioV));
						Descripcion.setText("<html>Chaqueta Pesada<br/><br/> Chaqueta con alto peso y absorcion de ataques enemigos<br/>Mucho cuidado con los golpes de calor");
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
						OpVenta=Armadura3.PrecioV;
						muestraStatsB(Armadura3.Defensa,Armadura3.Salud,Armadura3.Peso);
						lblPrecioC.setText("Precio: $"+String.valueOf(Armadura3.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Armadura3.PrecioV));
						Descripcion.setText("<html>Bata Oscura<br/><br/>Esta bata absorbe tu energia vital a cambio de mayor<br/>defensa y magia pero te hace parecer sospechoso...<br/>No la lleves a una sesion de Among Us<html>");
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
						OpVenta=Armadura4.PrecioV;
						muestraStatsB(Armadura4.Defensa,Armadura4.Salud,Armadura4.Peso);
						lblPrecioC.setText("Precio: $"+String.valueOf(Armadura4.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Armadura4.PrecioV));
						Descripcion.setText("<html>Capa Angelical<br/><br/>Una capa forgada por los angeles que otorga mucha <br/> vida a cambio de 0 defensa<br/>Perfecta si eres un healer main<html>");
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
						OpVenta=Armadura5.PrecioV;
						muestraStatsB(Armadura5.Defensa,Armadura5.Salud,Armadura5.Peso);
						lblPrecioC.setText("Precio: $"+String.valueOf(Armadura5.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Armadura5.PrecioV));
						Descripcion.setText("<html>Placa Paladin<br/><br/>Muro impenetrable de la fe<br/>pero al igual que un muro no te puedes mover<br/>Tambien posee defensa formidable<html>");
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
						OpVenta=Consumible1.PrecioV;
						lblPrecioC.setText("Precio: $"+String.valueOf(Consumible1.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Consumible1.PrecioV));
						muestraStatsC();
						Descripcion.setText("<html>Medicina<br/><br/>Item basico de cualquier aventurero que por alguna<br/>razon sabe a menta... pero su frescura recupera 50HP<html>");
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
						OpVenta=Consumible2.PrecioV;
						lblPrecioC.setText("Precio: $"+String.valueOf(Consumible2.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Consumible2.PrecioV));
						muestraStatsC();
						Descripcion.setText("<html>Pocion de Mana<br/><br/>Por alguna razon tiene sabor a jugo de arandano...<br/>A pesar de su tentador sabor esta recupera 50MP<html>");
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
						OpVenta=Consumible3.PrecioV;
						lblPrecioC.setText("Precio: $"+String.valueOf(Consumible3.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Consumible3.PrecioV));
						muestraStatsC();
						Descripcion.setText("<html>Gema reflectora<br/><br/>Reflecta el siguiente ataque a un enemigo<br/>duplicando su poder AKA Uno_reverse_card.mp4<html>");
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
						OpVenta=Consumible4.PrecioV;
						lblPrecioC.setText("Precio: $"+String.valueOf(Consumible4.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Consumible4.PrecioV));
						muestraStatsC();
						Descripcion.setText("<html>1-UP<br/><br/>Ultima linea de supervivencia otorga una vida<br/>extra... solo no le digas a Nintendo sobre esto ok?<html>");
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
						OpVenta=Consumible5.PrecioV;
						lblPrecioC.setText("Precio: $"+String.valueOf(Consumible5.PrecioC));
						lblPrecioV.setText("Venta: $"+String.valueOf(Consumible5.PrecioV));
						muestraStatsC();
						Descripcion.setText("<html>Restaurador<br/><br/>Gema magica que elimina los efectos negativos<br/>a tus stats generados por el enemigo<br/>No hay broma solo es eso...<html>");
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
					OpCompra=Arma1.PrecioC;
					muestraStatsA(Arma1.Ataque,Arma1.Magia,Arma1.Velocidad);
					lblPrecioC.setText("Precio: $"+String.valueOf(Arma1.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Arma1.PrecioV));
					Descripcion.setText("<html>Bate de Metal<br/><br/>Es un bate... pero de metal... creo que es obvio<br/>No es ligero pero tampoco pesado<html>");
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
					OpCompra=Arma2.PrecioC;
					muestraStatsA(Arma2.Ataque,Arma2.Magia,Arma2.Velocidad);
					lblPrecioC.setText("Precio: $"+String.valueOf(Arma2.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Arma2.PrecioV));
					Descripcion.setText("<html>Daga Siniestra<br/><br/>Una daga muy misteriosa pero por su tamano esta<br/>logra otorgar gran agilidad<html>");
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
					OpCompra=Arma3.PrecioC;
					muestraStatsA(Arma3.Ataque,Arma3.Magia,Arma3.Velocidad);
					lblPrecioC.setText("Precio: $"+String.valueOf(Arma3.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Arma3.PrecioV));
					Descripcion.setText("<html>Guante Magico<br/><br/>Un guante que por si solo no es muy fuerte<br/>Pero su poder magico boostea el poder de tus hechizos<html>");
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
					OpCompra=Arma4.PrecioC;
					muestraStatsA(Arma4.Ataque,Arma4.Magia,Arma4.Velocidad);
					lblPrecioC.setText("Precio: $"+String.valueOf(Arma4.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Arma4.PrecioV));
					Descripcion.setText("<html>Lanza Oscura<br/><br/>Un arma de alto poder que conlleva un precio a pagar<br/>Su poder oscuro te rebaja tu poder de magia<br/>pero tiene mucho poder fisico a cambio<html>");
					
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
					OpCompra=Arma5.PrecioC;
					muestraStatsA(Arma5.Ataque,Arma5.Magia,Arma5.Velocidad);
					lblPrecioC.setText("Precio: $"+String.valueOf(Arma5.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Arma5.PrecioV));
					Descripcion.setText("<html>Zweinhander<br/><br/>Gran espadon de doble filo y formidable poder<br/>Es increiblemente pesada<br/>No recomendable llevar una maraton :p<html>");
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
					OpCompra=Armadura1.PrecioC;
					muestraStatsB(Armadura1.Defensa,Armadura1.Salud,Armadura1.Peso);
					lblPrecioC.setText("Precio: $"+String.valueOf(Armadura1.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Armadura1.PrecioV));
					Descripcion.setText("<html>Cota de Malla<br/><br/>No creo que sea tan segura ya que parece cortado<br/>de una reja vieja y oxidada<html>");
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
					OpCompra=Armadura2.PrecioC;
					muestraStatsB(Armadura2.Defensa,Armadura2.Salud,Armadura2.Peso);
					lblPrecioC.setText("Precio: $"+String.valueOf(Armadura2.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Armadura2.PrecioV));
					Descripcion.setText("<html>Chaqueta Pesada<br/><br/> Chaqueta con alto peso y absorcion de ataques enemigos<br/>Mucho cuidado con los golpes de calor");
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
					OpCompra=Armadura3.PrecioC;
					muestraStatsB(Armadura3.Defensa,Armadura3.Salud,Armadura3.Peso);
					lblPrecioC.setText("Precio: $"+String.valueOf(Armadura3.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Armadura3.PrecioV));
					Descripcion.setText("<html>Bata Oscura<br/><br/>Esta bata absorbe tu energia vital a cambio de mayor<br/>defensa y magia pero te hace parecer sospechoso...<br/>No la lleves a una sesion de Among Us<html>");
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
					OpCompra=Armadura4.PrecioC;
					muestraStatsB(Armadura4.Defensa,Armadura4.Salud,Armadura4.Peso);
					lblPrecioC.setText("Precio: $"+String.valueOf(Armadura4.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Armadura4.PrecioV));
					Descripcion.setText("<html>Capa Angelical<br/><br/>Una capa forgada por los angeles que otorga mucha <br/> vida a cambio de 0 defensa<br/>Perfecta si eres un healer main<html>");
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
					OpCompra=Armadura5.PrecioC;
					muestraStatsB(Armadura5.Defensa,Armadura5.Salud,Armadura5.Peso);
					lblPrecioC.setText("Precio: $"+String.valueOf(Armadura5.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Armadura5.PrecioV));
					Descripcion.setText("<html>Placa Paladin<br/><br/>Muro impenetrable de la fe<br/>pero al igual que un muro no te puedes mover<br/>Tambien posee defensa formidable<html>");
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
					OpCompra=Consumible1.PrecioC;
					lblPrecioC.setText("Precio: $"+String.valueOf(Consumible1.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Consumible1.PrecioV));
					muestraStatsC();
					Descripcion.setText("<html>Medicina<br/><br/>Item basico de cualquier aventurero que por alguna<br/>razon sabe a menta... pero su frescura recupera 50HP<html>");
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
					OpCompra=Consumible2.PrecioC;
					lblPrecioC.setText("Precio: $"+String.valueOf(Consumible2.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Consumible2.PrecioV));
					muestraStatsC();
					Descripcion.setText("<html>Pocion de Mana<br/><br/>Por alguna razon tiene sabor a jugo de arandano...<br/>A pesar de su tentador sabor esta recupera 50MP<html>");
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
					OpCompra=Consumible3.PrecioC;
					lblPrecioC.setText("Precio: $"+String.valueOf(Consumible3.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Consumible3.PrecioV));
					muestraStatsC();
					Descripcion.setText("<html>Gema reflectora<br/><br/>Reflecta el siguiente ataque a un enemigo<br/>duplicando su poder AKA Uno_reverse_card.mp4<html>");
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
					OpCompra=Consumible4.PrecioC;
					lblPrecioC.setText("Precio: $"+String.valueOf(Consumible4.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Consumible4.PrecioV));
					muestraStatsC();
					Descripcion.setText("<html>1-UP<br/><br/>Ultima linea de supervivencia otorga una vida<br/>extra... solo no le digas a Nintendo sobre esto ok?<html>");
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
					OpCompra=Consumible5.PrecioC;
					lblPrecioC.setText("Precio: $"+String.valueOf(Consumible5.PrecioC));
					lblPrecioV.setText("Venta: $"+String.valueOf(Consumible5.PrecioV));
					muestraStatsC();
					Descripcion.setText("<html>Restaurador<br/><br/>Gema magica que elimina los efectos negativos<br/>a tus stats generados por el enemigo<br/>No hay broma solo es eso...<html>");
				}else if(command == "Equip" & ! OpcionInv.equals("")){
					if(OpcionInv.equals("IArma1")) {
						Character.Equipar(OpcionInv,Arma1.Ataque,Arma1.Magia,Arma1.Velocidad);
					}else if(OpcionInv.equals("IArma2")) {
						Character.Equipar(OpcionInv,Arma2.Ataque,Arma2.Magia,Arma2.Velocidad);
					}else if(OpcionInv.equals("IArma3")) {
						Character.Equipar(OpcionInv,Arma3.Ataque,Arma3.Magia,Arma3.Velocidad);
					}else if(OpcionInv.equals("IArma4")) {
						Character.Equipar(OpcionInv,Arma4.Ataque,Arma4.Magia,Arma4.Velocidad);
					}else if(OpcionInv.equals("IArma5")) {
						Character.Equipar(OpcionInv,Arma5.Ataque,Arma5.Magia,Arma5.Velocidad);
					}else if(OpcionInv.equals("IArmadura1")) {
						Character.Equipar(OpcionInv,Armadura1.Defensa,Armadura1.Salud,Armadura1.Peso);
					}else if(OpcionInv.equals("IArmadura2")) {
						Character.Equipar(OpcionInv,Armadura2.Defensa,Armadura2.Salud,Armadura2.Peso);
					}else if(OpcionInv.equals("IArmadura3")) {
						Character.Equipar(OpcionInv,Armadura3.Defensa,Armadura3.Salud,Armadura3.Peso);
					}else if(OpcionInv.equals("IArmadura4")) {
						Character.Equipar(OpcionInv,Armadura4.Defensa,Armadura4.Salud,Armadura4.Peso);
					}else if(OpcionInv.equals("IArmadura5")) {
						Character.Equipar(OpcionInv,Armadura5.Defensa,Armadura5.Salud,Armadura5.Peso);
					}
				}else if(command.equals("Sell") & ! OpcionInv.equals("")){//aqui se llama a metodo character para vender
					Character.vender(OpcionInv,OpVenta);
				}else if(command.equals("Buy") & ! OpcionTie.equals("")){
					Character.comprar(OpcionTie,OpCompra);//aqui se llama a metodo de tienda para comprar
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
		BtnEquiparI.setBounds(260, 319, 129, 48);
		BtnEquiparI.addActionListener(actionListener);
		PanelInventarioo.add(BtnEquiparI);
		
		JPanel PanelInvequip = new JPanel();
		PanelInvequip.setLayout(null);
		PanelInvequip.setOpaque(false);
		PanelInvequip.setBorder(new TitledBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 255, 0)), "Equipamiento", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 255, 0)));
		PanelInvequip.setBounds(227, 227, 200, 72);
		PanelInventarioo.add(PanelInvequip);
		
		lblArma = new JLabel("Arma:");
		lblArma.setForeground(Color.GREEN);
		lblArma.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblArma.setBounds(10, 11, 180, 22);
		PanelInvequip.add(lblArma);
		
		lblArmadura = new JLabel("Armadura:");
		lblArmadura.setForeground(Color.GREEN);
		lblArmadura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblArmadura.setBounds(10, 39, 180, 22);
		PanelInvequip.add(lblArmadura);
		
		StatMny = new JLabel();
		StatMny.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 0)), "Dinero", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 0)));
		StatMny.setBounds(265, 364, 121, 47);
		PanelInventarioo.add(StatMny);
		StatMny.setText(String.valueOf(personaje.Dinero));
		StatMny.setIcon(new ImageIcon(GUI.class.getResource("/App/Money Indicator.png")));
		StatMny.setForeground(new Color(255, 255, 0));
		StatMny.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelGeneral.add(PanelStats);
		PanelStats.setLayout(null);
		
		StatAtk = new JLabel();
		StatAtk.setText(String.valueOf(personaje.Ataque));
		StatAtk.setIcon(new ImageIcon(GUI.class.getResource("/App/Attack Indicator.png")));
		StatAtk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatAtk.setForeground(Color.RED);
		StatAtk.setBounds(44, 24, 121, 35);
		PanelStats.add(StatAtk);
		
		StatDfs = new JLabel();
		StatDfs.setText(String.valueOf(personaje.Defensa));
		StatDfs.setIcon(new ImageIcon(GUI.class.getResource("/App/Defense Indicator.png")));
		StatDfs.setForeground(Color.MAGENTA);
		StatDfs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatDfs.setBounds(44, 69, 121, 35);
		PanelStats.add(StatDfs);
		
		StatMna = new JLabel();
		StatMna.setText(String.valueOf(personaje.Mana));
		StatMna.setIcon(new ImageIcon(GUI.class.getResource("/App/Mana Indicator.png")));
		StatMna.setForeground(new Color(102, 102, 255));
		StatMna.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatMna.setBounds(167, 24, 102, 35);
		PanelStats.add(StatMna);
		
		StatSpd = new JLabel();
		StatSpd.setText(String.valueOf(personaje.Velocidad));
		StatSpd.setIcon(new ImageIcon(GUI.class.getResource("/App/Speed Indicator.png")));
		StatSpd.setForeground(Color.CYAN);
		StatSpd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatSpd.setBounds(167, 69, 102, 35);
		PanelStats.add(StatSpd);
		
		StatHlth = new JLabel();
		StatHlth.setText(String.valueOf(personaje.Vida));
		StatHlth.setIcon(new ImageIcon(GUI.class.getResource("/App/Health Indicator.png")));
		StatHlth.setForeground(new Color(255, 153, 255));
		StatHlth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatHlth.setBounds(279, 24, 121, 35);
		PanelStats.add(StatHlth);
		
		StatWgt = new JLabel();
		StatWgt.setIcon(new ImageIcon(GUI.class.getResource("/App/Weight Indicator.png")));
		StatWgt.setText(String.valueOf(personaje.Peso));
		StatWgt.setForeground(Color.ORANGE);
		StatWgt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		StatWgt.setBounds(279, 69, 121, 35);
		PanelStats.add(StatWgt);
		
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
		PanelTieArmor.setBounds(221, 51, 179, 140);
		PanelTienda.add(PanelTieArmor);
		
		BtnArmaduraT1 = new JButton("Cota de Malla");
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
		BtnArmaduraT2.setBounds(10, 40, 159, 21);
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
		
		JLabel LogoTienda = new JLabel("");
		LogoTienda.setIcon(new ImageIcon(GUI.class.getResource("/App/Shop Indicator.png")));
		LogoTienda.setBounds(10, 10, 50, 48);
		PanelTienda.add(LogoTienda);
		
		JButton BtnVender = new JButton("Vender");
		BtnVender.setBounds(243, 317, 129, 48);
		PanelTienda.add(BtnVender);
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
		
		lblPrecioC = new JLabel("Precio:");
		lblPrecioC.setBounds(35, 370, 85, 22);
		PanelTienda.add(lblPrecioC);
		lblPrecioC.setForeground(Color.GREEN);
		lblPrecioC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblPrecioV = new JLabel("Venta:");
		lblPrecioV.setBounds(35, 391, 85, 22);
		PanelTienda.add(lblPrecioV);
		lblPrecioV.setForeground(Color.GREEN);
		lblPrecioV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		BtnVender.addActionListener(actionListener);
		PanelGeneral.add(PanelDesc);
		PanelDesc.setLayout(null);
		
		Descripcion = new JLabel("Descripcion");
		Descripcion.setHorizontalAlignment(SwingConstants.CENTER);
		Descripcion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Descripcion.setForeground(Color.GREEN);
		Descripcion.setBounds(10, 10, 407, 105);
		PanelDesc.add(Descripcion);
		
		 
					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void cambiaText(String texto,String num,String Op2,Integer Plata) {
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
			if(texto.equals("") & lblArma.getText().equals("Arma: Bate de Metal")  ) {
				lblArma.setText("Arma:");
				personaje.Ataque=AtkBase;
				personaje.Velocidad=SpdBase;
				personaje.Mana=MnaBase;
				StatAtk.setText(String.valueOf(personaje.Ataque));
				StatSpd.setText(String.valueOf(personaje.Velocidad));
				StatMna.setText(String.valueOf(personaje.Mana));
			}
		}else if(num.equals("2")){
			BtnArmaI2.setText(texto);
			if(texto.equals("") & lblArma.getText().equals("Arma: Daga Siniestra")  ) {
				lblArma.setText("Arma:");
				personaje.Ataque=AtkBase;
				personaje.Velocidad=SpdBase;
				personaje.Mana=MnaBase;
				StatAtk.setText(String.valueOf(personaje.Ataque));
				StatSpd.setText(String.valueOf(personaje.Velocidad));
				StatMna.setText(String.valueOf(personaje.Mana));
				
			}
		}else if(num.equals("3")){
			BtnArmaI3.setText(texto);
			if(texto.equals("") & lblArma.getText().equals("Arma: Guante Magico")  ) {
				lblArma.setText("Arma:");
				personaje.Ataque=AtkBase;
				personaje.Velocidad=SpdBase;
				personaje.Mana=MnaBase;
				StatAtk.setText(String.valueOf(personaje.Ataque));
				StatSpd.setText(String.valueOf(personaje.Velocidad));
				StatMna.setText(String.valueOf(personaje.Mana));
			}
		}else if(num.equals("4")){
			BtnArmaI4.setText(texto);
			if(texto.equals("") & lblArma.getText().equals("Arma: Lanza Oscura")  ) {
				lblArma.setText("Arma:");
				personaje.Ataque=AtkBase;
				personaje.Velocidad=SpdBase;
				personaje.Mana=MnaBase;
				StatAtk.setText(String.valueOf(personaje.Ataque));
				StatSpd.setText(String.valueOf(personaje.Velocidad));
				StatMna.setText(String.valueOf(personaje.Mana));
			}
		}else if(num.equals("5")){
			BtnArmaI5.setText(texto);
			if(texto.equals("") & lblArma.getText().equals("Arma: Zweihander")  ) {
				lblArma.setText("Arma:");
				personaje.Ataque=AtkBase;
				personaje.Velocidad=SpdBase;
				personaje.Mana=MnaBase;
				StatAtk.setText(String.valueOf(personaje.Ataque));
				StatSpd.setText(String.valueOf(personaje.Velocidad));
				StatMna.setText(String.valueOf(personaje.Mana));
			}
		}else if (num.equals("6")){
			BtnArmaduraI1.setText(texto);
			if(texto.equals("") & lblArmadura.getText().equals("Armadura: Cota de Malla")  ) {
				lblArmadura.setText("Armadura:");
				personaje.Defensa=DfsBase;
				personaje.Vida=HltBase;
				personaje.Peso=WgtBase;
				StatDfs.setText(String.valueOf(personaje.Defensa));
				StatHlth.setText(String.valueOf(personaje.Vida));
				StatWgt.setText(String.valueOf(personaje.Peso));
			}
		}else if(num.equals("7")){
			BtnArmaduraI2.setText(texto);
			if(texto.equals("") & lblArmadura.getText().equals("Armadura: Chaqueta Pesada")  ) {
				lblArmadura.setText("Armadura:");
				personaje.Defensa=DfsBase;
				personaje.Vida=HltBase;
				personaje.Peso=WgtBase;
				StatDfs.setText(String.valueOf(personaje.Defensa));
				StatHlth.setText(String.valueOf(personaje.Vida));
				StatWgt.setText(String.valueOf(personaje.Peso));
			}
		}else if(num.equals("8")){
			BtnArmaduraI3.setText(texto);
			if(texto.equals("") & lblArmadura.getText().equals("Armadura: Bata Oscura")  ) {
				lblArmadura.setText("Armadura:");
				personaje.Defensa=DfsBase;
				personaje.Vida=HltBase;
				personaje.Peso=WgtBase;
				StatDfs.setText(String.valueOf(personaje.Defensa));
				StatHlth.setText(String.valueOf(personaje.Vida));
				StatWgt.setText(String.valueOf(personaje.Peso));
			}
		}else if(num.equals("9")){
			BtnArmaduraI4.setText(texto);
			if(texto.equals("") & lblArmadura.getText().equals("Armadura: Capa Angelical")  ) {
				lblArmadura.setText("Armadura:");
				personaje.Defensa=DfsBase;
				personaje.Vida=HltBase;
				personaje.Peso=WgtBase;
				StatDfs.setText(String.valueOf(personaje.Defensa));
				StatHlth.setText(String.valueOf(personaje.Vida));
				StatWgt.setText(String.valueOf(personaje.Peso));
			}
		}else if(num.equals("10")){
			BtnArmaduraI5.setText(texto);
			if(texto.equals("") & lblArmadura.getText().equals("Armadura: Placa Paladin")  ) {
				lblArmadura.setText("Armadura:");
				personaje.Defensa=DfsBase;
				personaje.Vida=HltBase;
				personaje.Peso=WgtBase;
				StatDfs.setText(String.valueOf(personaje.Defensa));
				StatHlth.setText(String.valueOf(personaje.Vida));
				StatWgt.setText(String.valueOf(personaje.Peso));
			}
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
		}if(Op2.equals("1")) {
			personaje.Dinero=((personaje.Dinero)-Plata);
		}else if(Op2.equals("2")) {
			personaje.Dinero=((personaje.Dinero)+Plata);
			
		}StatMny.setText(String.valueOf(personaje.Dinero));
	}
	public static void cambiaEquip(String nombre, Integer tipo, Integer Stat1,Integer Stat2,Integer Stat3) {
		if (!nombre.equals("")) {
			if (tipo.equals(1)) {
				lblArma.setText("Arma: "+nombre);
				personaje.Ataque=(AtkBase)+Stat1;
				personaje.Mana=(MnaBase)+Stat2;
				personaje.Velocidad=(SpdBase)+Stat3;
			}else {
				lblArmadura.setText("Armadura: "+nombre);
				personaje.Defensa=(DfsBase)+Stat1;
				personaje.Vida=(HltBase)+Stat2;
				personaje.Peso=(WgtBase)+Stat3;
				lblArmadura.setText("Armadura: "+nombre);
				
			}StatAtk.setText(String.valueOf(personaje.Ataque));
			StatDfs.setText(String.valueOf(personaje.Defensa));
			StatMna.setText(String.valueOf(personaje.Mana));
			StatWgt.setText(String.valueOf(personaje.Peso));
			StatHlth.setText(String.valueOf(personaje.Vida));
			StatSpd.setText(String.valueOf(personaje.Velocidad));
		}
	}
	public static void muestraStatsA(Integer ataque,Integer magia,Integer velocidad) {
		if (!(lblArma.getText()).equals("Arma:")) {
			if (ataque != 0) {
				if (ataque<personaje.Ataque-AtkBase) {
					StatAtk.setText(personaje.Ataque +" "+( AtkBase+ataque-personaje.Ataque));
				}else{
					StatAtk.setText(personaje.Ataque +" +"+( AtkBase+ataque-personaje.Ataque));
				}
			}else {
				StatAtk.setText(personaje.Ataque+" -"+(personaje.Ataque-AtkBase));
			}
			if (velocidad != 0) {
				if (velocidad<personaje.Velocidad-SpdBase) {
					StatSpd.setText(personaje.Velocidad+" "+( SpdBase+velocidad-personaje.Velocidad));
				}else {
					StatSpd.setText(personaje.Velocidad+" +"+( SpdBase+velocidad-personaje.Velocidad));
				}
			}else {
				StatSpd.setText(personaje.Velocidad+" -"+(personaje.Velocidad-SpdBase));
			}
			StatHlth.setText(personaje.Vida+"");
			StatDfs.setText(personaje.Defensa+"");
			StatWgt.setText(personaje.Peso+"");
			if (magia != 0) {
				if (magia<personaje.Mana-MnaBase) {
					StatMna.setText(personaje.Mana+" "+( MnaBase+magia-personaje.Mana));
				}else {
					StatMna.setText(personaje.Mana+" +"+( MnaBase+magia-personaje.Mana));
				}
			}else {
				StatMna.setText(personaje.Mana+" -"+(personaje.Mana-MnaBase));
			}
		}else {
			if (ataque != 0) {
				StatAtk.setText(personaje.Ataque+" +"+ataque);
			}else {
				StatAtk.setText(personaje.Ataque+"");
			}
			if (velocidad != 0) {
				if (velocidad<0) {
					StatSpd.setText(personaje.Velocidad+" "+velocidad);
				}else {
				StatSpd.setText(personaje.Velocidad+" +"+velocidad);}
			}else {
				StatSpd.setText(personaje.Velocidad+"");
			}
			StatHlth.setText(personaje.Vida+"");
			StatDfs.setText(personaje.Defensa+"");
			StatWgt.setText(personaje.Peso+"");
			if (magia != 0) {
				if (magia<0) {
					StatMna.setText(personaje.Mana+" "+magia);
				}else {
				StatMna.setText(personaje.Mana+" +"+magia);}
			}else {
				StatMna.setText(personaje.Mana+"");
			}
		}
	}
	public static void muestraStatsB(Integer defensa,Integer salud,Integer peso) {
		if (!(lblArmadura.getText()).equals("Armadura:")) {
			if (defensa != 0) {
				if (defensa<personaje.Defensa-DfsBase) {
					StatDfs.setText(personaje.Defensa +" "+( DfsBase+defensa-personaje.Defensa));
				}else {
				StatDfs.setText(personaje.Defensa +" +"+( DfsBase+defensa-personaje.Defensa));}
			}else {
				StatDfs.setText(personaje.Defensa+" "+( DfsBase-personaje.Defensa));
			}
			if (salud != 0) {
				if (salud<personaje.Vida-HltBase) {
					StatHlth.setText(personaje.Vida+" "+( HltBase+salud-personaje.Vida));
				}else {
				StatHlth.setText(personaje.Vida+" +"+( HltBase+salud-personaje.Vida));}
			}else {
				StatHlth.setText(personaje.Vida+" "+( HltBase-personaje.Vida));
			}
			StatAtk.setText(personaje.Ataque+"");
			StatSpd.setText(personaje.Velocidad+"");
			StatMna.setText(personaje.Mana+"");
			if (peso != 0) {
				if (peso<personaje.Peso-WgtBase) {
					StatWgt.setText(personaje.Peso+" "+( WgtBase+peso-personaje.Peso));
				}else {
				StatWgt.setText(personaje.Peso+" +"+( WgtBase+peso-personaje.Peso));}
			}else {
				StatWgt.setText(personaje.Peso+" "+( WgtBase-personaje.Peso));
			}
		}else {
			if (defensa != 0) {
				StatDfs.setText(personaje.Defensa+" +"+defensa);
			}else {
				StatDfs.setText(personaje.Defensa+"");
			}
			if (salud != 0) {
				if (salud<0) {
					StatHlth.setText(personaje.Vida+" "+salud);
				}else {
					StatHlth.setText(personaje.Vida+" +"+salud);
				}
			}else {
				StatHlth.setText(personaje.Vida+"");
			}
			StatAtk.setText(personaje.Ataque+"");
			StatSpd.setText(personaje.Velocidad+"");
			StatMna.setText(personaje.Mana+"");
			if (peso != 0) {
				StatWgt.setText(personaje.Peso+" +"+peso);
			}else {
				StatWgt.setText(personaje.Peso+"");
			}
		}
	}
	public static void muestraStatsC() {
		StatDfs.setText(personaje.Defensa+"");
		StatWgt.setText(personaje.Peso+"");
		StatHlth.setText(personaje.Vida+"");
		StatAtk.setText(personaje.Ataque+"");
		StatSpd.setText(personaje.Velocidad+"");
		StatMna.setText(personaje.Mana+"");
	}
}
		
	

