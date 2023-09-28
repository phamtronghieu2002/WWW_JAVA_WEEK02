package fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.converters;

import fit.iuh.edu.week02_lap_20062501_phamtronghieu_server.enums.EmployeeStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class EmployeeStatusConverter implements AttributeConverter<EmployeeStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }
    @Override
    public EmployeeStatus convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        return Stream.of(EmployeeStatus.values())
                .filter(c -> c.getValue() == dbData)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}