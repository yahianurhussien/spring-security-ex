package spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserId(int userId);
}
