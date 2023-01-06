package com.devsuperior.desafiocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafiocrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
