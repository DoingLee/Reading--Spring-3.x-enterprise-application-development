package com.baobaotao.service;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.metadata.CollectionMetadata;
import org.junit.Before;
import org.junit.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBean;

import com.baobaotao.domain.Board;
import com.baobaotao.domain.Post;
import com.baobaotao.domain.Topic;
import com.baobaotao.domain.User;
import com.baobaotao.test.dataset.util.XlsDataSetBeanFactory;

/**
 * BoardManager的测试类
 */
public class ForumServiceTest extends BaseServiceTest {
	@SpringBean("forumService")
	private ForumService forumService;

	@SpringBean("userService")
	private UserService userService;
	
	@Before
	public void init(){
		SessionFactory sf  = hibernateTemplate.getSessionFactory();
		Map<String, CollectionMetadata> roleMap = sf.getAllCollectionMetadata();
		for (String roleName : roleMap.keySet()) {
			sf.evictCollection(roleName);
		}
		Map<String, ClassMetadata> entityMap = sf.getAllClassMetadata();
		for (String entityName : entityMap.keySet()) {
			sf.evictEntity(entityName);
		}
		sf.evictQueries();
	}

	/**
	 * 测试新增一个版块
	 */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
	public void addBoard() throws Exception {
		Board board = XlsDataSetBeanFactory.createBean(ForumServiceTest.class,
				"BaobaoTao.DataSet.xls", "t_board", Board.class);

		forumService.addBoard(board);
		Board boardDb = forumService.getBoardById(board.getBoardId());
		assertThat(boardDb.getBoardName(), equalTo("育儿"));
	}

	/**
	 * 测试新增一个主题帖子
	 */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
	public void addTopic() throws Exception {
		Topic topic = XlsDataSetBeanFactory.createBean(ForumServiceTest.class,
				"BaobaoTao.DataSet.xls", "t_topic", Topic.class);
		User user = XlsDataSetBeanFactory.createBean(ForumServiceTest.class,
				"BaobaoTao.DataSet.xls", "t_user", User.class);
		topic.setUser(user);

		forumService.addTopic(topic);

		Board boardDb = forumService.getBoardById(1);
		User userDb = userService.getUserByUserName("tom");
		assertThat(boardDb.getTopicNum(), is(1));
		assertThat(userDb.getCredit(), is(110));
		assertThat(topic.getTopicId(), greaterThan(0));
	}

	/**
	 * 测试删除帖子
	 */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
	// 准备验证数据
	public void removeTopic() {
		forumService.removeTopic(1);
		Topic topicDb = forumService.getTopicByTopicId(1);
		assertNull(topicDb);
	}

	/**
	 * 测试添加回复帖子
	 * 
	 */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
	public void addPost() throws Exception {
		Post post = XlsDataSetBeanFactory.createBean(ForumServiceTest.class,
				"BaobaoTao.DataSet.xls", "t_post", Post.class);
		User user = XlsDataSetBeanFactory.createBean(ForumServiceTest.class,
				"BaobaoTao.DataSet.xls", "t_user", User.class);
		Topic topic = new Topic();
		topic.setTopicId(1);
		post.setUser(user);
		post.setTopic(topic);
		forumService.addPost(post);
		
		User userDb = userService.getUserByUserName("tom");
		Topic topicDb = forumService.getTopicByTopicId(1);
		
		assertThat(post.getPostId(), greaterThan(1));
		assertThat(userDb.getCredit(), equalTo(105));
		assertThat(topicDb.getReplies(), equalTo(2));
	}
	
    /**
     * 测试删除回复帖子的方法
     */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
    public void removePost()
    {
		forumService.removePost(1);
		
		Post postDb = forumService.getPostByPostId(1);
		User userDb = userService.getUserByUserName("tom");
		Topic topicDb = forumService.getTopicByTopicId(1);
		
		assertNull(postDb);
	    assertThat(userDb.getCredit(), equalTo(80));
	    assertThat(topicDb.getReplies(), equalTo(0));
    }

    /**
     * 测试置精华主题帖的服务方法
     */
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
    public void makeDigestTopic()throws Exception
    {
		forumService.makeDigestTopic(1);
		User userDb = userService.getUserByUserName("tom");
		Topic topicDb = forumService.getTopicByTopicId(1);
	    assertThat(userDb.getCredit(), equalTo(200));
	    assertThat(topicDb.getDigest(), equalTo(Topic.DIGEST_TOPIC));
    }
	
	
	
	@Test
	@DataSet("BaobaoTao.DataSet.xls")
	public void addBoardManager(){
	    forumService.addBoardManager(1,"tom");
		User userDb = userService.getUserByUserName("tom");
	    assertThat(userDb.getManBoards().size(), greaterThan(0));
	}

}
