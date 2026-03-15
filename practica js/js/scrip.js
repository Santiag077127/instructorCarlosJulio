/*-----------------BOTON MENSAJE-------------------------------*/
let boton = document.getElementById("btnMensaje");

let resultado = document.getElementById("resultado");

boton.addEventListener("click", function() {
resultado.textContent = "Hola mundo desde JavaScript";
});

/*-----------------Calculadora de suma -------------------------------*/
boton = document.getElementById("total");

boton.addEventListener("click", function(){

let numero1 = document.getElementById("num1").value;
let numero2 = document.getElementById("num2").value;

let suma = Number(numero1) + Number(numero2);

document.getElementById("resultado2").textContent = "Resultado: " + suma;

});

/*-----------------Cambiar color de fondo -------------------------------*/
document.getElementById("rojo").addEventListener("click", function(){
    document.body.style.backgroundColor = "red";
});

document.getElementById("azul").addEventListener("click", function(){
    document.body.style.backgroundColor = "blue";
});

document.getElementById("verde").addEventListener("click", function(){
    document.body.style.backgroundColor = "green";
});
 document.getElementById("blanco").addEventListener("click", function(){
    document.body.style.background = "white"
 })



/*-----------------contador de clics -------------------------------*/
let contador = 0;

boton = document.getElementById("btonContador");
let reiniciar = document.getElementById("btnReiniciar");
let resultado2 = document.getElementById("resultado3");

boton.addEventListener("click", function(){

    contador = contador + 1;
    resultado2.textContent = "Clics: " + contador;

});

reiniciar.addEventListener("click", function(){

    contador = 0;
    resultado2.textContent = "Clics: " + contador;

});

/*-----------------Agregar tareas -------------------------------*/

boton = document.getElementById("btnAgregar");

boton.addEventListener("click", function(){

let texto = document.getElementById("tarea").value;

let nuevoElemento = document.createElement("li");

nuevoElemento.textContent = texto + " ";

let botonEliminar = document.createElement("button");

botonEliminar.textContent = "Eliminar";

botonEliminar.addEventListener("click", function(){
    nuevoElemento.remove();
});

nuevoElemento.appendChild(botonEliminar);

document.getElementById("lista").appendChild(nuevoElemento);

});

/*-----------------formulario -------------------------------*/
let formulario = document.getElementById("formulario");

formulario.addEventListener("submit", function(event){

event.preventDefault();

let nombre = document.getElementById("nombre").value;
let correo = document.getElementById("correo").value;
let edad = document.getElementById("edad").value;

let mensaje = document.getElementById("mensaje");

if(nombre === "" || correo === "" || edad === ""){
    
    mensaje.textContent = "Debe completar todos los campos";

}else{

    mensaje.textContent = "Formulario enviado correctamente";

}

});

/*-----------------calculadora -------------------------------*/

let botonCalcular = document.getElementById("calcular");

botonCalcular.addEventListener("click", function(){

let num1 = Number(document.getElementById("numero1").value);
let num2 = Number(document.getElementById("numero2").value);
let operacion = document.getElementById("operacion").value;

let resultado;

if(operacion === "+"){
    resultado = num1 + num2;
}
else if(operacion === "-"){
    resultado = num1 - num2;
}
else if(operacion === "*"){
    resultado = num1 * num2;
}
else if(operacion === "/"){
    resultado = num1 / num2;
}

document.getElementById("resultadoCalc").textContent = "Resultado: " + resultado;

});


/*-----------------temporizador -------------------------------*/
let segundos = 0;
let intervalo;

let mostrarTiempo = document.getElementById("tiempo");

document.getElementById("iniciar").addEventListener("click", function(){

    intervalo = setInterval(function(){

        segundos++;
        mostrarTiempo.textContent = segundos;

    }, 1000);

});

document.getElementById("detener").addEventListener("click", function(){

    clearInterval(intervalo);

});

document.getElementById("reiniciar").addEventListener("click", function(){

    clearInterval(intervalo);
    segundos = 0;
    mostrarTiempo.textContent = segundos;

});