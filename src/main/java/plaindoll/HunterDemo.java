package plaindoll;

public class HunterDemo {
    public static void main(String[] args) {
        Welcomer welcomer = new Welcomer();
        System.out.println("Демонстрация задания 10 в TeamCity");
        System.out.println("Метод getHunterReplica() работает:");
        System.out.println("Пример: " + welcomer.getHunterReplica());
        System.out.println("Еще пример: " + welcomer.getHunterReplica());
        System.out.println("Проверка: " + 
            (welcomer.getHunterReplica().toLowerCase().contains("hunter") ? "✓" : "✗"));
    }
}
