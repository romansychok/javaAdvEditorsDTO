package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.owu.entity.User;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Integer> {

    @Query("from User u join fetch u.product")
    List<User> findAllWithProducts();

}
