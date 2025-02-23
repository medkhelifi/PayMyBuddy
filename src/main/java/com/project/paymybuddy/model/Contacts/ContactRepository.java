package com.project.paymybuddy.model.Contacts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

Optional<Contact> findContactByUsers_Email(String email);


}