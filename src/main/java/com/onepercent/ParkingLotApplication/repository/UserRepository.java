package com.onepercent.ParkingLotApplication.repository;


import com.onepercent.ParkingLotApplication.domain.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by linyuan on 2017/12/8.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByName(String name);

    List<User> findAllByName(String content,Sort sort);

    List<User> findAllByEmail(String content,Sort sort);

    List<User> findAllByPhone(String content,Sort sort);

    List<User> findAllByUserName(String content,Sort sort);

    List<User> findAllById(Integer id,Sort sort);
}
