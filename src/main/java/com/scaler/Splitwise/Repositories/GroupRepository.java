package com.scaler.Splitwise.Repositories;

import com.scaler.Splitwise.Models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    @Override
    Optional<Group> findById(Long aLong);

    Group findByName(String name);
}
