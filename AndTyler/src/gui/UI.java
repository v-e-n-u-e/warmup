package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;

import character.Player;
import data.ResourceManager;
import data.SaveData;
import gameworld.Controller;
import gameworld.Game;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UI extends JFrame {

	private JPanel contentPane;
	private JButton infoButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton[] bArray;
	private JTextArea textArea;
	private JMenuItem Save;
	private JMenuItem Load;
	public Controller controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setTitle("lul");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1075, 659);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem Menu = new JMenuItem("Menu");
		file.add(Menu);
		
		Save = new JMenuItem("Save");
		file.add(Save);
		
		Load = new JMenuItem("Load");
		file.add(Load);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel infopanel = new JPanel();
		infopanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		infopanel.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setBackground(SystemColor.control);
		txtrName.setText("Name");
		txtrName.setLineWrap(true);
		txtrName.setEditable(false);
		txtrName.setBounds(12, 10, 118, 47);
		infopanel.add(txtrName);
		
		JTextArea txtrMoney = new JTextArea();
		txtrMoney.setBackground(SystemColor.control);
		txtrMoney.setText("Money");
		txtrMoney.setLineWrap(true);
		txtrMoney.setEditable(false);
		txtrMoney.setBounds(12, 67, 118, 47);
		infopanel.add(txtrMoney);
		
		JTextArea txtrLocation = new JTextArea();
		txtrLocation.setBackground(SystemColor.control);
		txtrLocation.setText("Location");
		txtrLocation.setLineWrap(true);
		txtrLocation.setEditable(false);
		txtrLocation.setBounds(12, 124, 118, 47);
		infopanel.add(txtrLocation);
		
		JTextArea txtrFatigue = new JTextArea();
		txtrFatigue.setBackground(SystemColor.control);
		txtrFatigue.setText("Fatigue");
		txtrFatigue.setLineWrap(true);
		txtrFatigue.setEditable(false);
		txtrFatigue.setBounds(12, 181, 118, 47);
		infopanel.add(txtrFatigue);
		
		JTextArea txtrTemp = new JTextArea();
		txtrTemp.setBackground(SystemColor.control);
		txtrTemp.setText("Temp");
		txtrTemp.setLineWrap(true);
		txtrTemp.setEditable(false);
		txtrTemp.setBounds(12, 238, 118, 47);
		infopanel.add(txtrTemp);
		
		JTextArea txtrTemp1 = new JTextArea();
		txtrTemp1.setText("Temp");
		txtrTemp1.setBackground(SystemColor.control);
		txtrTemp1.setLineWrap(true);
		txtrTemp1.setEditable(false);
		txtrTemp1.setBounds(12, 295, 118, 47);
		infopanel.add(txtrTemp1);
		
		JTextArea txtrTemp2 = new JTextArea();
		txtrTemp2.setBackground(SystemColor.control);
		txtrTemp2.setText("Temp");
		txtrTemp2.setLineWrap(true);
		txtrTemp2.setEditable(false);
		txtrTemp2.setBounds(12, 352, 118, 47);
		infopanel.add(txtrTemp2);
		
		infoButton = new JButton("More Info");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		infoButton.setBounds(12, 409, 118, 32);
		infopanel.add(infoButton);
		
		JPanel buttons = new JPanel();
		buttons.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		
		button_2 = new JButton("");
		button = new JButton("New Game");
		button_1 = new JButton("Load Game");
		button_3 = new JButton("");
		button_5 = new JButton("");
		button_7 = new JButton("");
		button_4 = new JButton("");
		button_6 = new JButton("");
		button_8 = new JButton("");
		button_9 = new JButton("");
		bArray = new JButton[10];
		bArray[0]=button;
		bArray[1]=button_1;
		bArray[2]=button_2;
		bArray[3]=button_3;
		bArray[4]=button_4;
		bArray[5]=button_5;
		bArray[6]=button_6;
		bArray[7]=button_7;
		bArray[8]=button_8;
		bArray[9]=button_9;
		
		JPanel text = new JPanel();
		text.setBackground(SystemColor.window);
		text.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(infopanel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(text, GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE))
						.addComponent(buttons, GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE))
					.addGap(7))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(infopanel, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
						.addComponent(text, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
					.addGap(10)
					.addComponent(buttons, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(5))
		);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_buttons = new GroupLayout(buttons);
		gl_buttons.setHorizontalGroup(
			gl_buttons.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_buttons.createSequentialGroup()
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_buttons.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_buttons.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_buttons.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_buttons.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_buttons.createParallelGroup(Alignment.LEADING)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
					.addGap(1))
		);
		gl_buttons.setVerticalGroup(
			gl_buttons.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttons.createSequentialGroup()
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_buttons.createSequentialGroup()
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_buttons.createSequentialGroup()
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_buttons.createSequentialGroup()
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_buttons.createSequentialGroup()
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
		);
		
		JList list = new JList();
		list.setVisibleRowCount(6);
		scrollPane_1.setViewportView(list);
		buttons.setLayout(gl_buttons);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_text = new GroupLayout(text);
		gl_text.setHorizontalGroup(
			gl_text.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
		);
		gl_text.setVerticalGroup(
			gl_text.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
		);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		text.setLayout(gl_text);
		contentPane.setLayout(gl_contentPane);
		createEvents();
		Game game = new Game();
	}
	
	//------------------------------------------------EVENTS--------------------------------------------------------------------
	//------------------------------------------------EVENTS--------------------------------------------------------------------
	//------------------------------------------------EVENTS--------------------------------------------------------------------
	
	public void textOut(String m){
		//textArea.append("============================================================================================================\n\n");
		textArea.append(m);
		textArea.append("\n\n\n\n============================================================================================================\n\n\n\n");
	}
	
	public Player newGame(){
		textOut("What is your gender?");
		button.setText("Male");
		button_1.setText("Female");
		Player p=new Player(5,5,5,5,5);
		return p;
	}
	
	public void setButtons(ArrayList<String> actions){
		int count = 0;
		for(String s:actions){
				bArray[count].setText(s);
		}
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	
	private void createEvents(){
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textOut("test");
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveData data = new SaveData();
				data.name = "Venue";
				
				try{
					ResourceManager.save(data, "savefile");
				}
				catch(Exception e1){
					System.out.println("Couldn't save: " + e1.getMessage());
				}
			}
		});
		
		Load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					SaveData data = (SaveData) ResourceManager.load("savefile");
					
				}
				catch(Exception e1){
					System.out.println("Couldn't save: " + e1.getMessage());
				}
			}
		});
	}
}
