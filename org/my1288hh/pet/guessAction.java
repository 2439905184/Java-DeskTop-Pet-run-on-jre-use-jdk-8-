package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class guessAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("�¶�����Ϸ��ʼ��");
		ImageIcon a = new ImageIcon("C:\\Users\\Administrator\\Desktop\\tree_uv.png");
		Test.lable.setIcon(a);
		
	}

}
