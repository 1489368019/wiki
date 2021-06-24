package com.yeshiqi.wiki.mapper;

import com.yeshiqi.wiki.domain.Test;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TestMapper {

    List<Test> list();
}
