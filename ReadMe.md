**1) GET - http://localhost:8080/api/getAllProducts** 

**Test Response** 


[
    {
        "id": 1,
        "name": "laptop",
        "availableQuantity": 2,
        "price": 45900.0
    },
    {
        "id": 2,
        "name": "mobile",
        "availableQuantity": 5,
        "price": 7999.0
    },
    {
        "id": 3,
        "name": "smart watch",
        "availableQuantity": 0,
        "price": 2999.0
    }
]


 **2 POST - http://localhost:8080/api/placeOrder**
 
 Request Payload   
 {
     "orderDescription": "Test Order Description",
     
     "cartItems": [
         {
             "productId": 1,
             "quantity": 2
         },
         {
             "productId": 3,
             "quantity": 7
         }
     ],
     "customerEmail": "abcd@gmail.com",
     "customerName": "Anand Dubey"
 }
 
 **Response** 
 
 
  {
      "amount": 109794.0,
      "invoiceNumber": 679,
      "date": "22-07-2022 23:16:40",
      "orderId": 1,
      "orderDescription": "This order is for my friend's Marriage"
  }
  
  **3 GET - http://localhost:8080/api/getOrder/3**
  
  Response
  
  {
      "id": 3,
      "orderDescription": "This order is for my friend's Marriage",
      
      "customer": {
          "id": 2,
          "name": "Anand Dubey",
          "email": "anand@gmail.com"
      },
      "cartItems": [
          {
              "id": 4,
              "productId": 1,
              "productName": "laptop",
              "quantity": 1,
              "amount": 45900.0
          }
      ]
  }