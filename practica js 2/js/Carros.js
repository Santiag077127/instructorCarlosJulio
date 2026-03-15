/*------------- Control de vehículos -------------*/

let vehiculos = [];

let nombreVehiculo = document.getElementById("vehiculo");
let cambioVelocidad = document.getElementById("velocidad");

let resultado = document.getElementById("resultadoVehiculo");
let lista = document.getElementById("listaVehiculos");

document.getElementById("btnRegistrarVehiculo").addEventListener("click", function(){

let vehiculo = {
nombre: nombreVehiculo.value,
velocidad: 0
};

vehiculos.push(vehiculo);

let item = document.createElement("li");
item.textContent = vehiculo.nombre + " - Velocidad: " + vehiculo.velocidad + " km/h";

lista.appendChild(item);

resultado.textContent = "Vehículo registrado correctamente";

});

document.getElementById("btnAcelerar").addEventListener("click", function(){

let buscar = nombreVehiculo.value;
let cambio = Number(cambioVelocidad.value);

let vehiculo = vehiculos.find(v => v.nombre === buscar);

if(vehiculo){

vehiculo.velocidad += cambio;

resultado.textContent = "Nueva velocidad: " + vehiculo.velocidad + " km/h";

}else{

resultado.textContent = "Vehículo no encontrado";

}

});

document.getElementById("btnFrenar").addEventListener("click", function(){

let buscar = nombreVehiculo.value;
let cambio = Number(cambioVelocidad.value);

let vehiculo = vehiculos.find(v => v.nombre === buscar);

if(vehiculo){

vehiculo.velocidad -= cambio;

if(vehiculo.velocidad < 0){
vehiculo.velocidad = 0;
}

resultado.textContent = "Nueva velocidad: " + vehiculo.velocidad + " km/h";

}else{

resultado.textContent = "Vehículo no encontrado";

}

});

document.getElementById("btnConsultarVehiculo").addEventListener("click", function(){

let buscar = nombreVehiculo.value;

let vehiculo = vehiculos.find(v => v.nombre === buscar);

if(vehiculo){

resultado.textContent =
"Vehículo: " + vehiculo.nombre +
" | Velocidad actual: " + vehiculo.velocidad + " km/h";

}else{

resultado.textContent = "Vehículo no encontrado";

}

});