package Verzweigungen;

public class MaexchenRichtig {

  public static void main( String[] args) {
  	

    int min = (int)(Math.random() * 6) + 1;
    int max = (int)(Math.random() * 6) + 1;

    System.out.println("Zahl 1 ist:" + min);
    System.out.println("Zahl 2 ist:" + max);

    
    if(min == 1  &&  max == 2)      
        System.out.println(1000 + " Punkte");
    else if(min == max)             
        System.out.println(100*min + " Punkte");
    else                            
        System.out.println(10*max + min + " Punkte");
}
}