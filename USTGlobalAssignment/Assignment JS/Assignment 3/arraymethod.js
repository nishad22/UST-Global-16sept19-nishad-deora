let sub = ['English','Hindi','Math','History','Geography','Biology'];
let a = Array.isArray(sub);
console.log(a);
const n = [1,2,3,4,5,'hello','nishad','bike','trimmer'];

let comp = new Object();
let v = new Array(1,2,3,4);
console.log(Array.isArray(null));
console.log(Array.isArray(undefined));
console.log(Array.isArray(1));
console.log(Array.isArray('hell'));
console.log(Array.isArray(true));
console.log(Array.isArray(false));
console.log(Array.isArray('v'));
console.log(Array.isArray(v));
console.log(Array.isArray(n));




console.log('====================includes method=======================')
console.log(sub.includes('Math'));
console.log(sub.includes('Math',1));
console.log(sub.includes('Math',2));
console.log(sub.includes('Math',4));
console.log(n.includes('nishad'));
console.log(n.includes(4));
console.log(n.includes(5,1));
console.log(n.includes('trimmer',5));
console.log(n.includes('bike',10));
console.log(n.includes(0));

console.log('====================push method=======================')
const num1 = [1,2,3]
console.log(sub.push('Drawing'));
let b = sub.push('Chemistry');
console.log(b);
console.log(sub);
num1.push(4);
num1.push(5);
num1.push(6);
num1.push('seven');
num1.push('eight');
num1.push('nine');
console.log(num1);
console.log('====================pop method=======================')
let c = sub.pop();
console.log(sub);
console.log(c);
num1.pop();
num1.pop();
num1.pop();
num1.pop();
num1.pop();
num1.pop();
num1.pop();
num1.pop();
num1.pop();
console.log(sub);

console.log('====================unshift method=======================')
const arr = ['hello'];
let d = sub.unshift('Sanskrit','Physics');
console.log(d);
console.log(sub);
num1.unshift(1,2,3,4,5,6);
console.log(num1);
arr.unshift('world');
arr.unshift('this');
arr.unshift('is');
arr.unshift('nishad');
arr.unshift('deora');
arr.unshift('from');
arr.unshift('tirora');
console.log(arr);

console.log('====================shift method=======================')
let e = sub.shift()
console.log(e);
console.log(sub);
arr.shift();
arr.shift();
arr.shift();
arr.shift();
console.log(arr);
num1.shift();
num1.shift();
num1.shift();
num1.shift();
console.log(num1);



console.log('====================slice method=======================')
const color = ['voilet','indigo','blue','green','yellow','orange','red'];
let f = sub.slice(2);
console.log(f);
let g = sub.slice(3,7);console.log(g);
console.log(sub.slice(3,8));
let z = color.slice(1);
console.log(z);
console.log(color.slice(2));
console.log(color.slice(1,8));
console.log(color.slice(2,3));
console.log(color.slice(0,4));
console.log(color.slice(4,6));


console.log('====================splice method=======================')

color.splice(3,0,'purple'); //insert
console.log(color);
color.splice(3,1); //remove
console.log(color);
console.log(color.splice(3,1));
const lapi = ['dell','hp'];
lapi.splice(1,0,'asus');
lapi.splice(2,0,'fujistu');
lapi.splice(3,0,'lenovo');
lapi.splice(4,0,'acer');
lapi.splice(5,0,'alienware');
lapi.splice(1,0,'toshiba');
console.log(lapi);
lapi.splice(3,3);
console.log(lapi);

console.log('====================indexof method=======================')
let h=color.indexOf('voilet');
console.log(color.indexOf('voilet',3));
console.log(color.indexOf('red',3));
console.log(color.indexOf('green'));
console.log(h);
console.log(lapi.indexOf('dell'));
console.log(color.indexOf('toshiba'));
console.log(color.indexOf('hp'));
console.log(color.indexOf('orange'));
console.log(lapi.indexOf('dell',0));
console.log(lapi.indexOf('toshiba',1));
console.log('====================join method=======================')
const num = [1,2,3,4,5,6]
let i = num.join();
console.log(i);
console.log(num.join(''));
console.log(num.join('-'));
console.log(num.join('+'));
console.log(num.join('*'));
console.log(num.join('/'));
console.log(num.join('%'));
console.log(num.join('>'));
console.log(num.join('<'));
console.log(num.join('?'));
console.log(num.join('/'));
