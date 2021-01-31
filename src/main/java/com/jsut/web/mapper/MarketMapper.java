package com.jsut.web.mapper;

import com.jsut.web.pojo.Market;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.List;

/**
 * @author ZhangMinCong
 * @date 2021/1/21 10:38
 */
@EnableAutoConfiguration
@Mapper
public interface MarketMapper {
    public List<Market> selectAll();

    void insert(Market market);

    void deleteById(Integer id);

    void updateById(Market  market);
}
