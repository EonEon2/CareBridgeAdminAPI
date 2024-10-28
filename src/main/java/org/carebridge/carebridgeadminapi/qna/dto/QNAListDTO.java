package org.carebridge.carebridgeadminapi.qna.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class QNAListDTO {

    private Long qno;
    private String qtitle;
    private boolean qdelete;
    private boolean checkAnswer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
