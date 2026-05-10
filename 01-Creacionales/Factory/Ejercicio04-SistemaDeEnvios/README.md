# Ejercicio 04 - Sistema de envíos de pedididos
## Historia de usuario
Como cliente de una tienda online, quiero elegir diferentes
tipos de envío para recibir mi pedido según mi 
urgencia, ubicación y costo.

El sistema debe pedir trabajar con estos tipos de envío.

    - Envío estándar
    - Envío express
    - Envío internacional
    - Envío recojo en tienda
Cada tipo de envío debe calcular o mostrar el
proceso de envío de forma diferente.

---
## Solicitud del cliente
Necesito un sistema que gestione envíos de pedidos. 
Actualmente, existen cuatro formas de envío, pero en el futuro se podrían
agregar nuevas opciones como envío por motorizado,
envío programado o envío gratuito.
No quiero que el sistema principal cree directamente
las clases concretas de envío. Cada tipo de envío
debe tener su propia fábrica.
---
## Requisitos usando Factory Method
    -Una interfaz o clase abstracta Envio
    -Clases concretas para cada tipo de envío
    -Una clase creadora abstracta EnvioCreator
    -Fábricas concretas para cada tipo de envío
    -Una clase PedidoEnvio para guardar los datos del pedido
    -Una clase Main para probar
---    
## Clase adicional obligatoria
Debes crear una clase llamada:

    PedidoEnvio
Esta clase debe tener atributos como:
    
    String cliente;
    String direccion;
    double pesoKg;
    double costoProducto;
---
## Validaciones obligatorias
Antes de procesar el envío, el sistema debe validar:
    
    El cliente no debe estar vacio
    La dirección no debe estar vacía
    El peso debe ser mayor a 0.
    El costo del producto debe ser mayor a 0.
Si algún dato está mal, no se procesa el envío.

---
## Nivel extra
Agrega una validación especial:
    
    -Si el envio es internacional, el peso no puede ser
    mayor a 30kg

