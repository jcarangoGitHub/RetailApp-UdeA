"# RetailApp-UdeA" 
La imagen que representa la solución desarrollada se llama DiseñoRetailApp.jpg

Para correr la solución se deben ejecutar los siguientes proyectos:
1. SalesAPI (Proyecto maven)
2. Crm (Proyecto maven)
3. Retailapigateway (Proyecto gradle)
4. Debtor (proyecto maven que representa el sistema de cartera)
5. Provider (proyecto gradle que representa el sistema de Proveedores)

Para registrar una venta:
Hacer petición post a http://localhost:1100/retail/sale
application/json
body de ejemplo:
{
 "date": "2018-08-01T09:12:33.001Z",
 "id": "v12345",
 "orderId": "o12345",
 "salesmanId": "s12345",
 "value": 10000
}
Luego de este consumo en la consola de Crm, debtor y provider se debe visualizar la venta creada

Para registrar una devolución:
Hacer petición post a http://localhost:1100/retail/refund
application/json
body de ejemplo:
{
  "date": "2018-08-08T08:45:45.001Z",
  "id": "d12345",
  "saleId": "v12345",
  "value": 5000
}
Luego de este consumo en la consola de debtor se debe visualizar la devolución

Para consultar un cliente:
Hacer petición GET a http://localhost:1100/retail/client/{id}
application/json
Sin body

Integrantes:
Juan Camilo Arango
Diana Ciro
Sebastián Peláez
Alejandro Berrio
Juan Camilo Gaviria
