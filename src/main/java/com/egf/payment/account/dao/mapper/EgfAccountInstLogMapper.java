package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountInstLogEntity;

public interface EgfAccountInstLogMapper {
    int deleteByPrimaryKey(String instAccountLogId);

    int insert(EgfAccountInstLogEntity record);

    int insertSelective(EgfAccountInstLogEntity record);

    EgfAccountInstLogEntity selectByPrimaryKey(String instAccountLogId);

    int updateByPrimaryKeySelective(EgfAccountInstLogEntity record);

    int updateByPrimaryKey(EgfAccountInstLogEntity record);
}