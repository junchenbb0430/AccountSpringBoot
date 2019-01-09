/**
 * 
 */
package com.egf.payment.account.lock;

/**
 * @author lijunshi
 * 分布式锁服务
 */
public interface IDistributedLockService {
	
	boolean   acquireDistributeLock(String lockName,long expireTime);
	
	boolean   releaseLock(String lockName,String identify);
}
