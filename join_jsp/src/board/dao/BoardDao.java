package board.dao;

import java.util.List;
import board.dto.BoardDto;

public interface BoardDao {
	//select절로 dto에서 하나씩 가져오지만 여러개를 뽑아와야되니 배열형식으로 사용
	public List<BoardDto> boardList(String keyfield, String keyword);
	
	//preView는 select절이지만 Ajax기능으로 dto를 쓰지않음
	public String preView(int seq);
	
	//select절로 dto에서 시뭔스로 하나씩 가져옴
	public BoardDto findBySeq(int seq);
	public BoardDto viewContent(int seq);
	
	//update부분으로 글수정이 성공되면 번호 부여 int, 글에해당하는 board, 패스워드 pass
	public int updateBoard(BoardDto board, String pass);

	//delete절로 deleteBoard는 삭제후 성공되면 번호를 부여하기위해 int , deleteView는 삭제후 넘어가는 화면
	public String deleteView(int seq);
	public int deleteBoard(int seq, String storPass);
	
	public void insertBoard(BoardDto board);
	public void replyBoard(BoardDto board);
	public void replyUpPos(BoardDto board);
	
}
