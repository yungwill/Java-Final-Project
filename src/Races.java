// Controls 4 pages, the overall Race page and its 3 sub pages, Human, Elf, and Dwarf pages

import java.awt.*;
import javax.swing.*;

public class Races{
	
	// Buttons to go between pages
	static JButton back_r = new JButton("Back");
	static JButton back_h = new JButton("Back");
	static JButton back_e = new JButton("Back");
	static JButton back_d = new JButton("Back");
	
	static JButton next_h = new JButton("Next");
	static JButton next_e = new JButton("Next");
	static JButton next_d = new JButton("Next");
	
	// Titles for the 4 pages
	private static JLabel title = new JLabel("            Races");
	private static JLabel human_title = new JLabel("       Human");
	private static JLabel elf_title = new JLabel("         Elf");
	private static JLabel dwarf_title = new JLabel("      Dwarf");
	
	// Buttons to take user to race sub pages
	static JButton human = new JButton("HUMAN");
	static JButton elf = new JButton("ELF");
	static JButton dwarf = new JButton("DWARF");
	
	// panels with their layouts set for the 4 pages
	static JPanel race_panel = new JPanel(new GridLayout(5, 1));
	static JPanel human_panel = new JPanel(new BorderLayout());
	static JPanel elf_panel = new JPanel(new BorderLayout());
	static JPanel dwarf_panel = new JPanel(new BorderLayout());
	
	// panels for the buttons to be placed
	static JPanel button_panel1 = new JPanel(new BorderLayout());
	static JPanel button_panel2 = new JPanel(new BorderLayout());
	static JPanel button_panel3 = new JPanel(new BorderLayout());
	
	// text areas containing the descriptions of the races with the text being called from Text class
	static JTextArea human_des = new JTextArea(Text.setRaceText(1));
	static JTextArea elf_des = new JTextArea(Text.setRaceText(2));
	static JTextArea dwarf_des = new JTextArea(Text.setRaceText(3));
	
	// Function that sets the fonts of the races page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getRacePanel() { 
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 70)); // changes font and it size
		human.setFont(new Font("Pristina", Font.BOLD, 30));
		elf.setFont(new Font("Pristina", Font.BOLD, 30));
		dwarf.setFont(new Font("Pristina", Font.BOLD, 30));
		back_r.setFont(new Font("Pristina", Font.BOLD, 30));
	
		race_panel.add(title);
		race_panel.add(human); // adds race sub panels to main panel
		race_panel.add(elf);
		race_panel.add(dwarf);
		race_panel.add(back_r); 
	
		return race_panel;
	}
	
	// Function that sets the fonts of the human page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getHumanPanel() {
		human_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		human_des.setFont(new Font("Pristina", Font.BOLD, 25));
		back_h.setFont(new Font("Pristina", Font.BOLD, 50));
		next_h.setFont(new Font("Pristina", Font.BOLD, 50));
		
		human_des.setEditable(false); // prevents jtextarea from being modified by user
		
		human_panel.add(human_title, BorderLayout.NORTH); // adds text to panel
		human_panel.add(human_des, BorderLayout.CENTER);
		human_panel.add(button_panel1, BorderLayout.SOUTH); // adds sub panel to main panel
		
		button_panel1.add(back_h, BorderLayout.WEST); // adds buttons to sub panel
		button_panel1.add(next_h, BorderLayout.EAST);
		
		return human_panel;
	}
	
	// Function that sets the fonts of the elf page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getElfPanel() {
		elf_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		elf_des.setFont(new Font("Pristina", Font.BOLD, 25));
		back_e.setFont(new Font("Pristina", Font.BOLD, 50));
		next_e.setFont(new Font("Pristina", Font.BOLD, 50));
		
		elf_des.setEditable(false);
		
		elf_panel.add(elf_title, BorderLayout.NORTH);
		elf_panel.add(elf_des, BorderLayout.CENTER);
		elf_panel.add(button_panel2, BorderLayout.SOUTH);
		
		button_panel2.add(back_e, BorderLayout.WEST);
		button_panel2.add(next_e, BorderLayout.EAST);
		
		return elf_panel;
	}
	
	// Function that sets the fonts of the dwarf page and adds them to its corresponding panel and returns it when called
	// in the CharacterCreationClass
	public static JPanel getDwarfPanel() {
		dwarf_title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100));
		dwarf_des.setFont(new Font("Pristina", Font.BOLD, 25));
		back_d.setFont(new Font("Pristina", Font.BOLD, 50));
		next_d.setFont(new Font("Pristina", Font.BOLD, 50));
		
		dwarf_des.setEditable(false);
		
		dwarf_panel.add(dwarf_title, BorderLayout.NORTH);
		dwarf_panel.add(dwarf_des, BorderLayout.CENTER);
		dwarf_panel.add(button_panel3, BorderLayout.SOUTH);
		
		button_panel3.add(back_d, BorderLayout.WEST);
		button_panel3.add(next_d, BorderLayout.EAST);
		
		return dwarf_panel;
	}
}
