package plaindoll;

public class HunterDemo {
    public static void main(String[] args) {
        Welcomer welcomer = new Welcomer();
        
        System.out.println("========================================");
        System.out.println("TEAMCITY BUILD: ЗАДАНИЕ 10 - НОВЫЙ МЕТОД");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Существующие методы класса Welcomer:");
        System.out.println("1. sayWelcome(): " + welcomer.sayWelcome());
        System.out.println("2. sayFarewell(): " + welcomer.sayFarewell());
        System.out.println("3. sayNeedGold(): " + welcomer.sayNeedGold());
        System.out.println("4. saySome(): " + welcomer.saySome());
        System.out.println();
        System.out.println("НОВЫЙ МЕТОД (Задание 10):");
        System.out.println("5. getHunterReplica():");
        
        // Выводим несколько примеров
        for (int i = 1; i <= 5; i++) {
            System.out.println("   Пример " + i + ": " + welcomer.getHunterReplica());
        }
        
        System.out.println();
        System.out.println("Проверка: Все реплики содержат слово 'hunter'");
        System.out.println("(Проверка 10 случайных реплик):");
        
        boolean allContainHunter = true;
        for (int i = 1; i <= 10; i++) {
            String replica = welcomer.getHunterReplica();
            boolean contains = replica.toLowerCase().contains("hunter");
            System.out.println("  " + i + ". " + (contains ? "✓" : "✗") + " \"" + replica + "\"");
            if (!contains) allContainHunter = false;
        }
        
        System.out.println();
        System.out.println("РЕЗУЛЬТАТ: " + (allContainHunter ? "ВСЕ реплики содержат 'hunter' ✓" : "ОШИБКА: не все реплики содержат 'hunter' ✗"));
        System.out.println("========================================");
        
        // Возвращаем код выхода 0 при успехе, 1 при ошибке
        System.exit(allContainHunter ? 0 : 1);
    }
}
