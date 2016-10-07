package com.company.sample.resource;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.sample.api.UserDetail;
import com.company.sample.repository.UserRepository;

@RestController
public class UserResource {

    @RequestMapping(value = "/users", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<UserDetail> getUserList() {
        return UserRepository.USERS.values();
    }

    @RequestMapping(value = "/users/{user_id}", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDetail getUserDetail(@PathVariable("user_id") Long managerId) {
        return UserRepository.USERS.get(managerId);
    }
}