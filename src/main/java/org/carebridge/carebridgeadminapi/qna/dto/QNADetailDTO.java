package org.carebridge.carebridgeadminapi.qna.dto;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Data
public class QNADetailDTO {


    private Long qno;
    private String qtitle;
    private String qcontent;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

}
