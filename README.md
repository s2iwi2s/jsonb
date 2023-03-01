# jsonb
Implementing postgres jsonb

### EventLogDTO
```
{
	data: <string/json>
}
```

#### Sample Data 
```
{
    "data" : {
        "name": "Someone",
        "age": 44,
        "address": "Mem"
    }
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

### Object hash Sample code
```
    private static String getHash(Object object) throws IOException, NoSuchAlgorithmException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(object);
        oos.flush();
        MessageDigest md = MessageDigest.getInstance(HASH_ALGORITHM);
        md.update(bos.toByteArray());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest);
    }
```
