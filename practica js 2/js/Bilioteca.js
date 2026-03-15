/*------------- Sistema de biblioteca -------------*/

let biblioteca = [];

let titulo = document.getElementById("titulo");
let autor = document.getElementById("autor");

let resultado = document.getElementById("resultadoLibro");
let lista = document.getElementById("listaLibros");

document.getElementById("btnRegistrar").addEventListener("click", function(){

let libro = {
titulo: titulo.value,
autor: autor.value,
estado: "Disponible"
};

biblioteca.push(libro);

let item = document.createElement("li");
item.textContent = libro.titulo + " - " + libro.autor + " - " + libro.estado;

lista.appendChild(item);

resultado.textContent = "Libro registrado correctamente";

});

document.getElementById("btnPrestar").addEventListener("click", function(){

let buscar = titulo.value;

let libro = biblioteca.find(l => l.titulo === buscar);

if(libro){

if(libro.estado === "Disponible"){

libro.estado = "Prestado";
resultado.textContent = "Libro prestado correctamente";

}else{

resultado.textContent = "El libro ya está prestado";

}

}else{

resultado.textContent = "Libro no encontrado";

}

});

document.getElementById("btnDevolver").addEventListener("click", function(){

let buscar = titulo.value;

let libro = biblioteca.find(l => l.titulo === buscar);

if(libro){

libro.estado = "Disponible";
resultado.textContent = "Libro devuelto correctamente";

}else{

resultado.textContent = "Libro no encontrado";

}

});

document.getElementById("btnConsultar").addEventListener("click", function(){

let buscar = titulo.value;

let libro = biblioteca.find(l => l.titulo === buscar);

if(libro){

resultado.textContent =
"Libro: " + libro.titulo +
" | Autor: " + libro.autor +
" | Estado: " + libro.estado;

}else{

resultado.textContent = "Libro no encontrado";

}

});