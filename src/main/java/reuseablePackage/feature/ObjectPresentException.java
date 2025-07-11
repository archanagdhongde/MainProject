package reuseablePackage.feature;

class ObjectPresentException  extends Exception  
{  
    public ObjectPresentException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  