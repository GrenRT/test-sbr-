package test.sbr.yandex.model;

import java.util.List;

public class SnippetCardData {

    private String model;
    private List<String> description;

    public String getModel() {
        return model;
    }

    public SnippetCardData withModel(String model) {
        this.model = model;
        return this;
    }

    public List<String> getDescription() {
        return description;
    }

    public SnippetCardData withDescription(List<String> description) {
        this.description = description;
        return this;
    }
}
