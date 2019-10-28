import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseCoords extends JFrame implements MouseMotionListener
{
	ImageIcon map = new ImageIcon("Assets/Crater_Lake_Satellite_Map.jpg");
	JLabel mapLabel = new JLabel(map);

	public MouseCoords()
	{
		super("Mouse Coords");
		setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,500);
		setResizable(false);

		add(mapLabel);

		addMouseMotionListener(this);

		setVisible(true);
	}

	public void mouseMoved(MouseEvent e)
	{
		mouseEventOutput("Mouse moved", e);
	}
	public void mouseDragged(MouseEvent e)
	{
		mouseEventOutput("Mouse dragged", e);
	}

	private void mouseEventOutput(String eventDescription, MouseEvent e)
	{
		System.out.println(eventDescription + ": " + e.getX() + ", " + e.getY());
	}

	public static void main(String[] args)
	{
		new MouseCoords();
	}
}
