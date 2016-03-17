import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawingCanvas extends Canvas {
	int h, w, x, y;
	
	public DrawingCanvas(){
		this.setBackground(Color.ORANGE);
	}

	public void paint(Graphics win) {
		h = getSize().height;
		w = getSize().width;
		win.drawRect(0,0, w-1, h-1);	// Draw border
		
		drawObject(win);	
	} // paint

	
	public void drawObject(Graphics g){
		/*******************************************************
		 * Place your code for drawing an object
		 * within this method
		 *******************************************************/
		
		int House_big_rect_x = x,
		House_big_rect_y = y - 100,	// Originally 	House_big_rect_y = y,
		House_big_rect_w = 300,
		House_big_rect_h = 300,
		House_roof_x = x,
		House_roof_y = y - 200,
		House_roof_w = 300,
		House_roof_h = 200,
		House_roof_start_angle = 0,
		House_roof_arc_length = 180,
		House_door_x = x + 100,
		House_door_y = y,		// Originally y + 100;
		House_door_w = 100,
		House_door_h = 200,
		Door_window_x = x + 100,
		Door_window_y = y, 	// Originally Door_window_y = y + 100,
		Door_window_w = 100,
		Door_window_h = 100,
		Window_vert_x1 = x + 150,	
		Window_vert_y1 = y,		// Originally 100
		Window_vert_x2 = x + 150,
		Window_vert_y2 = y + 100,	// Originally 200
		Window_horiz_x1 = x + 100,	
		Window_horiz_y1 = y + 50,	// Originally 150
		Window_horiz_x2 = x + 200,
		Window_horiz_y2 = y + 50;	// Originally 150
		
		Color housebase = Color.BLUE;
		Color roof = Color.GRAY;
		Color door = Color.CYAN;
		Color window = Color.MAGENTA;
		Color windowCross = Color.YELLOW;
		
		g.setColor(housebase);
		g.fillRect(House_big_rect_x, House_big_rect_y, House_big_rect_w, House_big_rect_h);
		
		g.setColor(roof);
		g.fillArc(House_roof_x, House_roof_y, House_roof_w, House_roof_h, House_roof_start_angle, House_roof_arc_length);
		
		g.setColor(door);
		g.fillRect(House_door_x, House_door_y, House_door_w, House_door_h);
		
		g.setColor(window);
		g.fillOval(Door_window_x, Door_window_y, Door_window_w, Door_window_h);
		
		g.setColor(windowCross);
		g.drawLine(Window_vert_x1, Window_vert_y1, Window_vert_x2, Window_vert_y2);
		g.drawLine(Window_horiz_x1, Window_horiz_y1, Window_horiz_x2, Window_horiz_y2);
		
	}//end of DrawingObject
	
} // DrawingCanvas