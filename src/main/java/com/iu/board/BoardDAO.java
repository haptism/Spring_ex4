package com.iu.board;

public interface BoardDAO {
	
	//글 등록
	public int setData(BoardDTO boardDTO) throws Exception;
}
