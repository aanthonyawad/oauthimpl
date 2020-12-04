package com.awad.anthony.security.config;


import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return  MD5Encoder.encode(rawPassword.toString().getBytes());
        

    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return  MD5Encoder.encode(rawPassword.toString().getBytes())
                .equals(encodedPassword);
    }

}