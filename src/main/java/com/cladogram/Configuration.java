package com.cladogram;

import com.cladogram.misc.Keyed;
import org.jetbrains.annotations.NotNull;

public interface Configuration extends Keyed {

  @NotNull
  String peerId();

  @NotNull
  String[] allowedPeers();

  @NotNull
  String[] ignoredPeers();

  @Override
  @NotNull
  default String key() {
    return this.peerId();
  }
}
