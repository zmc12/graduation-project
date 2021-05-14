package com.jsut.web.service.Impl;

import com.jsut.web.mapper.MarketMapper;
import com.jsut.web.pojo.Market;
import com.jsut.web.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 10:08
 */
@EnableAutoConfiguration

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketMapper marketMapper;

    public List<Market> selectAll() {

        List<Market> list=marketMapper.selectAll();
        return list;
    }

    public void insert(Market market) {
        marketMapper.insert(market);
    }

    public void deleteById(Integer id) {
        marketMapper.deleteById(id);
    }

    public void updateById(Market market) {
        marketMapper.updateById(market);
    }

    @Override
    public Market selectById(Integer id) {
        return marketMapper.selectById(id);
    }
}
