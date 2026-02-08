package plaindoll;

public class HunterDemo {
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
