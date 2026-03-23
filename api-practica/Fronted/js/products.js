//función para consulta todos los productos 
async function getAllProducts(){

  var products=await queue(urlProducts,get);
  var container=document.getElementById("container");
  container.innerHTML="";
  loadData(container,products);
}

//función para consulta todos los productos 
async function getFindByIdProduct(){
  var id=document.getElementById("idFilter").value
  
  let product=await queue(urlProducts+"/"+id,get);
  var container=document.getElementById("container");
  loadData(container,product);
}