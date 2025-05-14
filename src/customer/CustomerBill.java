package customer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.*;
import java.awt.print.*;
import java.util.Calendar;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class CustomerBill extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_6;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_11;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField txtO;
	private JTextField textField_19;
	private JTextField textField_icecream;
	private JTextField textField_cake;
	private JTextField textField_22;
	private JTextField textField_23;
	private JFrame frame;
	private JTextArea textArea;
	
	private ButtonGroup bg = new ButtonGroup();
	
	String iTax, iSubTotal, iTotal;
	double [] itemcost = new double[20];
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBill frame = new CustomerBill();
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
	public CustomerBill() {
		
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent arg0) {
				textField_1.setText(null);
				textField_1.setEnabled(false);
				int refId = 5015 + (int) (Math.random()*17238);
				String custId = "";
				custId += refId + 1560;
				textField_1.setText(custId);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setVgap(12);
		flowLayout.setHgap(25);
		panel.setBackground(new Color(135, 206, 235));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel.setBounds(10, 11, 447, 541);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_1);
		textField_1.setColumns(15);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_2);
		textField_2.setColumns(15);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_3);
		textField_3.setColumns(15);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_4);
		textField_4.setColumns(15);
		
		JLabel lblNewLabel_4 = new JLabel("Postcode");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_5);
		textField_5.setColumns(15);
		
		JLabel lblNewLabel_5 = new JLabel("Ph. No.");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField);
		textField.setColumns(15);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_7);
		textField_7.setColumns(15);
		
		JLabel lblNewLabel_7 = new JLabel("Date of Birth");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_8);
		textField_8.setColumns(15);
		
		JLabel lblNewLabel_8 = new JLabel("Aadhar No.");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_9);
		textField_9.setColumns(15);
		
		JLabel lblNewLabel_9 = new JLabel(" State ");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_10);
		textField_10.setColumns(15);
		
		JLabel lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_10);
		
		JRadioButton male = new JRadioButton("Male");
		male.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(male.isSelected() == true) {
					textField_23.setText("Male");
				}
			}
		});
		male.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(female.isSelected() == true) {
					textField_23.setText("Female");
				}
			}
		});
		female.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		other.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(other.isSelected() == true) {
					textField_23.setText("Other");
				}
			}
		});
		other.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(other);
		
		bg.add(male);
		bg.add(female);
		bg.add(other);
		
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel.add(textField_23);
		textField_23.setColumns(15);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setHgap(30);
		flowLayout_2.setAlignment(FlowLayout.RIGHT);
		flowLayout_2.setVgap(12);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setBounds(467, 11, 455, 541);
		contentPane.add(panel_1);
		
		JCheckBox chkCoffee = new JCheckBox(" Coffee                ");
		chkCoffee.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(chkCoffee.isSelected()) {
					textField_12.setEnabled(true);
					textField_12.setText("");
					textField_12.requestFocus();
				}
				else {
					textField_12.setEnabled(false);
					textField_12.setText("0");
				}
			}
		});
		chkCoffee.setBackground(new Color(135, 206, 250));
		chkCoffee.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkCoffee);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		textField_12.setEnabled(false);
		
		JCheckBox chkGreenTea = new JCheckBox("Green Tea          ");
		chkGreenTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkGreenTea.isSelected()) {
					textField_11.setEnabled(true);
					textField_11.setText("");
					textField_11.requestFocus();
				}
				else {
					textField_11.setEnabled(false);
					textField_11.setText("0");
				}
			}
		});
		chkGreenTea.setBackground(new Color(135, 206, 235));
		chkGreenTea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkGreenTea);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		textField_11.setEnabled(false);
		
		JCheckBox chkLemonIceTea = new JCheckBox("Lemon Ice Tea  ");
		chkLemonIceTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkLemonIceTea.isSelected()) {
					textField_15.setEnabled(true);
					textField_15.setText("");
					textField_15.requestFocus();
				}
				else {
					textField_15.setEnabled(false);
					textField_15.setText("0");
				}
			}
		});
		chkLemonIceTea.setBackground(new Color(135, 206, 235));
		chkLemonIceTea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkLemonIceTea);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_15);
		textField_15.setColumns(10);
		textField_15.setEnabled(false);
		
		JCheckBox chkMilkshake = new JCheckBox("Milkshake         ");
		chkMilkshake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkMilkshake.isSelected()) {
					textField_16.setEnabled(true);
					textField_16.setText("");
					textField_16.requestFocus();
				}
				else {
					textField_16.setEnabled(false);
					textField_16.setText("0");
				}
			}
		});
		chkMilkshake.setBackground(new Color(135, 206, 235));
		chkMilkshake.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkMilkshake);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		textField_16.setEnabled(false);
		
		JCheckBox chkMojito = new JCheckBox("Mojito                ");
		chkMojito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkMojito.isSelected()) {
					textField_17.setEnabled(true);
					textField_17.setText("");
					textField_17.requestFocus();
				}
				else {
					textField_17.setEnabled(false);
					textField_17.setText("0");
				}
			}
		});
		chkMojito.setBackground(new Color(135, 206, 235));
		chkMojito.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkMojito);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		textField_17.setEnabled(false);
		
		JCheckBox chkMocktail = new JCheckBox("Mocktail            ");
		chkMocktail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkMocktail.isSelected()) {
					textField_18.setEnabled(true);
					textField_18.setText("");
					textField_18.requestFocus();
				}
				else {
					textField_18.setEnabled(false);
					textField_18.setText("0");
				}
			}
		});
		chkMocktail.setBackground(new Color(135, 206, 235));
		chkMocktail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkMocktail);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setText("0");
		panel_1.add(textField_18);
		textField_18.setColumns(10);
		textField_18.setEnabled(false);
		
		JCheckBox chkMintLime = new JCheckBox("Mint Lime         ");
		chkMintLime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkMintLime.isSelected()) {
					txtO.setEnabled(true);
					txtO.setText("");
					txtO.requestFocus();
				}
				else {
					txtO.setEnabled(false);
					txtO.setText("0");
				}
			}
		});
		chkMintLime.setBackground(new Color(135, 206, 235));
		chkMintLime.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkMintLime);
		
		txtO = new JTextField();
		txtO.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtO.setHorizontalAlignment(SwingConstants.CENTER);
		txtO.setText("0");
		panel_1.add(txtO);
		txtO.setColumns(10);
		txtO.setEnabled(false);
		
		JCheckBox chkFruitJuice = new JCheckBox("Fruit Juice        ");
		chkFruitJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkFruitJuice.isSelected()) {
					textField_19.setEnabled(true);
					textField_19.setText("");
					textField_19.requestFocus();
				}
				else {
					textField_19.setEnabled(false);
					textField_19.setText("0");
				}
			}
		});
		chkFruitJuice.setBackground(new Color(135, 206, 235));
		chkFruitJuice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		chkFruitJuice.setForeground(new Color(0, 0, 0));
		panel_1.add(chkFruitJuice);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setText("0");
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		textField_19.setEnabled(false);
		
		JCheckBox chkFalooda = new JCheckBox("Falooda              ");
		chkFalooda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkFalooda.isSelected()) {
					textField_6.setEnabled(true);
					textField_6.setText("");
					textField_6.requestFocus();
				}
				else {
					textField_6.setEnabled(false);
					textField_6.setText("0");
				}
			}
		});
		chkFalooda.setFont(new Font("Times New Roman", Font.BOLD, 20));
		chkFalooda.setBackground(new Color(135, 206, 235));
		panel_1.add(chkFalooda);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(255, 255, 255));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEnabled(false);
		
		JCheckBox chkIceCream = new JCheckBox("Ice Cream          ");
		chkIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkIceCream.isSelected()) {
					textField_icecream.setEnabled(true);
					textField_icecream.setText("");
					textField_icecream.requestFocus();
				}
				else {
					textField_icecream.setEnabled(false);
					textField_icecream.setText("0");
				}
			}
		});
		chkIceCream.setBackground(new Color(135, 206, 235));
		chkIceCream.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkIceCream);
		
		textField_icecream = new JTextField();
		textField_icecream.setHorizontalAlignment(SwingConstants.CENTER);
		textField_icecream.setText("0");
		textField_icecream.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField_icecream);
		textField_icecream.setColumns(10);
		textField_icecream.setEnabled(false);
		
		JCheckBox chkCake = new JCheckBox("Cake                   ");
		chkCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkCake.isSelected()) {
					textField_cake.setEnabled(true);
					textField_cake.setText("");
					textField_cake.requestFocus();
				}
				else {
					textField_cake.setEnabled(false);
					textField_cake.setText("0");
				}
			}
		});
		chkCake.setBackground(new Color(135, 206, 235));
		chkCake.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(chkCake);
		
		textField_cake = new JTextField();
		textField_cake.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_cake.setHorizontalAlignment(SwingConstants.CENTER);
		textField_cake.setText("0");
		panel_1.add(textField_cake);
		textField_cake.setColumns(10);
		textField_cake.setEnabled(false);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_2.getLayout();
		flowLayout_4.setVgap(16);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_2.setBackground(new Color(135, 206, 235));
		panel_2.setBounds(932, 11, 444, 541);
		contentPane.add(panel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setRows(28);
		textArea.setColumns(35);
		panel_2.add(textArea);
		textArea.setEnabled(false);
		
		JPanel panel_2_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2_1.getLayout();
		flowLayout_1.setHgap(50);
		flowLayout_1.setVgap(60);
		panel_2_1.setBounds(10, 562, 447, 191);
		contentPane.add(panel_2_1);
		panel_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_2_1.setBackground(new Color(135, 206, 235));
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(textField_12.getText()) * 40.00;
				itemcost[1] = Double.parseDouble(textField_11.getText()) * 35.00;
				itemcost[2] = Double.parseDouble(textField_15.getText()) * 35.00;
				itemcost[3] = Double.parseDouble(textField_16.getText()) * 110.00;
				itemcost[4] = Double.parseDouble(textField_17.getText()) * 70.00;
				itemcost[5] = Double.parseDouble(textField_18.getText()) * 150.00;
				itemcost[6] = Double.parseDouble(txtO.getText()) * 55.00;
				itemcost[7] = Double.parseDouble(textField_19.getText()) * 75.00;
				itemcost[8] = Double.parseDouble(textField_6.getText()) * 60.00;
				itemcost[9] = Double.parseDouble(textField_icecream.getText()) * 180.00;
				itemcost[10] = Double.parseDouble(textField_cake.getText()) * 250.00;
				
				itemcost[11] = itemcost[0] + itemcost[1] + itemcost[2] + itemcost[3] + itemcost[4];
				itemcost[12] = itemcost[5] + itemcost[6] + itemcost[7] + itemcost[8] + itemcost[9] + itemcost[10];
				
				itemcost[13] = itemcost[11] + itemcost[12];
				
				iTax = String.format("₹ %.2f", itemcost[13] / 100);
				iSubTotal = String.format("₹ %.2f", itemcost[13]);
				iTotal = String.format("₹ %.2f", itemcost[13] + (itemcost[13] / 100));
				
				textField_13.setText(iTax);
				textField_14.setText(iSubTotal);
				textField_22.setText(iTotal);
				
				//==========
				textArea.setEnabled(true);
				int id = 1325 + (int) (Math.random()*4238);
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
				tDate.format(timer.getTime());
				
				textArea.append("\n\t Customer Billing System\n\n" + 
				"   Reference ID:\t\t\t" + id +
				"\n  =============================================\t" + 
				
						"\n  =============================================\t "+
						"\n   Customer ID:\t\t\t" + textField_1.getText() +
						"\n   First Name:\t\t\t" + textField_2.getText() +
						"\n   Last Name:\t\t\t" + textField_3.getText() +
						
						"\n   Coffee:\t\t\t" + textField_12.getText() +
						"\n   Green Tea:\t\t\t" + textField_11.getText() +
						"\n   Lemon Ice Tea:\t\t" + textField_15.getText() +
						"\n   Milkshake:\t\t\t" + textField_16.getText() +
						"\n   Mojito:\t\t\t" + textField_17.getText() +
						"\n   Mocktail:\t\t\t" + textField_18.getText() +
						"\n   Mint Lime:\t\t\t" + txtO.getText() +
						"\n   Fruit Juice:\t\t\t" + textField_19.getText() +
						"\n   Falooda:\t\t\t" + textField_6.getText() +
						"\n   Ice Cream:\t\t\t" + textField_icecream.getText() +
						"\n   Cake:\t\t\t" + textField_cake.getText() +
						
						"\n  =============================================\t "+
						
						"\n   Tax:\t\t\t" + iTax +
						"\n   Sub Total:\t\t\t" + iSubTotal +
						"\n   Total:\t\t\t" + iTotal +
						"\n  =============================================\t "+
						"\n   Date: " + tDate.format(timer.getTime()) + 
						"\t\tTime: " + tTime.format(timer.getTime()) + 
						
						"\n\n\tThank You For Visiting LORA Cafe\t\n");
				
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2_1.add(btnTotal);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					textArea.print();

				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2_1.add(btnPrint);
		
		JPanel panel_2_1_1 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_2_1_1.getLayout();
		flowLayout_5.setVgap(60);
		flowLayout_5.setHgap(55);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_2_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_2_1_1.setBackground(new Color(135, 206, 235));
		panel_2_1_1.setBounds(932, 562, 444, 191);
		contentPane.add(panel_2_1_1);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_12.setEnabled(false);
				textField_11.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				txtO.setEnabled(false);
				textField_19.setEnabled(false);
				textField_6.setEnabled(false);
				textField_icecream.setEnabled(false);
				textField_cake.setEnabled(false);
				
				textField_12.setText("0");
				textField_11.setText("0");
				textField_15.setText("0");
				textField_16.setText("0");
				textField_17.setText("0");
				textField_18.setText("0");
				txtO.setText("0");
				textField_19.setText("0");
				textField_6.setText("0");
				textField_icecream.setText("0");
				textField_cake.setText("0");
				
				textArea.setEnabled(false);
				
				chkCoffee.setSelected(false);
				chkGreenTea.setSelected(false);
				chkLemonIceTea.setSelected(false);
				chkMilkshake.setSelected(false);
				chkMojito.setSelected(false);
				chkMocktail.setSelected(false);
				chkMintLime.setSelected(false);
				chkFruitJuice.setSelected(false);
				chkFalooda.setSelected(false);
				chkIceCream.setSelected(false);
				chkCake.setSelected(false);
				
				bg.clearSelection();
				
				textField_1.setText(null);
				textField_1.setEnabled(false);
				int refId = 5015 + (int) (Math.random()*17238);
				String custId = "";
				custId += refId + 1560;
				
				textField_1.setText(custId);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_14.setText(null);
				textField_13.setText(null);
				textField_22.setText(null);
				textField_23.setText(null);
				textArea.setText(null);
				
			}
		});
		btnReset.setHorizontalAlignment(SwingConstants.RIGHT);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2_1_1.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Customer Billing System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2_1_1.add(btnExit);
		
		JPanel panel_2_1_1_1 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2_1_1_1.getLayout();
		flowLayout_3.setHgap(15);
		flowLayout_3.setVgap(20);
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		panel_2_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_2_1_1_1.setBackground(new Color(135, 206, 235));
		panel_2_1_1_1.setBounds(467, 562, 455, 191);
		contentPane.add(panel_2_1_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("      Sub Total      ");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2_1_1_1.add(lblNewLabel_12);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2_1_1_1.add(textField_14);
		textField_14.setColumns(15);
		
		JLabel lblNewLabel_13 = new JLabel("         Tax           ");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2_1_1_1.add(lblNewLabel_13);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2_1_1_1.add(textField_13);
		textField_13.setColumns(15);
		
		JLabel lblNewLabel_11 = new JLabel("       Total          ");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2_1_1_1.add(lblNewLabel_11);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		panel_2_1_1_1.add(textField_22);
		textField_22.setColumns(15);
		
	}
}
