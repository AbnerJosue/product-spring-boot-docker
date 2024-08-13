# Ejecutar Proyecto

1. Tener instalado Java JDK
2. Instalar sus dependencias
3. Realizar el siguiente comando ```docker build -t spring-products:latest . ```
4. Ejecutar ``` docker run -p 8081:8080 spring-products:latest ```

5. 
|CRUD | APIS | TYPE|
|--|--|--| 
| 1 | http://localhost:8080/api/products/update-product/2  | UPDATE
| 2| http://localhost:8080/api/products/all | GET
| 3| http://localhost:8080/api/products/remove/2  | DELETE
| 4| http://localhost:8080/api/products/add  | GET
| 5| http://localhost:8080/api/products/3  | GET BY ONE
