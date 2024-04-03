package jmauriciorlima.github.portfolio.repository;

import jmauriciorlima.github.portfolio.model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContactRepository extends JpaRepository<ContactModel, UUID> {
}
