package com.egf.payment.account.dao.mapper;

import com.egf.payment.account.dao.entity.EgfAccountInstEntity;

public interface EgfAccountInstMapper {
    int deleteByPrimaryKey(String instAccountNo);

    int insert(EgfAccountInstEntity record);

    int insertSelective(EgfAccountInstEntity record);

    EgfAccountInstEntity selectByPrimaryKey(String instAccountNo);

    int updateByPrimaryKeySelective(EgfAccountInstEntity record);

    int updateByPrimaryKey(EgfAccountInstEntity record);
}