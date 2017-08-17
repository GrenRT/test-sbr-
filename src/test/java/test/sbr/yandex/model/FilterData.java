package test.sbr.yandex.model;

public class FilterData {

    private String from;
    private String to;
    private String[] manufacturer;

    public String getFrom() {
        return from;
    }

    public FilterData withFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public FilterData withTo(String to) {
        this.to = to;
        return this;
    }

    public String[] getManufacturer() {
        return manufacturer;
    }

    public FilterData withManufacturer(String[] manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

}
