package com.example.jsonb.service;

import java.util.List;

import com.example.jsonb.dto.EventLogDto;
import com.example.jsonb.service.exception.NotFoundException;

public interface EventLogService {
	
	EventLogDto save(EventLogDto eventLogDto);

	EventLogDto findById(Long id) throws NotFoundException;

	List<EventLogDto> findAll();
}
