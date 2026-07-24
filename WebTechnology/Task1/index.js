
const worker = new Worker("worker.js") ;

worker.postMessage("https://dummyjson.com/users") ;

worker.onmessage = (event)=>{
    const users = event.data ;

    if(!users || users.length==0){
        console.log("no User returend from the api") ;
        return ;
    }

    console.log(users) ;
    const container = document.getElementsByClassName("appcontent")[0];
    users.users.forEach(user =>{
       container.innerHTML += `
          
        <p> ${user.firstName} - ${user.role}    </p>     
        `
    });

    
}

worker.onerror = (error)=>{
    console.log("Worker Error:", error.message) ;
}

