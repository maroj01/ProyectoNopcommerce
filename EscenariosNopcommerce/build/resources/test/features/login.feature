# language: es

Característica: Realizar autenticación en el sitio web
  Yo como usuario de la tienda Nopcommerce
  Quiero autenticarme en la tienda virtual
  Para comprar productos de la tienda online

Antecedentes:
  Dado que se ingresó al home de la tienda virtual


  Escenario: Login a la plataforma con datos válidos
    Cuando me autentico con el email y password
    Entonces se mostrará el mensaje de bienvenida
    Y se mostrará la zona de compras


  Esquema del escenario: Login a la plataforma con datos inválidos
    Cuando me autentico con email <Email> y password <Password> erroneos
    Entonces se mostrará el mensaje de error

    Ejemplos:
      | Email                   | Password  |
      | adri.rojas990@gmail.com | Sofka2029 |
      | adrirojas990@gmail.com  | Sofka2022 |
      | adri.rojas@gmail.com    | Sofka2021 |



