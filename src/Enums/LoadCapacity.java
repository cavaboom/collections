package Enums;

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);

    private Float minLoad;
    private Float maxLoad;

    LoadCapacity(Float minLoad, Float maxLoad) {
        this.minLoad = minLoad;
        this.maxLoad = maxLoad;
    }

    public Float getMinLoad() {
        return minLoad;
    }

    public Float getMaxLoad() {
        return maxLoad;
    }

    @Override
    public String toString() {
        if (minLoad == null) {
            return "Грузоподъемность до " + maxLoad + " тонн";
        } else if (maxLoad == null) {
            return "Грузоподъемность от " + minLoad + " тонн";
        }
        return "Грузоподъемность от " + minLoad + " до" + maxLoad + " тонн";
    }

}
