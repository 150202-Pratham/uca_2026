// we have already covered Object.assign , and other object methods so far

const student1WB = new ConstructStudent("Name3",20,"name3@gmail.com" , 80) ;
const student2WB = new ConstructStudent("Name4",22,"name4@gmail.com", 90) ;

class ConstructStudent{

    constructor(name , age , email , marks){
        this.name = name ;
        this.age = age ;
        this.email = email ;
        this.marks = marks ;

    }


}



const arr = [1,2,3,4] ;
// or 
const arr1 = new Array(1,2,3) ;
console.log(arr1) ;

//  we want to make the every element to multiply with 2 

const multiply2 = (item)=>{
    return item*2 ;
}

arr1.map(multiply2) ;

// implement a Custom map function on array Constructor Prototype 


// this will behave same as inbuilt map function but we will implement it for better understanding 
Array.prototype.customMap = function(callbackfn){
    console.log(this);

    let newArray = [] ;
    for(let i = 0 ; i< this.length  ; i++){
        let result = callbackfn(this[i] , i , this) ;

        newArray.push(result) ;
    }

    return newArray ;
}

function foo (arg1,arg2,arg3){
    console.log(arr1,arr2,arr3) ;

}


// Prototype Inderitance 


function multiply2{
    
}




// Destructuring in JavaScript 

const studentDetails = {name : "name1" , age:23} ;
// const {name , age} = studentDetails ; 
// it is equivallent to saying as 
const name = studentDetails.name ;
const age =  studentDetails.age ;



// Destructuring Fr Arrays ;

const details = ["name1" , 20] ;
const [name1 , age1] = details ;
console.log(name , age1) ;

// Web Storage 
// it was introduced in HTML5 ;
// before this normally cookies weere used 

// Types of Storage ->> Session Storage , Local Storage 

// Here Data is Almost Stored in the Form of String 

localStorage.setItem("Data" , 4);
localStorage.setItem("Data" , 4);
localStorage.setItem("Data" , 4);
localStorage.setItem("Data" , 4);

sesssionStorage.setItem("data" , 23);


// session Storage -> temporary Storage and is saved in current tab not more than that 

// localStorage -> permananet Storage if once tab is closed then they can be retrived aming the tabs later too


// cookies -> old Storage way and these are sticky and if set for one domain and if we request the new Request the browser always keeps on attaching it to api 


