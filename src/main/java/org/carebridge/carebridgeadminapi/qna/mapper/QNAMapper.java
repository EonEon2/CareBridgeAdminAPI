package org.carebridge.carebridgeadminapi.qna.mapper;

import org.apache.ibatis.annotations.Param;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.qna.dto.QNADetailDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNARegisterDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNAListDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNAUpdateDTO;

import java.util.List;

public interface QNAMapper {

   List<QNAListDTO> getList(PageRequest pageRequest);

   int count(PageRequest pageRequest);

   Long insert(QNARegisterDTO qnaRegisterDTO);

   int delete(Long qno);

   int update(@Param("qno") Long qno, @Param("dto") QNAUpdateDTO qnaUpdateDTO);

   QNADetailDTO getOne(Long qno);
}
