package jUnit;
import java.util.Random;

public class GeneradorIp {
    private Random rand;

    public GeneradorIp() {
        rand = new Random();
    }

    public int generarNumero(int min, int max) {
        return rand.nextInt((max - min) + 1) + min;
    }

    public String generarIp() {
        StringBuilder sb = new StringBuilder();
        sb.append(generarNumero(0, 255)).append(".");
        sb.append(generarNumero(0, 255)).append(".");
        sb.append(generarNumero(0, 255)).append(".");
        sb.append(generarNumero(0, 255));
        return sb.toString();
    }
}