package com.cladogram.core.network.events;

import com.cladogram.misc.Keyed;
import com.cladogram.core.network.Peer;
import org.jetbrains.annotations.NotNull;

public interface PeerEvent extends Keyed {

  @NotNull
  Peer peer();

}
