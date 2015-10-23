class Pig implements Animal 
public void setup() {     
    Pig p = new Pig("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());  }  
}
class Pig implements Animal {     
     private String myType;     
     private String mySound;      
     public Pig(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Pig()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
