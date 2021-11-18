package com.example.jsonb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jsonb.entity.EventLog;

public interface EventLogRepository extends JpaRepository<EventLog, Long> {

}
