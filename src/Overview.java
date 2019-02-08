// Displays all the information collected from previous pages

import java.awt.*;
import javax.swing.*;

public class Overview {
	static JLabel title = new JLabel("         Overview");
	// Labels to show what type of information is being displayed
	static JLabel name = new JLabel("Name: ");
	static JLabel gender = new JLabel("Gender: ");
	static JLabel alignment = new JLabel("Alignment: ");
	static JLabel race = new JLabel("Race: ");
	static JLabel g_class = new JLabel("Class: ");
	static JLabel weapon = new JLabel("Weapon Type: ");
	static JLabel armor = new JLabel("Armor Type: ");
	static JLabel stats = new JLabel("Stats: ");
	
	// labels that contain the information taken from other pages
	static JLabel name_data = new JLabel();
	static JLabel gender_data = new JLabel();
	static JLabel alignment_data = new JLabel();
	static JLabel race_data = new JLabel();
	static JLabel g_class_data = new JLabel();
	static JLabel weapon_data = new JLabel();
	static JLabel armor_data = new JLabel();
	static JLabel stats_data = new JLabel();
	
	// labels to display type of stats
	static JLabel str = new JLabel("STR: ");
	static JLabel dex = new JLabel("DEX: ");
	static JLabel con = new JLabel("CON: ");
	static JLabel intel = new JLabel("INT: ");
	static JLabel wis = new JLabel("WIS: ");
	static JLabel cha = new JLabel("CHA: ");
	
	// label to contain stats
	static JLabel str_data = new JLabel();
	static JLabel dex_data = new JLabel();
	static JLabel con_data = new JLabel();
	static JLabel int_data = new JLabel();
	static JLabel wis_data = new JLabel();
	static JLabel cha_data = new JLabel();
	
	// buttons to go to previous or next page
	static JButton back = new JButton("Back");
	static JButton finish = new JButton("Finish");
	
	// panels to store data
	static JPanel overview_panel = new JPanel(new BorderLayout());
	static JPanel data_panel = new JPanel(new GridLayout(8, 2));
	static JPanel stats_panel = new JPanel(new GridLayout(1, 2, 1, 1));
	static JPanel stat_panel = new JPanel(new GridLayout(10, 2, 1, 1));
	static JPanel button_panel = new JPanel(new BorderLayout());
	
