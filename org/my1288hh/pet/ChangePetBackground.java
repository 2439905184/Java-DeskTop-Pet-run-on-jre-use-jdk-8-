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
		
		System.out.println("ע�⣬��֧��ͼƬ�ļ���ѡ�������ļ��ᵼ�³����벻Ҫѡ�����ع�����ļ��������������Ļ�ر��");
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
