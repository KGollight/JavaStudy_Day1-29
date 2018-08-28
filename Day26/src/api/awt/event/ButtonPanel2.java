package api.awt.event;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;

public class ButtonPanel2 extends Panel {
	
	private Button[] bt = new Button[15];
	private String[] title = new String[] {
		"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#", "지우기", "통화", "전체 지우기"
	};
	
	private GridLayout grid = new GridLayout(5, 3);
	
	public ButtonPanel2() {
		display();
	}
	
	private void display() {
		this.setLayout(grid);
		
		Font font = new Font("굴림", Font.BOLD, 20);
		for(int i=0; i < bt.length; i++) {
			bt[i] = new Button(title[i]);
			bt[i].setBackground(Color.BLACK);
			bt[i].setForeground(Color.cyan);
			bt[i].setFont(font);
			this.add(bt[i]);
		}
	}
}
