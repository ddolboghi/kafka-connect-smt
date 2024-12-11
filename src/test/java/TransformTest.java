import static org.junit.jupiter.api.Assertions.assertEquals;

import kafka.connect.transforms.IsoConverter;
import org.apache.kafka.connect.source.SourceRecord;
import org.junit.jupiter.api.Test;

public class TransformTest {

    private final IsoConverter<SourceRecord> isoConverter = new IsoConverter<>();

    @Test
    public void testTransformVersion() {
        String kafkaClientVersion = "3.6.1";
        assertEquals(isoConverter.version(), kafkaClientVersion);
    }

}
