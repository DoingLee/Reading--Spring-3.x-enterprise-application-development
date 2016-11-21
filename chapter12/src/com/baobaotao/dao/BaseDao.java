package com.baobaotao.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao<T> { 
	
   @Autowired	
   private HibernateTemplate hibernateTemplate;
   private Class entityClass;
   
   public BaseDao(){
    	Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class) params[0];
    }
   
    public T get(Serializable id){
    	return (T)hibernateTemplate.get(entityClass, id);
    }
    
    public void save(T entity){
    	hibernateTemplate.save(entity);
    }
    
    public void update(T entity){
    	hibernateTemplate.update(entity);
    }

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
    
}
