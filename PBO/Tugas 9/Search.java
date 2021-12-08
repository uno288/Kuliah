public class Search{  

    int[] array; 
    int nilaix, index;
    boolean found = false;

    Search(int[] array, int nilaix){
        this.index = index;
        this.array = array;
        this.nilaix = nilaix;
    }
    
    public boolean mencari(){

        while ((index < array.length) && (found == false)){

            if(array[index] == nilaix){               
                found = true;
                System.out.println("\nAngka yang dicari adalah " + nilaix);  
                System.out.println("Berada di index ke-" + index);
            }else{
                index = index + 1;
            }
        }
    return found;
    }
}