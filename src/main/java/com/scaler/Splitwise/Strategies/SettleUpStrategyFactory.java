package com.scaler.Splitwise.Strategies;

public class SettleUpStrategyFactory {
    public static SettleUpStrategy getSettleUpStrategy(SettleUpStrategies strategyName)
    {
        return new HeapBasedSettleUpStrategy();
    }
}
