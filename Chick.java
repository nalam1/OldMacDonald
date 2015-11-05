
class Chick implements Animal 
{     
     //your code here
	 protected String myType;     
     protected String mySound; 
     protected String mySound2;     
        public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }
    public Chick(String type, String soundOne, String soundTwo)
    {
        myType = type;
        if (Math.random() < .5)
        {
            mySound = soundOne;
        }
        else
        {
            mySound = soundTwo;
        }
    }
    public Chick()
    {
        myType = "unknown";
        mySound = "unknown";
    }
     public String getSound()
     {
        return mySound;
     }    
     public String getType()
     {
        return myType;
    }
}
