var obj1 = new Object(["name" , "Pratham"]) 
var obj2 = new Object(["age" , 20])  
console.log(obj1) ;

// object using assign 
// it takes two paramaeters and copy the valur of one 
// var obj1 = Object.assign(sourceDB,targetDB);
// Object.assign(obj1 , obj2) ;
// console.log( obj1 ) ;



let p1 = {name : "Pratham"} ;
let p2 = {age :20} ;

Object.assign(p1,p2) ;

console.log(p1)



// factory function = A factory function in JavaScript is a regular function that creates and returns an object. Instead of using the new keyword with a constructor, you call the function directly to create objects.
function createPerson(name, age) {
  return {
    name,
    age,
    greet() {
      console.log(`Hi, I'm ${this.name}`);
    }
  };
}

const person1 = createPerson("Alice", 25);
const person2 = createPerson("Bob", 30);

person1.greet(); 
person2.greet();