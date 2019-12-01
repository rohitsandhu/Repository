public class arrays {
    public static void main(String[] args) {

        System.out.println("digues un nom");
        String nom1 = System.console().readLine();

        System.out.println("digues un nom");
        String nom2 = System.console().readLine();

        System.out.println("digues un nom");
        String nom3 = System.console().readLine();

        String arrayNoms[]={nom1,nom2,nom3};
        //System.out.println(arrayNoms[0]);
        //System.out.println(arrayNoms[1]);
        //System.out.println(arrayNoms[2]);
        
        System.out.println("Mida array "+ arrayNoms.length);
        int posicio=(int)System.currentTimeMillis()%3; // ens don un valor de tipus long aleatori i el convertin en int per tal de que sigui un nomero enter
        System.out.println("the winner is " + arrayNoms[posicio]); 
    }
}