package com.kh.mini.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements KeyListener{
	public MainFrame() {
		this.setTitle("Æ÷ÄÏ¸óEE");
		this.setBounds(300, 200, 1024, 768);
		
		
		new UserCharacter(this);
	
		//new GymFieldPage(this);
	
		//new GymFieldPage(this);
	//setComponentZOrder(new Testchar(this), 1);
		//new KeyBoardTest(this);
		//new VillageFieldPage(this);
		
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(this);
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
