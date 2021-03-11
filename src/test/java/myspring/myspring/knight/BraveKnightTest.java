package myspring.myspring.knight;

import ru.konofeev.dependency.injection.knight.Quest;
import org.junit.jupiter.api.Test;
import ru.konofeev.dependency.injection.knight.BraveKnight;

import static org.mockito.Mockito.*;

class BraveKnightTest {
    @Test
    void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class); // Создание фиктивного объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest); // Внедрение
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark(); }
}