/*------------- Carrito de compras -------------*/

let carrito = [];

let lista = document.getElementById("listaCarrito");
let totalElemento = document.getElementById("total");

document.getElementById("btnAgregar").addEventListener("click", function(){

let nombre = document.getElementById("producto").value;
let precio = Number(document.getElementById("precio").value);

let producto = {
nombre: nombre,
precio: precio
};

carrito.push(producto);

let item = document.createElement("li");

item.textContent = producto.nombre + " - $" + producto.precio + " ";

let botonEliminar = document.createElement("button");
botonEliminar.textContent = "Eliminar";

botonEliminar.addEventListener("click", function(){

item.remove();

let index = carrito.indexOf(producto);
carrito.splice(index,1);

calcularTotal();

});

item.appendChild(botonEliminar);

lista.appendChild(item);

calcularTotal();

});

function calcularTotal(){

let total = 0;

carrito.forEach(function(producto){

total += producto.precio;

});

totalElemento.textContent = total;

}