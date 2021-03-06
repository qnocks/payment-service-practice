package com.itransition.payment.auth.repository;

import com.itransition.payment.auth.entity.Session;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {

    Optional<Session> findByUserId(Long id);

    void deleteByUserId(Long id);

    Boolean existsByUserId(Long id);
}
