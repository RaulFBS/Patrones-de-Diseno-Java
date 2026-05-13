# Ejercicio 01: Sistema de Componentes UI por tema
## Historia de usuario

Una empresa está desarrollando una aplicación que puede trabajar con diferentes temas 
visuales. Actualmente necesita soportar dos temas:

    -   Tema claro
    -   Tema oscuro

Cada tema debe tener sus propios componentes visuales:

    -   Botón
    -   Caja de texto
    -   Checkbox

El sistema debe permitir crear estos componentes sin que el código 
principal sepa si está usando el tema claro o el tema oscuro.

## Requerimientos

Debes diseñar un sistema usando Abstract Factory donde:

    1. Exista una familia de productos para los componentes visuales.
    2. Cada producto debe tener una interfaz o clase abstracta.
    3. Deben existir componentes concretos para el tema claro.
    4. Deben existir componentes concretos para el tema oscuro.
    5. Debe existir una fábrica abstracta que defina la creación de los componentes.
    6. Deben existir fábricas concretas para cada tema.
    7. El cliente debe poder usar cualquier tema sin depender directamente de las clases concretas.
## Productos que debe crear la fábrica

Tu fábrica debe poder crear:

    crearBoton()
    crearCajaTexto()
    crearCheckbox()

Pero no te estoy dando todavía la estructura final. Tú debes plantearla.

## Familias esperadas
### Tema claro

Debe crear:

    -   Botón claro
    -   Caja de texto clara
    -   Checkbox claro
### Tema oscuro

Debe crear:

    -   Botón oscuro
    -   Caja de texto oscura
    -   Checkbox oscuro

## Lo que debes entregar primero

Para este primer ejercicio, empieza solo con el diagrama de clases UML.

No hagas todavía el código.

Tu diagrama debe mostrar:

    Interfaces o clases abstractas de productos
    Productos concretos
    Fábrica abstracta
    Fábricas concretas
    Clase cliente o clase principal que usa la fábrica
## Pistas sin darte la respuesta completa

Piensa así:

    Boton
    CajaTexto
    Checkbox

serían productos abstractos.

Luego tendrías versiones concretas como:

    BotonClaro
    BotonOscuro

Y una fábrica general que no sabe si está creando claro u oscuro, solo define qué métodos deben existir.

## Pregunta clave para que entiendas Abstract Factory

En Factory Method normalmente una clase decide qué objeto individual crear.

En Abstract Factory, una fábrica decide qué familia completa de objetos crear.

La diferencia principal es esta:

    Factory Method = crea un producto
    Abstract Factory = crea una familia de productos relacionados