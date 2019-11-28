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