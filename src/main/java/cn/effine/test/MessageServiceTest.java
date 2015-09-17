/**
 * @author effine
 * @Date 2015年9月17日  上午11:49:39
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MessageServiceTest {
	private MessageService messageService;

	@Before
	public void setUp() {
		messageService = new MessageService();
	}

	@Test
	public void getMessage_ShouldReturnMessage() {
		assertEquals("Hello World!", messageService.getMessage());
	}
}
