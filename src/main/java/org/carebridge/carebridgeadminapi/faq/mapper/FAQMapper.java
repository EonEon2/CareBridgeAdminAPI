package org.carebridge.carebridgeadminapi.faq.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.carebridge.carebridgeadminapi.faq.dto.FAQDTO;

import java.util.Optional;

@Mapper
public interface FAQMapper {

    int insert(FAQDTO faqDTO);

    int update(FAQDTO faqDTO);

    int delete(FAQDTO faqDTO);

    Optional<FAQDTO> select(Long fno);

}
