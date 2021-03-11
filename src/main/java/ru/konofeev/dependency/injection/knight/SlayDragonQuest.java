package ru.konofeev.dependency.injection.knight;

/**
 * Убить дракона
 */
public class SlayDragonQuest  implements Quest
{
    @Override
    public void embark()
    {
        System.out.println("Убить дракона");
    }
}
