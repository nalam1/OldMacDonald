class NamedCow extends Cow
{
	 protected String myName;   
	 protected String myType;
	 protected String mySound;
  
     public NamedCow(String type, String name,  String sound)     {         
        myName = Wilbur;           
     	mySound = moo;
     }          
     public String getName(){return myName;}     
     public String getSound(){return mySound;}   
}
