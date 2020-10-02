package com.wkk.micro.common.backenduser;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wkk.micro.common.BackendCommonApplicationTests;
import com.wkk.micro.common.dao.entity.MoocBackendUserT;
import com.wkk.micro.common.dao.entity.MoocUserT;
import com.wkk.micro.common.dao.mapper.MoocBackendUserTMapper;
import com.wkk.micro.common.dao.mapper.MoocUserTMapper;
import com.wkk.micro.utils.util.MD5Util;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kongwiki@163.com
 * @since 2020/10/2
 */
public class UserTest extends BackendCommonApplicationTests {

    @Resource
    private MoocBackendUserTMapper mapper;

    @Test
    public void add() {
        MoocBackendUserT userT = new MoocBackendUserT();
        userT.setUserName("admin");
        userT.setUserPhone("111111111111");
        userT.setUserPwd(MD5Util.encrypt("admin"));

        mapper.insert(userT);
    }

    @Test
    public void select() {
//        MoocBackendUserT userT = mapper.selectById(2);
//        System.out.println(userT);
//        List<MoocBackendUserT> moocBackendUserTList = mapper.selectList(null);
//        moocBackendUserTList.stream().forEach(
//                System.out::println
//        );
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", "admin4");
        List<MoocBackendUserT> list = mapper.selectList(queryWrapper);
        list.stream().forEach(
                System.out::println
        );

    }

    @Test
    public void update() {
//        MoocBackendUserT userT = mapper.selectById(2);
//        userT.setUuid(2);
//        userT.setUserName("admin");
//        userT.setUserPwd("admin");
//        userT.setUserPhone("111111111111");
//        mapper.updateById(userT);
//        MoocBackendUserT userT2 = new MoocBackendUserT();
//        userT2.setUserName("wkk2");
//        userT2.setUserPwd("123");
//        userT2.setUserPhone("11111111111");
//        QueryWrapper wrapper = new QueryWrapper<>();
//        wrapper.eq("user_name","wkk");
//        mapper.update(userT2, wrapper);
        Page<MoocBackendUserT> page = new Page<>(1, 10);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_name", "wkk2");
        IPage<MoocBackendUserT> iPage = mapper.selectPage(page, queryWrapper);
        iPage.getRecords().stream().forEach(
                System.out::println
        );


    }

    @Test
    public void del() {
        mapper.deleteById(2);
    }

}
