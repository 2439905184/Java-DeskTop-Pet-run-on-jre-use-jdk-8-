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
		Dialog.showMessageDialog(null, "此软件由1288hh制作,这是个开源软件,你可以免费使用这个软件，也可更改代码实现更多功能，b站ID：电音爱好者1288hh", "关于此软件",JOptionPane.PLAIN_MESSAGE);
	}

}
