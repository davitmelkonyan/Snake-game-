import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Snake 
{

	public static Snake snake;
	public JFrame jframe;
	public SnakePanel panel;
	//public Timer timer = new Timer(20, this);
	public ArrayList<Point> snakeParts = new ArrayList<Point>();
	public static final int UP = 0, DOWN = 1, LEFT = 2, RIGHT = 3, SCALE = 10;
	public int ticks = 0, direction = DOWN, score, tailLength = 10, time;
	public Point head, cherry;
	public Random random;
	public boolean over = false, paused;
	public Dimension dim;

	public Snake()
	{
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		jframe = new JFrame("Snake");
		jframe.setVisible(true);
		jframe.setSize(805, 700);
		jframe.setResizable(false);
		jframe.setLocation(dim.width / 2 - jframe.getWidth() / 2, dim.height / 2 - jframe.getHeight() / 2);
		jframe.add(panel = new SnakePanel());
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//startGame();
	}

	public static void main(String[] args)
    {
        snake = new Snake();
    }
	

}