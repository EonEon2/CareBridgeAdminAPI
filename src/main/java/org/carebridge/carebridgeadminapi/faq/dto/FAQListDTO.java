package org.carebridge.carebridgeadminapi.faq.dto;

import lombok.Data;

@Data
public class FAQListDTO {

    private Long fno;

    private String fcategory;

    private String ftitle;

    private boolean fdelete;


    //삭제상태 한국어로 처리
    public String getFdelete() {
        return fdelete ? "삭제됨" : "게시중";
    }
}
