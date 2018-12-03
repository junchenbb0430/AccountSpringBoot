package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountLogEntity;

public interface EgfAccountLogMapper {
    int deleteByPrimaryKey(String accountLogId);

    int insert(EgfAccountLogEntity record);

    int insertSelective(EgfAccountLogEntity record);

    EgfAccountLogEntity selectByPrimaryKey(String accountLogId);

    int updateByPrimaryKeySelective(EgfAccountLogEntity record);

    int updateByPrimaryKey(EgfAccountLogEntity record);
}