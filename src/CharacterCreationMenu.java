// Controls the entire program

import java.awt.*; // imports libraries
import javax.swing.*;
import java.awt.event.*;

public class CharacterCreationMenu extends JFrame implements ActionListener{
	final int FRAME_WIDTH = 800; // data for window size
	final int FRAME_HEIGHT = 750;
	
	JButton start; // button to start application
	JPanel intro_panel; 
	JLabel title, buffer; // label for title of application and buffer
	
	Stats stat = new Stats(); // create new instances of classes
	Personal data = new Personal();
	Game play = new Game();
	
	CardLayout cardLayout = new CardLayout();
	
	public CharacterCreationMenu() {
		super("Character Creation Menu");
		
		title = new JLabel("<html>Fantasy Character<br/>Creation<html>"); // Sets data for title of the program
		buffer = new JLabel("                                                  ");
		start = new JButton("Start");
		
		intro_panel = new JPanel(new BorderLayout()); // Sets the type of layout for the panel
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT); // sets size of window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ends program when closed
		setLocationRelativeTo(null); // opens window to center of screen
		intro_panel.setBackground(Color.LIGHT_GRAY); // sets the background
		
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 100)); // sets the text for the title and button
		start.setFont(new Font("Pristina", Font.BOLD, 50));
		
		// Adds buttons from all of the pages in the program that cause the program to change pages
		start.addActionListener(this); 
		
		Races.human.addActionListener(this);
		Races.elf.addActionListener(this);
		Races.dwarf.addActionListener(this);
		
		Races.back_r.addActionListener(this);
		Races.back_h.addActionListener(this);
		Races.back_e.addActionListener(this);
		Races.back_d.addActionListener(this);
		
		Races.next_h.addActionListener(this);
		Races.next_e.addActionListener(this);
		Races.next_d.addActionListener(this);
		
		Classes.back_c.addActionListener(this);
		
		Classes.fighter.addActionListener(this);
		Classes.ranger.addActionListener(this);
		Classes.wizard.addActionListener(this);
		
		Classes.back_f.addActionListener(this);
		Classes.back_r.addActionListener(this);
		Classes.back_w.addActionListener(this);
		
		Classes.next_f.addActionListener(this);
		Classes.next_r.addActionListener(this);
		Classes.next_w.addActionListener(this);
		
		stat.back.addActionListener(this);
		stat.next.addActionListener(this);
		
		data.back.addActionListener(this);
		data.next.addActionListener(this);
		
		Overview.back.addActionListener(this);
		Overview.finish.addActionListener(this);
		
		play.button3.addActionListener(this);
		
		setLayout(cardLayout); // sets the layout of the entire program
		
		intro_panel.add(title, BorderLayout.CENTER); // adds the title and button to the panel
		intro_panel.add(buffer, BorderLayout.WEST);
		intro_panel.add(start, BorderLayout.SOUTH);
		
		// Adds all the panels to the main layout
		add(intro_panel, "Start_Menu"); // start page panel
		
		add(Races.getRacePanel(),"Race_Menu"); // gets race choice panel from function
		
		// Individual Races panels added from functions
		add(Races.getHumanPanel(), "Human_Menu");
		add(Races.getElfPanel(), "Elf_Menu");
		add(Races.getDwarfPanel(), "Dwarf_Menu");
		
		add(Classes.getClassPanel(), "Class_Menu"); // gets class choice panel from function
		
		// Individual Classes panels added from functions
		add(Classes.getFighterPanel(), "Fighter_Menu");
		add(Classes.getRangerPanel(), "Ranger_Menu");
		add(Classes.getWizardPanel(), "Wizard_Menu");
		
		add(stat.getStatsPanel(), "Stats_Menu"); // panel to control stats
		
		add(data.getPersonalPanel(), "Personal_Menu"); // panel to control personal data
		
		add(Overview.getOverviewPanel(), "Overview_Menu"); // panel that displays all info
		
		add(play.getGamePanel(), "Game_Menu"); // panel for game portion
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Checks for actions performed to change pages and flips to corresponding page
		Object source = e.getSource();
		if(source == start) {cardLayout.show(getContentPane(), "Race_Menu");} // flips to races page
		
		// flips to description of race based on which race button is pressed
		if(source == Races.human) {cardLayout.show(getContentPane(), "Human_Menu");} 
		if(source == Races.elf) {cardLayout.show(getContentPane(), "Elf_Menu");}
		if(source == Races.dwarf) {cardLayout.show(getContentPane(), "Dwarf_Menu");}
		
		if(source == Races.back_r) {cardLayout.show(getContentPane(), "Start_Menu");} // flips back to startup page
		
		// flips back to races page from individual race pages
		if(source == Races.back_h) {cardLayout.show(getContentPane(), "Race_Menu");}
		if(source == Races.back_e) {cardLayout.show(getContentPane(), "Race_Menu");}
		if(source == Races.back_d) {cardLayout.show(getContentPane(), "Race_Menu");}
		
		// checks if user has picked a race and send the data to overview page and flips to classes page
		if(source == Races.next_h) {
			cardLayout.show(getContentPane(), "Class_Menu");
			Overview.setRace("Human"); // saves race type to overview page
			}
		if(source == Races.next_e) {
			cardLayout.show(getContentPane(), "Class_Menu");
			Overview.setRace("Elf");
			}
		if(source == Races.next_d) {
			cardLayout.show(getContentPane(), "Class_Menu");
			Overview.setRace("Dwarf");
			}
		
		// takes user back to races page if button is pressed
		if(source == Classes.back_c) {cardLayout.show(getContentPane(), "Race_Menu");} 
		
		// takes user to individual classes page
		if(source == Classes.fighter) {cardLayout.show(getContentPane(), "Fighter_Menu");}
		if(source == Classes.ranger) {cardLayout.show(getContentPane(), "Ranger_Menu");}
		if(source == Classes.wizard) {cardLayout.show(getContentPane(), "Wizard_Menu");}
		
		// takes user back to overall classes pages
		if(source == Classes.back_f) {cardLayout.show(getContentPane(), "Class_Menu");}
		if(source == Classes.back_r) {cardLayout.show(getContentPane(), "Class_Menu");}
		if(source == Classes.back_w) {cardLayout.show(getContentPane(), "Class_Menu");}
		
		// check if class has been chosen and sends data to personal, overview and game pages
		// then takes user to stats page
		if(source == Classes.next_f) {
			cardLayout.show(getContentPane(), "Stats_Menu");
			data.setWeaponF(); // sends data of types of weapons available to user
			Overview.setClass("Fighter"); // saves class type to overview page
			play.getClass("Fighter"); // sends data for skills available to class
			}
		if(source == Classes.next_r) {
			cardLayout.show(getContentPane(), "Stats_Menu");
			data.setWeaponR();
			Overview.setClass("Ranger");
			play.getClass("Ranger");
			}
		if(source == Classes.next_w) {
			cardLayout.show(getContentPane(), "Stats_Menu");
			data.setWeaponW();
			Overview.setClass("Wizard");
			play.getClass("Wizard");
		}
		
		// takes user back to main classes page
		if(source == stat.back) {cardLayout.show(getContentPane(), "Class_Menu");}
		
		// takes user to personal data page and stores modified stats in overview and game page
		if(source == stat.next) {
			cardLayout.show(getContentPane(), "Personal_Menu");
			// stores stats in overview page
			Overview.setStats(stat.str_n.getText(), stat.dex_n.getText(), stat.con_n.getText()
					, stat.int_n.getText(), stat.wis_n.getText(), stat.cha_n.getText());
			// stores stats in game page
			play.setStats(stat.str_n.getText(), stat.dex_n.getText(), stat.con_n.getText()
					, stat.int_n.getText(), stat.wis_n.getText(), stat.cha_n.getText());
			}
		
		// takes user back to stats page
		if(source == data.back) {cardLayout.show(getContentPane(), "Stats_Menu");}
		
		// takes user to overview page and stores name data in overview and game pages
		if(source == data.next) {
			cardLayout.show(getContentPane(), "Overview_Menu");
			Overview.setName(data.nameField.getText());
			play.getName(data.nameField.getText());
		}
		
		// takes user back to personal data page
		if(source == Overview.back) {cardLayout.show(getContentPane(), "Personal_Menu");}
		
		// takes user to game page
		if(source == Overview.finish) { cardLayout.show(getContentPane(), "Game_Menu");}
		
		// checks if the button has a certain text and closes the window if does and button is pressed
		if(source == play.button3 && play.button3.getText() == "Exit") { super.dispose();}
	}
}
