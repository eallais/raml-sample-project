package com.company.sample.repository;

import java.util.HashMap;
import java.util.Map;

import com.company.sample.api.UserDetail;
import com.company.sample.api.definitions.Contact;

public final class UserRepository {
    
    private UserRepository() {
    }

    public static Map<Long, UserDetail> USERS = new HashMap<Long, UserDetail>() {
        private static final long serialVersionUID = 1L;
        {
            put((long) 1, new UserDetail()
                    .withUserId(1)
                    .withContact(new Contact()
                        .withFirstName("john")
                        .withLastName("doe")
                        .withEmail("john.doe@mail.com")));
            put((long) 2, new UserDetail()
                    .withUserId(2)
                    .withContact(new Contact()
                        .withFirstName("jane")
                        .withLastName("doe")
                        .withEmail("jane.doe@mail.com")));
            put((long) 3, new UserDetail()
                    .withUserId(3)
                    .withContact(new Contact()
                        .withFirstName("me")
                        .withLastName("myself")
                        .withEmail("and.i@mail.com")));
        }
    };
}
