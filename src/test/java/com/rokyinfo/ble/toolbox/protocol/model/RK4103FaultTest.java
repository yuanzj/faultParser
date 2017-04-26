package com.rokyinfo.ble.toolbox.protocol.model;

import com.rokyinfo.convert.util.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuanzhijian on 2017/4/26.
 */
public class RK4103FaultTest {
    @Test
    public void build() throws Exception {

//        RK4103Fault 定义了所有故障详情看代码注释
        RK4103Fault mRK4103Fault = RK4103Fault.build( StringUtils.
                stringToByteArray("00000000000000000000"));





    }

}