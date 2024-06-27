package exercise;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    public static void save(Path path, Car car) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new FileOutputStream(path.toString()), car);
    }

    public static Car extract(Path path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String fileContent = Files.readString(path);
        Car car = mapper.readValue(fileContent, Car.class);
        return car;
    }
}
// END
