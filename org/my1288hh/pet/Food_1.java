package org.my1288hh.pet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food_1 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Pet.IceCreamNumber-=1;
		System.out.println("±ù¼¤ÁèÊıÁ¿-1");
		System.out.println(Pet.IceCreamNumber);
		eat.s.validate();
	}

}
