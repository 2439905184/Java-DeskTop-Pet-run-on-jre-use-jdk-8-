package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class ChangePetBackground implements ActionListener 
{
	private JFileChooser filechooser = new JFileChooser();
	public static  File file;
	@Override
	public void actionPerformed(ActionEvent e)
	{
		filechooser.setVisible(true);
		filechooser.setDialogTitle("a");
		filechooser.showOpenDialog(filechooser);
		file = filechooser.getSelectedFile();
		String path = file.toString();
		ImageIcon image = new ImageIcon(path);
		Test.lable.setIcon(image);
		System.out.println(file);
		System.out.println("open file!");
	}

}
