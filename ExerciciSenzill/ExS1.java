public class ExS1{
    public static void main(String[] args){
        int numero;
        System.out.println("Digues un numero i fem un factorial");
        numero = Integer.parseInt(System.console().readLine());

        int res =1;
        for(int i=numero; i>0; i--){
            res = res *i;
            //System.out.println(numero * i);
        }
        System.out.println(res);
    }
}