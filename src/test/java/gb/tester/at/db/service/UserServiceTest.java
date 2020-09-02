package gb.tester.at.db.service;

import gb.tester.at.db.mogel.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void registerNewUser(){

        User userNew = userService.registerNewUser("Petr", "petr@mail.ru");
        Assertions.assertNotNull("Petr");


    }


}