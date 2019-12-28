package com.test.service.impl;

import com.test.mapper.ClassificationMapper;
import com.test.pojo.classification.*;
import com.test.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationServiceImpl implements ClassificationService {
    @Autowired
    private ClassificationMapper classificationMapper;


    @Override
    public List<Item> getItem(int rand) {
        return classificationMapper.getItem(rand);
    }
}
