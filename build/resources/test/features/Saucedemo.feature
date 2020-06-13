# language: es
Característica: Como usuario quiero comprar un producto en la página web de SWAGLABS

  Escenario: Comprar un producto en la página web de SWAGLABS

    Dado que el actor abra el navegador y quiera comprar un producto
    Cuando el busque y compre el producto deseado
    |username     |password    |firstname |lastname |codepostal|
    |standard_user|secret_sauce|James     |Rodriguez|1234      |
    Entonces verifica que si fue el producto que el queria comprar THANK YOU FOR YOUR ORDER