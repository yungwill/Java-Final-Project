// Controls the stats page
// Allows user to change their stats

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Stats implements ActionListener{
	static JLabel title = new JLabel("             Stats");
	
	// labels for the types of stats there are
	static JLabel str = new JLabel("STR");
	static JLabel dex = new JLabel("DEX");
	static JLabel con = new JLabel("CON");
	static JLabel intel = new JLabel("INT");
	static JLabel wis = new JLabel("WIS");
	static JLabel cha = new JLabel("CHA");
	
	// text fields to display value of stat
	JTextField str_n = new JTextField(2);
	JTextField dex_n = new JTextField(2);
	JTextField con_n = new JTextField(2);
	JTextField int_n = new JTextField(2);
	JTextField wis_n = new JTextField(2);
	JTextField cha_n = new JTextField(2);
	
	// buttons to add to a stat
	static JButton str_add = new JButton("+");
	static JButton dex_add = new JButton("+");
	static JButton con_add = new JButton("+");
	static JButton int_add = new JButton("+");
	static JButton wis_add = new JButton("+");
	static JButton cha_add = new JButton("+");
	
	// buttons to subtract from a stat
	static JButton str_sub = new JButton("-");
	static JButton dex_sub = new JButton("-");
	static JButton con_sub = new JButton("-");
	static JButton int_sub = new JButton("-");
	static JButton wis_sub = new JButton("-");
	static JButton cha_sub = new JButton("-");
	
	// buttons to take user to next or prev page
	static JButton back = new JButton("Back");
	static JButton next = new JButton("Next");
	
	// label to display how many points left that can be distributed
	static JLabel point_label = new JLabel("Points Remaining: ");
	static JTextField points = new JTextField(2);
	
	// panels to store data
	static JPanel stats_panel = new JPanel(new BorderLayout());
	static JPanel stat_panel = new JPanel(new GridLayout(6, 4, 100, 50));
	static JPanel button_panel = new JPanel(new BorderLayout());
	static JPanel point_panel = new JPanel(new FlowLayout());
	
	// counts how many points the user has to distribute to stats
	private static int count = 10;
	
	public Stats() {
		// sets the font for all text in on the page
		title.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 70));
		
		str.setFont(new Font("Pristina", Font.BOLD, 30));
		dex.setFont(new Font("Pristina", Font.BOLD, 30));
		con.setFont(new Font("Pristina", Font.BOLD, 30));
		intel.setFont(new Font("Pristina", Font.BOLD, 30));
		wis.setFont(new Font("Pristina", Font.BOLD, 30));
		cha.setFont(new Font("Pristina", Font.BOLD, 30));
		
		back.setFont(new Font("Pristina", Font.BOLD, 50));
		next.setFont(new Font("Pristina", Font.BOLD, 50));
		
		str_n.setFont(new Font("Arial", Font.BOLD, 30));
		dex_n.setFont(new Font("Arial", Font.BOLD, 30));
		con_n.setFont(new Font("Arial", Font.BOLD, 30));
		int_n.setFont(new Font("Arial", Font.BOLD, 30));
		wis_n.setFont(new Font("Arial", Font.BOLD, 30));
		cha_n.setFont(new Font("Arial", Font.BOLD, 30));
		
		point_label.setFont(new Font("Arial", Font.BOLD, 30));
		points.setFont(new Font("Arial", Font.BOLD, 30));
		points.setEditable(false);
		
		points.setText(Integer.toString(count));
		
		// prevents textfields from being modified by user
		str_n.setEditable(false);
		dex_n.setEditable(false);
		con_n.setEditable(false);
		int_n.setEditable(false);
		wis_n.setEditable(false);
		cha_n.setEditable(false);
		
		// centers the values inside the text fields
		str_n.setHorizontalAlignment(JTextField.CENTER);
		dex_n.setHorizontalAlignment(JTextField.CENTER);
		con_n.setHorizontalAlignment(JTextField.CENTER);
		int_n.setHorizontalAlignment(JTextField.CENTER);
		wis_n.setHorizontalAlignment(JTextField.CENTER);
		cha_n.setHorizontalAlignment(JTextField.CENTER);
		
		// adds tool tip to labels of stats so that user knows what each stat does
		str.setToolTipText("Physical Power");
		dex.setToolTipText("Agility");
		con.setToolTipText("Endurance");
		intel.setToolTipText("Reasoning and Memory");
		wis.setToolTipText("Perception and Insight");
		cha.setToolTipText("Force of Personality");
		
		// sets initial value of stats to be 1
		str_n.setText("1");
		dex_n.setText("1");
		con_n.setText("1");
		int_n.setText("1");
		wis_n.setText("1");
		cha_n.setText("1");
		
		// adds buttons to action listener
		str_add.addActionListener(this);
		dex_add.addActionListener(this);
		con_add.addActionListener(this);
		int_add.addActionListener(this);
		wis_add.addActionListener(this);
		cha_add.addActionListener(this);
		
		str_sub.addActionListener(this);
		dex_sub.addActionListener(this);
		con_sub.addActionListener(this);
		int_sub.addActionListener(this);
		wis_sub.addActionListener(this);
		cha_sub.addActionListener(this);
		
		// adds to main panel
		stats_panel.add(title, BorderLayout.NORTH);
		stats_panel.add(stat_panel, BorderLayout.CENTER);
		stats_panel.add(button_panel, BorderLayout.SOUTH);
		
		// adds stat control buttons, data, and label to stat panel
		stat_panel.add(str);
		stat_panel.add(str_sub);
		stat_panel.add(str_n);
		stat_panel.add(str_add);
		
		stat_panel.add(dex);
		stat_panel.add(dex_sub);
		stat_panel.add(dex_n);
		stat_panel.add(dex_add);
		
		stat_panel.add(con);
		stat_panel.add(con_sub);
		stat_panel.add(con_n);
		stat_panel.add(con_add);
		
		stat_panel.add(intel);
		stat_panel.add(int_sub);
		stat_panel.add(int_n);
		stat_panel.add(int_add);
		
		stat_panel.add(wis);
		stat_panel.add(wis_sub);
		stat_panel.add(wis_n);
		stat_panel.add(wis_add);
		
		stat_panel.add(cha);
		stat_panel.add(cha_sub);
		stat_panel.add(cha_n);
		stat_panel.add(cha_add);
		
		// adds page buttons to button panel
		button_panel.add(back, BorderLayout.WEST);
		button_panel.add(next, BorderLayout.EAST);
		button_panel.add(point_panel, BorderLayout.CENTER);
		
		// adds points to point panel
		point_panel.add(point_label);
		point_panel.add(points);
	}
	
	// returns main panel when called
	public static JPanel getStatsPanel() {
		return stats_panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		// Checks if add or subtract button is pressed
		if (source == str_add) { 
			if (count > 0) { // checks if there are any points left
				String temp = str_n.getText(); // get the text from the textfield
				int temp2 = Integer.parseInt(temp); // convert text to int and set it to temp int
				temp = Integer.toString(temp2+1); // add to overall points in str and change it back to text
				count -= 1; // subtract from count to keep count of number of points left
				points.setText(Integer.toString(count)); // convert count to string and set it back to label
				str_n.setText(temp); // set text back to textfield
			}
		}
		if (source == str_sub) {
			String temp = str_n.getText(); // get the text from the textfield
			int temp2 = Integer.parseInt(temp); // convert text to int and set it to temp int
			if (temp2 > 1) { // check if points in str is larger than 1
				temp = Integer.toString(temp2-1); // subtract overall points in str and change it back to text
				count += 1; // add to count to keep count of number of points left
				points.setText(Integer.toString(count)); // convert count to string and set it back to label
				str_n.setText(temp); // set text back to textfield
			}
		}
		// Conceptually the same as above
		if (source == dex_add) {
			if (count > 0) {
				String temp = dex_n.getText();
				int temp2 = Integer.parseInt(temp);
				temp = Integer.toString(temp2+1);
				count -= 1;
				points.setText(Integer.toString(count));
				dex_n.setText(temp);
			}
		}
		if (source == dex_sub) {
			String temp = dex_n.getText();
			int temp2 = Integer.parseInt(temp);
			if (temp2 > 1) {
				temp = Integer.toString(temp2-1);
				count += 1;
				points.setText(Integer.toString(count));
				dex_n.setText(temp);
			}
		}
		// Conceptually the same as above
		if (source == con_add) {
			if (count > 0) {
				String temp = con_n.getText();
				int temp2 = Integer.parseInt(temp);
				temp = Integer.toString(temp2+1);
				count -= 1;
				points.setText(Integer.toString(count));
				con_n.setText(temp);
			}
		}
		if (source == con_sub) {
			String temp = con_n.getText();
			int temp2 = Integer.parseInt(temp);
			if (temp2 > 1) {
				temp = Integer.toString(temp2-1);
				count += 1;
				points.setText(Integer.toString(count));
				con_n.setText(temp);
			}
		}
		// Conceptually the same as above
		if (source == int_add) {
			if (count > 0) {
				String temp = int_n.getText();
				int temp2 = Integer.parseInt(temp);
				temp = Integer.toString(temp2+1);
				count -= 1;
				points.setText(Integer.toString(count));
				int_n.setText(temp);
			}
		}
		if (source == int_sub) {
			String temp = int_n.getText();
			int temp2 = Integer.parseInt(temp);
			if (temp2 > 1) {
				temp = Integer.toString(temp2-1);
				count += 1;
				points.setText(Integer.toString(count));
				int_n.setText(temp);
			}
		}
		// Conceptually the same as above
		if (source == wis_add) {
			if (count > 0) {
				String temp = wis_n.getText();
				int temp2 = Integer.parseInt(temp);
				temp = Integer.toString(temp2+1);
				count -= 1;
				points.setText(Integer.toString(count));
				wis_n.setText(temp);
			}
		}
		if (source == wis_sub) {
			String temp = wis_n.getText();
			int temp2 = Integer.parseInt(temp);
			if (temp2 > 1) {
				temp = Integer.toString(temp2-1);
				count += 1;
				points.setText(Integer.toString(count));
				wis_n.setText(temp);
			}
		}
		// Conceptually the same as above
		if (source == cha_add) {
			if (count > 0) {
				String temp = cha_n.getText();
				int temp2 = Integer.parseInt(temp);
				temp = Integer.toString(temp2+1);
				count -= 1;
				points.setText(Integer.toString(count));
				cha_n.setText(temp);
			}
		}
		if (source == cha_sub) {
			String temp = cha_n.getText();
			int temp2 = Integer.parseInt(temp);
			if (temp2 > 1) {
				temp = Integer.toString(temp2-1);
				count += 1;
				points.setText(Integer.toString(count));
				cha_n.setText(temp);
			}
		}
	}
}
