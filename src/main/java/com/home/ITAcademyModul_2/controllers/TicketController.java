package com.home.ITAcademyModul_2.controllers;

import com.home.ITAcademyModul_2.models.Ticket;
import com.home.ITAcademyModul_2.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TicketController {

    @Autowired
    private TicketService service;

    /**
     * Метод извлечения/отобраажения всех залоговых билетов
     * @return список всех задач
     */
    @GetMapping("/tickets")
    public List<Ticket> list() {
        return service.listAll();
    }

    /**
     * Метод извлечения/отобраажения залогового билета по id
     * @param id - id залогового билета
     * @return один залоговый билет по id
     */
    @GetMapping(value = "/tickets/{id}")
    public ResponseEntity<Ticket>read(@PathVariable(name="id") Long id){
        final Ticket ticket = service.get(id);
        return ticket != null ?
                new ResponseEntity<>(ticket,HttpStatus.OK):
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Метод для добавления/вставки нового залогового билета
     * @param ticket - залоговый билет
     */
    @PostMapping("/tickets")
    public void add(@RequestBody Ticket ticket) {
        service.save(ticket);
    }

    /**
     * Метод для обновления залогового билета по id
     * @param ticket - залоговый билет
     * @param id - id залогового билета
     * @return -
     */
    @PutMapping("/tickets/{id}")
    public ResponseEntity<?> update(@RequestBody Ticket ticket, @PathVariable Long id) {
        try {
            Ticket existTicket = service.get(id);
            service.save(ticket);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
//Приложение создано и принадлежит Киселевой Марии Александровне GitHub marika7813
    /**
     * Метод для удаления залогового билета по id
     * @param id - id залогового билета
     */
    @DeleteMapping("/tickets/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}


