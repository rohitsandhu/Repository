public class Exercici8{
    public static void main(String[] args){
        int num_Aleatori;
        int intents = 0;
        int num_loteria= -1;
        boolean array[] = new boolean[1000];            //crear l'array

        num_Aleatori=(int)(Math.random()*1000);               // crear el numero random de la loteria
        
        while (num_Aleatori != num_loteria) {                    //mentre la num_lotria no és igual a num_Aleatori

            num_loteria = (int)(Math.random()*1000);                //crear un altre num ramdom i donar valor a num_loteria

            if (array[num_loteria] == true){                        // si array [lotria] es "true"(verificat) continua
                continue;
            }
            else {
                array[num_loteria] = true;                          //sino fes que el numero sigui "true"(verificat) i afegeix 1 intent
                intents++;
            }
        }

        System.out.println("El numero de la loteria era " + num_Aleatori + " i el numero de intents ha sigut de " + intents);
    }
}