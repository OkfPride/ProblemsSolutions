package dto;

import java.io.Serializable;

public class Aggregated implements Serializable {
    private static final long serialVersionUID = 3477107245247501486L;

    private Integer period;
    private Integer year;
    private Integer count;
    private String name;

    public Aggregated() {}

    public Aggregated(Integer period, Integer year, Integer count, String name) {
        this.period = period;
        this.year = year;
        this.count = count;
        this.name = name;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
