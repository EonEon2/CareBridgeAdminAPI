package org.carebridge.carebridgeadminapi.faq.dto;

import lombok.Data;

@Data
public class FAQListDTO {

    private Long fno;

    private String fcategory;

    private String ftitle;

    private boolean fdelete;

}
