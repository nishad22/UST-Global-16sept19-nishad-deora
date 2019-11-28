// named function
function fib(num) {
    var f1=0;
    var f2=1;
    var f3;
    for (let index = 1; index <=num; index++) {
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
        console.log(f3);
    }
}
val = fib(10)


//function Expression
var val = function (num) {
    var f1=0;
    var f2=1;
    var f3;
    for (let index = 1; index <=num; index++) {
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
        console.log(f3) 
}

}
 val(10)

 //fat arrow
 var val = (num) => {
    var f1=0;
    var f2=1;
    var f3;
    for (let index = 1; index <=num; index++) {
        f3 = f1 + f2;
        f1 = f2;
        f2 = f3;
        console.log(f3)
    } 
 }
val([4,5,6])
