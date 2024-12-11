package kafka.connect.transforms;

import java.util.Map;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.utils.AppInfoParser;
import org.apache.kafka.connect.components.Versioned;
import org.apache.kafka.connect.connector.ConnectRecord;
import org.apache.kafka.connect.transforms.Transformation;

public class IsoConverter<R extends ConnectRecord<R>> implements Transformation<R>, Versioned {

    @Override
    public String version() {
        return AppInfoParser.getVersion();
    }

    @Override
    public R apply(R record) {
        return null;
    }

    @Override
    public ConfigDef config() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
