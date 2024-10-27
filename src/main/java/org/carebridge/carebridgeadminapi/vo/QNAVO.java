package org.carebridge.carebridgeadminapi.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QNAVO {

    private Long qno;
    private String qtitle;
    private String qcontent;
    private boolean qdelete;
    private boolean checkAnswer;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

    private List<String> fileNames;

}