	public static JPanel getOverviewPanel() {
		// sets the font for all text in on the page
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 70));
		
		name.setFont(new Font("Pristina", Font.BOLD, 40));
		gender.setFont(new Font("Pristina", Font.BOLD, 40));
		alignment.setFont(new Font("Pristina", Font.BOLD, 40));
		race.setFont(new Font("Pristina", Font.BOLD, 40));
		g_class.setFont(new Font("Pristina", Font.BOLD, 40));
		weapon.setFont(new Font("Pristina", Font.BOLD, 40));
		armor.setFont(new Font("Pristina", Font.BOLD, 40));
		stats.setFont(new Font("Pristina", Font.BOLD, 40));
		
		name_data.setFont(new Font("Pristina", Font.BOLD, 40));
		gender_data.setFont(new Font("Pristina", Font.BOLD, 40));
		alignment_data.setFont(new Font("Pristina", Font.BOLD, 40));
		race_data.setFont(new Font("Pristina", Font.BOLD, 40));
		g_class_data.setFont(new Font("Pristina", Font.BOLD, 40));
		weapon_data.setFont(new Font("Pristina", Font.BOLD, 40));
		armor_data.setFont(new Font("Pristina", Font.BOLD, 40));
		stats_data.setFont(new Font("Pristina", Font.BOLD, 40));
		
		str.setFont(new Font("Pristina", Font.BOLD, 35));
		dex.setFont(new Font("Pristina", Font.BOLD, 35));
		con.setFont(new Font("Pristina", Font.BOLD, 35));
		intel.setFont(new Font("Pristina", Font.BOLD, 35));
		wis.setFont(new Font("Pristina", Font.BOLD, 35));
		cha.setFont(new Font("Pristina", Font.BOLD, 35));
		
		str_data.setFont(new Font("Pristina", Font.BOLD, 35));
		dex_data.setFont(new Font("Pristina", Font.BOLD, 35));
		con_data.setFont(new Font("Pristina", Font.BOLD, 35));
		int_data.setFont(new Font("Pristina", Font.BOLD, 35));
		wis_data.setFont(new Font("Pristina", Font.BOLD, 35));
		cha_data.setFont(new Font("Pristina", Font.BOLD, 35));
		
		back.setFont(new Font("Pristina", Font.BOLD, 50));
		finish.setFont(new Font("Pristina", Font.BOLD, 50));
		
		stats.setVerticalAlignment(JLabel.NORTH); // sets stats to be at the top of its loc
		
		// add page controlling buttons to its panel
		button_panel.add(back, BorderLayout.WEST);
		button_panel.add(finish, BorderLayout.CENTER);
	
		// adds stat labels and its corresponding data to the stats panel
		stat_panel.add(str);
		stat_panel.add(str_data);
		
		stat_panel.add(dex);
		stat_panel.add(dex_data);
		
		stat_panel.add(con);
		stat_panel.add(con_data);
		
		stat_panel.add(intel);
		stat_panel.add(int_data);
		
		stat_panel.add(wis);
		stat_panel.add(wis_data);
		
		stat_panel.add(cha);
		stat_panel.add(cha_data);
		
		// adds name, gender, alignment, race, class, weapon, and armor labels and data to data panel
		data_panel.add(name);
		data_panel.add(name_data);
		data_panel.add(gender);
		data_panel.add(gender_data);
		data_panel.add(alignment);
		data_panel.add(alignment_data);
		data_panel.add(race);
		data_panel.add(race_data);
		data_panel.add(g_class);
		data_panel.add(g_class_data);
		data_panel.add(weapon);
		data_panel.add(weapon_data);
		data_panel.add(armor);
		data_panel.add(armor_data);
		
		// add stats to its larger panel
		stats_panel.add(stats);
		stats_panel.add(stat_panel);
		
		// add sub panels and title to main panel
		overview_panel.add(title, BorderLayout.NORTH);
		overview_panel.add(data_panel, BorderLayout.CENTER);
		overview_panel.add(stats_panel, BorderLayout.EAST);
		overview_panel.add(button_panel, BorderLayout.SOUTH);
		return overview_panel;
	}
	
	// function that when called takes in user input name and stores it in its corresponding label
	public static void setName(String name) {
		name_data.setText(name);
	}
	
	// function that when called takes in user selected gender and stores it in its corresponding label
	public static void setGender(String gender) {
		gender_data.setText(gender);
	}
	
	// function that when called takes in user selected alignment and stores it in its corresponding label
	public static void setAlignment(String alignment) {
		alignment_data.setText(alignment);
	}
	
	// function that when called takes in user selected race and stores it in its corresponding label
	public static void setRace(String race) {
		race_data.setText(race);
	}
	
	// function that when called checks what class user chose and sets corresponding armor type
	public static void setClass(String c_class) {
		g_class_data.setText(c_class);
		if(g_class_data.getText() == "Fighter") armor_data.setText("Plate");
		if(g_class_data.getText() == "Ranger") armor_data.setText("Leather");
		if(g_class_data.getText() == "Wizard") armor_data.setText("Cloth");
	}
	
	// function that when called takes in user selected weapon and stores it in its corresponding label
	public static void setWeapon(String weapon) {
		weapon_data.setText(weapon);
	}
	
	// function that when called takes in user selected stats and stores it in their corresponding labels
	public static void setStats(String str, String dex, String con, String intel, String wis, String cha) {
		str_data.setText(str);
		dex_data.setText(dex);
		con_data.setText(con);
		int_data.setText(intel);
		wis_data.setText(wis);
		cha_data.setText(cha);
	}
}
