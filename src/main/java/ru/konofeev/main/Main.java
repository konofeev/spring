package ru.konofeev.main;

import ru.konofeev.aop.MainAop;
import ru.konofeev.dependency.injection.MainDependencyInjection;

/**
 * Точка входа
 */
public class Main
{
    /**
     * Точка входа
     * @param arguments параметры командной строки
     */
    public static void main(String[] arguments)
    {
        // Внедрение зависимостей (di)
        MainDependencyInjection.main(arguments);

        // Аспектно-ориентирование программирование (aop)
        MainAop.main(arguments);
    }
}
