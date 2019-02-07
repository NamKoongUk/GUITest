package com.kh.mini.view;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserCharacter extends JPanel implements KeyListener{
	final int FLYING_UNIT = 10;
	private MainFrame mf;
	private JPanel panel;
	Image icon = new ImageIcon("images/char.PNG").getImage();
	 JLabel label = (new JLabel(new ImageIcon(icon)));
	 Image icon1 = new ImageIcon("images/gym.PNG").getImage().getScaledInstance(1024, 768,0);	
		JLabel label1 = new JLabel(new ImageIcon(icon1));
	
	public UserCharacter(MainFrame mf) {
		this.mf = mf;
		this.panel = this;
		this.setLayout(null);
		this.setSize(1024,768);
		label1.setBounds(0, 0 ,1024, 768);
		
		
		
		label.setBounds(410, 600, 50, 50);
		
		
		 
		
		 
		 
		 panel.add(label1);
		 panel.add(label);
		this.setComponentZOrder(label1, 1);
		mf.add(this);
		mf.addKeyListener(this);
		 
		
		
		 
		
		
		
	} 
	
	/*public void paintComponent(Graphics page)

	{

		super.paintComponent(page);



		page.drawImage(icon, 600, 500, 40,40, this);
		
	}*/

	@Override
	public void keyPressed(KeyEvent e) {
int keyCode =e.getKeyCode();
        


        switch(keyCode){
            case KeyEvent.VK_UP:
            	label.setLocation(label.getX(), label.getY()-FLYING_UNIT);; break;
            case KeyEvent.VK_DOWN:
            	label.setLocation(label.getX(), label.getY()+FLYING_UNIT);; break;
            case KeyEvent.VK_RIGHT:
            	label.setLocation(label.getX()+FLYING_UNIT, label.getY()); break;
            case KeyEvent.VK_LEFT:
            	label.setLocation(label.getX()-FLYING_UNIT, label.getY());; break;
        }
		
        if((label.getX() >390 && label.getX() <460) &&
				 (label.getY()>685 && label.getY() <720)) {
        	this.removeAll();
			 ChangePanel.changePanel(mf,this,new VillageFieldPage(mf));
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
