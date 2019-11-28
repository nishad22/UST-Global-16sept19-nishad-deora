//named Fuctions
function fact(num1) {
    var f =1;
    for (let index = 1; index <=num1; index++) {
        f = f *index;
    }
    console.log('Factoial:',f);
    return f
}
var fe=fact(5);
console.log('Factoial:',fe);

//function Expression
var fact = function(num) {
    var f=1
    for (let index = 1; index <= num; index++){
        f=f*index;
}
return f;
}
var val = fact(4)
console.log('Factorial',val);

//self invoked or immediately 
(function (num) {
    var f=1;
    for(let i=1;i<=num;i++)
    {
        f=f*i
    }
    console.log('Factorial:',f)
})(6)

//fat arrow with multiple parameter
var fact = (num) => {
    f = 1;
    for (let index = 1; index <= num; index++) {
          f = f*index;     
    }
    return f
}
var val = fact(5)
console.log('Factoral:',val)

//with one parameter
var fact = num => {
    var f = 1;
    for (let index = 1; index <= num; index++) {
        f = f*index;
    }
    console.log('Factorial:',f)
}
fact(5)
