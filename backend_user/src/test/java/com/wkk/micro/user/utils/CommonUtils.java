package com.wkk.micro.user.utils;

import com.wkk.micro.utils.common.vo.BaseResponseVO;
import org.junit.Test;

/**
 * @author kongwiki@163.com
 * @since 2020/10/2
 */
public class CommonUtils {
    @Test
    public void test(){
        BaseResponseVO vo = new BaseResponseVO();
        System.out.println(vo.run("user package "));
    }
}
