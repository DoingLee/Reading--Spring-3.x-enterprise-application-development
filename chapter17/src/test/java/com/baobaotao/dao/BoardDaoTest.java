package com.baobaotao.dao;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringBean;
import com.baobaotao.domain.Board;
import com.baobaotao.test.dataset.util.XlsDataSetBeanFactory;
public class BoardDaoTest extends BaseDaoTest{

	@SpringBean("boardDao")
	private BoardDao boardDao;

	/**
	 * 创建一个新的论坛版块
	 * 
	 * @param board
	 */

	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedBoards.xls")
	public void addBoard()throws Exception {
		//通过XlsDataSetBeanFactory数据集绑定工厂创建测试实体
		List<Board> boards  = XlsDataSetBeanFactory.createBeans(BoardDaoTest.class,"BaobaoTao.SaveBoards.xls", "t_board", Board.class);
		for(Board board:boards){
		    boardDao.save(board);
		}
	}
	
	/**
	 * 删除一个版块
	 * @param boardId
	 */

	@Test
	@DataSet("BaobaoTao.Boards.xls")//准备数据 
	@ExpectedDataSet("BaobaoTao.ExpectedBoards.xls")
	public void removeBoard(){
		Board board = boardDao.get(7);
		boardDao.remove(board);
	}
	
	@Test
	@DataSet("BaobaoTao.Boards.xls")//准备数据 
	public void getBoard(){
		Board board = boardDao.load(1);
		assertNotNull(board);
		assertThat(board.getBoardName(), Matchers.containsString("育儿"));
	}
}
