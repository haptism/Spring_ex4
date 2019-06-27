package com.iu.board.qna;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.DBConnecotr;

@Repository //new QnaDAO();
public class QnaDAO implements BoardDAO {
	
	
	private DBConnecotr dBConnecotr;
	
	
	@Required
	public void setdBConnecotr(DBConnecotr dBConnecotr) {
		this.dBConnecotr = dBConnecotr;
	}



	@Override
	public int setData(BoardDTO boardDTO) throws Exception {
		Connection con = dBConnecotr.getConnect();
		String sql ="insert into qna values(notice_seq.nextval, ?,?,?,sysdate,0,notice_seq.currval, 0,0)";
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
