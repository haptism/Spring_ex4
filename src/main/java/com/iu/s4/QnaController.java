package com.iu.s4;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iu.board.qna.QnaDTO;
import com.iu.board.qna.QnaService;

@Controller
@RequestMapping("/qna/")
public class QnaController {
	
	@Inject
	private QnaService qnaService;
	
	@RequestMapping(value = "qnaWrite")
	public void setData(QnaDTO qnaDTO)throws Exception{
		qnaDTO.setTitle("qnaTitle");
		qnaDTO.setWriter("qnaWriter");
		qnaDTO.setContents("qnaContents");
		int result=qnaService.setData(qnaDTO);
	}

}
