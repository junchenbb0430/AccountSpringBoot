package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountFreezeLogEntity;

public interface EgfAccountFreezeLogMapper {
    int deleteByPrimaryKey(String freezeIdLog);

    int insert(EgfAccountFreezeLogEntity record);

    int insertSelective(EgfAccountFreezeLogEntity record);

    EgfAccountFreezeLogEntity selectByPrimaryKey(String freezeIdLog);

    int updateByPrimaryKeySelective(EgfAccountFreezeLogEntity record);

    int updateByPrimaryKey(EgfAccountFreezeLogEntity record);
}