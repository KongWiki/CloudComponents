package com.wkk.micro.user.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wkk.micro.common.dao.entity.MoocBackendUserT;
import com.wkk.micro.common.dao.mapper.MoocBackendUserTMapper;
import com.wkk.micro.user.BackendUserApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kongwiki@163.com
 * @since 2020/10/2
 */
public class UserTest extends BackendUserApplicationTests {

    @Resource
    private MoocBackendUserTMapper mapper;

    @Test
    public void add(){
//        MoocBackendUserT userT = new MoocBackendUserT();
    }

    @Test
    public void select(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", "wkk2");
        List<MoocBackendUserT> list = mapper.selectList(queryWrapper);
        list.stream().forEach(
                System.out::println
        );

    }

}
