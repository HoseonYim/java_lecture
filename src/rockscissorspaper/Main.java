package rockscissorspaper;

import javax.swing.*;
import java.awt.GridBagLayout;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("rock scissors paper");
        JButton rock = new JButton("바위");
        JButton scissors = new JButton("가위");
        JButton paper = new JButton("보");
        GridBagLayout gbl = new GridBagLayout();


        f.add(rock);
        f.add(scissors);
        f.add(paper);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
