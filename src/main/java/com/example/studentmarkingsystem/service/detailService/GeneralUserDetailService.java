package com.example.studentmarkingsystem.service.detailService;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("generalUserDetailsService")
public class GeneralUserDetailService implements UserDetailsService {

    private final UserDetailsService adminDetailsService;
    private final UserDetailsService teacherDetailsService;
    private final UserDetailsService parentDetailsService;
    private final UserDetailsService studentDetailsService;

    public GeneralUserDetailService(
            @Qualifier("adminDetailsService") UserDetailsService adminDetailsService,
            @Qualifier("teacherDetailsService") UserDetailsService teacherDetailsService,
            @Qualifier("parentDetailsService") UserDetailsService parentDetailsService,
            @Qualifier("studentDetailsService") UserDetailsService studentDetailsService) {
        this.adminDetailsService = adminDetailsService;
        this.teacherDetailsService = teacherDetailsService;
        this.parentDetailsService = parentDetailsService;
        this.studentDetailsService = studentDetailsService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = null;

        try {
            userDetails = adminDetailsService.loadUserByUsername(username);
            return userDetails;
        } catch (UsernameNotFoundException e) {
        }

        try {
            userDetails = teacherDetailsService.loadUserByUsername(username);
            return userDetails;
        } catch (UsernameNotFoundException e) {
        }

        try {
            userDetails = parentDetailsService.loadUserByUsername(username);
            return userDetails;
        } catch (UsernameNotFoundException e) {
        }

        try {
            userDetails = studentDetailsService.loadUserByUsername(username);
            return userDetails;
        } catch (UsernameNotFoundException e) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        //return userDetails;
    }
}

