document.getElementById('btn').disabled = true;
function showPass() {
let x = document.getElementById("showpw");
console.log(x);
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}

