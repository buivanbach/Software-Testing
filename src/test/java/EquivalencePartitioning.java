import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquivalencePartitioning {

    @Test
    void checkAbilityR1() {
        assertEquals("8 triệu",Main.checkAbility(new InformationStudent(3.6,90,16)));
    }
}