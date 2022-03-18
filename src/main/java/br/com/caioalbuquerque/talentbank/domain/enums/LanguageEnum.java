package br.com.caioalbuquerque.talentbank.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 17/03/22
 */
public enum LanguageEnum {
    JAVA(1), JAVASCRIPT(2), PYTHON(3), RUBY(4), GOLANG(5);

    private final int language;

    LanguageEnum(int language) {
        this.language = language;
    }

    public int getLanguage() {
        return language;
    }
}