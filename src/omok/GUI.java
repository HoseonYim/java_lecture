package omok;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class GUI extends JFrame{
	Container c;
	MapSize size=new MapSize();
	public GUI(String title) {
		// TODO Auto-generated constructor stub
		c=getContentPane();
		setBounds(200,20,650,700);
		c.setLayout(null);
		Map map=new Map(size);
		DrawBoard d=new DrawBoard(size,map);
		setContentPane(d);
		addMouseListener(new MouseEventHandler(map, size,d,this));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showPopUp(String message) {
		JOptionPane.showMessageDialog(this, message,"축하합니다",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}