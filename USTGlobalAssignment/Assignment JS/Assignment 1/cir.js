// fat arrow function
var cir = (num) => {
    console.log('circumference:',2*Math.PI*Math.pow(num,2));
}
cir(2);

//fat arrow with one para
var cir = num => {
    console.log('circumference:',2*Math.PI*Math.pow(num,2));
}
cir(3.15);

//fat with one  line
var cir = num => console.log('circumference:',2*Math.PI*Math.pow(num,2));
cir(4);

//named function
function cir(num) {
    console.log('circumference:',2*Math.PI*Math.pow(num,2));
}
cir(5);

//function expression
var cir = function (num) {
    console.log('circumference:',2*Math.PI*Math.pow(num,2));
}
cir(5);

//self invoked function
(function (num){
    console.log('circumference:',2*Math.PI*Math.pow(num,2));
})(5) 