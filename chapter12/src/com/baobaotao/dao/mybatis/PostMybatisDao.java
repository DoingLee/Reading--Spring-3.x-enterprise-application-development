package com.baobaotao.dao.mybatis;

import com.baobaotao.domain.Post;

public interface PostMybatisDao{
	void addPost(Post post);
	Post getPost(int postId);
}
