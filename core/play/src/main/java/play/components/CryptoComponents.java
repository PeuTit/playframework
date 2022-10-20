/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.components;

import play.libs.crypto.CSRFTokenSigner;
import play.libs.crypto.CookieSigner;

import java.time.Clock;

public interface CryptoComponents {

  CookieSigner cookieSigner();

  CSRFTokenSigner csrfTokenSigner();

  // TODO Should this be part of the interface?
  default Clock clock() {
    return Clock.systemUTC();
  }
}
