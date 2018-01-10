package board.dao;

import java.util.ArrayList;
import java.util.List;
import board.dto.BoardDto;
import board.mybatis.BoardManager;

public class BoardDaoImpl implements BoardDao{
	@Override
	public List<BoardDto> boardList(String keyfield, String keyword){
		List<BoardDto> result = new ArrayList<BoardDto>();
		System.out.println("정상적으로 값이 들어옴");
		System.out.println(keyfield + "//" + keyword);
		result = BoardManager.boardList(keyfield, keyword);
		System.out.println(result.size());
		return result;
	}
	@Override
	public String preView(int seq){
		String preContent = BoardManager.preView(seq);
		return preContent; 
	}
	@Override
	public BoardDto findBySeq(int seq){
		BoardDto result = BoardManager.findBySeq(seq);
		return result; 
	}
	@Override
	public BoardDto viewContent(int seq){
		BoardManager.readCount(seq);
		BoardDto result = BoardManager.findBySeq(seq);
		return result; 
	}
	public void upPos(){
		BoardManager.upPos();
		System.out.println("글을 쓰면 pos 1업");
	}
	public void insertBoard(BoardDto board){
		upPos();
		BoardManager.insertBoard(board);
	}
	
	public int updateBoard(BoardDto board,String pass){
		return BoardManager.updateBoard(board,pass);
	}
	public int deleteBoard(int seq,String storPass){
		return BoardManager.deleteBoard(seq,storPass);
	}
	@Override
	public String deleteView(int seq){
		String storPass = BoardManager.deleteView(seq);
		return storPass;
	}
	@Override
	public void replyBoard(BoardDto board) {
		BoardManager.replyboard(board);
	}
	@Override
	public void replyUpPos(BoardDto board){
		BoardManager.replyUpPos(board);
	}
}
