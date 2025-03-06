Parcial-CAE

Este es un aplicativo desarrollado con Spring Boot, JPA, MySQL (usando Docker) y Adminer para la gestión de ventas. Permite realizar operaciones CRUD sobre las entidades User, Product, Customer, MeansOfPayment y SalesBox.
Tecnologías utilizadas

    Java 17
    Spring Boot 3+
    Spring Data JPA
    MySQL (en Docker)
    Docker Compose
    Adminer (para gestión de la BD)

Instalación y configuración
1️⃣ Clonar el repositorio

git clone https://github.com/JuanCorrea4/Parcial-CAE.git
cd Parcial-CAE

2️⃣ Levantar los contenedores de MySQL y Adminer

Ejecuta el siguiente comando en la raíz del proyecto para iniciar los servicios en Docker:

docker compose up -d

✅ Esto iniciará:

    MySQL en el puerto 5500
    Adminer en el puerto 8000

Para acceder a Adminer, abre en tu navegador:
http://localhost:8000
Credenciales:

    Servidor: db
    Usuario: root
    Contraseña: 23202183A6A5FB

3️⃣ Configurar la base de datos en application.properties

Verifica que src/main/resources/application.properties tenga esta configuración:

spring.datasource.url=jdbc:mysql://localhost:5500/parcial?serverTimezone=UTC&createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=23202183A6A5FB
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

4️⃣ Ejecutar la aplicación

Puedes ejecutar el proyecto con:

./mvnw spring-boot:run

O en Visual Studio Code usando el botón de Run.

La API estará disponible en:
http://localhost:4500
Endpoints disponibles
1️⃣ User (Usuarios)

Crear usuario
POST /api/user/newUser

{
  "name": "Juan Pérez",
  "email": "juanperez@example.com"
}

Obtener todos los usuarios
GET /api/user/getAllUsers
2️⃣ Product (Productos)

Crear producto
POST /api/product/newProduct

{
  "name": "Laptop",
  "price": 1500.0
}

Obtener todos los productos
GET /api/product/getAllProducts
3️⃣ Customer (Clientes)

Crear cliente
POST /api/customer/newCustomer

{
  "name": "Carlos Ramírez"
}

Obtener todos los clientes
GET /api/customer/getAllCustomers
4️⃣ MeansOfPayment (Medios de pago)

Crear medio de pago
POST /api/payment/newPayment

{
  "type": "Tarjeta de crédito"
}

Obtener todos los medios de pago
GET /api/payment/getAllPayments
5️⃣ SalesBox (Ventas)

Registrar venta
POST /api/salesbox/newSalesBox

{
  "user": { "id": 1 },
  "customer": { "id": 2 },
  "products": [
    { "id": 3 },
    { "id": 4 }
  ],
  "meansOfPayment": { "id": 1 }
}

Obtener todas las ventas
GET /api/salesbox/getAllSalesBoxes
 Solución de problemas
 Error de conexión a MySQL

Si la aplicación no puede conectarse a la base de datos, asegúrate de que el contenedor de MySQL esté corriendo:

docker ps

Si no aparece mysql_parcial, reinicia los contenedores:

docker compose down
docker compose up -d

 La aplicación no inicia en el puerto 4500

Asegúrate de que ningún otro servicio está usando ese puerto:

netstat -ano | findstr :4500

Si hay conflicto, cambia el puerto en application.properties y reinicia.
