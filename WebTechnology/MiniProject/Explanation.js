// Self Invoking Function 
(function foo(input){
    console.log("Input params", input) 

})

// using Arrow Function 

((input)=>{
    console.log("Input params" , input) ;

})

const foo = (input)=>{
    console.log("Arrow Function Working") ;
}

foo("hello") ;


// Array ->

let arr1 = [1,2,3,4,5,6] ;

const arr1Multiply2 = arr1.map((value , index, arr)=>{

      return value *2 ;
})
console.log(arr1Multiply2) ;

// callback function is any function that is passed as an argument to another function 





