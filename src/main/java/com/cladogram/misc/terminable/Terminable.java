package com.cladogram.misc.terminable;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


@FunctionalInterface
public interface Terminable extends AutoCloseable {
    Terminable EMPTY = () -> {};

    @Override
    void close() throws Exception;

    default boolean isClosed() {
        return false;
    }

    @Nullable
    default Exception closeSilently() {
        try {
            close();
            return null;
        } catch (Exception e) {
            return e;
        }
    }

    default void closeAndReportException() {
        try {
            close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    default void bindWith(@NotNull TerminableConsumer consumer) {
        consumer.bind(this);
    }

}