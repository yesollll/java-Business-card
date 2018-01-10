package board.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import board.dto.BoardDto;

public class BoardManager {

	// 빌더와 같이 사용되는 구문
	// reader로 mybatis폴더의 sqlmapConfig.xml파일을 읽어드리고 
	// 팩초리 내용이 들어있는 sqlMapper를 build(reader)로 저장
	private static SqlSessionFactory sqlMapper;
	static{
		try{
			Reader reader = Resources.getResourceAsReader("board.mybatis/sqlmapConfig.xml");
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException err){
			throw new RuntimeException("SQL세션팩토리 인스턴스 생성 실패"+err,err);
		}
	}
	
	public static List<BoardDto> boardList(String keyfield, String keyword){
		List<BoardDto> list = null;		//list초기화
		//sql문을 실행하는 메소드 제공
		SqlSession session = sqlMapper.openSession();
		//null값이나 공백이 있다면 
		if(keyfield != null && keyword != null && keyfield != "" && keyword != ""){
			Map<String, String> map = new HashMap<String, String> ();
			//map에 key와 value값을 객체로 저장
			map.put("keyfield", keyfield);
			map.put("keyword", keyword);
			//검색을 하기 위해 list 를 select한다
			list = session.selectList("boardSearch", map);
			session.close();
			return list;
		//null값이나 공백이 있으면 boardList를 그냥 출력하는 정보를 list로 리턴
		}else{
			list = session.selectList("boardList");
			session.close();
			return list;
		}
	}
	//boarddto의 정보중 fingbyseq를 seq값에 저장한 것을 하나만 골라 board에 저장
	public static BoardDto findBySeq(int seq){
		SqlSession session = sqlMapper.openSession();
		BoardDto board = session.selectOne("findBySeq",seq);
		session.close();
		return board;
	}
	public static String preView(int seq){
		SqlSession session = sqlMapper.openSession();
		String content = session.selectOne("preView",seq);
		System.out.println(content);
		session.close();
		return content;
	}
	
	public static void readCount(int seq){
		SqlSession session = sqlMapper.openSession();
		session.update("readCount",seq);
		session.commit();
		session.close();
	}
	public static void upPos(){
		SqlSession session = sqlMapper.openSession();
		session.update("upPos");
		session.commit();
		session.close();
	}
	//select는 commit이 필요없기 때문에 select구절에는 사용안함.
	public static void insertBoard(BoardDto board){
		SqlSession session = sqlMapper.openSession();
		session.insert("insertBoard",board);
		session.commit();
		session.close();
	}
	public static int updateBoard(BoardDto board, String pass){
		SqlSession session = sqlMapper.openSession();
		Map<String, Object> map = new HashMap<String, Object> ();
		map.put("board", board);
		map.put("password", pass);
		int result = session.update("updateBoard", map);
		session.commit();
		session.close();
		return result;
	}
	public static int deleteBoard(int seq, String storPass){
		SqlSession session = sqlMapper.openSession();
		Map map = new HashMap();
		System.out.println("seq : storPass = " + seq + ":" + storPass);
		map.put("seq", seq);
		map.put("storPass", storPass);
		int result = session.delete("deleteBoard", map);
		session.commit();
		session.close();
		return result;
	}
	public static String deleteView(int seq){
		SqlSession session = sqlMapper.openSession();
		String storPass = session.selectOne("deleteView",seq);
		session.close();
		return storPass;
	}
	public static void replyboard(BoardDto board){
		SqlSession session = sqlMapper.openSession();
		int result = session.insert("replyboard",board);
		session.commit();
		session.close();
	}
	public static void replyUpPos(BoardDto board){
		SqlSession session = sqlMapper.openSession();
		session.update("replyUpPos",board);
		session.commit();
		session.close();
	}
}
