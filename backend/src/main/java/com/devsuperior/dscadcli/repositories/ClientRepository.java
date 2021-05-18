package com.devsuperior.dscadcli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscadcli.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
