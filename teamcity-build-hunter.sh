#!/bin/bash

echo "##teamcity[blockOpened name='Задание 10: Новый метод Welcomer.getHunterReplica()']"

# Компилируем проект
echo "##teamcity[progressStart 'Компиляция проекта']"
mvn clean compile
if [ $? -ne 0 ]; then
    echo "##teamcity[buildProblem description='Ошибка компиляции']"
    exit 1
fi
echo "##teamcity[progressFinish 'Компиляция проекта']"

# Запускаем тесты
echo "##teamcity[progressStart 'Запуск тестов']"
mvn test
if [ $? -ne 0 ]; then
    echo "##teamcity[buildProblem description='Ошибка в тестах']"
    exit 1
fi
echo "##teamcity[progressFinish 'Запуск тестов']"

# Запускаем демо нового метода
echo "##teamcity[progressStart 'Демонстрация нового метода']"
mvn exec:java -Dexec.mainClass="plaindoll.HunterDemo"
EXIT_CODE=$?
if [ $EXIT_CODE -eq 0 ]; then
    echo "##teamcity[buildStatus status='SUCCESS' text='Новый метод работает корректно']"
else
    echo "##teamcity[buildProblem description='Ошибка в новом методе']"
    exit 1
fi
echo "##teamcity[progressFinish 'Демонстрация нового метода']"

echo "##teamcity[blockClosed name='Задание 10: Новый метод Welcomer.getHunterReplica()']"
