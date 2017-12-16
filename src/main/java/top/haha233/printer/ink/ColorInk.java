package top.haha233.printer;

import top.haha233.printer.MyInk;
import java.awt.*;

/**
 * @author Ice_Dog
 */
public class ColorInk implements MyInk {

	@Override
	public String getColor(int r, int g, int b) {
		//使用# 十六进制的形式来表示
		Color color = new Color(r,g,b);
		String strColor = "#"+Integer.toHexString(color.getRGB()).substring(2);
		return strColor;
	}

}
