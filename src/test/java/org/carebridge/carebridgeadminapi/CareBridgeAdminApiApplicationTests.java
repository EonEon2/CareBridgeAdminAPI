package org.carebridge.carebridgeadminapi;

import lombok.extern.log4j.Log4j2;

import org.carebridge.carebridgeadminapi.time.mapper.TimeMapper;
import org.carebridge.carebridgeadminapi.qna.mapper.QNAMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
class CareBridgeAdminApiApplicationTests {

    @Autowired(required = false)
    TimeMapper timeMapper;

    @Autowired(required = false)
    QNAMapper qnaMapper;

    @Test
    public void Test1(){
        log.info("------------");
        log.info("!"+timeMapper.getTime());
    }

    @Test
    public void contextLoads() {
        log.info("------------test--------------");
        log.info("!"+ qnaMapper.getQuestion());
    }

}
