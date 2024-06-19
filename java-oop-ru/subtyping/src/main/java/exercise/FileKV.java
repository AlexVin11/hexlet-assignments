package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;
    private Map<String, String> data = new HashMap<>();

    FileKV(String path, Map<String, String> initial) {
        this.path = path;
        data.putAll(initial);

    }

    @Override
    public void set(String key, String value) {
        data.put(key, value);
    }

    @Override
    public void unset(String key) {
        data.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return data.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }
}
// END
