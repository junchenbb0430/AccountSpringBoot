package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.CashLklPosEntity;
import java.math.BigDecimal;

public interface CashLklPosMapper {
    int deleteByPrimaryKey(BigDecimal lpPkid);

    int insert(CashLklPosEntity record);

    int insertSelective(CashLklPosEntity record);

    CashLklPosEntity selectByPrimaryKey(BigDecimal lpPkid);

    int updateByPrimaryKeySelective(CashLklPosEntity record);

    int updateByPrimaryKey(CashLklPosEntity record);
}