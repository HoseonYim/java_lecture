package java20201101;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int square() {
        return width*height;
    }

    public void show(){
        System.out.printf("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
}
