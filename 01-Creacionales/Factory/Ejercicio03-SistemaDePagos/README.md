# Ejercicio 03 - Sistema De Pagos

## Historia de Usuario
Como cliente de una tienda online, quiero pagar
mi compra usando diferentes métodos de pago para
poder escoger la opción que más me convenga.

El sistema debe permitir pagar con:

-       Tarjeta de crédito; Yape; PayPal; Transferencia bancaria
Cada método de pago debe tener una forma distina de procesar
el pago.

## Solicitud del cliente
Necesito un sistema que procese pagos de una
tienda online. Actualmente aceptamos tarjeta,
yape, paypal y transferencia bancaria.

En el futuro queremos agregar otros métodos como
Plin, Apple Pay o pago contra entrega, por eso el
sistema no debe depender directamente de clases
concretas.

Cada método de pago debe tener su propia fábrica.

## Requisitos usando Factory Method
    -Una interfaz o clase abstracta MetodoPago
    -Clases concretas para cada método de pago
    -Una clase creadora abstracta PagoCreator
    -Fábricas concretas para cada método de pago
    -Una clase Main para probar

## Métodos mínimos
La interfaz MetodoPago debe tener algo parecido a:

    -procearPago(dobule monto)

cada clase concreta debe mostrar un mensaje diferente.

## Nivel extra del ejercicio
Agregar una validación:

    -Si el monto es menor o igual a 0, no se debe procesar el pago.

