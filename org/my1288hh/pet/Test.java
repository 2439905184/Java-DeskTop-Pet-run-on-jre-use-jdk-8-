package org.my1288hh.pet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.sound.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import java.io.InputStream;
public class Test
{	private InputStream fileinput;
	public static JFrame frame;
	public static JPanel panel;
	public static JLabel lable;
	private static JButton settings;
	private static JButton exit;
	private static  JButton eat;
	public static int mouseAtx;
	public static int mouseAty;
	public static int foodNumber;
	public static void main(String[] args)
	{
		//audioStream = AudioSystem.getAudioInputStream(file);
	    frame = new JFrame("�������");
	   
	    //frame.setUndecorated(true);
	    //frame.setBackground(new Color(0,0,0,0));
		frame.setAlwaysOnTop(true);
		frame.setLocation(800,400);
		frame.setVisible(true);
		frame.addMouseListener(new Mouse());
		frame.addMouseMotionListener(new mouseDrag());
		ImageIcon character = new ImageIcon("src/character.jpg");
		panel = new JPanel();
		lable = new JLabel();
		//settings
		settings = new JButton("����");
		settings.addActionListener(new SettingAction());
		//exit
		exit = new JButton("�˳�");
		exit.addActionListener(new exit());
		eat();
		//С��Ϸ
		JButton game = new JButton("С��Ϸ");
		game.addActionListener(new game());
		
		lable.setIcon(character);
		frame.add(panel);
		panel.add(lable);
		panel.add(settings);
		panel.add(exit);
		panel.add(eat);
		panel.add(game);
		panel.setBackground(Color.BLACK);
		frame.pack();
		//panel.setBackground(new Color(0,0,0,0));
		frame.validate();
		frame.addWindowListener(new Close());
		String root_path = System.getProperty("user.dir");
		System.out.println("��ǰĿ¼"+root_path);
		File saveFloader = new File("saves");
		File petFloader = new File("pet");
		File petActions = new File("petActions");
	
		//��ʼ��Ŀ¼
		if(saveFloader.exists()==false) 
		{
			System.out.println("�浵Ŀ¼������");
			saveFloader.mkdir();
		}
		else 
		{
			System.out.println("�浵Ŀ¼�Ѵ���");
		}
		if(petFloader.exists()==false) 
		{
			System.out.println("����Ŀ¼������");
			petFloader.mkdir();
		}
		else 
		{
			System.out.println("����Ŀ¼�Ѵ���");
		}
		if(petActions.exists()==false) 
		{
			System.out.println("��ΪĿ¼������");
			petActions.mkdir();
		}
		else 
		{
			System.out.println("��ΪĿ¼�Ѵ���");
		}
		//����xml�ļ���Ϸ�浵
		GameSave();
	}
	private static void GameSave() 
	{
		Element hungerValue = new Element("����ֵ");
		hungerValue.setAttribute("version", "1.0");
		hungerValue.addContent("40");
		Document doc = new Document(hungerValue);
		Format format = Format.getCompactFormat();
		format.setEncoding("UTF-8");
		
		XMLOutputter out = new XMLOutputter(format);
		File file = new File("petState.xml");
		file.renameTo(new File("/saves"));
		try {
			out.output(doc, new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void eat() 
	{
		//eat
		eat = new JButton("ι��");
		eat.addActionListener(new eat());
	}

}
