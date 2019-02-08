// Controls 4 pages, the overall Class page and its 3 sub pages, Fighter, Ranger, and Wizard pages

import java.awt.*;
import javax.swing.*;

public class Classes {	
	
	// Buttons to go between pages
	static JButton back_c = new JButton("Back");
	static JButton back_f = new JButton("Back");
	static JButton back_r = new JButton("Back");
	static JButton back_w = new JButton("Back");
	
	static JButton next_f = new JButton("Next");
	static JButton next_r = new JButton("Next");
	static JButton next_w = new JButton("Next");
	
	// Buttons to take user to class sub pages
	static JButton fighter = new JButton("FIGHTER");
	static JButton ranger = new JButton("RANGER");
	static JButton wizard = new JButton("WIZARD");

	// Titles for the 4 pages
	private static JLabel title = new JLabel("           Classes");
	private static JLabel fighter_title = new JLabel("     Fighter");
	private static JLabel ranger_title = new JLabel("       Ranger");
	private static JLabel wizard_title = new JLabel("      Wizard");
	
	// text areas containing the descriptions of the classes with the text being called from Text class
	private static JTextArea fighter_des = new JTextArea(Text.setClassText(1));
	private static JTextArea ranger_des = new JTextArea(Text.setClassText(2));
	private static JTextArea wizard_des = new JTextArea(Text.setClassText(3));
	
	// panels with their layouts set for the 4 pages
	static JPanel class_panel = new JPanel(new GridLayout(5, 1));
	static JPanel fighter_panel = new JPanel(new BorderLayout());
	static JPanel ranger_panel = new JPanel(new BorderLayout());
	static JPanel wizard_panel = new JPanel(new BorderLayout());
	
	// panels for the buttons to be placed
	static JPanel button_panel1 = new JPanel(new BorderLayout());
	static JPanel button_panel2 = new JPanel(new BorderLayout());
	static JPanel button_panel3 = new JPanel(new BorderLayout());
	
	// Function that sets the fonts of the classes page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getClassPanel() {
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 70));
		fighter.setFont(new Font("Pristina", Font.BOLD, 30));
		ranger.setFont(new Font("Pristina", Font.BOLD, 30));
		wizard.setFont(new Font("Pristina", Font.BOLD, 30));
		back_c.setFont(new Font("Pristina", Font.BOLD, 30));
	
		class_panel.add(title); 
		class_panel.add(fighter); // adds class sub panels to main panel
		class_panel.add(ranger);
		class_panel.add(wizard);
		class_panel.add(back_c);
	
		return class_panel;
	}
	
	// Function that sets the fonts of the fighter page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getFighterPanel() {
		fighter_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		fighter_des.setFont(new Font("Pristina", Font.BOLD, 25));
		
		back_f.setFont(new Font("Pristina", Font.BOLD, 50));
		next_f.setFont(new Font("Pristina", Font.BOLD, 50));
		
		fighter_panel.add(fighter_title, BorderLayout.NORTH); // adds text to panel
		fighter_panel.add(fighter_des, BorderLayout.CENTER);
		fighter_panel.add(button_panel1, BorderLayout.SOUTH); // adds sub panel to main panel
		
		fighter_des.setEditable(false); // prevents jtextarea from being modified by user
		
		button_panel1.add(back_f, BorderLayout.WEST); // adds buttons to sub panel
		button_panel1.add(next_f, BorderLayout.EAST);
		
		return fighter_panel;
	}
	
	// Function that sets the fonts of the ranger page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getRangerPanel() {
		ranger_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		ranger_des.setFont(new Font("Pristina", Font.BOLD, 25));
		
		back_r.setFont(new Font("Pristina", Font.BOLD, 50));
		next_r.setFont(new Font("Pristina", Font.BOLD, 50));
		
		ranger_panel.add(ranger_title, BorderLayout.NORTH);
		ranger_panel.add(ranger_des, BorderLayout.CENTER);
		ranger_panel.add(button_panel2, BorderLayout.SOUTH);
		
		ranger_des.setEditable(false); // prevents jtextarea from being modified by user
		
		button_panel2.add(back_r, BorderLayout.WEST);
		button_panel2.add(next_r, BorderLayout.EAST);
		
		return ranger_panel;
	}
	
	// Function that sets the fonts of the wizard page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getWizardPanel() {
		wizard_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		wizard_des.setFont(new Font("Pristina", Font.BOLD, 25));
		
		back_w.setFont(new Font("Pristina", Font.BOLD, 50));
		next_w.setFont(new Font("Pristina", Font.BOLD, 50));
		
		wizard_panel.add(wizard_title, BorderLayout.NORTH);
		wizard_panel.add(wizard_des, BorderLayout.CENTER);
		wizard_panel.add(button_panel3, BorderLayout.SOUTH);
		
		wizard_des.setEditable(false); // prevents jtextarea from being modified by user
		
		button_panel3.add(back_w, BorderLayout.WEST);
		button_panel3.add(next_w, BorderLayout.EAST);
		
		return wizard_panel;
	}
}
