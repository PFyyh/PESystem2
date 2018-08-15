package com.pesystem.mapper;

import com.pesystem.po.Faculty;
import com.pesystem.po.FacultyExample;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springConfig/springConfig.xml"})
public class FacultyMapperTest {
    //获取日志记录器Logger，名字为本类类名
    private static Logger log = Logger.getLogger(String.valueOf(FacultyMapperTest.class));

    @Autowired
    private FacultyMapper facultyMapper;

    @Test
    public void testInsert(){
        Faculty faculty = new Faculty();
        faculty.setFacultyName("BarkLuc，不得转载。。。。");
        facultyMapper.insert(faculty);
    }
}
