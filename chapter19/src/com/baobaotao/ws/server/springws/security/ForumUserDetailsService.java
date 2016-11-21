

package com.baobaotao.ws.server.springws.security;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.*;


public class ForumUserDetailsService implements UserDetailsService {
    private static final Map<String,String> pwMockDB = new HashMap();
        static{
            pwMockDB.put("tom", "123456");
            pwMockDB.put("john", "123456");
            pwMockDB.put("katty", "123456");
            pwMockDB.put("mike", "123456");
        }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
         if(pwMockDB.get(username)!=null){
               return new ForumUserDetails(username,pwMockDB.get(username));
         }else{
               throw new UsernameNotFoundException("当前用户："+username+"未授权！");
         }
    }

}
