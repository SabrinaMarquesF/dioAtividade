public class Main {
    public static void main(String[] args) {
        // Definindo variáveis
        String nomeHeroi = "Thor";
        int xpHeroi = 5000;
        String nivelHeroi;

        switch (xpHeroi) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 999:
                nivelHeroi = "Ferro";
                break;
            case 1000:
            case 1001:
            case 1002:
            case 2000:
                nivelHeroi = "Bronze";
                break;
            case 2001:
            case 2002:       
            case 5000:
                nivelHeroi = "Prata";
                break;
            case 5001:
            case 7000:
                nivelHeroi = "Ouro";
                break;
            case 7001:
            case 8000:
                nivelHeroi = "Platina";
                break;
            case 8001:
            case 9000:
                nivelHeroi = "Ascendente";
                break;
            case 9001:
            case 10000:
                nivelHeroi = "Imortal";
                break;
            default:
                nivelHeroi = "Radiante";
                break;
        }
        System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivelHeroi);
    }
}
