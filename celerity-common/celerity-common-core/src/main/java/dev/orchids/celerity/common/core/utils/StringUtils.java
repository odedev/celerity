package dev.orchids.celerity.common.core.utils;

import com.google.common.base.Strings;

public class StringUtils {
  public static String padStart(String string) {
    return Strings.padStart(string, 32, '0');
  }

  public static String padEnd(String string) {
    return Strings.padEnd(string, 32, '0');
  }
}
