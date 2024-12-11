package kafka.connect.transforms;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.utils.AppInfoParser;
import org.apache.kafka.connect.components.Versioned;
import org.apache.kafka.connect.connector.ConnectRecord;
import org.apache.kafka.connect.transforms.Transformation;

public class IsoConverter<R extends ConnectRecord<R>> implements Transformation<R>, Versioned {

    public static final String FIELD_CONFIG = "field";
    private static final List FIELD_DEFAULT = Collections.emptyList();
    public static final String FIELD_CONFIG_DOC = "A list of fields that are timestamps. The default value is empty.";

    public static final String TIMEZONE_CONFIG = "timezone";
    private static final String TIMEZONE_DEFAULT = "UTC";
    public static final String TIMEZONE_CONFIG_DOC =
        "The timezone to specify when converting timestamps to ISO8601 format. If not specified, it will be converted to UTC.";

    public static final ConfigDef CONFIG_DEF = new ConfigDef()
        .define(FIELD_CONFIG, ConfigDef.Type.LIST, FIELD_DEFAULT, ConfigDef.Importance.HIGH,
            FIELD_CONFIG_DOC)
        .define(TIMEZONE_CONFIG, ConfigDef.Type.STRING, TIMEZONE_DEFAULT,
            ConfigDef.Importance.MEDIUM,
            TIMEZONE_CONFIG_DOC);

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
        return CONFIG_DEF;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
