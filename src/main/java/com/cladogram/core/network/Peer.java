package com.cladogram.core.network;

import com.cladogram.misc.Keyed;
import org.jetbrains.annotations.NotNull;

public interface Peer extends Keyed {

  @NotNull
  String address();

  int port();


}
