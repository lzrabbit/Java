package nb.ghotel.test;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import nb.ghotel.util.*;

public class MyTest {

	// D:\GitHub\Java\GHotel\config>java -jar
	// D:\GitHub\Java\jar\org\mybatis\generator\mybatis-generator-core\1.3.2\mybatis-generator-core-1.3.2.jar
	// -configfile generator.xml -overwrite
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Hello Rabbit");

		Date availableDate = DateUtil.parse("2014-02-16");

		System.out.println(availableDate);

		Log log = LogFactory.getLog(MyTest.class);

		log.debug("Hello Rabbit");
		String baidu = HttpRequest.sendGet("http://baike.baidu.com/link?url=YTClV2fmkCPmsaALrb2rxc6mCAbVuIwKXb_e6wOvfVHu14NvZxi4ephGzqGxjB8HpS99EHSOk5n4-4AP8-T7Ja");
		log.debug(baidu);
		// org.apache.ibatis.logging.LogFactory.useLog4JLogging();

		// IGProductService service = new GProductServiceImpl();

		// service.UpdateProduct(availableDate);
		// System.out.println("Hello Rabbit");

		System.out.println("over...");
	}

}
