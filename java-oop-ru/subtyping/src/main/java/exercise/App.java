package exercise;

import java.util.Map;

// BEGIN
public class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> storageMap = storage.toMap();
        var entries = storageMap.entrySet();
        entries.forEach(entry -> storage.unset(entry.getKey()));
        entries.forEach(entry -> storage.set(entry.getValue(), entry.getKey()));
    }
}
// END
