import dinossauro.Dinossauro;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static dinossauro.EscolheAcoesService.*;


public class Teste {
    public static void main(String[] args) {

        Dinossauro skeep = new Dinossauro();
        Dinossauro scan = new Dinossauro();
        while (isAlive(skeep)) {
            String option = abreMenu();
            escolheAcao(skeep, option);
        }
        System.out.println("fim de jogo. Você perdeu");
    }
}