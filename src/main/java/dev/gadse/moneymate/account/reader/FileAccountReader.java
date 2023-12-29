package dev.gadse.moneymate.account.reader;

import dev.gadse.moneymate.account.reader.camt052file.CAMT052File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FileAccountReader {

    public CAMT052File read(String path) {
        Path p = Paths.get(path);

        CAMT052File converted = null;
        try {
            converted = convert(p.toFile());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return converted;
    }

    private CAMT052File convert(File file) throws JAXBException {
        // TODO: Find a way to unmarshal without using a cast!
        Unmarshaller unmarshaller = JAXBContext.newInstance(CAMT052File.class).createUnmarshaller();
        return (CAMT052File) unmarshaller.unmarshal(file);
    }
}
