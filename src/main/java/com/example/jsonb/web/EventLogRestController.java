package com.example.jsonb.web;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonb.dto.EventLogDto;
import com.example.jsonb.service.EventLogService;
import com.example.jsonb.service.exception.NotFoundException;


@RestController
public class EventLogRestController {

	private EventLogService eventLogService;

	public EventLogRestController(EventLogService eventLogService) {
		this.eventLogService = eventLogService;
	}

	@PostMapping("/save")
	ResponseEntity<?> save(@RequestBody EventLogDto eventLogDto) {
		return ok(eventLogService.save(eventLogDto));
	}

	@GetMapping("/findById/{id}")
	ResponseEntity<?> findById(@PathVariable("id") Long id) throws NotFoundException {
		return ok(eventLogService.findById(id));
	}

	@GetMapping("/findAll")
	ResponseEntity<?> findAll() {
		return ok(eventLogService.findAll());
	}
}
