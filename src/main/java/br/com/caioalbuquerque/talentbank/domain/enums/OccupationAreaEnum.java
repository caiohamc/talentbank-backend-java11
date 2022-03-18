package br.com.caioalbuquerque.talentbank.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
public enum OccupationAreaEnum {
    FULLSTACK(1), BACKEND(2), FRONTEND(3), INFRA(4), DATABASE(5), TESTING(6);

    private final int area;

    OccupationAreaEnum(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }
}