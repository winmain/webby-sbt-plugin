package webby
import sbt.internal.util.ConsoleAppender

object Colors {

  import scala.Console._

  def red(str: String): String = if (ConsoleAppender.formatEnabledInEnv) RED + str + RESET else str
  def blue(str: String): String = if (ConsoleAppender.formatEnabledInEnv) BLUE + str + RESET else str
  def cyan(str: String): String = if (ConsoleAppender.formatEnabledInEnv) CYAN + str + RESET else str
  def green(str: String): String = if (ConsoleAppender.formatEnabledInEnv) GREEN + str + RESET else str
  def magenta(str: String): String = if (ConsoleAppender.formatEnabledInEnv) MAGENTA + str + RESET else str
  def white(str: String): String = if (ConsoleAppender.formatEnabledInEnv) WHITE + str + RESET else str
  def black(str: String): String = if (ConsoleAppender.formatEnabledInEnv) BLACK + str + RESET else str
  def yellow(str: String): String = if (ConsoleAppender.formatEnabledInEnv) YELLOW + str + RESET else str
}
