package my.project.moneytransferservice.repository;

import my.project.moneytransferservice.model.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<CardEntity, Long> {
}
