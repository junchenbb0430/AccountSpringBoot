package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.CashUmsPosEntity;
import java.math.BigDecimal;

public interface CashUmsPosMapper {
    int deleteByPrimaryKey(BigDecimal upPkid);

    int insert(CashUmsPosEntity record);

    int insertSelective(CashUmsPosEntity record);

    CashUmsPosEntity selectByPrimaryKey(BigDecimal upPkid);

    int updateByPrimaryKeySelective(CashUmsPosEntity record);

    int updateByPrimaryKey(CashUmsPosEntity record);
}