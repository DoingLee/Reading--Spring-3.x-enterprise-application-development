package com.baobaotao.ws.server.springws.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class ForumUserDetails implements UserDetails {
    private String userName;
    private String password;
    public static final Collection<GrantedAuthority> GRANTED_AUTHORITIES =
            new ArrayList<GrantedAuthority>();

    {
        GRANTED_AUTHORITIES.add(new GrantedAuthorityImpl("ROLE_QUERY_AUTH"));
    }

    public ForumUserDetails(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Collection<GrantedAuthority> getAuthorities() {
        return GRANTED_AUTHORITIES;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.userName;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }


}
