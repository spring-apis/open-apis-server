# Getting Started

### Reference Documentation

Sample API Implementations using open API maven plugin and vertical slice implementation style  https://en.wikipedia.org/wiki/Vertical_slice

- POST /customers [**createCustomer**]

  #### sample request 

```json
{
  "customerId": 1,
  "name": "Shashank Singh",
  "location": "New Jersey USA",
  "email": "ultradev.nitc@gmail.com",
  "address": "422 Robert Street",
  "status": false
}
```

#### sample response

```json
{
    "id": 5,
    "customerId": 1,
    "name": "Shashank Singh",
    "location": "New Jersey USA",
    "email": "ultradev.nitc@gmail.com",
    "address": "422 Robert Street",
    "status": false
}
```

`refer customer.postman_collection.json for postman request`
