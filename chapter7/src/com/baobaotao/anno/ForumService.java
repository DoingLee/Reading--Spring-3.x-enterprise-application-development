package com.baobaotao.anno;

public class ForumService {
	//一个成员的注解可以省略成员名和赋值符号
    @NeedTest(true)
	public void deleteForum(int forumId){
		System.out.println("删除论坛模块："+forumId);
	}
    /**
     * 
     * @param topicId
     */
    @NeedTest(true)
    public void deleteTopic(int topicId){
		System.out.println("删除论坛主题："+topicId);
	}	
}
