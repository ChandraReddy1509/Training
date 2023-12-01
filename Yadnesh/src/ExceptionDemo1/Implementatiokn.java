package ExceptionDemo1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Implementatiokn {
    public static Map<String, Long> getCount(List<Candidate> list) {
        long maleCount = list.stream()
                .filter(candidate -> "Male".equalsIgnoreCase(candidate.getGender()))
                .count();
        long femaleCount = list.stream()
                .filter(candidate -> "Female".equalsIgnoreCase(candidate.getGender()))
                .count();

        Map<String, Long> genderCount = new HashMap<>();
        genderCount.put("Male", maleCount);
        genderCount.put("Female", femaleCount);

        return genderCount;
    }

    public static Map<String, Double> getAverageAge(List<Candidate> list) {
        Map<String, Double> averageAgeByGender = list.stream()
                .collect(Collectors.groupingBy(Candidate::getGender,
                        Collectors.averagingInt(Candidate::getAge)));

        return averageAgeByGender;
    }

    public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
        Map<String, Long> departmentCount = list.stream()
                .collect(Collectors.groupingBy(Candidate::getDepartment,
                        Collectors.counting()));

        return departmentCount;
    }

    public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
        Optional<Candidate> youngestMaleInProductDevelopment = list.stream()
                .filter(candidate -> "Male".equalsIgnoreCase(candidate.getGender())
                        && "Product Development".equalsIgnoreCase(candidate.getDepartment()))
                .min(Comparator.comparingInt(Candidate::getAge));

        return youngestMaleInProductDevelopment;
    }
}

