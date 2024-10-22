package org.carebridge.carebridgeadminapi.qna.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.carebridge.carebridgeadminapi.common.page.PageRequest;
import org.carebridge.carebridgeadminapi.common.page.PageResponse;
import org.carebridge.carebridgeadminapi.qna.dto.QNAListDTO;
import org.carebridge.carebridgeadminapi.qna.dto.QNARegisterDTO;
import org.carebridge.carebridgeadminapi.qna.mapper.QNAMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class QNAService {

    private final QNAMapper qnaMapper;

    public PageResponse<QNAListDTO> getQNAList(PageRequest pageRequest) {
        log.info("getQNAList");

        PageResponse<QNAListDTO> pageResponse =
                PageResponse.<QNAListDTO>with()
                        .list(qnaMapper.getList(pageRequest))
                        .total(qnaMapper.count(pageRequest))
                        .pageRequest(pageRequest)
                        .build();

        return pageResponse;
    }

    public void register(QNARegisterDTO dto) {

        log.info("register Service");

        QNARegisterDTO registerDTO = QNARegisterDTO.builder()
                .qno(dto.getQno())
                .qtitle(dto.getQtitle())
                .qcontent(dto.getQcontent())
                .build();

        qnaMapper.insert(registerDTO);
    }

    public void delete(Long qno) {
        log.info("delete Service");

        qnaMapper.delete(qno);
    }


}
