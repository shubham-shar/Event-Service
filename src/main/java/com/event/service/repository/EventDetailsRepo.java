package com.event.service.repository;


import com.event.service.model.EventDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDetailsRepo extends JpaRepository<EventDetails, Long> {


}
