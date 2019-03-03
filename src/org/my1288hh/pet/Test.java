package org.my1288hh.pet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.sound.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
public class Test
{
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel lable;
	private static JButton settings;
	public static int mouseAtx;
	public static int mouseAty;
	private static AudioInputStream audioStream;
	public static void main(String[] args)
	{
		//audioStream = AudioSystem.getAudioInputStream(file);
	    frame = new JFrame("aaa");
	    frame.setUndecorated(true);
	    frame.setBackground(new Color(0,0,0,0));
		frame.setAlwaysOnTop(true);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLocation(800,400);
		frame.addMouseListener(new Mouse());
		frame.addMouseMotionListener(new mouseDrag());
		ImageIcon character = new ImageIcon("src/character.jpg");
		panel = new JPanel();
		lable = new JLabel();
		//settings
		settings = new JButton("…Ë÷√");
		settings.addActionListener(new SettingAction());
		
		//lable.setSize(500, 500);
		lable.setIcon(character);
		frame.add(panel);
		panel.add(lable);
		panel.add(settings);
		panel.setBackground(new Color(0,0,0,0));
		frame.validate();
		frame.addWindowListener(new Close());
		
	}

}
