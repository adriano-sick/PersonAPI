package api.person.personapi.utils;

import api.person.personapi.dto.request.PhoneDTO;
import api.person.personapi.entity.Phone;
import api.person.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "1198765-4321";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}