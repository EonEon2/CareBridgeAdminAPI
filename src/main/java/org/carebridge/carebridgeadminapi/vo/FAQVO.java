package org.carebridge.carebridgeadminapi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FAQVO {

    private Long fno;

    private FAQCategory fcategory;

    private String ftitle;

    private String fcontent;

    private boolean fdelete;

}
