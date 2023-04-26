package com.sist.lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 라이브러리_Object_2_1 extends JFrame implements ItemListener {

	JComboBox box;
	JLabel la;
	
	public 라이브러리_Object_2_1() {
		
		box = new JComboBox();
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		la = new JLabel();
		
		// 배치
		add("North", box);
		add("Center",la);
		
		setSize(300,300);
		setVisible(true);
		
		box.addItemListener(this);
		
	}
	


	public static void main(String[] args) {
		
		new 라이브러리_Object_2_1();
		
	}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
	
			if(e.getSource()==box) {
				
				String name = box.getSelectedItem().toString();
				//	String name = (String)box.getSelectedItem()
				la.setText(name);
				
				
			}
		
		

		
	}

}

// 리턴형이 오브젝트인 경우엔 String 형변환 필수다