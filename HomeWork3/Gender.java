package Seminars_Exceptions.HomeWork.HomeWork3;

/*
 * Изначально ипользовал enum, только потом увидел, что по условию должна быть строка. Но так интереснее.)
 */
enum Gender {
    f("Женский"),
    m("Мужской");

    String translate;

    Gender(String translate) {
        this.translate = translate;
    }

}
