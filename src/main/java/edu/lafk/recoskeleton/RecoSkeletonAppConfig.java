package edu.lafk.recoskeleton;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * TODO: Write here what this does?
 * <HR>
 * Created 03.06.15 01:37
 *
 * @author LAFK (@LAFK_pl || LIttleAncientForestKami@Github)
 */
public class RecoSkeletonAppConfig extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String recommendations = "random or offer of the day";

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getRecommendations() {
        return recommendations;
    }

    @JsonProperty
    public void setRecommendations(String name) {
        this.recommendations = name;
    }

}
