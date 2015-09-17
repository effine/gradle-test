/**
 * @author effine
 * @Date 2015年9月17日  上午11:50:11
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.test;

import org.apache.log4j.Logger;

public class HelloWorld {
	private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		MessageService messageService = new MessageService();

		String message = messageService.getMessage();
		LOGGER.info("Received message: " + message);
	}
}
