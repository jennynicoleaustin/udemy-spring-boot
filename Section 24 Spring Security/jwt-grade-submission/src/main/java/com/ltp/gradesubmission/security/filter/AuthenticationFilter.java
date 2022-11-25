package com.ltp.gradesubmission.security.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ltp.gradesubmission.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    //    /login
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            User user = new ObjectMapper().readValue(request.getInputStream(), User.class);
            // Above takes in the body of the request, deserializes it and objectMapper maps the deserialized information to a user object.
            System.out.println(user.getUsername() + user.getPassword());
        } catch (IOException e) {
            throw new RuntimeException(); // you cannot handle an exception that occurs within a filter via the exception handler because authFilter occurs prior to the exception controller.
        }

        return super.attemptAuthentication(request, response);
    }

}
