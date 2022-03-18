package br.com.caioalbuquerque.talentbank.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
public enum GenderEnum {
    FEMALE(1), MALE(2);

    private final int gender;

    GenderEnum(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }
}