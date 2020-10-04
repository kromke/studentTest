package domain.service.entities;

import App.MainApp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    private static Map<String, String> map = new HashMap<>();
    public static domain.service.entities.Test test;

    @BeforeAll
    private static void init() {
        map.put("1", "2");
        map.put("a", "b");
        test = new domain.service.entities.Test(map);
    }

    @Test
    void getClearTest() {
        Map<String, String> clearMap = new HashMap<>();
        clearMap.put("1", "");
        clearMap.put("a", "");
        var expected = new domain.service.entities.Test(clearMap);
        var actual = test.getClearTest();
        assertEquals(expected, actual);
    }
}