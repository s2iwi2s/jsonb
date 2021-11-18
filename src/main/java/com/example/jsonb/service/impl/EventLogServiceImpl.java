package com.example.jsonb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.jsonb.dto.EventLogDto;
import com.example.jsonb.entity.EventLog;
import com.example.jsonb.mapper.EventLogMapper;
import com.example.jsonb.repository.EventLogRepository;
import com.example.jsonb.service.EventLogService;
import com.example.jsonb.service.exception.NotFoundException;

@Service
public class EventLogServiceImpl implements EventLogService {

	private EventLogRepository eventLogRepository;
	private EventLogMapper eventLogMapper;

	public EventLogServiceImpl(EventLogRepository eventLogRepository, EventLogMapper eventLogMapper) {
		this.eventLogRepository = eventLogRepository;
		this.eventLogMapper = eventLogMapper;
	}

	@Override
	public EventLogDto save(EventLogDto eventLogDto) {
		EventLog eventLog = eventLogMapper.toEntity(eventLogDto);
		return eventLogMapper.toDto(eventLogRepository.save(eventLog));
	}

	@Override
	public EventLogDto findById(Long id) throws NotFoundException {
		Optional<EventLog> eventLogOptional = eventLogRepository.findById(id);
		if (eventLogOptional.isPresent()) {
			return eventLogMapper.toDto(eventLogOptional.get());
		} else {
			throw new NotFoundException("EventLog not found: " + id);
		}

	}

	@Override
	public List<EventLogDto> findAll() {
		return eventLogMapper.toDto(eventLogRepository.findAll());
	}

}
