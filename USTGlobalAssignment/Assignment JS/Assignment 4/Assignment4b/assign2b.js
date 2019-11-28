// function validEmail(inputText) 
// {
//     var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
//     if(inputText.value.match(mailformat) )
//     {
//     document.form1.text1.focus();
//     return true;
//     }
//     else
//     {
//     alert("You have entered an invalid email address!");
//     document.form1.text1.focus();
//     return false;
//     }
// }

function validEmail(inputText) 
{
    
    if(inputText.value.length > 5 )
    {
    document.form1.text1.focus();
    return true;
    }
    else
    {
    alert("email id is too short");
    document.form1.text1.focus();
    return false;
    }
}