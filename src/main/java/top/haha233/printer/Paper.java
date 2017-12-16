package top.haha233.printer;

/**
 * @author Ice_Dog
 */
public interface Paper {
	String NEWLINE="\r\n";

	/**
	 * 输出字符到纸张
	 * @param c
	 */
	void putInChar(char c);

	/**
	 * 得到纸张上的字符
	 * @return
	 */
	String getContent();
}
