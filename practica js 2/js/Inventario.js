/*------------- Inventario de tienda -------------*/

let inventario = [];

let nombre = document.getElementById("nombreProducto");
let precio = document.getElementById("precioProducto");
let cantidad = document.getElementById("cantidadProducto");

let resultado = document.getElementById("resultadoInventario");
let lista = document.getElementById("listaProductos");

document.getElementById("btnRegistrar").addEventListener("click", function(){

let producto = {
nombre: nombre.value,
precio: Number(precio.value),
cantidad: Number(cantidad.value)
};

inventario.push(producto);

let item = document.createElement("li");
item.textContent = producto.nombre + " - $" + producto.precio + " - Cantidad: " + producto.cantidad;

lista.appendChild(item);

resultado.textContent = "Producto registrado correctamente";

});

document.getElementById("btnConsultar").addEventListener("click", function(){

let nombreBuscar = nombre.value;

let encontrado = inventario.find(p => p.nombre === nombreBuscar);

if(encontrado){
resultado.textContent = "Producto: " + encontrado.nombre +
" | Precio: $" + encontrado.precio +
" | Cantidad: " + encontrado.cantidad;
}else{
resultado.textContent = "Producto no encontrado";
}

});

document.getElementById("btnTotal").addEventListener("click", function(){

let total = 0;

inventario.forEach(function(producto){

total += producto.precio * producto.cantidad;

});

resultado.textContent = "Valor total del inventario: $" + total;

});