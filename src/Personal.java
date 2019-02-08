// Allows user to input name and pick gender, alignment, weapon type

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Personal implements ItemListener{
	static JLabel title = new JLabel("     Personal Data");
	// labels to display type of data thats being modified
	static JLabel gender = new JLabel("Gender");
	static JLabel alignment = new JLabel("Alignment");
	static JLabel weapon = new JLabel("Weapon");
	static JLabel name = new JLabel("Name");
	
	// textfield to input name
	static JTextField nameField = new JTextField(12);
	
	// String arrays to store alignment information that is then stored in a combo box
	static String[] AlignmentArray = {"", "Lawful Good", "Neutral Good", "Chaotic Good", 
			"Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	static JComboBox comboAlignment = new JComboBox(AlignmentArray);
	
	// String arrays to store fighter weapon information that is then stored in a combo box
	static String[] WeaponFArray = {"", "Sword and Shield", "Greatsword", "Dual Blades", "Spear", "Greataxe"};
	static JComboBox comboWeaponF = new JComboBox(WeaponFArray);
	
	// String arrays to store ranger weapon information that is then stored in a combo box
	static String[] WeaponRArray = {"", "Bow", "Daggers", "Crossbow"};
	static JComboBox comboWeaponR = new JComboBox(WeaponRArray);
	
	// String arrays to store wizard weapon information that is then stored in a combo box
	static String[] WeaponWArray = {"", "Staff", "Wand", "Mace"};
	static JComboBox comboWeaponW = new JComboBox(WeaponWArray);
	
	// check boxes for gender
	static JCheckBox male = new JCheckBox("Male", false);
	static JCheckBox female = new JCheckBox("Female", false);
	
	// button group to group gender check boxes
	static ButtonGroup gender_group = new ButtonGroup();
	
	// buttons to go to next or prev page
	static JButton back = new JButton("Back");
	static JButton next = new JButton("Next");
	
	// panels to store and display data
	static JPanel personal_panel = new JPanel(new BorderLayout());
	static JPanel data_panel = new JPanel(new GridLayout(8, 2, 1, 1));
	static JPanel button_panel = new JPanel(new BorderLayout());
	static JPanel gender_panel = new JPanel(new FlowLayout());
	
	String w_type; // string to check type of weapon 
	
	public Personal() {
		// sets the font for all text in on the page
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 70));
		
		gender.setFont(new Font("Pristina", Font.BOLD, 30));
		name.setFont(new Font("Pristina", Font.BOLD, 30));
		weapon.setFont(new Font("Pristina", Font.BOLD, 30));
		alignment.setFont(new Font("Pristina", Font.BOLD, 30));
		
		nameField.setFont(new Font("Pristina", Font.BOLD, 30));
		
		male.setFont(new Font("Pristina", Font.BOLD, 30));
		female.setFont(new Font("Pristina", Font.BOLD, 30));
		
		back.setFont(new Font("Pristina", Font.BOLD, 50));
		next.setFont(new Font("Pristina", Font.BOLD, 50));
		
		// adds check boxes and combo boxes to itemlistener
		male.addItemListener(this);
		female.addItemListener(this);
		comboAlignment.addItemListener(this);
		comboWeaponF.addItemListener(this);
		comboWeaponR.addItemListener(this);
		comboWeaponW.addItemListener(this);
		
		// add genders to group
		gender_group.add(male);
		gender_group.add(female);
		
		// add genders to its personal panel
		gender_panel.add(male);
		gender_panel.add(female);
		
		// add buttons to page changing panel
		button_panel.add(back, BorderLayout.WEST);
		button_panel.add(next, BorderLayout.EAST);
		
		//adds inputs and their labels to its own panel
		data_panel.add(name);
		data_panel.add(nameField);
		data_panel.add(gender);
		data_panel.add(gender_panel);
		data_panel.add(alignment);
		data_panel.add(comboAlignment);
		data_panel.add(weapon);
		
		// adds title and other panels to main panel
		personal_panel.add(title, BorderLayout.NORTH);
		personal_panel.add(data_panel, BorderLayout.CENTER);
		personal_panel.add(button_panel, BorderLayout.SOUTH);
		
	}
	
	// returns main panel when called
	public static JPanel getPersonalPanel() {
		return personal_panel;
	}
	
	// removes other weapon panels and adds fighter weapon combobox to data panel when called
	public void setWeaponF() {
		data_panel.remove(comboWeaponR);
		data_panel.remove(comboWeaponW);
		data_panel.add(comboWeaponF);
	}
	
	// removes other weapon panels and adds ranger weapon combobox to data panel when called
	public void setWeaponR() {
		data_panel.remove(comboWeaponF);
		data_panel.remove(comboWeaponW);
		data_panel.add(comboWeaponR);
	}
	
	// removes other weapon panels and adds wizard weapon combobox to data panel when called
	public void setWeaponW() {
		data_panel.remove(comboWeaponR);
		data_panel.remove(comboWeaponF);
		data_panel.add(comboWeaponW);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getItem();
		Object source1 = e.getSource();
		int select = e.getStateChange();
		
		// checks which gender is checked and stores that data in overview panel 
		if (source ==  male) {
			if(select == ItemEvent.SELECTED) {
				Overview.setGender("Male");
			}
		}
		
		if (source ==  female) {
			if(select == ItemEvent.SELECTED) {
				Overview.setGender("Female");
			}
		}
		
		// checks which alignment is selected and stores it in overview panel
		if(source1 == comboAlignment) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = comboAlignment.getSelectedIndex();
				for(int i = 0; i < 10; i++) {
					if (i == positionOfSelection) {
						Overview.setAlignment(AlignmentArray[i]);
					}
				}
			}
		}
		
		// checks which fighter weapon is selected and stores it in overview panel
		if(source1 == comboWeaponF) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = comboWeaponF.getSelectedIndex();
				for(int i = 0; i < 6; i++) {
					if (i == positionOfSelection) {
						Overview.setWeapon(WeaponFArray[i]);
					}
				}
			}
		}
		
		// checks which ranger weapon is selected and stores it in overview panel
		if(source1 == comboWeaponR) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = comboWeaponR.getSelectedIndex();
				for(int i = 0; i < 3; i++) {
					if (i == positionOfSelection) {
						Overview.setWeapon(WeaponRArray[i]);
					}
				}
			}
		}
		
		// checks which wizard weapon is selected and stores it in overview panel
		if(source1 == comboWeaponW) {
			if(select == ItemEvent.SELECTED) {
				int positionOfSelection = comboWeaponW.getSelectedIndex();
				for(int i = 0; i < 3; i++) {
					if (i == positionOfSelection) {
						Overview.setWeapon(WeaponWArray[i]);
					}
				}
			}
		}
	}
}
