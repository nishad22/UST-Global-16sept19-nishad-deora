//fat arrow with parenthesis
var pri = (num) => {
    var i = 1;
    var j;
    while (i <= num/2) {
        var count = 1;
        if(num%i == 0)
            count++;
        i++;
        j=count;
    }
    if(j > 2)
        console.log('the number is not prime'); 
    else
        console.log('the number is  prime');
}
pri(7)

//fat arrow without parenthesis
var pri = num => {
    var i = 1;
    var count = 1;
    while (i <= num/2) {
        
        if(num%i == 0)
            count++;
        if(count>2)
            break;
        i++;
       
    }
    if(count === 2)
        console.log('the number is  prime'); 
    else
        console.log('the number is not prime');
}
pri(6);

//self invoked function
(function (num) {
    var i = 1;
    var count = 1;
    while (i <= num/2) {
       
        if(num%i == 0)
        {
            count++;
        }
        if (count>2) {
            break;
        }
        i++;
         
    }
    if(count === 2)
        console.log('the number is  prime'); 
    else
        console.log('the number is not  prime');
})(6)