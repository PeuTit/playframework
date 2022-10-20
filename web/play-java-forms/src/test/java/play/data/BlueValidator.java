/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package play.data;

import play.data.validation.Constraints;
import play.libs.F;

public class BlueValidator extends Constraints.Validator<String> {

  public boolean isValid(String value) {
    return "blue".equals(value);
  }

  public F.Tuple<String, Object[]> getErrorMessageKey() {
    return F.Tuple("notblue", new Object[] {"argOne", "argTwo"});
  }
}
