package com.lining.boot.service.impl;

import com.lining.boot.mapper.ProvinceMapper;
import com.lining.boot.model.Province;
import com.lining.boot.model.ProvinceExample;
import com.lining.boot.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description:
 * date 2018-05-14
 *
 * @author lining1
 * @version 1.0.0
 */
@Service
public class ProvinceServiceImpl implements IProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    @Override
    public List<Province> getProvinceList() {
        ProvinceExample example = new ProvinceExample();
        ProvinceExample.Criteria criteria = example.createCriteria();
        List<Province> list = provinceMapper.selectByExample(example);
        return list;
    }
}
