package com.kh.mini.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GymFieldPage extends JPanel{

	private MainFrame mf;
	public GymFieldPage(MainFrame mf) { 
		this.mf = mf;
		this.setLayout(null);
		Image icon = new ImageIcon("images/gym.PNG").getImage().getScaledInstance(1024, 768,0);	
		JLabel label = new JLabel(new ImageIcon(icon));
		label.setBounds(0, 0 ,1024, 768);
		
		//this.add(label);
		//this.setComponentZOrder(label, 1);
		
		
		mf.add(this);
		
		
	}
	
	
}
