// constructor function for reusability and  memory Optimization


class Student{
    constructor(name, age, email, marks){
        this.name = name ;
        this.age = age ;
        this.email  = email;
        this.marks = marks ;
    }

    percentage(){
        return (this.marks/1000) * 100 ;

    }
}

const student1 = new Student("Anuj" , 22, "anujgupt22@gmail.com" , 80) ;

// Class is just a Keyword and it is not something more idempotent and and at core level it just a function

// constructor function and Prototype inheritance 