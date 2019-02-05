package com.springexample.repository;

import com.springexample.model.Canal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Long> {

}
