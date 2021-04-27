package com.jsut.web.service.Impl;

import com.jsut.web.mapper.KnowMapper;
import com.jsut.web.mapper.NoticeMapper;
import com.jsut.web.mapper.StudentMapper;
import com.jsut.web.pojo.Know;
import com.jsut.web.pojo.Notice;
import com.jsut.web.pojo.Student;
import com.jsut.web.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: ZhangMinCong
 * @Date: 2021/1/22 19:29
 */
@Service
@EnableAutoConfiguration
@Transactional
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Autowired
    private KnowMapper knowMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Notice> selectAll(String name) {
        List<Notice> list=noticeMapper.selectAll(name);
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        noticeMapper.deleteById(id);
    }

    @Override
    public void insert(Notice notice) {
        noticeMapper.insert(notice);

    }

    @Override
    public void updateById(Notice notice) {
        noticeMapper.updateById(notice);
        knowMapper.deleteById(notice.getId());
        List<Student> students = studentMapper.selectByGrade(notice.getGrade());
        for(int j=0;j<students.size();j++){
            knowMapper.insert(new Know(notice.getId(),students.get(j).getName(),"未确认"));
        }
    }

}
