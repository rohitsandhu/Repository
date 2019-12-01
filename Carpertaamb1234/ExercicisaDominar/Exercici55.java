public class Exercici55{
    public static void main(String [] args){
        int resposta1;
        int resposta2;
        int resposta3;
        int punts =0;
        System.out.println("Quant és 2+2?");
        resposta1 = Integer.parseInt( System.console().readLine());
        if (resposta1==4){
            punts++;
            System.out.println("Quant és 1000-7?");
            resposta2 = Integer.parseInt( System.console().readLine());
            if(resposta2==993){
                punts++;
                System.out.println("Quant és 970 - 25?");
                resposta3 = Integer.parseInt( System.console().readLine());
                if(resposta3==945){ 
                    punts++;
                    System.out.println("Has obtingut " + punts +" punts");
                }
                else{
                    System.out.println("Has obtingut " + punts +" punts");
                }
            }
            else{
                System.out.println("Has obtingut " + punts +" punts");
            }
        }
     
    }
}