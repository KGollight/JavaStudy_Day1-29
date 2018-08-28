package api.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

public class ButtonPanel extends Panel{
	
	private Button[] bt = new Button[16];
	private String[] title = new String[] {
		"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"	
	};
	
	private GridLayout grid = new GridLayout(4, 4);
	
	public ButtonPanel() {
		display();
	}
	
	private void display() {
		this.setLayout(grid);
		
		Font font = new Font("±¼¸²", Font.ITALIC, 40);
		for(int i=0; i < bt.length; i++) {
			bt[i] = new Button(title[i]);
			bt[i].setBackground(Color.BLACK);
			bt[i].setForeground(Color.white);
			bt[i].setFont(font);
			this.add(bt[i]);
		}
	}
	
}












