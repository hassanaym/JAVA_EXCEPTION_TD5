class Grich{
    public int m5() { 
        int age; 
        String s = "24"; 
        try { 
            age = getAccessCode(); 
            
        } catch (IllegalAccessException e) 
        {
            e.printStackTrace();
        }  
         return age; 
    } 

    public int getAccessCode() throws IllegalAccessException { 
        throw new IllegalAccessException(); 
    }
}
