# Ejercicio 02: Sistema de Menuda de Restaurantes
## Historia de usuario

Una empresa quiere crear un sistema para restaurantes que permita generar menús completos según el tipo de restaurante.

El sistema debe soportar diferentes estilos de restaurante:

    Restaurante peruano
    Restaurante italiano
    Restaurante japonés

Cada restaurante debe poder crear una familia de productos relacionados:

    Entrada
    Plato principal
    Bebida

La idea es que el cliente pueda elegir un tipo de restaurante y el sistema genere automáticamente un menú completo de esa familia, sin mezclar productos de otros restaurantes.

Por ejemplo, si se elige restaurante peruano, el sistema podría crear:

    Entrada peruana
    Plato principal peruano
    Bebida peruana

Pero no debería mezclar:

    Entrada peruana
    Plato principal italiano
    Bebida japonesa
## Requerimientos del ejercicio

Debes aplicar Abstract Factory para crear familias de menús.

### Productos abstractos

Debes tener abstracciones para:

    Entrada
    PlatoPrincipal
    Bebida

Cada uno puede tener un método simple como:

    void mostrar();

o algo parecido.

### Productos concretos

Debes crear productos concretos para cada familia.

#### Familia peruana
    EntradaPeruana
    PlatoPrincipalPeruano
    BebidaPeruana
#### Familia italiana
    EntradaItaliana
    PlatoPrincipalItaliano
    BebidaItaliana
#### Familia japonesa
    EntradaJaponesa
    PlatoPrincipalJapones
    BebidaJaponesa
## Fábrica abstracta

Debe existir una fábrica abstracta que defina métodos como:

    crearEntrada()
    crearPlatoPrincipal()
    crearBebida()

La fábrica no debe saber si se trata de comida peruana, italiana o japonesa.

## Fábricas concretas

Debes tener una fábrica para cada tipo de restaurante:

    RestaurantePeruanoFactory
    RestauranteItalianoFactory
    RestauranteJaponesFactory

Cada fábrica debe crear solamente productos de su propia familia.

## Mayor dificultad respecto al ejercicio 1

En este ejercicio ya no tienes solo dos familias, sino tres familias completas.

Además, te recomiendo agregar una clase cliente como:

    ClienteRestaurante

o:

    SistemaMenu

Esa clase debe recibir una fábrica abstracta y generar el menú completo.

La idea es que esa clase no sepa si está usando una fábrica peruana, italiana o japonesa.

## Lo que debes entregar primero

Para este ejercicio, comienza otra vez con el diagrama de clases UML.

Tu diagrama debe mostrar:

    1. Productos abstractos
    2. Productos concretos
    3. Fábrica abstracta
    4. Fábricas concretas
    5. Cliente que usa la fábrica abstracta
## Pista importante

Tu sistema debería funcionar con esta lógica general:

    RestauranteFactory factory = new RestaurantePeruanoFactory();

    SistemaMenu menu = new SistemaMenu(factory);
    menu.mostrarMenu();

Pero el cliente también debería poder cambiar fácilmente a:

    RestauranteFactory factory = new RestauranteItalianoFactory();

o:

    RestauranteFactory factory = new RestauranteJaponesFactory();

sin modificar la lógica interna del sistema.

## Regla del ejercicio

No mezcles familias.

Es decir:

    RestaurantePeruanoFactory

solo debe crear:

    EntradaPeruana
    PlatoPrincipalPeruano
    BebidaPeruana

