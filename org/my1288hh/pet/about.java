package org.my1288hh.pet;

import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JDialog;
public class about implements ActionListener 
{
	private JOptionPane Dialog;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Dialog = new JOptionPane();
		Dialog.showMessageDialog(null, "�������1288hh����,���Ǹ���Դ���,��������ʹ����������Ҳ�ɸ��Ĵ���ʵ�ָ��๦�ܣ�bվID������������1288hh", "���ڴ����",JOptionPane.PLAIN_MESSAGE);
	}

}
