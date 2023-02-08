package Enums;

public enum SeatsAmount {
    EXTRASMALL(null, 10),
    SMALL(null, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXTRALARGE(100, 120);

    private Integer upperLimit;
    private Integer lowerLimit;

    SeatsAmount(Integer upperLimit, Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public Integer getUpperLimit() {
        return upperLimit;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    @Override
    public String toString() {
        if(lowerLimit == null) {
            return "Количество мест до " + upperLimit;
        } else if(upperLimit == null) {
            return "Количество мест от " + lowerLimit;
        }
        return "Количество мест от " + lowerLimit + " до" + upperLimit;
    }
}
