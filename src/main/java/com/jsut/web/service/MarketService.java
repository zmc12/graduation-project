package com.jsut.web.service;

import com.jsut.web.pojo.Market;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 10:05
 */
public interface MarketService {
    List<Market> selectAll();

    void insert(Market market);
}
