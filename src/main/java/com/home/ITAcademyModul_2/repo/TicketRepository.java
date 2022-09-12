package com.home.ITAcademyModul_2.repo;

import com.home.ITAcademyModul_2.models.Ticket;

import org.springframework.data.repository.CrudRepository;



public interface TicketRepository extends CrudRepository <Ticket, Integer> {
}
