# Introduccion a la programación orientada a objetos
La programación orientada a objetos como su nombre lo indica hace refererencia a las representaciones abstractas de objetos del mundo real un lineas de código entendible por el ordenador.

Estas deben contar con una clase (class) que se encargue de darle el molde a este objeto para que luego nosotros podamos instanciar (new NombreDelObjeto()) ese objeto y manipular sus propiedades y métodos.

Cada objeto contiene un constructor que se asigna por defecto en Java y que podemos manipular para alterar estas propiedades iniciales y así disponer de variedades de objetos que nacen de una misma clase.

Cada objeto por más que sea instanciado de una misma clase es agnostico de los demas por lo que nada de lo que hagamos en nuestro objeto 1 se vera reflejado en nuestro objeto 2 que tiene sus propiedades intactas.

# Privacidad, abstracción y encapsulación
Dentro de los objetos podemos tener propiedades 3 tipos de propiedades:
* Publicas : Podemos acceder desde fuera a una propiedad
* Privadas : Las privadas solamente la podemos acceder internamente desde el objeto.
* Protegidas ?? : Completar más tarde

La encapsulación nos permite que utilizando tipos publicos y privados, manipularlos dentro de la clase y utilizarlos por fuera. (getters && setters).

En otras palabras lo que hacemos es crear dos funciones que nos permitan modificar y consultar el valor de esa propiedad.

Por otro lado la abstracción permite crear funciones que solo pueden ser invocadas por funciones hijas lo cual abstrae completamente la funcionalidad del entorno. Son funciones parcialmente construidas donde se indican el tipo de dato que operar y nombre de dicha función.

Las clases abstractas no pueden ser utilizadas, solo pueden ser heredadas.

# Herencia polimorfismo e interfaces
En la herencia, valga la redundancia, heredamos métodos y/o propiedades de una clase padre. Tambien se heredan métodos abastractos que debemos construir la lógica del negocio.

En el polimorfismo las clases hijas implementan la misma función pero realizan diferentes cosas

Las interfaces no implementan ninguna función, sino que nos dice a nosotros que debemos implementar.

