package nb.ghotel.domain;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class ServiceContext {
	
	private static final String CONFIG_PATH = "mybatis.xml";

	/*
	 * 获取数据库访问链接
	 */
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		try {

			InputStream stream = Resources.getResourceAsStream(CONFIG_PATH);			
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(stream);
			session = factory.openSession();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return session;
	}

}
