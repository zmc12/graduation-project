package com.jsut.web.service;

import com.jsut.web.pojo.Market;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 10:05
 */
@EnableAutoConfiguration

public interface MarketService {
    List<Market> selectAll();

    void insert(Market market);


    void deleteById(Integer id);

    void updateById(Market  market);

    Market selectById(Integer id);
}
