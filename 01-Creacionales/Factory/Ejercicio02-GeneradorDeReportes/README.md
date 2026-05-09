# Ejercicio 02 - Generador De Reportes

## Patrón utilizado 
Factory Method

## Historia de usuario
Como usuario de un sistema administrativo,
quiero generar reportes en diferentes
formatos para poder exportar la información según
mis necesidades.
El sistema debe permitir generar reportes en:
-      PDF, Excel y Word
Cada tipo de reporte debe tener su propia forma
de generarse, pero el sistema debe trabajar con
una estructura común para todos.

## Solicitud del cliente
Necesito un sistema que permita generar reportes
. Actualmente solo se necesitan reportes en 
PDF, Excel y Word, pero en el futuro se podrían agregar otros formatos como HTML o CSV.

El sistema no debe depender directamente de las
clases concretas de cada reporte. Quiero que cada
tipo de reporte tenga su propia fábrica encargada
de crear el reporte correspondiente.

## Requisitos
Debe crear una solución usando Factory Method.
Tu sistema debe tener:

- Una interfaz o clase abstracta para Reporte
- Clases concretas para cada tipo de reporte
- Una clase creadora abstracta
- Fábricas concretas para cada formato de reporte
- Una clase Main para probar el funcionamiento

## Reto Extra
Agrega después un nuevo tipo de reporte