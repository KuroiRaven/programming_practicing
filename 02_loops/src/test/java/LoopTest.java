import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class LoopTest {
    private final List<Integer> zeroToHundred = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
    private final PrintStream originalOut = System.out;

    @AfterEach
    void tearDown() {
        System.setOut(this.originalOut);
    }

    @Test
    /* Ajouter les chiffres de 1 à 100 à la liste pré-créée*/
    public void ForLoop() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // À l'aide d'une boucle for

        assertThat(numbers).hasSize(100);
        assertThat(numbers).containsAll(this.zeroToHundred);
    }

    @Test
    /* Ajouter les chiffres de 1 à 100 à la liste pré-créée*/
    public void WhileLoop() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // À l'aide d'une boucle while

        assertThat(numbers).hasSize(100);
        assertThat(numbers).containsAll(this.zeroToHundred);
    }

    @Test
    /* Ajouter les chiffres de 1 à 100 à la liste pré-créée*/
    public void DoWhileLoop() {
        ArrayList<Integer> numbers = new ArrayList<>();

        // À l'aide d'une boucle do while

        assertThat(numbers).hasSize(100);
        assertThat(numbers).containsAll(this.zeroToHundred);
    }

    @Test
    /*
     * À l'aide de la boucle de votre choix, dessiner une pyramide*/
    public void PrintLoopTest() {
        // Gestion du print, ne pas toucher.
        ByteArrayOutputStream printed = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printed));

        // Ajouter votre boucle ici.

        // Assert the value using AssertJ
        assertThat(printed.toString()).isEqualToNormalizingNewlines("""
                                
                -
                --
                ---
                ----
                -----
                ------
                -------
                --------
                ---------
                ----------
                """);
    }

    @Test
    /* Trouvez la somme des entier de 1 à N */
    public void SumTest() {
        // Ajouter une boucle pour que la variable ait la valeur attendue

        // 1 à 9
        int sumOneToNine = 0;

        // 1 à 20
        int sumOneToTwenty = 0;

        // 30 à 60
        int sumThirtyToSixty = 0;

        // -10 à 40
        int sumMinusTenToFourty = 0;

        assertThat(sumOneToNine).isEqualTo(45);
        assertThat(sumOneToTwenty).isEqualTo(210);
        assertThat(sumThirtyToSixty).isEqualTo(1395);
        assertThat(sumMinusTenToFourty).isEqualTo(765);
    }

    @Test
    /* Trouvez le nombre de chiffre pair et impaire */
    public void EvenOrOddTest() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(19, 17, 50, 24, 92, 86, 80, 11, 76, 45, 84, 18, 40, 20, 66, 36, 37, 8, 48, 87, 47, 3, 7, 49, 81));
        int numberOfEven = 0;
        int numberOfOdd = 0;

        // Ajoutez votre boucle et votre logique ici.

        assertThat(numberOfEven).isEqualTo(14);
        assertThat(numberOfOdd).isEqualTo(11);
    }


    @Test
    /* Print les 20 premiers nombres de la suite de fibonacci (sans comprendre le 0) */
    public void FibonacciTest() {
        // Gestion du print, ne pas toucher.
        ByteArrayOutputStream printed = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printed));

        // Ajoutez votre boucle et votre logique ici.

        assertThat(printed.toString()).isEqualToNormalizingNewlines("""
                1
                2
                3
                5
                8
                13
                21
                34
                55
                89
                144
                233
                377
                610
                987
                1597
                2584
                4181
                6765
                10946""");
    }
}
