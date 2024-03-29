package omok;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawBoard extends JPanel{
	MapSize size;
	Map map;
	final int STONE_SIZE=28;
	public DrawBoard(MapSize m,Map map) {
		// TODO Auto-generated constructor stub
		setBackground(new Color(206,167,61));
		size=m;
		setLayout(null);
		System.out.println("board");
		this.map=map;
		
	}
	@Override
	public void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paintComponent(arg0);
		arg0.setColor(Color.BLACK);
		board(arg0);
		drawStone(arg0);
	}
	public void board(Graphics arg0) {
		for(int i=1;i<=size.getSize();i++){
			arg0.drawLine(size.getCell(), i*size.getCell(), size.getCell()*size.getSize(), i*size.getCell());
			arg0.drawLine(i*size.getCell(), size.getCell(), i*size.getCell() , size.getCell()*size.getSize());
		}
	}
	public void drawStone(Graphics arg0) {
		for(int y=0;y<size.SIZE;y++){
			for(int x=0;x<size.SIZE;x++){
				if(map.getXY(y, x)==map.getBlack())
					drawBlack(arg0,x,y);
				else if(map.getXY(y, x)==map.getWhite())
					drawWhite(arg0, x, y);
			}
		}
	}
	public void drawBlack(Graphics arg0,int x,int y){
		arg0.setColor(Color.BLACK);
		arg0.fillOval((x+1)*size.getCell()-15, (y)*size.getCell()+15, STONE_SIZE, STONE_SIZE);

	}
	public void drawWhite(Graphics arg0,int x,int y){
		arg0.setColor(Color.WHITE);
		arg0.fillOval(x*size.getCell()+15, y*size.getCell()+15, STONE_SIZE, STONE_SIZE);
		
	}
}

