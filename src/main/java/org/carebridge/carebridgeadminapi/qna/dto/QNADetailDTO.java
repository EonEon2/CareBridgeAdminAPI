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
    private boolean checkAnswer;

    private String cgemail;
    private String cgname;
    private String ctemail;
    private String ctname;

    private String qanswer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

}
