package minepine.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainGUI 
{
	JFrame mainFrame = new JFrame();
	
	public mainGUI()
	{
		mainFrame.setSize(600, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setTitle("Audio Player");
		
		Action a1 = new Action();
		JPanel mainPanel = new JPanel();
		
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}
	
	private class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}
