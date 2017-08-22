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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SnippetCardData that = (SnippetCardData) o;

        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SnippetCardData{" +
                "model='" + model + '\'' +
                ", description=" + description +
                '}';
    }
}
