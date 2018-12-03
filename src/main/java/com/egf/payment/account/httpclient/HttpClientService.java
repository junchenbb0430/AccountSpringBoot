/**
 * 
 */
package com.egf.payment.account.httpclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lijunshi
 *
 */
@Service
public class HttpClientService {
	
 public static final String CHARSET_UTF_8 = "UTF-8";
	 
	 public static final String APPLICATION__JSON_TYPE = "json";
	 
	 public static final String APPLICATION_XML_TYPE="xml";
	
	  @Autowired
	  private HttpClientManager  connManager;
	 
	  /**
	   *  进行Form表单提交
	   * @param url
	   * @param dataMap
	   * @return 返回
	   */
	  public String doPostInForm(String url,Map<String,String> dataMap) {
		  String  httpRespContent = null;
		  // 1. 创建HttpClient实例
		  CloseableHttpClient httpClient = connManager.getHttpClient(); 
		  // 2. 创建请求HttpPost实例
		  HttpPost httpPost= new HttpPost(url);
		  CloseableHttpResponse response = null; 
		  // 3. 创建key-value的List集合,form提交都是key-value形式
		  List<BasicNameValuePair> nameValueList = new ArrayList<BasicNameValuePair>();
		  for(Map.Entry<String,String> entry:dataMap.entrySet()) {
			  nameValueList.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
		  }
		  UrlEncodedFormEntity urlEndcodeFormEntity;
		try {
			urlEndcodeFormEntity = new UrlEncodedFormEntity(nameValueList,CHARSET_UTF_8);
			 
			 httpPost.setEntity(urlEndcodeFormEntity);
			 // 4. 执行Post请求
			  response = httpClient.execute(httpPost);
			  if(null != null) {
				  // 5 返回HTTP CODE状态
				  StatusLine statusLine =  response.getStatusLine();
				  if(HttpStatus.SC_OK == statusLine.getStatusCode()) {
					// 6 获取应答消息HttpEntity
					  HttpEntity httpEntity = response.getEntity();
					  // 6.1 将HttpEntity中的content按照charset字符转换为String形式
					  httpRespContent =  EntityUtils.toString(httpEntity, CHARSET_UTF_8) ; 
				  }		  
			  }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null != response) {
				try {
					EntityUtils.consume(response.getEntity());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
		  return httpRespContent;
	  }
	  
	 
	  
	  /**
	   * 
	   * @param url
	   * @param strXml
	   * @return
	   */
	  public String doPostInJsonOrXml(String url,String strXml,String contentType) {
		  String  httpRespContent = null;
		  // 1. 创建HttpClient实例
		  CloseableHttpClient httpClient = connManager.getHttpClient(); 
		  // 2. 创建请求HttpPost实例
		  HttpPost httpPost= new HttpPost(url);
		  CloseableHttpResponse response = null; 
		  // 3.构建HttpEntity，报文载体PayLoad
		  StringEntity  stringEntity = new StringEntity(strXml,CHARSET_UTF_8);
		  if(APPLICATION__JSON_TYPE.equals(contentType)) {
			  stringEntity.setContentType("application/json");
		  }else {
			  stringEntity.setContentType("application/xml");
		  }
		 
		  httpPost.setEntity(stringEntity);
		  try {
			  // 4. 执行Post请求
			  response = httpClient.execute(httpPost);
			  if(null != response) {
				// 5. 获取HTTP返回码
				StatusLine statusLine =  response.getStatusLine();
				if(HttpStatus.SC_OK == statusLine.getStatusCode()) {
					// 6 获取应答消息HttpEntity
					HttpEntity httpEntity = response.getEntity();
					// 6.1 将HttpEntity中的content按照charset字符转换为String形式
					httpRespContent =  EntityUtils.toString(httpEntity, CHARSET_UTF_8) ; 
				 }
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(null != response) {
				try {
					EntityUtils.consume(response.getEntity());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		  return httpRespContent;
	  }
}
