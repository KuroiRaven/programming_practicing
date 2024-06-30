import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsTest {

    class Player {
        private String name;
        private int healthPoints;
        private int mana;
        private boolean alive;

        public Player(String name, int healthPoints, int mana) {
            this.name = name;
            this.healthPoints = healthPoints;
            this.mana = mana;
            this.alive = healthPoints > 0;
        }

        public String getName() {
            return name;
        }

        public int currentHealthPoint(){
            return healthPoints;
        }

        public int currentMana(){
            return mana;
        }

        public boolean isAlive() {
            return alive;
        }

        public void takeDamage(int damage) {
            int updatedHealthPoints = this.healthPoints - damage;
            if(updatedHealthPoints <= 0) {
                this.alive = false;
            }

            healthPoints -= damage;
        }

        public void heal(int amount) {
            healthPoints += amount;
        }
    }

    @Test
    @DisplayName("La méthode takeDamage réduit la vie du joueur")
    void ShouldTakeDamage() {
        // Créer un joueur : nom => "Liliana", healthPoints => 20, mana => 2

        // Infliger 8 puis 9 de dégat au joueur

        assertThat(liliana.healthPoints).isEqualTo(3);
    }

    @Test
    @DisplayName("La méthode heal augmente la vie du joueur")
    void ShouldGetHealed() {
        // Créer un joueur : nom => "Liliana", healthPoints => 3, mana => 2

        // Heal le joueur de 10HP

        assertThat(liliana.healthPoints).isEqualTo(13);
    }

    @Test
    @DisplayName("Lorsque les points de vie d'un joueur tombe à 0, il est considéré mort.")
    void ShouldEnsureDeath() {
        // Créer un joueur : nom => "Liliana", healthPoints => 3, mana => 2

        // Le joueur doit être en vie

        // Le joueur doit prendre 3 ou plus point de dégat

        assertThat(liliana.isAlive()).isFalse();
    }

    @Test
    @DisplayName("Le combat se passe tel qu'attendu")
    void fightShouldOccurCorrectly() {

        // Joueur 1 doit avoir ces résultats
        assertThat(liliana.isAlive()).isTrue();
        assertThat(liliana.currentHealthPoint()).isEqualTo(15);

        // Joueur 2 doit avoir ces résultats
        assertThat(gideon.isAlive()).isTrue();
        assertThat(gideon.currentHealthPoint()).isEqualTo(13);
    }

    @Test
    @DisplayName("Les informations sont récupérées correctement")
    void shouldGetPlayerData() {

        assertThat(liliana.isAlive()).isTrue();
        assertThat(liliana.currentHealthPoint()).isEqualTo(3);
        assertThat(liliana.currentMana()).isEqualTo(2);
        assertThat(liliana.getName()).isEqualTo("Liliana");
    }

}
