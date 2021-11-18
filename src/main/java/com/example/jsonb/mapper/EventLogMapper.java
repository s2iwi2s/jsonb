package com.example.jsonb.mapper;

import org.mapstruct.Mapper;

import com.example.jsonb.dto.EventLogDto;
import com.example.jsonb.entity.EventLog;

@Mapper(componentModel = "spring", uses = {})
public interface EventLogMapper extends EntityMapper<EventLogDto, EventLog>{
	
}
