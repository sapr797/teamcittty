package plaindoll;

import java.util.Random;

public class Welcomer {
    // Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
    // https://t.me/notopsofficial
    
    // Массив реплик со словом "hunter" для нового метода
    private static final String[] HUNTER_REPLICAS = {
        "The hunter became the hunted in this thrilling chase.",
        "Every good hunter knows patience is the key to success.",
        "In the forest, the hunter must respect nature's balance.",
        "The hunter's moon shone brightly over the silent woods.",
        "A skilled hunter tracks more than just footprints.",
        "The hunter prepared his gear for the morning expedition.",
        "Legend speaks of a hunter who could talk to animals.",
        "The hunter's instinct told him danger was nearby.",
        "As a bounty hunter, she always got her target.",
        "The hunter's code forbids killing for sport alone."
    };
    
    private final Random random = new Random();
    
    /**
     * Задание 10: Новый метод, возвращающий произвольную реплику со словом "hunter"
     * @return случайная реплика про охотника
     */
    public String getHunterReplica() {
        int index = random.nextInt(HUNTER_REPLICAS.length);
        return HUNTER_REPLICAS[index];
    }
    
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }
    
    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }
    
    public String sayNeedGold() {
        return "Not enough gold";
    }
    
    public String saySome() {
        return "something in the way";
    }
    
    /**
     * Метод main для демонстрации задания 10 при сборке TeamCity
     */
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("TEAMCITY BUILD: ЗАДАНИЕ 10 - ВЫПОЛНЕНО!");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Новый метод getHunterReplica() добавлен в класс Welcomer.");
        System.out.println("Метод возвращает случайную реплику, содержащую слово 'hunter'.");
        System.out.println();
        System.out.println("Демонстрация работы метода:");
        
        Welcomer welcomer = new Welcomer();
        for (int i = 1; i <= 5; i++) {
            System.out.println("  Пример " + i + ": " + welcomer.getHunterReplica());
        }
        
        System.out.println();
        System.out.println("Проверка: все реплики содержат слово 'hunter'");
        boolean allContain = true;
        for (int i = 0; i < 10; i++) {
            String replica = welcomer.getHunterReplica();
            if (!replica.toLowerCase().contains("hunter")) {
                allContain = false;
                break;
            }
        }
        
        System.out.println("Результат: " + (allContain ? "✓ УСПЕХ" : "✗ ОШИБКА"));
        System.out.println("========================================");
        
        // Выход с кодом 0 при успехе
        System.exit(allContain ? 0 : 1);
    }
}
