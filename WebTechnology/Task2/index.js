const container = document.createElement("div");
container.className = "content";
document.body.appendChild(container);
const users = [
    {name:"Alice", age:53},
    {name:"Tim", age:74}
]

container.innerHTML = `
<table>
  ${users.map((value)=>{
    return `
        <tr>
            <td>${value.name}</td>
            <td>${value.age}</td>
        </tr>
    `
  }).join("")}
</table>
`



const fields = [ 
  "First Name", 
  "Last Name", 
  "Email"
]


const container2 = document.createElement("div")
container2.className = "inputContent" 

document.body.appendChild(container2);

container2.innerHTML = `
   <div>
   ${
        fields.map((value)=>{
            return `
              <label>${value}</label>
              <input type="text"> 
              <br>
            `
        }).join("") 
    }
   </div>
    

`


