package top.haha233.printer;

import top.haha233.printer.MyInk;

import java.awt.*;

public class GrayInk implements MyInk {

	@Override
	public String getColor(int r, int g, int b) {
		int c=(r+b+g)/3;
		Color color = new Color(c,c,c);
		return '#'+Integer.toHexString(color.getRGB()).substring(2);
	}
}
