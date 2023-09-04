#language:es
Característica: Agregar un producto de forma exitosa al carrito de compras

  @agregarProducto
  Escenario: Usuario agrega Producto al Carrito
    Dado que el usuario se dirige al menu desplegable y selecciona electrodomesticos de cocina
    Cuando se selecciona una subcategoria aleatoriamente y se visualiza los productos
    Y da click aleatoriamente un producto y se observa los detalles del producto
    Y dando click en comprar y seleccionar ir a pagar
    Entonces el usuario visualiza su producto en el carrito
