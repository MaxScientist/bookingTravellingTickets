package com.travelling.plain.repository;

import org.springframework.stereotype.Repository;
import com.travelling.plain.entity.Plain;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlainRepository extends JpaRepository<Plain, Long> {

}
