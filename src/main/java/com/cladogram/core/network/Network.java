package com.cladogram.core.network;

import com.cladogram.misc.terminable.TerminableModule;
import org.jetbrains.annotations.NotNull;

public interface Network extends TerminableModule {

  @NotNull
  Peer localPeer();

}
