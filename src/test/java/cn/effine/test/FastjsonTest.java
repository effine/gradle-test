/**
 * @author effine
 * @Date 2015年9月29日  下午5:33:39
 * @email verphen#gmail.com
 * @site http://www.effine.cn
 */

package cn.effine.test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastjsonTest {

	public static void main(String[] args) {

		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("a", 1);
		jsonMap.put("b", "");
		jsonMap.put("c", null);
		jsonMap.put("d", "wuzhuti.cn");

		String str = JSONObject.toJSONString(jsonMap,
				SerializerFeature.WriteMapNullValue);
		System.out.println(str);
		// 输出结果:{"a":1,"b":"",d:"wuzhuti.cn"}
		
		
		
		

	}
}
