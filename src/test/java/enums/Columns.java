package enums;

public enum Columns {
    ID("Id"),
    TYPE("Type"),
    SIDE("Side"),
    SIZE("Size"),
    INSTRUMENT("Instrument"),
    AVG_FILL_PRICE("Avg fill price"),
    EXEC_SIZE("Exec size"),
    EXEC_TYPE("Exec type"),
    BENCHMARK_PRICE("Benchmark price"),
    PRICE_TICKS("Price imp. (ticks)"),
    START_TIME("Start time"),
    END_TIME("End time"),
    NUM_OF_EXECUTIONS("Num of executions"),
    EXECUTION_PRICE_VOLATILITY("Execution price volatility"),
    REALIZED_MARKET_IMPACT("Realized market impact"),
    PARTICIPATION_RATE("Participation rate"),
    SHORTFALL("Shortfall"),
    MULTIPLIER("Multiplier"),
    TICK_SIZE("Tick size"),
    CURRENCY_CODE("Currency code"),
    SEQUENCE_NUMBER("Sequence number"),
    DB_SEQUENCE_NUMBER("Db sequence number"),
    PRICE("Price"),
    PRICE_AMOUNT("Price imp. (amount)");

    private final String column;

    Columns(String column) {
        this.column = column;
    }

    public String getColumn() {
        return column;
    }
}