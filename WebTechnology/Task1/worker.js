self.onmessage = async (event)=>{
    const url = event.data ;

   try{
        const output =  await fetch(url) ;
        if(!output.ok){
            throw new Error(`HTTP Error: ${response.status}`) ; 
        }
        const users = await output.json() ;

        if(!users || users.length == 0){
            throw new Error("no users returned from the API") ;
        }

        self.postMessage(users) ;
    
    }
   catch(error){
     console.error(error.message) ;
     self.postMessage([]) ;


   }
};

