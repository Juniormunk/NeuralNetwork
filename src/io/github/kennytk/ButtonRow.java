package io.github.kennytk;

import java.util.ArrayList;

public class ButtonRow implements IDrawable
{
	private ArrayList<ButtonBase> row;
	
	int x, y, width, height;
	
	public ButtonRow(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw()
	{
		
	}
}