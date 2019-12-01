public class Exercici77{
    public static void main(String[] args) {
        int diesviscuts;
        int messos;
        int dies;
        int anys;
        
        System.out.println("Quant dies has viscut");

        diesviscuts = Integer.parseInt(System.console().readLine());
        
        dies = diesviscuts;
        messos = (diesviscuts / 30);
        anys = (diesviscuts / 365);
        System.out.println("Has viscut "+anys+" anys, "+messos+" messos i "+dies+" dies");
    }
}