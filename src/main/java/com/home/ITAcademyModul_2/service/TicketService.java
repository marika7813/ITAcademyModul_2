package com.home.ITAcademyModul_2.service;

import com.home.ITAcademyModul_2.models.Ticket;
import com.home.ITAcademyModul_2.repo.TicketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TicketService {

    @Autowired
    private TicketRepository repo;

    public List<Ticket> listAll() {
        return (List<Ticket>) repo.findAll();
    }

    public void save(Ticket ticket) {
        repo.save(ticket);
    }

    public Ticket get(Long id) {
        return repo.findById(Math.toIntExact(id)).get();
    }

    public void delete(Long id) {
        repo.deleteById(Math.toIntExact(id));
    }
}