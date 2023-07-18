package service;

import dto.Aggregated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupingTraining {
    public static void main(String[] args) {
        List<Aggregated> arr = new ArrayList<>();
        arr.add(new Aggregated(1, 1, 1, "name"));
        arr.add(new Aggregated(1, 1, 1, "name"));
        arr.add(new Aggregated(1, 1, 1, "name"));
        arr.add(new Aggregated(1, 1, 1, "name"));
        arr.add(new Aggregated(1, 1, 1, "name"));
        Map<Integer, Map<Integer, String>> collect = arr.stream()
                                                        .collect(groupingBy(Aggregated::getYear,
                                                                            groupingBy(Aggregated::getPeriod, Collectors.mapping(Aggregated::getName, Collectors.joining()))));

    }

    private record PeriodData(Map<Integer, PeriodInfo> periodInfoMap) {}

    private record YearData(Map<Integer, PeriodData> yearPeriods) {}

    private static class PeriodInfo {
        private Integer count;

        private List<String> names;

        public PeriodInfo() {}

        public PeriodInfo(Integer count, List<String> names) {
            this.count = count;
            this.names = names;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<String> getNames() {
            return names;
        }

        public void setNames(List<String> names) {
            this.names = names;
        }
    }

}
