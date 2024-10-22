package org.carebridge.carebridgeadminapi.faq.dto;

import lombok.Data;

@Data
public class FAQUpdateDTO {

    private Long fno;

    private String fcategory;

    private String ftitle;

    private String fcontent;


}
