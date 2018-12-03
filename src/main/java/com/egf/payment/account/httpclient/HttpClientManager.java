package com.egf.payment.account.httpclient;

import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.ManagedHttpClientConnectionFactory;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HttpClientManager implements InitializingBean {

	 
	
	private  CloseableHttpClient httpClient = null; 
	
	/**
	 * 最大连接数
	 */
	@Value("")
	private  int connMaxTotal;
	
	/**
	 * 连接不活动时间
	 */
	@Value("")
	private int inactivityTime;
	
	/**
	 * 
	 */
	@Value("")
	private int connMaxTotalRoute;
	
	/**
	 * 
	 */
	@Value("")
	private int requestTimeOut;
	
	/**
	 * 
	 */
	@Value("")
	private int connectTimeOut;
	
	/**
	 * 
	 */
	@Value("")
	private int socketTimeOut; 
	
	/**
	 * 
	 */
	private boolean sharedManager;
	
	@Value("")
	private String targetUrl;
	
	@Value("")
	private String relativePath;
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory =
				 new ManagedHttpClientConnectionFactory();
		PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(connFactory);
		
		connManager.setMaxTotal(this.getConnMaxTotal());//最大连接数
		connManager.setDefaultMaxPerRoute(this.getConnMaxTotalRoute());//每个route的最大连接数
		connManager.setValidateAfterInactivity(this.getInactivityTime()); // 连接不活动的时间，默认为毫秒
		connManager.setMaxPerRoute(new HttpRoute(new HttpHost(this.getHttpHost())), 50);  
		
		RequestConfig requestConfig = RequestConfig.custom()
				.setConnectionRequestTimeout(this.getRequestTimeOut())// 客户端从连接池获取请求连接的时间，
				.setConnectTimeout(this.connectTimeOut)// 连接池建立远程socket连接的超时时间，毫秒
				.setSocketTimeout(this.getSocketTimeOut())//Scoket读取远程服务器数据应答超时时间，毫秒
				.build();
		
		  httpClient = HttpClients.custom() 
		.setConnectionManager(connManager)//设置连接管理器
		.setConnectionManagerShared(false)//不共享连接管理器
		.setDefaultRequestConfig(requestConfig)
		.build(); 
	}

	
	
	public CloseableHttpClient getHttpClient() {
		return httpClient;
	}


	public int getConnMaxTotal() {
		return connMaxTotal;
	}

	public void setConnMaxTotal(int connMaxTotal) {
		this.connMaxTotal = connMaxTotal;
	}

	 

	public int getInactivityTime() {
		return inactivityTime;
	}

	public void setInactivityTime(int inactivityTime) {
		this.inactivityTime = inactivityTime;
	}

	public int getConnMaxTotalRoute() {
		return connMaxTotalRoute;
	}

	public void setConnMaxTotalRoute(int connMaxTotalRoute) {
		this.connMaxTotalRoute = connMaxTotalRoute;
	}

	 

	public int getRequestTimeOut() {
		return requestTimeOut;
	}



	public void setRequestTimeOut(int requestTimeOut) {
		this.requestTimeOut = requestTimeOut;
	}




	public int getConnectTimeOut() {
		return connectTimeOut;
	}



	public void setConnectTimeOut(int connectTimeOut) {
		this.connectTimeOut = connectTimeOut;
	}



	public int getSocketTimeOut() {
		return socketTimeOut;
	}



	public void setSocketTimeOut(int socketTimeOut) {
		this.socketTimeOut = socketTimeOut;
	}



	public boolean isSharedManager() {
		return sharedManager;
	}



	public void setSharedManager(boolean sharedManager) {
		this.sharedManager = sharedManager;
	}



	public String getTargetUrl() {
		return targetUrl;
	}



	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}



	public String getRelativePath() {
		return relativePath;
	}



	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

 
	public String getHttpHost() {
		return this.getTargetUrl()+this.getRelativePath();
	}

}
