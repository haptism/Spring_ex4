package com.iu.board.notice;

import com.iu.board.BoardDTO;
import com.iu.board.BoardService;

public class NoticeService implements BoardService {
	private NoticeDAO noticeDAO;
	
	

	public void setNoticeDAO(NoticeDAO noticeDAO) {
		this.noticeDAO = noticeDAO;
	}



	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("notice Service");
		return noticeDAO.setData(boardDTO);
	}

}
