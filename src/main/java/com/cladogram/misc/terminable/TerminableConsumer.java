package com.cladogram.misc.terminable;

import org.jetbrains.annotations.NotNull;

public interface TerminableConsumer {

    @NotNull
    <T extends AutoCloseable> T bind(@NotNull T terminable);

    @NotNull
    default <T extends TerminableModule> T bindModule(@NotNull T module) {
        module.setup(this);
        return module;
    }

}