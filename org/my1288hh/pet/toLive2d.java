package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javafx.application.Platform;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
public class toLive2d implements ActionListener 
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane Dialog = new JOptionPane();
		Dialog.showMessageDialog(Dialog, "Ϊ��ʵ��live2dЧ�����˰汾���ܲ��ټ���������","ע�⣡ ",JOptionPane.WARNING_MESSAGE);	
	}
}
