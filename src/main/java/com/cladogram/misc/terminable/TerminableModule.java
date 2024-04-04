package com.cladogram.misc.terminable;

import org.jetbrains.annotations.NotNull;

public interface TerminableModule {

    void setup(@NotNull TerminableConsumer consumer);

    default void bindModuleWith(@NotNull TerminableConsumer consumer) {
        consumer.bindModule(this);
    }

}