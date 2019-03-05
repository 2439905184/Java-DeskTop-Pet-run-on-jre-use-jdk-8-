package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
public class ChangePetBackground implements ActionListener 
{
	private JFileChooser filechooser = new JFileChooser();
	private File file;
	@Override
	public void actionPerformed(ActionEvent e)
	{
		filechooser.setVisible(true);
		filechooser.setDialogTitle("a");
		filechooser.showOpenDialog(filechooser);
		
		System.out.println("注意，仅支持图片文件，选择其他文件会导致出错，请不要选择像素过大的文件，除非你电脑屏幕特别大");
		file = filechooser.getSelectedFile();
		String path = file.toString();
		ImageIcon image = new ImageIcon(path);
		Test.lable.setIcon(image);
		Test.frame.validate();
		Test.panel.validate();
		System.out.println(file);
		System.out.println("open file!");
	}

}
