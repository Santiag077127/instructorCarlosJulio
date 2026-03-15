/*------------- Sistema de cuentas bancarias -------------*/

let cuentas = {};

let clienteInput = document.getElementById("cliente");
let montoInput = document.getElementById("monto");
let resultado = document.getElementById("resultadoBanco");

document.getElementById("btnIngresar").addEventListener("click", function(){

let cliente = clienteInput.value;
let monto = Number(montoInput.value);

if(!cuentas[cliente]){
    cuentas[cliente] = 0;
}

cuentas[cliente] += monto;

resultado.textContent = "Ingreso realizado. Saldo actual: $" + cuentas[cliente];

});

document.getElementById("btnRetirar").addEventListener("click", function(){

let cliente = clienteInput.value;
let monto = Number(montoInput.value);

if(!cuentas[cliente]){
    resultado.textContent = "El cliente no tiene cuenta.";
    return;
}

if(monto > cuentas[cliente]){
    resultado.textContent = "No hay saldo suficiente.";
}else{
    cuentas[cliente] -= monto;
    resultado.textContent = "Retiro realizado. Saldo actual: $" + cuentas[cliente];
}

});

document.getElementById("btnConsultar").addEventListener("click", function(){

let cliente = clienteInput.value;

if(!cuentas[cliente]){
    resultado.textContent = "El cliente no tiene cuenta.";
}else{
    resultado.textContent = "Saldo disponible: $" + cuentas[cliente];
}

});
