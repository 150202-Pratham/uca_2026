let productListFromServer = [] 
loadDataFromServer() 
renderProducts(productListFromServer)

function setProductListFromServer(productList , callBackFn){
    productListFromServer = productList ;

}

function loadDataFromServer(){
    setTimeout(()=>{
        console.log("data Coming") 
        setProductListFromServer([
            {
                name : "Product1" ,
                price : "$10.00" ,
                description: "This is a great Product",
            },
            {
                name : "Product2" ,
                price : "$20.00" ,
                description: "This Product is Even better"
            },
            {
                name : "Product3" ,
                price : "$20.00" ,
                description: "This Product is Even better" 
        }] , callBackFn )
    

    console.log("Data from Server",productListFromServer); 
    renderProducts(productListFromServer);

    } , 2000)

}

function renderProducts(productList){
    if(productList.length == 0 ){
      document.getElementById("appcontent").innerHTML = `
        <h1>
            Loading Data From Server .... 
        </h1>
      `
       return ;

    }

    document.getElementById("appcontent").innerHTML = `
    <table>
        <thead>
            <th>Sr.No</th>
            <th>Product Name</th>
            <th>Price</th>
        </thead>
        <tbody>
        ${productList.map((item)=>{
           return  `
            <tr>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td>${item.description}</td>
            </tr>
            `
        })}
            
            
        </tbody>
    </table>

    `
}





