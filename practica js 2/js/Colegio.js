/*------------- Registro de estudiantes -------------*/

let estudiantes = [];

let nombre = document.getElementById("nombreEstudiante");
let programa = document.getElementById("programa");
let nota = document.getElementById("nota");

let resultado = document.getElementById("resultadoEstudiante");
let lista = document.getElementById("listaEstudiantes");

document.getElementById("btnRegistrar").addEventListener("click", function(){

let estudiante = {
nombre: nombre.value,
programa: programa.value,
nota: Number(nota.value)
};

estudiantes.push(estudiante);

let estado;

if(estudiante.nota >= 3){
estado = "Aprobó";
}else{
estado = "No aprobó";
}

let item = document.createElement("li");
item.textContent = estudiante.nombre + " - " + estudiante.programa + " - Nota: " + estudiante.nota + " - " + estado;

lista.appendChild(item);

resultado.textContent = "Estudiante registrado correctamente";

});

document.getElementById("btnConsultar").addEventListener("click", function(){

let nombreBuscar = nombre.value;

let encontrado = estudiantes.find(e => e.nombre === nombreBuscar);

if(encontrado){

let estado;

if(encontrado.nota >= 3){
estado = "Aprobó";
}else{
estado = "No aprobó";
}

resultado.textContent =
"Nombre: " + encontrado.nombre +
" | Programa: " + encontrado.programa +
" | Nota: " + encontrado.nota +
" | Resultado: " + estado;

}else{

resultado.textContent = "Estudiante no encontrado";

}

});