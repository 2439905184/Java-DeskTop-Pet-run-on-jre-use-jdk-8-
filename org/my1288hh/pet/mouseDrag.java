package org.my1288hh.pet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class mouseDrag implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e)
	{
		Test.frame.setLocation(e.getXOnScreen()-Test.mouseAtx, e.getYOnScreen()-Test.mouseAty);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
