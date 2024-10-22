package org.carebridge.carebridgeadminapi.qna.mapper;

import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.qna.dto.QNARegisterDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNAListDTO;

import java.util.List;

public interface QNAMapper {

   List<QNAListDTO> getList(PageRequest pageRequest);

   int count(PageRequest pageRequest);

   Long insert(QNARegisterDTO qnaRegisterDTO);

   int delete(Long qno);

}
