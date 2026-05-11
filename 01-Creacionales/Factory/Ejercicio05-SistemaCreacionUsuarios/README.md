# Ejercicio 05: Sistema de creación de cuentas de usuario

## Historia de usuario
Como administrador de una plataforma digital,
quiero registrar diferentes tipos de cuentas
de usuario para que cada usuario tenga permisos
beneficios según su tipo de cuenta.
El sitema debe permitir crear cuentas de:

    Usuario básico
    Usuario premium
    Usuario vendedor
    Usuario administrador

Cada tipo de cuenta debe tener una forma distinta
de activarse y mostrar sus permisos.

## Solicitud del cliente
Necesito un sistema que permita registrar cuentas
de usuario en una plataforma. Actualmente, existen
cuatro tipos de cuentas, pero en el futuro se 
podrian agregar nuevos tipos de usuario corporativo,
usuario invitado o usuario estudiante.

No quiero que el sistema principal cree directamente
las clases concretas de usuario. Cada tipo de cuenta
debe tener su propio creador.

## Clases principales que se debe considerar
Debes crear una interfaz o clase abstracta:

    CuentaUsuario

Clases concretas:

    CuentaBasica
    CuentaPremium
    CuentaVendedor
    CuentaAdministrador

Una clase creadora abstracta:

    CuentaCreator

Creadores concretos:

    BasicaCreator
    PremiumCreator
    VendedorCreator
    AdministradorCreator

Y una clase modelo para los datos:

    RegistroUsuario

## Datos mínimos de RegistroUsuario

La clase RegistroUsuario debe tener como mínimo:

    String nombre;
    String correo;
    String password;
    int edad;
    double pagoInicial;
    String ruc;

No todos los tipos de cuenta usarán todos los
datos. Por ejemplo, el ruc solo será importante 
para vendedor.

## Validaciones generales

Estas validaciones deben aplicarse a todos los usuarios:

    El nombre no debe estar vacío.
    El correo no debe estar vacío.
    El correo debe contener @.
    La contraseña debe tener al menos 6 caracteres.
    La edad debe ser mayor o igual a 13.

Estas reglas pueden estar en RegistroUsuario o ser llamadas desde CuentaCreator.   

## Validaciones especiales

Aquí sube la dificultad.

### Usuario premium

Para crear una cuenta premium:

    El pagoInicial debe ser mayor a 0.
### Usuario vendedor

Para crear una cuenta vendedor:

    El RUC no debe estar vacío.
    El RUC debe tener 11 dígitos.
### Usuario administrador

Para crear una cuenta administrador:

    El correo debe terminar en @empresa.com
### Usuario básico

Solo necesita cumplir las validaciones generales.

## Dificultad extra

Para evitar repetir código, puedes pensar en un método especial que las clases hijas puedan sobrescribir.

Por ejemplo:

    CuentaCreator
    → valida reglas generales
    
    PremiumCreator
    → agrega regla de pagoInicial

    VendedorCreator
    → agrega regla de RUC

    AdministradorCreator
    → agrega regla del correo corporativo

La idea es similar a lo que hiciste con InternacionalCreator, pero ahora tendrás varios creators con reglas especiales.

## Reto final

Cuando termines los cuatro tipos de cuenta, agrega una nueva:

    CuentaEstudiante

Regla especial:

    El correo debe terminar en .edu o contener edu

Y debes agregar solamente:

    CuentaEstudiante
    EstudianteCreator

No deberías modificar las clases principales ya existentes.