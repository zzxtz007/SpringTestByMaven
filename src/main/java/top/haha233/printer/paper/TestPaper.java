package top.haha233.printer.paper;

import top.haha233.printer.Paper;

public class TestPaper implements Paper {
	/**
	 * 每行字符数
	 */
	private int charPerLine = 12;
	/**
	 * 每页行数
	 */
	private int linePerPage = 10;
	/**
	 * 纸张中内容
	 */
	private String content = "";
	/**
	 * 当前横向位置，从0到charPerLine-1
	 */
	private int posX = 0;
	/**
	 * 当前行数，从0到linePerPage-1
	 */
	private int posY = 0;
	/**
	 * 当前页数
	 */
	private int posP = 1;

	@Override
	public void putInChar(char c) {
		content += c;
		posX++;
		//判断是否换行
		if (posX==charPerLine) {
			content += Paper.NEWLINE;
			posX = 0;
			posY++;
		}
		//判断是否换页
		if (posY==linePerPage) {
			content += "===第"+posP+"页===";
			content += Paper.NEWLINE+Paper.NEWLINE;
			posY = 0;
			posP++;
		}
	}

	@Override
	public String getContent() {
		String ret = this.content;
		//补齐本页空行，并显示页码
		if (!(posX==0&&posY==0)) {
			int count = linePerPage-posY;
			for (int i = 0; i < count; i++) {
				ret += Paper.NEWLINE;
			}
			ret += "===第"+posP+"页===";
		}
		return ret;
	}

	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}
}
