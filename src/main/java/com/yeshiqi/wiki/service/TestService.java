package com.yeshiqi.wiki.service;

import com.yeshiqi.wiki.domain.Test;
import com.yeshiqi.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    //@Autowired
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
