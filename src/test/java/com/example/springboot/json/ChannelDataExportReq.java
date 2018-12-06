/**
 * 
 */
package com.example.springboot.json;

import lombok.Data;

/**
 * @author lijunshi
 *
 */
@Data
public class ChannelDataExportReq {

	private String spbillStartTime;
	
	private String  spbillEndTime;
	/**交易状态**/
	private String transStatus;
	
	private String transStartTime;
	
	private String transEndTime;
	
	private String checkResult;
	
	private String cardType;
	
	private String channelId;
	
	private String bankSeq;
	
	private String customerName;
	
	
}
