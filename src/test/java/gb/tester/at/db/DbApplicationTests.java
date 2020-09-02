package gb.tester.at.db;

import gb.tester.at.db.mogel.User;
import gb.tester.at.db.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class DbApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        User one = userRepository.getOne(1L);
        Assertions.assertEquals("Ivan", one.getName());
       // List<User> nameSortUser = userRepository.findAll(Sort.by("name"));  сортировка по столбцу
        List<User> all = userRepository.findAllByNameContaining("Ivan");
        Assertions.assertEquals(1,all.size());


    }

}
