package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

/*    @Override
    @Query("Select u from User u left join fetch u.roles where u.id=:id")
    User getById(@Param("id") Integer integer);*/
}
