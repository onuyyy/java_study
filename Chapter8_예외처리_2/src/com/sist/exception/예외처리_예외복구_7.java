package com.sist.exception;
/*
 * 예외처리 방법
 * 1. 예외 복구 : try ~ catch ~ finally
 * 2. 예외 회피 : throws
 * ------------------------------------------------------- 1,2 번이 자주 사용된다 (2번은 라이브러리에 주로 있다)
 * 3. 임의 발생 : throw
 * 4. 사용자 정의 : 지원하지 않는 경우에 직접 제작 (사용 빈도는 거의 없다)
 * 	  -------- if문 사용이 더 편하다
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class 예외처리_예외복구_7 extends JFrame implements ActionListener {

	private JTextField tf;
	private JButton b1, b2;	// 부분적 예외처리
	private int com;
	
	public 예외처리_예외복구_7 () {		// 생성자 : 초기화 및 시작과 동시에 처리하는 내용
		
		tf = new JTextField(20);
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		tf.setEnabled(false);
		
		JPanel p = new JPanel();
		p.add(tf); p.add(b1); p.add(b2);
		
		add("Center",p);
		setSize(500, 150);
		setVisible(true);
		
		b1.addActionListener(this);		// b1을 클릭하면 actionPerformed 호출한다 (이벤트 등록)
		b2.addActionListener(this);
		tf.addActionListener(this);		// tf에서 엔터를 누르면 actionPerformed 호출한다 (이벤트 등록)
		
	}
	
	public static void main(String[] args) {
		
		new 예외처리_예외복구_7();

	}

	// 버튼 처리하는 메소드 : 정의를 핤 수 없다 (용도가 여러 개이기 때문에 구현을 하지 못한다)
	// 호출은 해주는데 구현은 사용자가 해야한다
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b2) { 	// b2를 클릭했냐고 묻는 중
			System.exit(0);			// 프로그램 종료
		} else if(e.getSource()==b1) {
			
			com = (int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
			
			} else if (e.getSource()==tf) {
				String strNum = tf.getText();		// 사용자의 입력값 가져오기
				if(strNum.trim().length() < 1) {	// 좌우의 공백을 제거
					
					// 입력이 안된 경우
					JOptionPane.showMessageDialog(this, "정수를 입력해라 (1 ~ 100)");
					tf.requestFocus();
					return;			// 메소드 종료
					
				}
				
					// 입력이 된 경우
				int num = 0;
				try {
					
					num = Integer.parseInt(strNum);
					// 문자열 -> 정수형으로 변경
					// 정수 -> 문자열 (valueOf())
					
				} catch (NumberFormatException ex) {
					
					// 잘못된 입력인 경우에 복구
					JOptionPane.showMessageDialog(this, "정수만 입력이 가능하다");
					tf.setText("");			// 잘못 입력됐을 때 오류메세지 뜨게 한 후 내용 공백으로 다시 만들어주기
					tf.requestFocus();
					
					return;
					
				}
				
				
				// 비교
				if(com > num) {
					JOptionPane.showMessageDialog(this, "입력한 정수보다 큰 정수를 입력해라");
					tf.setText("");			
					tf.requestFocus();
				} else if (com < num) {
					JOptionPane.showMessageDialog(this, "입력한 정수보다 작은 정수를 입력해라");
					tf.setText("");			
					tf.requestFocus();
				} else {
					JOptionPane.showMessageDialog(this, "Game Over");
					tf.setText("");			
					tf.setEditable(false);
					tf.setEditable(true);
				}
				
				
				
			}
	}

}
