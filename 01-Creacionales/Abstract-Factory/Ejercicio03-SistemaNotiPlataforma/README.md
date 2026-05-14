# Ejercicio 03: Sistema de notificacion por plataforma
## Historia de usuario

Una empresa quiere crear un sistema de notificaciones que funcione en diferentes plataformas.

El sistema debe poder enviar notificaciones por:

    Android 
    iOS
    Web

Cada plataforma tiene su propia familia de componentes para notificar al usuario:

    Notificación
    Sonido
    Icono

La idea es que si el sistema usa la fábrica de Android, todo lo que se cree pertenezca a Android:

    Notificación Android
    Sonido Android
    Icono Android

Y no se mezclen elementos como:

    Notificación Android
    Sonido iOS
    Icono Web
## Objetivo del ejercicio

Aplicar Abstract Factory para crear familias de elementos de notificación según la plataforma.

### Productos abstractos

Debes crear abstracciones para:

    Notificacion
    Sonido
    Icono

Cada uno puede tener métodos como:

    void mostrar();

Pero esta vez quiero que uses nombres más específicos.

Por ejemplo:

    Notificacion -> enviar()
    Sonido -> reproducir()
    Icono -> mostrar()
### Productos concretos
#### Familia Android
    NotificacionAndroid
    SonidoAndroid
    IconoAndroid
#### Familia iOS
    NotificacionIOS
    SonidoIOS
    IconoIOS
#### Familia Web
    NotificacionWeb
    SonidoWeb
    IconoWeb
### Fábrica abstracta

Debes crear una fábrica abstracta llamada, por ejemplo:

    NotificacionFactory

Debe tener métodos como:

    crearNotificacion()
    crearSonido()
    crearIcono()
### Fábricas concretas

Debes crear tres fábricas concretas:

    AndroidFactory
    IOSFactory
    WebFactory

Cada una debe crear solo productos de su familia.

Por ejemplo:

    AndroidFactory
    ├── crea NotificacionAndroid
    ├── crea SonidoAndroid
    └── crea IconoAndroid
### Cliente

Debes crear una clase cliente, por ejemplo:

    ClienteNotificacion

Esa clase debe recibir una NotificacionFactory.

El cliente no debe saber si está trabajando con Android, iOS o Web.

Debe poder hacer algo como:

    public void enviarNotificacionCompleta() {
    notificacion.enviar();
    sonido.reproducir();
    icono.mostrar();
    }
## Reglas importantes
No mezcles familias.
El cliente debe depender de la fábrica abstracta.
Las fábricas concretas deben devolver tipos abstractos.
Los productos concretos deben implementar sus interfaces correspondientes.
Primero haz el diagrama UML, todavía no el código.
## Mayor dificultad respecto al ejercicio 2

En el ejercicio anterior todos los productos usaban casi el mismo método:

    mostrar()

Ahora cada producto debe tener un comportamiento más propio:

    Notificacion -> enviar()
    Sonido -> reproducir()
    Icono -> mostrar()

Eso hará que tu diseño sea un poco más realista.

## Ejemplo de salida esperada

Si usas la fábrica de Android, la salida podría ser:

    Enviando notificación estilo Android.
    Reproduciendo sonido de Android.
    Mostrando icono de Android.

Si cambias a iOS:

    Enviando notificación estilo iOS.
    Reproduciendo sonido de iOS.
    Mostrando icono de iOS.