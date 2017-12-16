package top.haha233.printer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer p = (Printer) context.getBean("printer");
		String Content = "后付款撒地方和撒开始的恢复爱是快乐福克斯地方卡洛斯返回的开始发货卡洛斯发的开始发咖啡打瞌睡发看是否是方式看到罚款撒地方两三块粉红色肯定福克斯罚款撒到了富士康发咖啡按理说";
		p.print(Content);
	}
}
