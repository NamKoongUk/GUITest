package com.kh.mini.view;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VillageFieldPage extends JPanel implements KeyListener{
	Image icon1 = new ImageIcon("images/char.PNG").getImage();
	 JLabel label1 = (new JLabel(new ImageIcon(icon1)));
	final int FLYING_UNIT = 10;
	private MainFrame mf;
	public VillageFieldPage(MainFrame mf) {
		this.mf = mf;
	
		
		this.setSize(1024,768);
		
		Image icon = new ImageIcon("images/main.png").getImage().getScaledInstance(1024, 768, 0);
		JLabel label = new JLabel(new ImageIcon(icon));
		label.setSize(1024,768);
		
		
	
		 label1.setBounds(500, 500, 30, 30);
		
		this.add(label);
		this.add(label1);
		this.setComponentZOrder(label, 1);
		
	
		mf.addKeyListener(this);
		
		mf.add(this);
	

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int keyCode =e.getKeyCode();
		switch(keyCode){
         case KeyEvent.VK_UP:
        	
         	label1.setLocation(label1.getX(), label1.getY()-FLYING_UNIT);; break;
         case KeyEvent.VK_DOWN:
        	 label1.setLocation(label1.getX(), label1.getY()+FLYING_UNIT);; break;
         case KeyEvent.VK_RIGHT:
        	 label1.setLocation(label1.getX()+FLYING_UNIT, label1.getY()); break;
         case KeyEvent.VK_LEFT:
        	 label1.setLocation(label1.getX()-FLYING_UNIT, label1.getY());; break;
     }
		 if((label1.getX() >390 && label1.getX() <460) &&
				 (label1.getY()>685 && label1.getY() <720)) {
        	
			 ChangePanel.changePanel(mf,this,new UserCharacter(mf));
		 }
		
		
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
