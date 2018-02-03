package application.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Matan Lachmish
 * Date: 03/02/2018
 */
@Configuration
@ConfigurationProperties(prefix="global")
@Getter
@Setter
/**
 * This class manage the configuration in the 'application.yml' file.
 * The scope of this class is all the configuration with the prefix "global".
 *
 * You can validate the value of the specified properties
 * (e.g: '@NotBlank', '@Length(max = 4, min = 1)', '@Min(1025)', '@Max(65536)', '@Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")')
 * If any of these validations fail then the main application would fail to start with an IllegalStateException
 */
public class GlobalConfiguration {
    /**
     * Example Boolean
     */
    private Boolean isExampleBoolean = false;

    /**
     * Example int
     */
    private int exampleInt = 0;
}
