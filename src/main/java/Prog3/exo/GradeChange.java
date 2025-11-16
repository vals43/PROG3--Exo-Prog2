package Prog3.exo;

import java.time.Instant;

public class GradeChange {

    private final double value;
    private final Instant zaoLeraZao;
    private final String reason;

    public GradeChange(double value, Instant timestamp, String reason) {
        this.value = value;
        this.zaoLeraZao = timestamp;
        this.reason = reason;
    }

    public double getValue() { return value; }
    public Instant getTimestamp() { return zaoLeraZao; }
    public String getReason() { return reason; }

}