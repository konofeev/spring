package ru.konofeev.aop;

/**
 * Сервис дополнительной обработки (логгирования) для других сервисов
 */
public class Minstrel {
    public void singBeforeQuest() {
        System.out.println("Логгирование до вызова метода!");
    }

    public void singAfterQuest() {
        System.out.println("Логгирование после вызова метода!");
    }
}
