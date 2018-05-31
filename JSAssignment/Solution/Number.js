sum = function( x,  y) {
 
   return x+y
}

//biggest between two numbers
big = function(x,y)
{
    if(x<y)
    {
        return y;
    }
    else
    {
        return x;
    }
}

//getting the grade
grade = function(s1,s2,s3)
{
    avg = (s1+s2+s3)/30;
    grade = ["FAIL","FAIL","FAIL","FAIL","FAIL","B-","B","B+","A-","A","A+"]
    return grade[avg]
}

//prime or not
isPrime = function(n)
{
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        return false;
    }
    return true;
}
//prime numbers between range
displayPrimeNumbers = function(range1,rage2)
{
    for(i=range1;i<rage2;i++)
    {
        if(isPrime(i))
        {
            console.log(i);
        }
    }
}


displayPrimeNumbers(100,200);

