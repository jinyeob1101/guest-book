package com.jin.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jin.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Long> {

}