import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Calculator implements  ActionListener{
	JFrame jf;
	JLabel displayLabel,resShowLabel;
	
	Boolean isOpratorClicked=false;
	String oldValue;
	int whichOprator;
	
	//colorThemeButtons
	JButton WhiteButton,orangeButton,purpleButton,defaulttheme;
	//numberButtons
	JButton nineButton,eighteButton,sevenButton,sixButton,fiveButton,fourButton,threeButton,twoButton,oneButton,zeroButton;
	//operationButton
	JButton additionButton,substrationButton,multButton,divisionButton,modButton,equalButton,clearButton;
	JButton dotButton;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setBounds(300, 100, 370, 400);
		jf.getContentPane().setBackground(Color.DARK_GRAY.darker());
		jf.setMinimumSize(new Dimension(370, 400));
		
		resShowLabel= new JLabel();
		resShowLabel.setBounds(10, 15, 350, 70);
		resShowLabel.setBackground(Color.darkGray.darker());
		resShowLabel.setOpaque(true);
		resShowLabel.setHorizontalAlignment(SwingConstants.CENTER);
		resShowLabel.setForeground(Color.white.darker());
		resShowLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
		jf.add(resShowLabel);
		
		displayLabel= new JLabel();
		displayLabel.setBounds(10, 95, 350, 70);
		displayLabel.setBackground(Color.darkGray.darker());
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Verdana", Font.PLAIN, 25));
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(10, 185, 50, 35);
		sevenButton.addActionListener(this);
		sevenButton.setBackground(Color.gray.darker());
		sevenButton.setBorderPainted(true);
        sevenButton.setBorder(new LineBorder(Color.black));
        sevenButton.setForeground(Color.WHITE);
		jf.add(sevenButton);
		
		eighteButton=new JButton("8");
		eighteButton.setBounds(70, 185, 50,35);
		eighteButton.addActionListener(this);
		eighteButton.setBackground(Color.gray.darker());
		eighteButton.setBorderPainted(true);
        eighteButton.setBorder(new LineBorder(Color.black));
        eighteButton.setForeground(Color.WHITE);
		jf.add(eighteButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(130, 185, 50,35);
		nineButton.addActionListener(this);
		nineButton.setBackground(Color.gray.darker());
		nineButton.setBorderPainted(true);
		nineButton.setBorder(new LineBorder(Color.black));
		nineButton.setForeground(Color.WHITE);
		jf.add(nineButton);
		
		divisionButton=new JButton("/");
		divisionButton.setBounds(190, 185, 50,35);
		divisionButton.addActionListener(this);
		divisionButton.setBackground(Color.gray.darker());
		divisionButton.setBorderPainted(true);
		divisionButton.setBorder(new LineBorder(Color.black));
		divisionButton.setForeground(Color.WHITE);
		jf.add(divisionButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(250, 185, 50,35);
		clearButton.addActionListener(this);
		clearButton.setBackground(Color.gray.darker());
		clearButton.setBorderPainted(true);
		clearButton.setBorder(new LineBorder(Color.black));
		clearButton.setForeground(Color.WHITE);
		jf.add(clearButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(10, 230, 50,35);
		fourButton.addActionListener(this);
		fourButton.setBackground(Color.gray.darker());
		fourButton.setBorderPainted(true);
		fourButton.setBorder(new LineBorder(Color.black));
		fourButton.setForeground(Color.WHITE);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(70, 230, 50,35);
		fiveButton.addActionListener(this);
		fiveButton.setBackground(Color.gray.darker());
		fiveButton.setBorderPainted(true);
		fiveButton.setBorder(new LineBorder(Color.black));
		fiveButton.setForeground(Color.WHITE);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(130, 230, 50,35);
		sixButton.addActionListener(this);
		sixButton.setBackground(Color.gray.darker());
		sixButton.setBorderPainted(true);
		sixButton.setBorder(new LineBorder(Color.black));
		sixButton.setForeground(Color.WHITE);
		jf.add(sixButton);
		
		multButton=new JButton("x");
		multButton.setBounds(190, 230, 50,35);
		multButton.addActionListener(this);
		multButton.setBackground(Color.gray.darker());
		multButton.setBorderPainted(true);
		multButton.setBorder(new LineBorder(Color.black));
		multButton.setForeground(Color.WHITE);
		jf.add(multButton);
		
		modButton=new JButton("%");
		modButton.setBounds(250, 230, 50,35);
		modButton.addActionListener(this);
		modButton.setBackground(Color.gray.darker());
		modButton.setBorderPainted(true);
		modButton.setBorder(new LineBorder(Color.black));
		modButton.setForeground(Color.WHITE);
		jf.add(modButton);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(10, 275, 50,35);
		oneButton.addActionListener(this);
		oneButton.setBackground(Color.gray.darker());
		oneButton.setBorderPainted(true);
		oneButton.setBorder(new LineBorder(Color.black));
		oneButton.setForeground(Color.WHITE);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(70, 275, 50,35);
		twoButton.addActionListener(this);
		twoButton.setBackground(Color.gray.darker());
		twoButton.setBorderPainted(true);
		twoButton.setBorder(new LineBorder(Color.black));
		twoButton.setForeground(Color.WHITE);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(130, 275, 50,35);
		threeButton.addActionListener(this);
		threeButton.setBackground(Color.gray.darker());
		threeButton.setBorderPainted(true);
		threeButton.setBorder(new LineBorder(Color.black));
		threeButton.setForeground(Color.WHITE);
		jf.add(threeButton);
		
		substrationButton=new JButton("-");
		substrationButton.setBounds(190, 275, 50,35);
		substrationButton.addActionListener(this);
		substrationButton.setBackground(Color.gray.darker());
		substrationButton.setBorderPainted(true);
		substrationButton.setBorder(new LineBorder(Color.black));
		substrationButton.setForeground(Color.WHITE);
		jf.add(substrationButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(250, 275, 50,80);
		equalButton.addActionListener(this);
		equalButton.setBackground(Color.gray.darker());
		equalButton.setBorderPainted(true);
		equalButton.setBorder(new LineBorder(Color.black));
		equalButton.setForeground(Color.WHITE);
		jf.add(equalButton);
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(10, 320, 110,35);
		zeroButton.addActionListener(this);
		zeroButton.setBackground(Color.gray.darker());
		zeroButton.setBorderPainted(true);
		zeroButton.setBorder(new LineBorder(Color.black));
		zeroButton.setForeground(Color.WHITE);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(130, 320, 50,35);
		dotButton.addActionListener(this);
		dotButton.setBackground(Color.gray.darker());
		dotButton.setBorderPainted(true);
		dotButton.setBorder(new LineBorder(Color.black));
		dotButton.setForeground(Color.WHITE);
		jf.add(dotButton);
		
		additionButton=new JButton("+");
		additionButton.setBounds(190, 320, 50,35);
		additionButton.addActionListener(this);
		additionButton.setBackground(Color.gray.darker());
		additionButton.setBorderPainted(true);
		additionButton.setBorder(new LineBorder(Color.black));
		additionButton.setForeground(Color.WHITE);
		jf.add(additionButton);
		
		
//		multButton=new JButton("x");
//		multButton.setBounds(310, 230, 50,35);
//		multButton.addActionListener(this);
//		jf.add(multButton);
		
		//colorThemeButtons
		WhiteButton=new JButton();
		WhiteButton.setBounds(310, 185, 50,35);
		WhiteButton.addActionListener(this);
		WhiteButton.setBackground(Color.DARK_GRAY.brighter());
		WhiteButton.setBorderPainted(true);
		WhiteButton.setBorder(new LineBorder(Color.black));
		jf.add(WhiteButton);
		
		orangeButton=new JButton();
		orangeButton.setBounds(310, 230, 50,35);
		orangeButton.addActionListener(this);
		orangeButton.setBackground(Color.ORANGE);
		orangeButton.setBorderPainted(true);
		orangeButton.setBorder(new LineBorder(Color.black));
		jf.add(orangeButton);
		
		purpleButton=new JButton();
		purpleButton.setBounds(310, 275, 50,35);
		purpleButton.addActionListener(this);
		purpleButton.setBackground(Color.CYAN);
		purpleButton.setBorderPainted(true);
		purpleButton.setBorder(new LineBorder(Color.black));
		jf.add(purpleButton);
		
		defaulttheme=new JButton();
		defaulttheme.setBounds(310, 320, 50,35);
		defaulttheme.addActionListener(this);
		defaulttheme.setBackground(Color.darkGray.darker());
		defaulttheme.setBorderPainted(true);
		defaulttheme.setBorder(new LineBorder(Color.black));
		jf.add(defaulttheme);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nineButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("9");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==eighteButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("8");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==sevenButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("7");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}else if(e.getSource()==sixButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("6");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==fiveButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("5");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==fourButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("4");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==threeButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("3");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==twoButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("2");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==oneButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("1");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==zeroButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText("0");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==dotButton) {
			if(isOpratorClicked==true) {
				displayLabel.setText(".");
				isOpratorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()==divisionButton) {
			isOpratorClicked=true;
			whichOprator=4;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==multButton) {
			isOpratorClicked=true;
			whichOprator=3;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==substrationButton) {
			isOpratorClicked=true;
			whichOprator=2;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==additionButton) {
			isOpratorClicked=true;
			whichOprator=1;
			oldValue=displayLabel.getText();
		}else if(e.getSource()==equalButton) {
			String newVale=displayLabel.getText();
			float oldValueFloat=Float.parseFloat(oldValue);
			float newValueFloat=Float.parseFloat(newVale);
			float res=0;
			String disValue="";
			if(whichOprator==1) {
				res=oldValueFloat+newValueFloat;
				disValue=oldValueFloat+" + "+newValueFloat+" = "+res;
			}else if(whichOprator==2) {
				res=oldValueFloat-newValueFloat;
				disValue=oldValueFloat+" - "+newValueFloat+" = "+res;
			}else if(whichOprator==3) {
				res=oldValueFloat*newValueFloat;
				disValue=oldValueFloat+" x "+newValueFloat+" = "+res;
			}else if(whichOprator==4) {
				res=oldValueFloat/newValueFloat;
				disValue=oldValueFloat+" / "+newValueFloat+" = "+res;
			}else if(whichOprator==5) {
				res=oldValueFloat%newValueFloat;
				disValue=oldValueFloat+" % "+newValueFloat+" = "+res;
			}
			displayLabel.setText("");
			resShowLabel.setText(disValue);
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}else if(e.getSource()==modButton) {
			isOpratorClicked=true;
			whichOprator=5;
			oldValue=displayLabel.getText();
		}
		
		else if(e.getSource()==WhiteButton) {
			jf.getContentPane().setBackground(Color.DARK_GRAY.brighter());
			resShowLabel.setBackground(Color.DARK_GRAY.brighter());
			displayLabel.setBackground(Color.DARK_GRAY.brighter());
		}else if(e.getSource()==orangeButton) {
			jf.getContentPane().setBackground(Color.ORANGE);
			resShowLabel.setBackground(Color.ORANGE);
			displayLabel.setBackground(Color.ORANGE);
		}else if(e.getSource()==purpleButton) {
			jf.getContentPane().setBackground(Color.CYAN);
			resShowLabel.setBackground(Color.CYAN);
			displayLabel.setBackground(Color.CYAN);
		}else if(e.getSource()==defaulttheme) {
			jf.getContentPane().setBackground(Color.DARK_GRAY.darker());
			resShowLabel.setBackground(Color.DARK_GRAY.darker());
			displayLabel.setBackground(Color.DARK_GRAY.darker());
		}
		
	}
}
