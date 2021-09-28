public class ForLoop{

    public static void main(String[] args) {
        
        /* for (inisialisasi; kondisi; step nilai){
            aksi;
        }
        */
        
        
        System.out.println("Ini adalah awal dari program");
        System.out.println("loop");

        /*for(int nilai = 10; nilai <=40; nilai++){

            if (nilai % 4 == 0){

                System.out.println("nilai " +nilai+ " = genap");
            }
        }*/


        for(int prima = 0; prima <= 40; prima++){          
            if (prima % 2 != 0){
                
                if (prima != 1){            
                    System.out.println("prima " +prima);
                }       
            }else if (prima == 2){
                System.out.println("prima " +prima);
            }                            
                    
        }
    }
}