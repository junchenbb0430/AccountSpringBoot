package com.ehomepay.reconciliation.dao;

import com.ehomepay.reconciliation.entity.ClearComfirmEntity;
import java.math.BigDecimal;

public interface ClearComfirmMapper {
    int deleteByPrimaryKey(BigDecimal pkid);

    int insert(ClearComfirmEntity record);

    int insertSelective(ClearComfirmEntity record);

    ClearComfirmEntity selectByPrimaryKey(BigDecimal pkid);

    int updateByPrimaryKeySelective(ClearComfirmEntity record);

    int updateByPrimaryKey(ClearComfirmEntity record);
}