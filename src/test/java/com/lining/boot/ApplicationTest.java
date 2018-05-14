package com.lining.boot;

import com.lining.boot.model.Province;
import com.lining.boot.service.IProvinceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * description:
 * date 2018-05-14
 *
 * @author lining1
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    @Autowired
    private IProvinceService provinceService;

    @Test
    public void test() {
        logger.info("Spring boot logging test!");
        List<Province> list = provinceService.getProvinceList();
     }
}
