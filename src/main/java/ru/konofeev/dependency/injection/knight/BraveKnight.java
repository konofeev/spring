package ru.konofeev.dependency.injection.knight;

import lombok.AllArgsConstructor;

/**
 * Храбрый рыцарь
 */
@AllArgsConstructor
public class BraveKnight implements Knight
{
    /**
     * Квест
     */
    private final Quest quest;

    /**
     * Отправиться на задание
     */
    public void embarkOnQuest()
    {
        quest.embark();
    }
}
