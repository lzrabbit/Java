package nb.ghotel.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class HttpRequest {

	static final String Accept = "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8";
	static final String UserAgent = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36";
	static final String Connection = "Keep-Alive";

	public static String sendGet(String url) {
		return send(url, "GET", null, null, null);
	}

	public static String sendPost(String url, String param) {
		return send(url, "POST", param, null, null);
	}

	public static String send(String url, String method, String param,
			Map<String, String> headers, String charset) {

		String result = "";
		try {
			HttpURLConnection conn = getConnection(url, method, null, headers);
			BufferedReader bufferReader = new BufferedReader(
					new InputStreamReader(conn.getInputStream(), "utf-8"));

			String line;
			while ((line = bufferReader.readLine()) != null) {
				result += line;
			}
			bufferReader.close();
		} catch (Exception e) {
			System.out.println("发送http请求出现异常！" + e);
			e.printStackTrace();
		}

		return result;
	}

	static HttpURLConnection getConnection(String url, String method,
			String param, Map<String, String> header) {
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) (new URL(url)).openConnection();
			conn.setRequestMethod(method);

			// 设置通用的请求属性
			conn.setRequestProperty("Accept", Accept);
			conn.setRequestProperty("Connection", Connection);
			conn.setRequestProperty("User-Agent", UserAgent);

			if (header != null) {
				for (String key : header.keySet()) {
					conn.setRequestProperty(key, header.get(key));
				}
			}

			if (method == "POST") {
				conn.setDoOutput(true);
				conn.setDoInput(true);
				if (param != null) {
					conn.getOutputStream().write(param.getBytes());
				}
			}
			// 建立实际的连接
			conn.connect();
			return conn;
		} catch (Exception e) {
			System.out.println("发送http请求出现异常:" + e);
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null)
				conn.disconnect();
		}
	}
}
