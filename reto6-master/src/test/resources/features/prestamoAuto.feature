#language: es
#Author: Nilo Chaverra


Característica: Prestamo para autos
  Descricion: El usuario puede solicitar uno de nuestros servicios, prestamo para su auto y podra
  ver los beneficios,características, Documentación requerida,  Tasas y tarifas,  Transacciones y
  canales


  Antecedentes: Abrir pagina web
    Dado que el usuario se encuentra en la pagina

  Escenario:Tasas y tarifas de los Prestamos de Auto
    Cuando el usuario ingresa a la opcion prestamo para autos
    Y hace click en Tasas y tarifas
    Y descarga archivo pdf
    Entonces prodra ver en el archivo toda nuestras tasas


