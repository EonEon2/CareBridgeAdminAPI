package org.carebridge.carebridgeadminapi.qna.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class QNARegisterDTO {

    private Long qno;
    private String qtitle;
    private String qcontent;
    private boolean checkAnswer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
