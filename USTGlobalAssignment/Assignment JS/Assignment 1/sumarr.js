//fat arrow
var sumarr = (arr) => {
    var sum = 0; 
    for (let index = 0; index < arr.length; index++) {
        sum = sum + arr[index];
    }
    console.log('Sum of all element:',sum);
}
sumarr([1,2,3])

//namely function
function sumarr(arr) {
    var sum = 0; 
    for (let index = 0; index < arr.length; index++) {
        sum = sum + arr[index];
    }
    console.log('Sum of all element:',sum);
}
sumarr([1,2,3]);

//self invoked
(function sumarr(arr) {
    var sum = 0; 
    for (let index = 0; index < arr.length; index++) {
        sum = sum + arr[index];
    }
    console.log('Sum of all element:',sum);
})([2,3,4]);

//function Expression
var sumarr = function (arr) {
    var sum = 0; 
    for (let index = 0; index < arr.length; index++) {
        sum = sum + arr[index];
    }
    return sum;
}
var val = sumarr([3,4,5]);
console.log('Sum of all element:',val);
