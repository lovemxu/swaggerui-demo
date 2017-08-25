package com.zito.swaggerui.utils;

import javax.net.ssl.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
	/**
	 * http发送
	 * 
	 * @author wq
	 * @date 2014-11-3
	 * @param url
	 *            请求地址
	 * @param json
	 *            请求参数
	 * @return
	 * @throws Exception 
	 * @throws Exception
	 */
	public static String httpSendMessage(String json, String url) throws Exception {
		//System.out.println("requestJson 请求报文:" + json);
		////System.out.println("url 请求地址:" + url);
		String responseStr = "";
		HttpURLConnection conn = null;
		ByteArrayOutputStream buffer = null;
		BufferedInputStream bufIn = null;
		URL urlAddress = new URL(url);
		conn = (HttpURLConnection) urlAddress.openConnection();
		conn.setRequestMethod("POST");
		conn.setReadTimeout(300000);
		conn.setConnectTimeout(300000);
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setRequestProperty("Connection", "Keep-Alive");
		conn.setRequestProperty("Charset", "UTF-8");
		conn.setRequestProperty("Content-Length",
				String.valueOf(json.getBytes("UTF-8").length));
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		OutputStream out = conn.getOutputStream();
		out.write(json.getBytes("UTF-8"));
		out.flush();
		out.close();
		
		
		bufIn = new BufferedInputStream(conn.getInputStream());
		buffer = new ByteArrayOutputStream();
		byte[] tmpBuf = new byte[1024];
		int len = bufIn.read(tmpBuf);
		while (len != -1) {
			buffer.write(tmpBuf, 0, len);
			len = bufIn.read(tmpBuf);
		}
		responseStr = new String(buffer.toByteArray(), "UTF-8");
		buffer.close();
		bufIn.close();
		
		conn.disconnect();
		return responseStr;
	}

	public static String httpsSendMessage(String json,String url) throws Exception {
		String result = null;

			// 设置SSLContext
			SSLContext sslcontext = SSLContext.getInstance("TLS");
			sslcontext.init(null, new TrustManager[] { myX509TrustManager },
					null);

			// 打开连接
			// 要发送的POST请求url?Key=Value&amp;Key2=Value2&amp;Key3=Value3的形式
			URL requestUrl = new URL(url);
			HttpsURLConnection conn = (HttpsURLConnection) requestUrl
					.openConnection();
			ByteArrayOutputStream buffer = null;
			BufferedInputStream bufIn = null;
			// 设置套接工厂
			conn.setSSLSocketFactory(sslcontext.getSocketFactory());
			conn.setHostnameVerifier(new NullHostnameVerifier());
			
			//conn.setDefaultHostnameVerifier(new NullHostnameVerifier());
			
			conn.setRequestMethod("POST");
			conn.setReadTimeout(180000);
			conn.setConnectTimeout(180000);
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Charset", "UTF-8");
			conn.setRequestProperty("Content-Length",
					String.valueOf(json.getBytes("UTF-8").length));
//			conn.setRequestProperty("Content-Type", "text/json");
			OutputStream out = conn.getOutputStream();
			out.write(json.getBytes("UTF-8"));
			out.flush();
			out.close();
			bufIn = new BufferedInputStream(conn.getInputStream());
			buffer = new ByteArrayOutputStream();
			byte[] tmpBuf = new byte[1024];
			int len = bufIn.read(tmpBuf);
			while (len != -1) {
				buffer.write(tmpBuf, 0, len);
				len = bufIn.read(tmpBuf);
			}
			result = new String(buffer.toByteArray(), "UTF-8");
			buffer.close();
			bufIn.close();
			conn.disconnect();
		return result;
	}

	private static TrustManager myX509TrustManager = new X509TrustManager() {

		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			return certificates;
		}

		public void checkClientTrusted(
				java.security.cert.X509Certificate[] arg0, String arg1)
				throws java.security.cert.CertificateException {
			if (this.certificates == null) {  
	            this.certificates = arg0;  
	        }  
		}

		public void checkServerTrusted(
				java.security.cert.X509Certificate[] arg0, String arg1)
				throws java.security.cert.CertificateException {
			 if (this.certificates == null) {  
		            this.certificates = arg0;  
		        }  
		}
		
		private java.security.cert.X509Certificate[] certificates;  
		  
		
	};
	
	private static class NullHostnameVerifier implements HostnameVerifier {
	    

		public boolean verify(String arg0, SSLSession arg1) {
			return true;
		}
	}
}
