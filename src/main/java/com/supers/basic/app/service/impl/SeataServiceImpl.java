package com.supers.basic.app.service.impl;

import com.supers.basic.app.service.SeataService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

@Service
public class SeataServiceImpl implements SeataService {

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void transactionTest(){

    }
}
