package com.company.project.service.impl;

import com.company.project.dao.CounterMapper;
import com.company.project.model.Counter;
import com.company.project.service.CounterService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2019/08/29.
 */
@Service
@Transactional
public class CounterServiceImpl extends AbstractService<Counter> implements CounterService {
    @Resource
    private CounterMapper counterMapper;

}
