package org.my1288hh.pet;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class game implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JDialog Dialog = new JDialog();
		JPanel panel = new JPanel();
		Dialog.setTitle("�¶���");
		Dialog.setVisible(true);
		//Dialog.setLayout();
		//Dialog.setSize(300, 300);
		JButton guessAction = new JButton("�¶���");
		JLabel pick = new JLabel("��������İ�ť�����ж�");
		JButton jump = new JButton("��");
		JButton grab = new JButton("ץ");
		JButton smile = new JButton("Ц");
		guessAction.addActionListener(new guessAction());
		Dialog.add(panel);
		panel.add(guessAction);
		panel.add(pick);
		panel.add(jump);
		panel.add(grab);
		panel.add(smile);
		Dialog.pack();
		Dialog.validate();
	}
	

}
