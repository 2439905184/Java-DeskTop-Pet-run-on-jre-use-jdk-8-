package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SettingAction implements ActionListener
{
	private JFrame frame;
	private JButton setting;
	private JPanel panel;
	private JButton about;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		frame = new JFrame("����");
		frame.setVisible(true);
		frame.setSize(100,200);
		panel = new JPanel();
		frame.add(panel);
		setting = new JButton("���ó��ﱳ��ͼ��");
		setting.addActionListener(new ChangePetBackground());
		about = new JButton("����");
		about.addActionListener(new about());
		panel.add(setting);
		panel.add(about);
		frame.validate();
	}

}
