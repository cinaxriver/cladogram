package com.cladogram;

import com.cladogram.misc.terminable.TerminableConsumer;
import com.cladogram.misc.terminable.TerminableModule;
import com.cladogram.core.network.Network;
import com.cladogram.core.rpc.RPC;
import com.cladogram.rtc.RTC;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public final class CladeHub implements TerminableModule {

  @NotNull
  private final Configuration configuration;

  @NotNull
  private final Network network;

  @Override
  public void setup(@NotNull final TerminableConsumer consumer) {
    network.setup(consumer);
  }
}
