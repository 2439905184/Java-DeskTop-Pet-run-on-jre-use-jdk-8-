package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class eat extends JDialog implements ActionListener
{
private JMenuBar menubar;
private JMenuItem menuItem;
private JMenuItem menuItem2;
private JMenuItem menuItem3;
private ImageIcon foodIcon_IceCream;
private ImageIcon foodIcon_KeLiBing;
private ImageIcon foodIcon_egg;
public static JDialog s;
	private static final long serialVersionUID = 1L;
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("ºÃ³Ô£¡");
		s = new JDialog();
		initEatMenu();
		s.setTitle("Î¹Ñø");
		s.setAlwaysOnTop(true);
		s.setVisible(true);
		s.setSize(200, 100);
		s.add(menubar);
	}
	private void initEatMenu() 
	{
		menubar = new JMenuBar();
		menuItem = new JMenuItem("±ù¼¤Áè:"+Pet.IceCreamNumber);
		menuItem2 = new JMenuItem("Æ»¹ûÅÉ:"+Pet.PieNumber);
		menubar.add(menuItem);
		menubar.add(menuItem2);
		
		foodIcon_IceCream = new ImageIcon("src/iceCream.png");
		menuItem.setIcon(foodIcon_IceCream);
		menuItem.addActionListener(new Food_1());
		menuItem2.addActionListener(new pie());
	}

}
