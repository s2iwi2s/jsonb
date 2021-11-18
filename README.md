# jsonb
Implementing postgres jsonb

### EventLogDTO
```
{
	data: <string/json>
}
```

### POST http://localhost:8080/save
#### Request
```
EventLogDTO
```

#### Response
```
EventLogDTO
```

### GET http://localhost:8080/findById/{id}

#### Response
```
EventLogDTO
```

### GET http://localhost:8080/findAll

#### Response
```
[EventLogDTO]
```