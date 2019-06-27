package com.iu.board.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.DBConnecotr;

public class NoticeDAO implements BoardDAO {

	private DBConnecotr dBConnecotr;
	
	
	




	public void setDBConnecotr(DBConnecotr dBConnecotr) {
		this.dBConnecotr = dBConnecotr;
	}







	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		System.out.println("notice DAO");
		Connection con = dBConnecotr.getConnect();
		String sql ="insert into notice values(notice_seq.nextval, ?,?,?,sysdate,0)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getWriter());
		st.setString(3, boardDTO.getContents());
		int result = st.executeUpdate();
		st.close();
		con.close();
		return result;
	}

}
